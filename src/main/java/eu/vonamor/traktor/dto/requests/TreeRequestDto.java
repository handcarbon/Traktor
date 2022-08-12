package eu.vonamor.traktor.dto.requests;

import io.micronaut.http.HttpMethod;

public record TreeRequestDto(
        long id,
        String name,
        HttpMethod method) {
}
