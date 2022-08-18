import { Injectable } from "@nestjs/common";
import { VehicleCreateDTO } from "../dto/Vehicle.dto";
import { VehicleRepository } from "../repositories/Vehicle.repository";
import { Vehicle } from "../schema/Vehicle.schema";

@Injectable()
export class VehicleService{
    constructor(private vehicleRepository:VehicleRepository){

    }

    async create(vehicleCreateDTO:VehicleCreateDTO):Promise<Vehicle>{
        return await this.vehicleRepository.create(vehicleCreateDTO)
    }

    async getAll():Promise<Vehicle[]>{
        return await this.vehicleRepository.findAll();
    }
}