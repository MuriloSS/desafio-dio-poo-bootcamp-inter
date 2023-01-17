package dominio;

import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Curso> mentoria;
	private Set<Curso> atividades;
	
	public Dev() {}

	public Dev(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Curso> getMentorias() {
		return mentorias;
	}

	public void setMentorias(Set<Curso> mentorias) {
		this.mentorias = mentorias;
	}

	public Set<Curso> getAtividades() {
		return atividades;
	}

	public void setAtividades(Set<Curso> atividades) {
		this.atividades = atividades;
	}
	
	
	

}
