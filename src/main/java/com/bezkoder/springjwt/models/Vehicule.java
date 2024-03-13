package com.bezkoder.springjwt.models;

import com.bezkoder.springjwt.models.enums.TSpecialitePoseur;
import com.bezkoder.springjwt.models.enums.TtypeVehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "Vehicules" ,
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "codeSerie")
        })
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String codeSerie;
    private float coutTheoriqueH;
    private float coutTheoriqueKilo;

    @Column(name = "emprunte")
    private boolean emprunte = false;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private TtypeVehicule typeVehicule;

    @OneToOne(optional = true) // Permettre la valeur nulle
    @JoinColumn(name="chargeVehicule_id")
    private ChargeVehicule chargeVehicule;

    @ManyToOne // Un véhicule est associé à un seul livreur ou chef d'équipe
    @JoinColumn(name="livreur_id")
    private Livreur livreur;

    @ManyToOne // Un véhicule est associé à un seul livreur ou chef d'équipe
    @JoinColumn(name="chefEquipe_id")
    private ChefEquipe chefEquipe;

}
