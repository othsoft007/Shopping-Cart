import { Component } from '@angular/core';

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

  public loading = true;
}
