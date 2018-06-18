package by.pipeline.jar.repository;

import by.pipeline.jar.model.PipeTasks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface PipeTasksRepository extends CrudRepository<PipeTasks, Long> {

    @Override
    Optional<PipeTasks> findById(Long aLong);

    @Override
    <S extends PipeTasks> S save(S s);

    @Override
    List<PipeTasks> findAll();

    @Override
    void deleteById(Long aLong);
}
