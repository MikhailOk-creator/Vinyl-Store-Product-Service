package ru.okhapkin.vinylstore.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.okhapkin.vinylstore.productservice.model.Vinyl;

public interface VinylRepository extends MongoRepository<Vinyl, String> {
}
