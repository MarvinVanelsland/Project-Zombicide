import { Routes } from '@angular/router';
import {PagePlayerListComponent} from './pages/page-player-list/page-player-list.component';
import {HomeComponent} from './pages/home/home.component';
import {SelectComponent} from './pages/select/select.component';

export const routes: Routes = [
  {
    path:'',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path:'home',
    component: HomeComponent
  },
  {
    path:'select',
    component: SelectComponent
  },
  {
    path:'player-list',
    component:PagePlayerListComponent
  }
];
