package com.etiya.cleanCodeDemo.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public class BaseEntity<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private T id;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;
    @Column(name = "updatedDate")
    private LocalDateTime updatedDate;
    @Column(name = "deletedDate")
    private LocalDateTime deletedDate;
}
