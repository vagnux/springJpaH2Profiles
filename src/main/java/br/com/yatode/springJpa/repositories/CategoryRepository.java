package br.com.yatode.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yatode.springJpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
