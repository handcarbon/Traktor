package eu.vonamor.traktor.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.rules.SecurityRule;

@Controller("/api/v1/user")
public class UserController {

    @Secured(SecurityRule.IS_AUTHENTICATED)
    @Get(produces = MediaType.APPLICATION_JSON)
    public String auth(Authentication authentication) {
        return authentication.getName() + " is authenticated";
    }
}
