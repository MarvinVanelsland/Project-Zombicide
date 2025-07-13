import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common'; // <-- nécessaire pour *ngIf et *ngFor
import { Player } from '../../interfaces/player.interface';

@Component({
  selector: 'app-player-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './player-list.component.html',
  styleUrls: ['./player-list.component.scss']
})
export class PlayerListComponent implements OnInit {
  players: Player[] = [];

  ngOnInit(): void {
    this.loadFakePlayers();
  }

  loadFakePlayers(): void {
    this.players = [
      { name: 'Tom', health: 5, actionsRemaining: 2, role:"healer",isFlipped: false},
      { name: 'David', health: 5, actionsRemaining: 2, role:"healer",isFlipped: false},
      { name: 'James', health: 5, actionsRemaining: 2, role:"healer",isFlipped: false},
      { name: 'Ronaldo', health: 5, actionsRemaining: 2, role:"healer",isFlipped: false},

    ];
  }

  getAvatarForRole(role: string): string {
    const normalizedRole = role.toLowerCase();
    return `assets/roles/${normalizedRole}.png`;
  }

  toggleFlip(player: any): void {
    player.isFlipped = !player.isFlipped;
  }
}
