package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String town;

    private String street;

    @Column(name = "number_house")
    private int numberHouse;

    @Column(name = "number_flat")
    private int numberFlat;

    private String notes;
}