import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Bill } from '../model/Bill';
import { Detail } from '../model/Detail';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class BillService {
  url='http://localhost:8080/api/bills';
  urlde='http://localhost:8080/api/details';

  constructor(private http:HttpClient) { }
  getBills():Observable<any>{
    return this.http.get(this.url);
  }
  getBill(id:string):Observable<any>{
    return this.http.get(this.url+'/'+id);
  }
  saveBill(bill:Bill):Observable<any>{
    return this.http.post(this.url,bill);
  }

  editBill(id:string,bill:Bill):Observable<any>{
    return this.http.put(this.url+'/'+id,bill);
  }
  deleteBill(id:string):Observable<any>{
    return this.http.delete(this.url+'/'+id);
  }

  getDetails():Observable<any>{
    return this.http.get(this.urlde);
  }
  getDetail(id:string):Observable<any>{
    return this.http.get(this.urlde+'/'+id);
  }
  saveDetail(detail:Detail):Observable<any>{
    return this.http.post(this.urlde,detail);
  }

  editDetail(id:string,detail:Detail):Observable<any>{
    return this.http.put(this.urlde+'/'+id,detail);
  }
  deleteDetail(id:string):Observable<any>{
    return this.http.delete(this.urlde+'/'+id);
  }
}
