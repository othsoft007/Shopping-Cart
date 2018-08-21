import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-carousel',
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.css']
})
export class CarouselComponent implements OnInit {

  constructor() { }
  oCarouselItems = [
                    {id: 1, title: "Item 1", description: "item 1", src:"../../assets/carousel/item1.jpg"},
                    {id: 2, title: "item 2", description: "item 2", src:"../../assets/carousel/item2.jpg"},
                    {id: 3, title: "item 3", description: "item 3", src:"../../assets/carousel/item3.jpg"},
                  ]
  ngOnInit() {
     
  }

}
