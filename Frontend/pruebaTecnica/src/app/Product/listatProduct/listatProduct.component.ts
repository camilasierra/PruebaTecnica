import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../Service/product.service';


@Component({
  selector: 'app-listatProduct',
  templateUrl: './listatProduct.component.html',
  styleUrls: ['./listatProduct.component.css']
})
export class ListatProductComponent implements OnInit {
  list:any=[];
  constructor(private productservice:ProductService) { }

  ngOnInit(): void {
   this.listProduct();
  }

  listProduct(){
    this.productservice.getProducts().subscribe(
      res=>{
        this.list=res;
      console.log(res);},
      err=>console.log(err)
    );
  }

}
