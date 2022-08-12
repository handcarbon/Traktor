import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {AppRoutingModule} from "./app-routing.module";
import {VariablesComponent} from "./components/variables/variables.component";
import {AuditComponent} from "./components/audit/audit.component";
import {RequestsComponent} from "./components/requests/requests.component";
import {PermissionsComponent} from "./components/permissions/permissions.component";
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {SettingsComponent} from "./components/settings/settings.component";
import {HttpClientModule} from "@angular/common/http";
import {SingleRequestComponent} from "./components/requests/single/single.component";
import {RequestTreeComponent} from "./components/requests/request-tree.component";

@NgModule({
    declarations: [
        AppComponent,
        VariablesComponent,
        AuditComponent,
        RequestsComponent,
        RequestTreeComponent,
        SingleRequestComponent,
        PermissionsComponent,
        SettingsComponent
    ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        AppRoutingModule,
        FontAwesomeModule,
        HttpClientModule,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
