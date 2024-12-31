package com.example.springdatar2dbc.repositories;

import com.example.springdatar2dbc.entities.TacoOrder;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface OrderRepository extends ReactiveCrudRepository<TacoOrder, UUID> {
}
