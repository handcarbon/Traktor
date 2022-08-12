package eu.vonamor.traktor.dto.security;

import java.time.Instant;
import java.util.Set;

public class Role {
    private Long id;
    private String rolename;
    private Set<Long> allowedGroups;
    private Set<Long> allowedRequests;

    private Instant createdAt;
    private Instant updatetAt;

}
