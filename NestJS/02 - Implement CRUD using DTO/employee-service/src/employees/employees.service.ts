import { Injectable } from '@nestjs/common';
import { Employee, EmployeeStatus, EmployeeTier } from './Employee.model';
import { v1 as uuid } from 'uuid'
import { EmployeeSearchDto } from 'src/employees/EmployeeSearch.dto';
import { EmployeeUpdateDto } from './EmployeeUpdate.dto';

@Injectable()
export class EmployeesService {

    private employees : Employee[] = []

    getAllEmployees() {
        return this.employees;
    }

    createEmployee(firstName: string, lastName: string, designation: string, nearestCity: string, tier: EmployeeTier){
        const employee = {
            id: uuid(),
            firstName,
            lastName,
            designation,
            nearestCity,
            tier,
            status: EmployeeStatus.ACTIVE
        }
        this.employees.push(employee)
        return employee;
    }

    employeeSearch(employeeSearchDto: EmployeeSearchDto){
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
    }

    getEmployeeById(id:string): Employee{
        const employees = this.getAllEmployees();
        return employees.find(employee => employee.id === id)
    }

    updateEmployee(employeeUpdateDto:EmployeeUpdateDto): Employee{
        const { id, city } = employeeUpdateDto;
        let employee = this.getEmployeeById(id)
        employee.nearestCity = city
        return employee;
    }

    deleteEmployee(id:string): boolean{
        let employees = this.getAllEmployees();
        this.employees = employees.filter(employee => employee.id != id)
        return (employees.length != this.employees.length)
    }

}
