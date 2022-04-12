import { Component, OnInit } from '@angular/core';
import { BillService } from '../../Service/bill.service';

@Component({
  selector: 'app-listat-bill',
  templateUrl: './listat-bill.component.html',
  styleUrls: ['./listat-bill.component.css']
})
export class ListatBillComponent implements OnInit {
  list:any=[];
  listdeta:any=[];
  constructor(private billservice:BillService) { }

  ngOnInit(): void {
    this.listBill();
    this.listDetail();
  }

  listBill(){
    this.billservice.getBills().subscribe(
      res=>{
        this.list=res;
      },
      err=>console.log(err)
    );
  }

  listDetail(){
    this.billservice.getDetails().subscribe(
      res=>{
        this.listdeta=res;
      },
      err=>console.log(err)
    );
  }

}


  

