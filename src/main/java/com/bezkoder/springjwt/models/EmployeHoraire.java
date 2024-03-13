package com.bezkoder.springjwt.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "EmployeHoraires")
@Getter
@Setter
public class EmployeHoraire extends User{
    private int nombreHT;
    private float coutHoraire;
}
