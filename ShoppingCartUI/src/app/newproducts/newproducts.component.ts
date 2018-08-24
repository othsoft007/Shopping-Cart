import { Component, OnInit } from '@angular/core';
import {ProductsService} from '../services/products.service';
declare var $: any;
@Component({
  selector: 'app-newproducts',
  templateUrl: './newproducts.component.html',
  styleUrls: ['./newproducts.component.css']
})
export class NewproductsComponent implements OnInit {

  constructor(private productsservice : ProductsService) { }
  oProducts : any;
  ngOnInit() {
    
    $(document).ready(function() {
      $('.owl-carousel').owlCarousel({
        loop:true,
        margin:10,
        nav:true,
        responsive:{
            0:{
                items:1
            },
            600:{
                items:3
            },
            1000:{
                items:5
            }   
        }
    });
           });
    this.productsservice.getProducts().subscribe(data=>{
        this.oProducts = data;
        console.log(this.oProducts);
      },
      error2 => {
        alert(error2)
      });


    
  }

}
