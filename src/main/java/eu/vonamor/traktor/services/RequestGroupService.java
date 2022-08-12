package eu.vonamor.traktor.services;

import eu.vonamor.traktor.domain.RequestGroup;
import eu.vonamor.traktor.dto.RequestGroupDto;
import eu.vonamor.traktor.repository.RequestGroupRepository;
import jakarta.inject.Singleton;
import reactor.core.publisher.Flux;

import java.time.Instant;

@Singleton
public class RequestGroupService {

    private final RequestGroupRepository groupRepository;

    public RequestGroupService(RequestGroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Flux<RequestGroupDto> getAll() {
//        return Flux.fromIterable(groupRepository.findAll())
//                .map(req ->
//                        new RequestGroupDto(req.getId(), req.getParentId(), req.getName(), req.getStatus(), req.getCreatedAt(), req.getCreatedAt())
//                );

        var g1 = new RequestGroupDto(1L, 0L, "API", "OK", Instant.now(), Instant.now());
        var g2 = new RequestGroupDto(2L, 0L, "WEB", "OK", Instant.now(), Instant.now());

        return Flux.just(g1, g2);
    }

    public void create(RequestGroupDto dto) {
        var group = new RequestGroup();
        group.setName(dto.name());
        group.setStatus(dto.status());
        // TODO
        // group.setParentId();
        group.setCreatedAt(Instant.now());
        group.setUpdatedAt(group.getUpdatedAt());

        groupRepository.save(group);
    }
}
