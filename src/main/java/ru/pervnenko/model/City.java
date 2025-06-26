package ru.pervnenko.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ruName;
    private String enName;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
