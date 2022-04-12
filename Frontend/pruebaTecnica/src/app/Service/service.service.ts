import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Client } from '../model/Client';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  url='http://localhost:8080/api/clients';
  constructor(private http:HttpClient) { }
  getClients():Observable<any>{
    return this.http.get(this.url);
  }
  getClient(id:string):Observable<any>{
    return this.http.get(this.url+'/'+id);
  }
  saveClient(client:Client):Observable<any>{
    return this.http.post(this.url,client);
  }

  editClient(id:string,client:Client):Observable<any>{
    return this.http.put(this.url+'/'+id,client);
  }
  deleteClient(id:string):Observable<any>{
    return this.http.delete(this.url+'/'+id);
  }
}
