package entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class LikeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Product product;

}