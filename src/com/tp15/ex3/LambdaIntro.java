package com.tp15.ex3;

public class LambdaIntro {

	public static void main(String[] args) {

		Calculateur addition = new Calculateur() {
			@Override
			public int calculer(int a, int b) {
				return a + b;
			}
		};

		// Même chose avec une expression lambda
		Calculateur additionLambda = (a, b) -> a + b;
		

		// Test des deux implémentations
		System.out.println("Addition traditionnelle: " + addition.calculer(5, 3));
		System.out.println("Addition avec lambda: " + additionLambda.calculer(5, 3));

	}

}
