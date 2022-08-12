package eu.vonamor.traktor.dto;

import java.time.Instant;

public class ExecutionLog {
    private Long id;
    private Long requestId;
    private Long responseId;

    private Instant createdAt;
    private Instant updatedAt;
}
