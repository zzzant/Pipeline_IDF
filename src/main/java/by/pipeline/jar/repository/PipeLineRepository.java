package by.pipeline.jar.repository;

import by.pipeline.jar.model.PipeLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PipeLineRepository extends CrudRepository<PipeLine, Long> {
    @Override
    <S extends PipeLine> S save(S s);

    @Override
    long count();

    @Override
    Optional<PipeLine> findById(Long aLong);

    @Override
    List<PipeLine> findAll();

    @Override
    void deleteById(Long aLong);


}
