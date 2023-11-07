package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_shop")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(mappedBy = "contact_shop")
    private Shop shop;
}
