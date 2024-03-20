package com.bezkoder.springjwt.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(	name = "Administrateurs")
@Getter
@Setter
public class Administrateur extends Utilisateur {

    private float salaire;

}
