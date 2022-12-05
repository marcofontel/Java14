package org.arca.instanceofx;


public class TestInstaceOf {

	
	public static void main(String[] args) {
		Animal animal = new Gato();
		if(animal instanceof Gato dog) {
			animal.miau();
		} else {
			animal.late();
		}
	}
	
	
}
