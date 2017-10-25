package eschool.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import eschool.dao.TaskRepository;
import eschool.model.Task;


@Service
@Transactional
public class TaskService {
	
	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<Task> findAll(){
		
		return (List<Task>) taskRepository.findAll();
	}
		
}
