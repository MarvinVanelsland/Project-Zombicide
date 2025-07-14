import { Component } from '@angular/core';
import {PlayerListComponent} from '../../components/player-list/player-list.component';

@Component({
  selector: 'app-page-player-list',
  imports: [
    PlayerListComponent
  ],
  templateUrl: './page-player-list.component.html',
  styleUrl: './page-player-list.component.scss'
})
export class PagePlayerListComponent {

}
