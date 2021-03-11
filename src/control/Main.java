package control;

import modele.Employe;
import modele.EmployeDejaPresent;
import modele.ListeEmploye;

public class Main {
    public static void main(String[] args) {
        ListeEmploye liste = new ListeEmploye();
        Employe e1 = new Employe("Chapdelaine","Michel",62);
        Employe e2 = new Employe("Walberg","Mark",53);
        Employe e3 = new Employe("Terrien","Roland",35);
        Employe e4 = new Employe("Bosse","Réal",45);
        Employe e5 = new Employe("Terrien","Roland",35);



        try {
            liste.ajouterEmploye(e1);
        }catch (EmployeDejaPresent ex1){
            System.out.println(ex1.getMessage());
        }
        try {
            liste.ajouterEmploye(e2);
        }catch (EmployeDejaPresent ex1){
            System.out.println(ex1.getMessage());
        }
        try {
            liste.ajouterEmploye(e3);
        }catch (EmployeDejaPresent ex1){
            System.out.println(ex1.getMessage());
        }
        try {
            liste.ajouterEmploye(e4);
        }catch (EmployeDejaPresent ex1){
            System.out.println(ex1.getMessage());
        }
        try {
            liste.ajouterEmploye(e5);
        }catch (EmployeDejaPresent ex1){
            System.out.println(ex1.getMessage());
        }
        liste.afficherListe();


    }
}
