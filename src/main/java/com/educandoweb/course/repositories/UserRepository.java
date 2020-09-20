package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;
											//<Entidade, Tipo do Id da entidade>
public interface UserRepository extends JpaRepository<User, Long>{
	//não necessita definir a implementação da interface pois o Spring JPA já possui implementação padrão para essa interface
	

}
