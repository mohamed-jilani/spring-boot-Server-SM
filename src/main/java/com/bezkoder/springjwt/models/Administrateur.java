package com.bezkoder.springjwt.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "Administrateurs")
@Getter
@Setter
public class Administrateur extends User {

    private float salaire;

}
