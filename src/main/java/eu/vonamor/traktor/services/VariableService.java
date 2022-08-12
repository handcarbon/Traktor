package eu.vonamor.traktor.services;

import eu.vonamor.traktor.dto.Variable;
import jakarta.inject.Singleton;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Singleton
public class VariableService {

    public Flux<Variable> getAll() {
        return null;
    }

    public Mono<String> create(Variable v) {
        return null;
    }

    public Mono<String> update(Integer id, Variable v) {
        return null;
    }
}
