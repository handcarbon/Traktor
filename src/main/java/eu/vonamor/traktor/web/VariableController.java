package eu.vonamor.traktor.web;

import eu.vonamor.traktor.dto.Variable;
import eu.vonamor.traktor.services.VariableService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller("/api/v1/variables")
public class VariableController {

    private final VariableService variableService;

    public VariableController(VariableService variableService) {
        this.variableService = variableService;
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public Flux<Variable> getAll() {
        return variableService.getAll();
    }

    @Post(produces = MediaType.APPLICATION_JSON)
    public Mono<String> create(Variable v) {
        return variableService.create(v);
    }

    @Put(uri = "/{id}", produces = MediaType.APPLICATION_JSON)
    public Mono<String> update(@PathVariable Integer id, @Body Variable v) {
        return variableService.update(id, v);
    }
}
