package com.challenge.event_system.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_block")
public class Block {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant begin;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant ending;
	
	@OneToMany(mappedBy = "blocks")
	private List<Activity> activity = new ArrayList<>();
	
	public Block () {}
	
	public Block(Integer id, Instant begin, Instant ending) {
		this.id = id;
		this.begin = begin;
		this.ending = ending;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getBegin() {
		return begin;
	}

	public void setBegin(Instant begin) {
		this.begin = begin;
	}

	public Instant getending() {
		return ending;
	}

	public void setending(Instant ending) {
		this.ending = ending;
	}

	public List<Activity> getActivity() {
		return activity;
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
		Block other = (Block) obj;
		return Objects.equals(id, other.id);
	}
	
}
