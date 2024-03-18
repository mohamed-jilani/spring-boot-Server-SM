package com.bezkoder.springjwt.models;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class User extends AbstractEntity{

	@Setter
	@Getter
	@NotBlank
	@Size(max = 255)
	private String username;

	@Null
	@Size(max = 255)
	private String nom;

	@Null
	@Size(max = 255)
	private String prenom;

	@Null
	private Long tel;

	@Null
	@Size(max = 255)
	private String adresse;


	@Null
	private Long cin;


	@Setter
	@Getter
	@NotBlank
	@Size(max = 255)
	@Email
	private String email;

	@Setter
	@Getter
	@NotBlank
	@Size(max = 120)
	private String password;

	@Setter
	@Getter
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.setCreationDate(new Date().toInstant());
	}

}
