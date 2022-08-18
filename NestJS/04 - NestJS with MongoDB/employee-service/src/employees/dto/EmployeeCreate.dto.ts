import { IsNotEmpty, NotEquals } from "class-validator";
import { EmployeeTier, EmployeeStatus } from "../Employee.enum";

export class EmployeeCreateDto {
    id: string
    @IsNotEmpty()
    firstName: string
    @IsNotEmpty()
    lastName: string
    @NotEquals('CEO')
    designation: string
    nearestCity: string
    tier: EmployeeTier
    status: EmployeeStatus
}