package eu.vonamor.traktor.web;

import eu.vonamor.traktor.dto.requests.TreeFolderDto;
import eu.vonamor.traktor.services.RequestTreeService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Flux;

@Controller("/api/v1/request-tree")
public class RequestTreeController {

    private final RequestTreeService requestTreeService;

    public RequestTreeController(RequestTreeService requestTreeService) {
        this.requestTreeService = requestTreeService;
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public Flux<TreeFolderDto> getAll() {
        return requestTreeService.getRequestsTree();
    }
}
