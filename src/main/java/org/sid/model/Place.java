package org.sid.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="place")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Place {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private int numero ;
	private double longitude , latitude , altitude ;
	@ManyToOne
	private Salle salle ;
	@OneToMany(mappedBy = "place")
	private List<Ticket> tickets;

}
