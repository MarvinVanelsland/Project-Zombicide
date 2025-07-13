import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {PlayerListComponent} from './components/player-list/player-list.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, PlayerListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'zombicide-frontend';
}
