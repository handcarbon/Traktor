package eu.vonamor.traktor.domain;

import eu.vonamor.traktor.dto.KeyValue;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.http.HttpMethod;

import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;

@MappedEntity
public class RequestTemplate {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private Long id;

    @NotNull
    private String url;

    @NotNull
    private HttpMethod httpMethod;

    @NotNull
    private String name;

    private List<KeyValue> headers;

    private List<KeyValue> queryParams;

    @NotNull
    private String body;

    private boolean isLocked;

    // replaced in header, query params, url when executions
    private List<String> parameters;

    @NotNull
    private Long groupId;

    @NotNull
    private String status;

    @NotNull
    private Instant createdAt;

    @NotNull
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}