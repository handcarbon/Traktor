package eu.vonamor.traktor.services;

import eu.vonamor.traktor.dto.ExecutionRequest;
import eu.vonamor.traktor.dto.RequestTemplate;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

@Singleton
public class StoredRequestsService {

    public Mono<String> execute(Integer id, ExecutionRequest req) {
        return null;
    }

    public Mono<String> create(RequestTemplate template) {
        return null;
    }

    public Mono<String> update(Integer id, RequestTemplate template) {
        return null;
    }
}
