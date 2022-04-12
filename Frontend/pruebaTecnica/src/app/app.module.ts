import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListatComponent } from './Client/listat/listat.component';
import { EditComponent } from './Client/edit/edit.component';
import { AddComponent } from './Client/add/add.component';

import { ListatProductComponent } from './Product/listatProduct/listatProduct.component';
import { EditProductComponent } from './Product/editProduct/editProduct.component';
import { AddProductComponent } from './Product/addProduct/addProduct.component';

import { FormsModule } from '@angular/forms';
import { ServiceService } from '../app/Service/service.service';
import { HttpClientModule } from '@angular/common/http';
import { ListatBillComponent } from './Bill/listat-bill/listat-bill.component';
import { AddBillComponent } from './Bill/add-bill/add-bill.component';
import { EditBillComponent } from './Bill/edit-bill/edit-bill.component';
import { ListatDetailComponent } from './Detail/listat-detail/listat-detail.component';



@NgModule({
  declarations: [
    AppComponent,
    ListatComponent,
    EditComponent,
    AddComponent,
    ListatProductComponent,
    EditProductComponent,
    AddProductComponent,

    ListatBillComponent,
    AddBillComponent,
    EditBillComponent,
    ListatDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
