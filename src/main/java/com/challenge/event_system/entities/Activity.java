package com.challenge.event_system.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_activity")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@Column(columnDefinition = "TEXT")
	private String description;
	private Double price;
	
	@OneToMany(mappedBy = "activitys")
	private List<Category> category = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "block_id")
	private Block blocks;
	
	@ManyToOne
	@JoinColumn(name = "participants_id")
	private Participant participants;
	
	public Activity() {}

	public Activity(Integer id, String name, String description, Double price, Block blocks, Participant participants) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.blocks = blocks;
		this.participants = participants;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Participant getParticipants() {
		return participants;
	}

	public void setParticipants(Participant participants) {
		this.participants = participants;
	}

	public Block getBlock() {
		return blocks;
	}

	public void setBlock(Block blocks) {
		this.blocks = blocks;
	}

	public List<Category> getCategory() {
		return category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		return Objects.equals(id, other.id);
	}
	

}
