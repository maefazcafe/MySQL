package com.farmacia.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
	@Table(name = "Produtos")
	public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@OneToMany(mappedBy = "remedio", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("remedio")
		private List<Categoria> categoria;
		
		@NotNull
		public String nome;
		
		@NotNull
		public double preco;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public List<Categoria> getCategoria() {
			return categoria;
		}
		
		public void setCategoria(List<Categoria> categoria) {
			this.categoria = categoria;
		}

}
