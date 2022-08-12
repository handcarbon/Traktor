package eu.vonamor.traktor.web;

import eu.vonamor.traktor.dto.ExecutionRequest;
import eu.vonamor.traktor.dto.RequestTemplate;
import eu.vonamor.traktor.services.StoredRequestsService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import reactor.core.publisher.Mono;

@Controller("/api/v1/stored-requests")
public class RequestController {

    private final StoredRequestsService storedRequestsService;

    public RequestController(StoredRequestsService storedRequestsService) {
        this.storedRequestsService = storedRequestsService;
    }

    @Post(produces = MediaType.APPLICATION_JSON)
    public Mono<String> create(RequestTemplate template) {
        return storedRequestsService.create(template);
    }

    @Put(uri = "/{id}", produces = MediaType.APPLICATION_JSON)
    public Mono<String> update(@PathVariable Integer id, @Body RequestTemplate template) {
        return storedRequestsService.update(id, template);
    }

    @Post(uri = "/{id}/execute", produces = MediaType.APPLICATION_JSON)
    public Mono<String> execute(@PathVariable Integer id, @Body ExecutionRequest req) {
        return storedRequestsService.execute(id, req);
    }
}
