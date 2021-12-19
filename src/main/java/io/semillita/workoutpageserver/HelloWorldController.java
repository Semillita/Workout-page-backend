package io.semillita.workoutpageserver;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;

@RestController
public class HelloWorldController {
	public int i;
	
	@GetMapping("/hello-world")
	public List<String> helloWorld(@RequestParam(name = "name", required = false, defaultValue = "Hugo") String name) {
		return Arrays.asList(new String("Hello " + name + "!"));
	}
	
}