import { Injectable, NotFoundException } from '@nestjs/common';
import { EmployeeStatus, EmployeeTier } from '../Employee.enum';
import { v1 as uuid } from 'uuid'
import { EmployeeSearchDto } from 'src/employees/dto/EmployeeSearch.dto';
import { EmployeeUpdateDto } from '../dto/EmployeeUpdate.dto';
import { EmployeeCreateDto } from '../dto/EmployeeCreate.dto';
import { Employee } from '../schema/Employee.schema';
import { EmployeeRepository } from '../repositories/Employee.repository';

@Injectable()
export class EmployeesService {

    constructor(private employeeRepository:EmployeeRepository){

    }

    async getAllEmployees(): Promise<Employee[]> {
        return await this.employeeRepository.findAll();
    }

    async createEmployee(employeeCreateDto: EmployeeCreateDto):Promise<Employee>{
        return await this.employeeRepository.create(employeeCreateDto);
    }

    /*employeeSearch(employeeSearchDto: EmployeeSearchDto){
        console.log(employeeSearchDto)
        const { status, name } = employeeSearchDto;
        let employees = this.getAllEmployees();
        if(status){
            employees = employees.filter(employee => employee.status === status);
            // console.log(employees)
        }
        if(name){
            employees = employees.filter(employee => employee.firstName.includes(name) || employee.lastName.includes(name))
            // console.log(employees)
        }
        return employees;
    }*/

    /*getEmployeeById(id:string): Employee{
        const employees = this.getAllEmployees();
        let employee = employees.find(employee => employee.id === id)
        if(!employee){
            throw new NotFoundException(`${id} is not exist`)
        }
        return employee
    }*/

    /*updateEmployee(employeeUpdateDto:EmployeeUpdateDto): Employee{
        const { id, city } = employeeUpdateDto;
        let employee = this.getEmployeeById(id)
        employee.nearestCity = city
        return employee;
    }*/

    /*deleteEmployee(id:string): boolean{
        let employees = this.getAllEmployees();
        this.employees = employees.filter(employee => employee.id != id)
        return (employees.length != this.employees.length)
    }*/

}
