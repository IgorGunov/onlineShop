package entity;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
public class FeedBack {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "number_telephone")
    private int numberTelephone;

    private String name;

    private String email;

    private String tg;

    private String notes;

    private Date date;

    private boolean processed;
}