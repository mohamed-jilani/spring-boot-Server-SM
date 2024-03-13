package com.bezkoder.springjwt.models.planification;

import com.bezkoder.springjwt.models.GroupePoseur;
import com.bezkoder.springjwt.models.Poseur;
import com.bezkoder.springjwt.models.enums.TetatCommande;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "Commandes" )
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private TetatCommande tetatCommande;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "commande")
    private List<Produit> produits;

    @OneToMany(mappedBy = "commande")
    private List<Reclamation> reclamations;

    @ManyToMany
    @JoinTable(
            name = "Commande_GroupePoseur",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "groupePoseur_id"))
    private List<GroupePoseur> groupesPoseurs;

}
