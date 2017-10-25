package eschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eschool.model.Task;
import eschool.service.TaskService;

@RestController
public class SampleRestController {
	@Autowired
	TaskService taskService;
	
	@GetMapping ("/hello")
	public String hello() {
		return "Hello world!";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	public List<Task> test() {
		return taskService.findAll();
	}
}
