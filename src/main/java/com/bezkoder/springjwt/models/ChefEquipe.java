package com.bezkoder.springjwt.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "ChefEquipes")
@Getter
@Setter
public class ChefEquipe extends Responsable{
    private int grade;

    @OneToMany(mappedBy = "chefEquipe")
    private List<Vehicule> vehicules;

    @OneToOne(mappedBy = "chefEquipe")
    private GroupePoseur groupePoseur;
}
