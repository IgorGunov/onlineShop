package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "characteristica")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Characteristica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
