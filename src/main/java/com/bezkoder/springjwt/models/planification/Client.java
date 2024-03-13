package com.bezkoder.springjwt.models.planification;

import com.bezkoder.springjwt.models.enums.TtypeClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "Clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private long cin;
    private long tel1;
    private long tel2;

    private String email;
    private String adresse;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private TtypeClient typeClient;

}
