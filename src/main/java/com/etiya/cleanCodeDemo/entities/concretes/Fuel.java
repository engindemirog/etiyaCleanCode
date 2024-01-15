package com.etiya.cleanCodeDemo.entities.concretes;

import com.etiya.cleanCodeDemo.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "fuels")
public class Fuel extends BaseEntity<Integer> {
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "fuel")
    private List<Model> models;
}

//Task 1: User should be able to add a brand,model,fuel,transmission,car to the system
//Task 2: One brand can contain max 5 models
//Task 3: Name fields can not be duplicated
