package br.com.yatode.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yatode.springJpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
