import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CarouselComponent } from './carousel/carousel.component';
import { CarouselModule } from 'ngx-bootstrap';
import { NewproductsComponent } from './newproducts/newproducts.component';
import { ProductsService } from './services/products.service';
import { HttpClientModule, HttpClient } from '@angular/common/http';

const appRoutes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CarouselComponent,
    NewproductsComponent
  ],
  imports: [
    BrowserModule,
    CarouselModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [ProductsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
