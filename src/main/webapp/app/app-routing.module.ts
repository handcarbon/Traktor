import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {AuditComponent} from "./components/audit/audit.component";
import {VariablesComponent} from "./components/variables/variables.component";
import {RequestsComponent} from "./components/requests/requests.component";
import {PermissionsComponent} from "./components/permissions/permissions.component";
import {SettingsComponent} from "./components/settings/settings.component";
import {SingleRequestComponent} from "./components/requests/single/single.component"; // CLI imports router

const routes: Routes = [
    {
        path: 'requests',
        children: [
            {path: '', component: RequestsComponent},
            {path: ':id', component: SingleRequestComponent}
        ]
    },
    {path: 'variables', component: VariablesComponent},
    {path: 'settings', component: SettingsComponent},
    {path: 'permissions', component: PermissionsComponent},
    {path: 'audit', component: AuditComponent},
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {
}