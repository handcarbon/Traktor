package eu.vonamor.traktor.repository;


import eu.vonamor.traktor.domain.RequestGroup;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.PageableRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface RequestGroupRepository extends PageableRepository<RequestGroup, Long> {

}
