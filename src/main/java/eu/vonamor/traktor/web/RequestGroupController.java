package eu.vonamor.traktor.web;

import eu.vonamor.traktor.dto.RequestGroupDto;
import eu.vonamor.traktor.services.RequestGroupService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import reactor.core.publisher.Flux;

@Controller("/api/v1/request-group")
public class RequestGroupController {

    private final RequestGroupService groupService;

    public RequestGroupController(RequestGroupService groupService) {
        this.groupService = groupService;
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public Flux<RequestGroupDto> getAll() {
        return groupService.getAll();
    }

    @Post(produces = MediaType.APPLICATION_JSON)
    public void create(RequestGroupDto dto) {
        groupService.create(dto);
    }
}
