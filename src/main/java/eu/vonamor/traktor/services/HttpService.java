package eu.vonamor.traktor.services;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

import static io.micronaut.http.HttpHeaders.ACCEPT;

@Singleton
public class HttpService {

    private final HttpClient httpClient;

    public HttpService(@Client HttpClient httpClient) {
        this.httpClient = httpClient;
    }


    public Mono<String> execute() {
        var uri = UriBuilder.of("https://showcase.api.linx.twenty57.net/UnixTime/fromunixtimestamp?unixtimestamp=1549892280")
                .build();

        HttpRequest<?> req = HttpRequest.GET(uri)
                .header(ACCEPT, "application/json");
        var r = Mono.from(httpClient.retrieve(req, Argument.of(String.class)));

        return r;
    }
}
