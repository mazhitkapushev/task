package eschool.dao;

import org.springframework.data.repository.CrudRepository;

import eschool.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
		
}
