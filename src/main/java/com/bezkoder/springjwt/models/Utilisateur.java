package com.bezkoder.springjwt.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "Utilisateur",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "cin")
        })
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Utilisateur extends User{
    @Null
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;

    @Null
    @Size(max = 255)
    @Column(name = "prenom")
    private String prenom;

    @Null
    @Column(name = "tel")
    private Long tel;

    @Null
    @Size(max = 255)
    @Column(name = "adresse")
    private String adresse;


    @Null
    @Column(name = "cin")
    private Long cin;

}
