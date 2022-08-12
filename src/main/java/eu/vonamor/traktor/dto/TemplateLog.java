package eu.vonamor.traktor.dto;

import java.time.Instant;
import java.util.List;

public class TemplateLog {
    private Long id;
    private Long templateId;
    private String url;
    private String httpMethod;
    private String name;
    private List<KeyValue> headers;
    private List<KeyValue> queryParams;
    private String body;
    private boolean isLocked;

    // replaced in header, query params, url when executions
    private List<String> parameters;
    private Long groupId;

    private Instant createdAt;
    private Instant updatedAt;
}
