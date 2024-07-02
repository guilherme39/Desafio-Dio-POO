package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosEscrito = new LinkedHashSet<>();
	private Set<Conteudo>conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp){
		this.conteudosEscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	public void progredir(){
		Optional<Conteudo> conteudo = this.conteudosEscrito.stream().findFirst();
		if(conteudo.isPresent()){
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosEscrito.remove(conteudo.get());
		}else {
			System.err.println("você não está matriculado em nenhum conteúdo");
		}
	}
	public double calcularTotalXp(){
		return this.conteudosConcluidos
		.stream()
		.mapToDouble(Conteudo::calcularXp)
		.sum();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudosEscrito() {
		return conteudosEscrito;
	}
	public void setConteudosEscrito(Set<Conteudo> conteudosEscrito) {
		this.conteudosEscrito = conteudosEscrito;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosEscrito, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosEscrito, other.conteudosEscrito) && Objects.equals(nome, other.nome);
	}
	
	
}
