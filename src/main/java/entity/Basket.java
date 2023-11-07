package entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private int sum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Product product;
}