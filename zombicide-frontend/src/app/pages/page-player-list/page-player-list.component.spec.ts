import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PagePlayerListComponent } from './page-player-list.component';

describe('PagePlayerListComponent', () => {
  let component: PagePlayerListComponent;
  let fixture: ComponentFixture<PagePlayerListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PagePlayerListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PagePlayerListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
