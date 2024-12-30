package com.example.springdatar2dbc.repositories;

import com.example.springdatar2dbc.entities.Taco;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TacoRepository extends ReactiveCrudRepository<Taco, Long> {
}
