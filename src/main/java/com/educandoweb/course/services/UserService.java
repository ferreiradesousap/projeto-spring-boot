package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Component  //registra a classe como um componente do spring

@Service  
public class UserService {
	
	@Autowired //para que o spring faça a injeção de dependência
	private UserRepository repository;
	
	public List<User> findAll(){   //operação na camada de serviço (findAll) que repassa a chamada para repository.findAll
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get(); //retorna o objeto user que estiver dentro do optional
	}


}
