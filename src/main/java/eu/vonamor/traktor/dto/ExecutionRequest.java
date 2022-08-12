package eu.vonamor.traktor.dto;

import java.util.List;

public class ExecutionRequest {
    private List<KeyValue> params;

    public ExecutionRequest() {
    }

    public List<KeyValue> getParams() {
        return params;
    }

    public void setParams(List<KeyValue> params) {
        this.params = params;
    }
}
