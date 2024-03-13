package com.bezkoder.springjwt.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "ChargeVehicules")
@Getter
@Setter
public class ChargeVehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float energie;
    private Date entretient;
    private float taxe;
    private float valeur;
    private Date date;

}
