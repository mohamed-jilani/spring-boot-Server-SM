package com.bezkoder.springjwt.models;

import com.bezkoder.springjwt.models.enums.TCategorieLivreur;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "Livreurs")
@Getter
@Setter
public class Livreur extends EmployeHoraire {
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private TCategorieLivreur categorie ;


}
