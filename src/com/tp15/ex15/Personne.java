package com.tp15.ex15;

public class Personne {
	private String nom;
    private String prenom;
    private int age;
    
    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return prenom + " " + nom + " (" + age + ")";
    }
}
