import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bill } from 'src/app/model/Bill';
import { Detail } from 'src/app/model/Detail';
import { BillService } from 'src/app/Service/bill.service';

import { ServiceService } from 'src/app/Service/service.service';
import { ProductService } from 'src/app/Service/product.service';
import { Product } from 'src/app/model/Product';





@Component({
  selector: 'app-add-bill',
  templateUrl: './add-bill.component.html',
  styleUrls: ['./add-bill.component.css']
})
export class AddBillComponent implements OnInit {
  list:any=[];
  listya:any=[];
  productprice!:number;
  productob:Product={id_product:0,name:'',price:0,stock:0};
  listpro:any=[];

  billNew: Bill={
    num_bill:0,
    date_bill: new Date(),
    id_client:0};

  detailNew: Detail={
    num_detail:0,
    id_bill:1,
    id_product:0,
    amount:0,
    price:0
  }

  constructor(private billservice:BillService,private service:ServiceService,
    private productservice:ProductService, private router:Router) { }

  ngOnInit(): void {
    this.listClient();
    this.listProduct();
  }

  addall(){
    console.log("llegooooo")
    this.addBill();
    
    
  }

  addBill(){
    console.log(this.billNew.id_client);
    console.log(this.billNew.date_bill);
    console.log(this.billNew.num_bill);
    this.billservice.saveBill(this.billNew).subscribe(
      
      res=>{
        console.log(res);
        this.addDetail(res.num_bill);
        this.router.navigate(['/listat'])
      },
      err=>console.log(err)
    );
  }

 
  listClient(){
    this.service.getClients().subscribe(
      res=>{
        this.list=res;
      console.log(res);},
      err=>console.log(err)
    );
  }

  getProductPri(id_product:string){
    console.log("si llego po" + id_product);
    this.productservice.getProduct(id_product).subscribe(
      res=>{
        this.listya=res;
        ;
       console.log(this.listya.price);},
      err=>console.log(err)
    );
  }
  listProduct(){
    this.productservice.getProducts().subscribe(
      res=>{
        this.listpro=res;
      console.log(res);},
      err=>console.log(err)
    );
  }

  addDetail(id_bill:number){

    this.getProductPri(this.detailNew.id_product.toString());
    console.log("kf" + this.productprice);
    
    this.detailNew.price=this.productprice*this.detailNew.amount;
    this.billservice.saveDetail(this.detailNew).subscribe(
      res=>{
        console.log(res);
        this.router.navigate(['/listat'])
      },
      err=>console.log(err)
    );
  }


}
