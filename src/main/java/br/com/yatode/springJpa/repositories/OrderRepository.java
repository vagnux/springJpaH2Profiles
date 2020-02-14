package br.com.yatode.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yatode.springJpa.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
