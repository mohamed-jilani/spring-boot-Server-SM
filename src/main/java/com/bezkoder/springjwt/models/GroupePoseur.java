package com.bezkoder.springjwt.models;

import com.bezkoder.springjwt.models.enums.TetatGroupPoseur;
import com.bezkoder.springjwt.models.planification.Commande;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GroupesPoseurs")
public class GroupePoseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, name = "etatGroupPoseur")
    private TetatGroupPoseur tetatGroupPoseur;

    @OneToMany(mappedBy = "groupePoseur")
    private List<Poseur> poseurs;

    @OneToOne
    @JoinColumn(name = "chefEquipe_id")
    private ChefEquipe chefEquipe;


}

