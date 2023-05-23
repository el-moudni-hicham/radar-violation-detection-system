import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, retry} from "rxjs";
import {ValidationErrors} from "@angular/forms";
import {Vehicle} from "../models/vehicle.model";
const baseUrl = "http://localhost:8890/RREGESTRATION-SERVICE/api/vehicle/";
@Injectable({
  providedIn: 'root'
})
export class VehiclesService {

  private vehicles! : Vehicle[];
  private errMessage! : string;

  constructor(private http : HttpClient) {
    this.http.get(`${baseUrl}vehicles`).subscribe({
      next : data => {
        this.vehicles = data as Vehicle[];
      },
      error : err => {
        this.errMessage = err;
      }
    });
  }

  getAllVehicles():Observable<Vehicle[]>{
    return this.http.get<Vehicle[]>(`${baseUrl}vehicles`).pipe(retry(1))
  }

  addVehicle(vehicle : Vehicle): Observable<Vehicle>{
    return this.http.post<Vehicle>(`http://localhost:8890/RREGESTRATION-SERVICE/vehicles`,vehicle);
  }

  editVehicle(vehicle : Vehicle): Observable<Vehicle> {
    return this.http.put<Vehicle>(`http://localhost:8890/RREGESTRATION-SERVICE/vehicles/${vehicle.id}`, vehicle);
  }

  public deleteVehicle(id: number): Observable<boolean> {
    return this.http.delete<boolean>(`http://localhost:8890/RREGESTRATION-SERVICE/vehicles/${id}`);
  }


  public searchVehicle(keyword : string) : Observable<any>{
    return this.http.get<any>(`http://localhost:8890/RREGESTRATION-SERVICE/api/vehicle/pageVehicleName/${keyword}`);
  }


  getVehicle(id: number): Observable<Vehicle> {
    return this.http.get<Vehicle>(`http://localhost:8890/RREGESTRATION-SERVICE/api/vehicle/vehicles/${id}`);
  }

  getErrorMessage(field: string, error: ValidationErrors) {
    if(error['required']){
      return field + " is Required !";
    } else if(error['maxlength']){
      return field+" should have no more than " + error['maxlength']['requiredLength'] + " Characters !";
    } else if(error['min']) {
      return field + " must be more than " + error['min']['min'] ;
    }else return "Invalid Input!";
  }


  getAllVehiclesPages(page: number, size: number) : Observable<any>{
    return this.http.get<any>(`http://localhost:8890/REGESTRATION-SERVICE/api/vehicle/pageVehicle?page=${page}&size=${size}`);
  }

  getVehiclesCount(): Observable<number> {
    return this.http.get<number>('http://localhost:8890/REGESTRATION-SERVICE/api/vehicle/count');

  }

}
