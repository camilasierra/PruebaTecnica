import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../model/Product';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ProductService {
  url='http://localhost:8080/api/products';
  constructor(private http:HttpClient) { }
  getProducts():Observable<any>{
    return this.http.get(this.url);
  }
  getProduct(id:string):Observable<any>{
    return this.http.get(this.url+'/'+id);
  }
  saveProduct(product:Product):Observable<any>{
    return this.http.post(this.url,product);
  }

  editProduct(id:string,product:Product):Observable<any>{
    return this.http.put(this.url+'/'+id,product);
  }
  deleteProduct(id:string):Observable<any>{
    return this.http.delete(this.url+'/'+id);
  }
}
