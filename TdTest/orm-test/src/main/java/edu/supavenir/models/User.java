package edu.supavenir.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Organisation organisation;
	
	@ManyToMany (mappedBy = "users")
	private List<Groupe> groups;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	public List<Groupe> getGroups() {
		return groups;
	}

	public void setGroups(List<Groupe> groups) {
		this.groups = groups;
	}
	
	
}
