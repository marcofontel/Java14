package org.arca.nullpointexceptions;


public class TestNullPointer {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		System.out.println(aluno.getNome().substring(0, 1));
		
	}
}
