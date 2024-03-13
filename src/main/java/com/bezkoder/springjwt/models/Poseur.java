package com.bezkoder.springjwt.models;

import com.bezkoder.springjwt.models.enums.TCategoriePoseur;
import com.bezkoder.springjwt.models.enums.TSpecialitePoseur;
import com.bezkoder.springjwt.models.enums.TtypePoseur;
import lombok.*;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "Poseurs")
@Getter
@Setter
public class Poseur extends EmployeHoraire{

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private TCategoriePoseur categoriePoseur;
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private TSpecialitePoseur specialitePoseur;
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private TtypePoseur typePoseur;

    @ManyToOne
    @JoinColumn(name = "groupePoseur_id")
    private GroupePoseur groupePoseur;
}
