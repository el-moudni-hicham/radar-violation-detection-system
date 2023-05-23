import { Injectable } from '@angular/core';
import {Observable, of, throwError} from "rxjs";
import {UserAppModel} from "../models/userApp.model";

@Injectable({
  providedIn: 'root'
})
export class AuthentificationsService {
  appUsers: UserAppModel[]=[];
  authenticatUser :UserAppModel|undefined|any;

  constructor() {
    this.appUsers.push({userId:2,username:"hicham",password:"hicham",roles:["ADMIN","USER"]});
    this.appUsers.push({userId:1,username:"user",password:"user",roles:["USER"]});
    this.appUsers.push({userId:3,username:"admin",password:"admin",roles:["ADMIN"]});

    // Check for authenticated user in local storage on initialization
    const storedUser = localStorage.getItem("user");
    if (storedUser) {
      const { username, roles } = JSON.parse(storedUser);
      this.authenticatUser = { username, roles, password: '' };
    }
  }

  public login(username:string,password:string):Observable<UserAppModel>{
    let userAppModel = this.appUsers.find(user=>user.username==username);
    if(userAppModel==undefined){
      return throwError(()=>new Error("this user doesn't exist"));
    }
    if(userAppModel.password!=password){
      return throwError(()=>new Error("password incorrect"));
    }
    return of(userAppModel);
  }
  public authenticat(user:UserAppModel):Observable<boolean>{
    this.authenticatUser=user;
    localStorage.setItem("user",JSON.stringify({username:user.username,roles:user.roles,jwt:"JWT Athentification"}))
    return of(true)
  }
  public hasRole(role:string):boolean{
    return (this.authenticatUser!.roles.includes(role));
  }
  public isAuthenticat():boolean{
    return (this.authenticatUser!=undefined);
  }
  public logout():Observable<boolean>{
    this.authenticatUser=undefined;
    localStorage.removeItem("user");
    return of(true);
  }
}
