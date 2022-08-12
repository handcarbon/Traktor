package eu.vonamor.traktor.services;

import eu.vonamor.traktor.dto.requests.TreeFolderDto;
import eu.vonamor.traktor.dto.requests.TreeRequestDto;
import io.micronaut.http.HttpMethod;
import jakarta.inject.Singleton;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.List;

@Singleton
public class RequestTreeService {

    public Flux<TreeFolderDto> getRequestsTree() {
        var r4 = new TreeRequestDto(4L, "Request 4", HttpMethod.DELETE);
        var r3 = new TreeRequestDto(3L, "Request 3", HttpMethod.PUT);
        var r2 = new TreeRequestDto(2L, "Request 2", HttpMethod.POST);
        var r1 = new TreeRequestDto(1L, "Request 1", HttpMethod.GET);

        var f3 = new TreeFolderDto(3L, "Folder 3", Collections.emptyList(), Collections.emptyList());
        var f2 = new TreeFolderDto(2L, "Folder 2", List.of(r4, r3), Collections.emptyList());
        var f1 = new TreeFolderDto(1L, "Folder 1", List.of(r2, r1), List.of(f3, f2));

       return Flux.just(f1);
    }
}
