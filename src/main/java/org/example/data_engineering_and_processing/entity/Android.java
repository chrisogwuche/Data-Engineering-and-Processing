package org.example.data_engineering_and_processing.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@Getter
@Setter
public class Android {

    @Id
    private String id;
    private String name;
    private String model;
    @CreatedDate
    private Instant createdAt;
}
