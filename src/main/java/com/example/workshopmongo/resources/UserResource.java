package com.example.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User vinicius = new User("1", "Vinicius", "vinis02p@gmail.com");
		User maria = new User("2", "Maria", "maria@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(vinicius, maria));
		return ResponseEntity.ok(list);
	}
}
