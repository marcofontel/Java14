package org.arca.records;

class Figura2d {
	
}

record Retangulo(double largura, double altura){}

public class TestRecords {
	
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(100, 122);
		System.out.println(r1.altura());
		System.out.println(r1.largura());
	}

}
