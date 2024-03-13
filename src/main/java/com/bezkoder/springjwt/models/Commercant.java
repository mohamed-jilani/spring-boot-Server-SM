package com.bezkoder.springjwt.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "Commercants")
@Getter
@Setter
public class Commercant extends Responsable{
    private String poste;
}
