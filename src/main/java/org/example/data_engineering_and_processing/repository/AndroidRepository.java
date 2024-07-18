package org.example.data_engineering_and_processing.repository;

import org.example.data_engineering_and_processing.entity.Android;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndroidRepository extends MongoRepository<Android, String> {
}
