package com.dhanu.modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "cardId", referencedColumnName = "id")
	private Card card;
	
	@OneToMany(mappedBy = "page", cascade = CascadeType.ALL)
	private List<Sentense> sentenses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public List<Sentense> getSentenses() {
		return sentenses;
	}

	public void setSentenses(List<Sentense> sentenses) {
		this.sentenses = sentenses;
	}
	
	

}
