package edu.joao.primeirasemana;

public class BoletimEstudantil {

  public static void main(String[] args) {

    int mediaFinal = 7;
    if (mediaFinal < 6)
      System.out.println("Aluno reprovado!");
    else if (mediaFinal == 6)
      System.out.println("Prova minerva!");
    else
      System.out.println("Aprovado!");
  }

}
