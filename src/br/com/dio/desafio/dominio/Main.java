package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("boot camp java developer");
		bootcamp.setDescricao("descrição boot camp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGuilherme = new Dev();
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devGuilherme.getConteudosEscrito());
		
		devGuilherme.progredir();
		devGuilherme.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos" + devGuilherme.getConteudosEscrito());
		System.out.println("Conteúdos Concluidos" + devGuilherme.getConteudosConcluidos());
		System.out.println("XP:" + devGuilherme.calcularTotalXp());
		
		System.out.println("-------");
	
		
		Dev devGleyce = new Dev();
		devGleyce.setNome("Gleyce");
		devGleyce.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devGleyce.getConteudosEscrito());
		
		devGleyce.progredir();
		devGleyce.progredir();
		devGleyce.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos" + devGleyce.getConteudosEscrito());
		System.out.println("Conteúdos Concluidos" + devGleyce.getConteudosConcluidos());
		System.out.println("XP:" + devGleyce.calcularTotalXp());

	}

}
