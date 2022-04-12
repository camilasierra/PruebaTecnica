import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/model/Product';
import { ProductService } from 'src/app/Service/product.service';

@Component({
  selector: 'app-addProduct',
  templateUrl: './addProduct.component.html',
  styleUrls: ['./addProduct.component.css']
})
export class AddProductComponent implements OnInit {

  productNew: Product={
    id_product:0,
    name:'',
    price:0,
    stock:0
    };

  constructor(private router:Router, private service:ProductService) { }

  ngOnInit(): void {
  }

  addProduct(){
    this.service.saveProduct(this.productNew).subscribe(
      res=>{
        console.log(res);
        this.router.navigate(['/listat'])
      },
      err=>console.log(err)
    );
  }

  

}
