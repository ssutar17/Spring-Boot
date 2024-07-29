package com.searchApi.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	private boolean available;

	@CreationTimestamp
	private LocalDateTime datecreated;

	@UpdateTimestamp
	private LocalDateTime dateUpdated;

	public Product(long id, String name, boolean available, LocalDateTime datecreated, LocalDateTime dateUpdated) {
		super();
		this.id = id;
		this.name = name;
		this.available = available;
		this.datecreated = datecreated;
		this.dateUpdated = dateUpdated;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public LocalDateTime getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(LocalDateTime datecreated) {
		this.datecreated = datecreated;
	}

	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}
