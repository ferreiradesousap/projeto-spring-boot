package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController   //para informar que a classe é um recurso web que é implementado por um controlador rest
@RequestMapping(value="/users") //Classe UserResource é um controlador rest que responde ao caminho users
public class UserResource {
	
	@Autowired //para que seja feita a injeção de dependência automática
	private UserService service;
	
	//tipo de método específico para retornar respostas de requisições web	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll(); 
		return ResponseEntity.ok().body(list); //vai retornar a resposta de sucesso do HTTP e no corpo da resposta vai retornar a listaa de usuários
	}
	
	@GetMapping(value = "/{id}") //também vai ser uma requisição do tipo GET que vai aceitar como parâmetro na url o id
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}







