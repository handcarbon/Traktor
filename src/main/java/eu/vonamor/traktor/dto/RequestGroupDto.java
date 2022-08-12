package eu.vonamor.traktor.dto;

import java.time.Instant;

public record RequestGroupDto(
        Long id,
        Long parentId,
        String name,
        String status,
        Instant createdAt,
        Instant updatedAt) {
}
