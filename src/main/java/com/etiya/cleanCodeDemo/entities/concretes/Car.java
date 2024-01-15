package com.etiya.cleanCodeDemo.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cars")
public class Car {
    @Column(name="modelYear")
    private int modelYear;
    @Column(name="plate")
    private String plate;
    @Column(name="state")//1-Available 2-Rented 3-Under Maintenance
    private int state;
    @Column(name="dailyPrice")
    private double dailyPrice;
    @ManyToOne()
    @JoinColumn(name="model_id")
    private Model model;
}
