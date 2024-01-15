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
@Table(name="brands")
public class Brand extends BaseEntity<Integer> {
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Model> models;
}

//Fuel,Transmission-->id,name