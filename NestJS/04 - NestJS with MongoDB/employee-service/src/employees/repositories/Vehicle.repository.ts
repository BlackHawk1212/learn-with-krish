import { Injectable } from "@nestjs/common";
import { InjectModel } from "@nestjs/mongoose";
import { Model } from "mongoose";
import { VehicleCreateDTO } from "../dto/Vehicle.dto";
import { Vehicle, VehicleDocument } from "../schema/Vehicle.schema";

@Injectable()
export class VehicleRepository{
    constructor(@InjectModel(Vehicle.name) private vehicleModel:Model<VehicleDocument>){

    }

    async create(vehicleCreateDto:VehicleCreateDTO):Promise<Vehicle>{
        let newVehicle = new this.vehicleModel(vehicleCreateDto);
        return await newVehicle.save()
    }

    async findAll(){
        return await this.vehicleModel.find().populate('employeeId');
    }
}