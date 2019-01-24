import { NgModule } from '@angular/core';

import { Component } from '@angular/core';
import { Routes , RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { FinishComponent } from './finish/finish.component';
import { MenuComponent } from './menu/menu.component';
import { TabComponent } from './tab/tab.component';
import { ReserveQueueComponent } from './reserveQueue/reserveQueue.component';
import { QueueTableComponent } from './queueTable/queueTable.component';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';

import { FileworkComponent } from './filework/filework.component';

import { LastpageComponent } from './lastpage/lastpage.component';
import { RegistercusComponent } from './registercus/registercus.component';

import {MatCheckboxModule} from '@angular/material';
import {MatMenuModule} from '@angular/material/menu';
import {MatSelectModule} from '@angular/material/select';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatTableModule} from '@angular/material/table';

const routes: Routes = [
{ path: '', component:LoginComponent },
{ path: 'login', component:LoginComponent },
{ path: 'register',component: RegisterComponent },
{ path: 'finish', component:FinishComponent },
{ path: 'menu',component: MenuComponent },
{ path: 'tab',component: TabComponent },
{ path: 'registercus',component: RegistercusComponent },
{ path: 'lastpage', component:LastpageComponent },
{ path: 'filework',component: FileworkComponent },
{ path: 'reserveQueue' ,component:ReserveQueueComponent },
{ path: 'queueTable' ,component:QueueTableComponent },
];
@NgModule({
  imports: [RouterModule.forRoot(routes),
             BrowserAnimationsModule,
             NoopAnimationsModule,
             MatCheckboxModule,
             MatMenuModule,
             MatSelectModule,
             MatFormFieldModule,
             MatTableModule
  ],
  exports: [RouterModule,
            MatCheckboxModule,
            MatMenuModule,
            MatSelectModule,
            MatFormFieldModule,
            MatTableModule

  ],

})

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'System Analysis and Design 61 / 1';
}
