package entity;

import lombok.Data;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @Column(name = "client_id")
    private Client clientId;

    @Column(name = "date_and_time")
    private Timestamp dateAndTime;

    private String status;

    private int price;

    @Column(name = "count_product")
    private int countProduct;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @Column(name = "address_id")
    private Address address;
}