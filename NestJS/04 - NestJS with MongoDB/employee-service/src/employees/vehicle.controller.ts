import { Body, Controller, Get, Post } from "@nestjs/common";
import { VehicleCreateDTO } from "./dto/Vehicle.dto";
import { Vehicle } from "./schema/Vehicle.schema";
import { VehicleService } from "./services/vehicle.service";

@Controller('vehicles')
export class VehicleController{
    constructor(private vehicleService:VehicleService){

    }

    @Post()
    async create(@Body()vehicleCreateDto:VehicleCreateDTO):Promise<Vehicle>{
        let ret = await this.vehicleService.create(vehicleCreateDto);
        console.log(ret)
        return ret
    }

    @Get()
    async getAll(){
        return this.vehicleService.getAll();
    }
}