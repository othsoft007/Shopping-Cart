import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'the Shopping Cart';
  menu = {
    home: "Home",
    about: "About Us",
    produts: "Producs",
    contact: "Contact"

  }
  count = 0;
  openDialog(){
    this.count = this.count +1;
  }
  public loading = true;

  
}
