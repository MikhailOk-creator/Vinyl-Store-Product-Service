package ru.okhapkin.vinylstore.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.okhapkin.vinylstore.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
