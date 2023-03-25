package eu.vonamor.traktor.services;

import io.micronaut.security.authentication.AuthenticationResponse;
import io.micronaut.security.oauth2.endpoint.authorization.state.State;
import io.micronaut.security.oauth2.endpoint.token.response.OpenIdAuthenticationMapper;
import io.micronaut.security.oauth2.endpoint.token.response.OpenIdClaims;
import io.micronaut.security.oauth2.endpoint.token.response.OpenIdTokenResponse;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.List;

@Named("google")
@Singleton
public class UserDetailsMapper2 implements OpenIdAuthenticationMapper {

    @Override
    public AuthenticationResponse createAuthenticationResponse(String providerName,
                                                               OpenIdTokenResponse tokenResponse,
                                                               OpenIdClaims openIdClaims,
                                                               State state) {
        return AuthenticationResponse.success(openIdClaims.getEmail(), List.of("ROLE_ADMIN"));
    }
}