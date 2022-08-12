package eu.vonamor.traktor.dto;

import java.time.Instant;
import java.util.List;

public class Request {
    private Long id;

    // optional, can be one off
    private Long templateId;
    private String url;
    private String httpMethod;
    private String name;
    private List<KeyValue> headers;
    private List<KeyValue> queryParams;
    private String body;

    private Instant createdAt;
}
