import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class GameService {
  private apiUrl = 'http://localhost:8080/';

  constructor(private http: HttpClient) {}

  //getPlayers(): Observable<Player[]> {
  //  return this.http.get<Player[]>(`${this.apiUrl}/players`);
  //}

  startGame(): Observable<string> {
    return this.http.post(`${this.apiUrl}/start`, {}, { responseType: 'text' });
  }
}
