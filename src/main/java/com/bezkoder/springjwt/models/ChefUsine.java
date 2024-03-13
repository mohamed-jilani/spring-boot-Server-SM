package com.bezkoder.springjwt.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "ChefUsines")
@Getter
@Setter
public class ChefUsine extends Responsable{
    private String poste;

}
