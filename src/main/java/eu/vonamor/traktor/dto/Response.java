package eu.vonamor.traktor.dto;

import java.time.Instant;
import java.util.List;

public class Response {
    private Long id;
    private Long requestId;
    private String url;
    private String httpMethod;
    private List<KeyValue> headers;
    private List<KeyValue> queryParams;
    private String body;
    private long duration;
    private Instant createdAt;

}
