package example.model;

import lombok.Data;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;

import org.springframework.data.annotation.Id;

@Document(collection = "dog")
@Data
public class Dog {
    @Id
    private String id;
    private String breed;
    private String color;

    @PartitionKey
    private String dogCatagory;
}
