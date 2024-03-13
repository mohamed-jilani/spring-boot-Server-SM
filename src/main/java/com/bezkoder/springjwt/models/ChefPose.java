package com.bezkoder.springjwt.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "ChefPoses")
@Getter
@Setter
public class ChefPose extends Responsable{
    private int expGrade;

}
