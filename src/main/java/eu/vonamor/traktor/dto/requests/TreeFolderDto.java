package eu.vonamor.traktor.dto.requests;

import java.util.List;

public record TreeFolderDto(
        long id,
        String name,
        List<TreeRequestDto> requests,
        List<TreeFolderDto> folders) {
}
