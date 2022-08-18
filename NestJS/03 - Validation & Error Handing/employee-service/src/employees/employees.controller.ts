import { Body, Controller, Delete, Get, HttpCode, NotFoundException, Param, Post, Put, Query, UsePipes, ValidationPipe } from '@nestjs/common';
import { EmployeeTierValidationPipe } from 'src/employee-tier-validation.pipe';
import { EmployeeSearchDto } from 'src/employees/EmployeeSearch.dto';
import { EmployeeTier } from './Employee.model';
import { EmployeeCreateDto } from './EmployeeCreate.dto';
import { EmployeesService } from './employees.service';
import { EmployeeUpdateDto } from './EmployeeUpdate.dto';

@Controller('employees')
export class EmployeesController {

    constructor(private employeeService: EmployeesService) {

    }

    @Get()
    @UsePipes(ValidationPipe)
    getAllEmployees(@Query() param:EmployeeSearchDto) {
        if(Object.keys(param).length){
            return this.employeeService.employeeSearch(param)
        } else{
            return this.employeeService.getAllEmployees()
        }
    }

    @Post()
    @UsePipes(ValidationPipe)
    @UsePipes(new EmployeeTierValidationPipe())
    createEmployee(@Body()employeeCreateDto:EmployeeCreateDto) {
        return this.employeeService.createEmployee(employeeCreateDto)
    }

    @Get('/:id')
    getEmployeeById(@Param('id') id:string){
        return this.employeeService.getEmployeeById(id)
    }

    @Put('/:id/city')
    updateEmployee(@Param('id') id:string, @Body() employeeUpdateDto:EmployeeUpdateDto){
        employeeUpdateDto.id = id
        this.employeeService.updateEmployee(employeeUpdateDto)
    }

    @Delete('/:id')
    @HttpCode(204)
    deleteEmployee(@Param('id')id:string){
        if(this.employeeService.deleteEmployee(id)){
            throw new NotFoundException('Employee Does Not Exist')
        }
    }

}
