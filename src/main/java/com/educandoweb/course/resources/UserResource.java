package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController   //para informar que a classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value="/users") //controlador rest que responde no caminho users
public class UserResource {
	
	//tipo de método específico para retornar respostas de requisições web	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}







