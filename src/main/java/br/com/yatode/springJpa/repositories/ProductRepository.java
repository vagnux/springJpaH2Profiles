package br.com.yatode.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yatode.springJpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
