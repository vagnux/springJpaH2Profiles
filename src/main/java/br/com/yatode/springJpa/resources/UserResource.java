package br.com.yatode.springJpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yatode.springJpa.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"Vagner Rodrigues","vagnux@gamil.com","11971779852","W09RU230R0293F09");
		return ResponseEntity.ok().body(u);
	}	
	
}
