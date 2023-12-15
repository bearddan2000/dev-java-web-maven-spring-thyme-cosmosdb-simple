package example.repository;

import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

import example.model.Dog;

@Repository
public interface DogRepository extends CosmosRepository<Dog, String>{}
