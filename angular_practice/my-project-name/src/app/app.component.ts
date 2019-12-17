import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pretty cool angular shit';
  name: string="pteradactyl";
  itemList: string=[] = ['item1', 'item2', 'item3', 'item4'] ;
  rectangle: rectangle = {
    length: 5,
    width: 6,
    area: function() {
       return this.length * this.width;
    }
  };
}
