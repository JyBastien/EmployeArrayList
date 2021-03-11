package modele;

public class Employe {
    private String nom,prenom;
    private int age;

    public Employe(String nom, String prenom, int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public String getPrenom() {
        return prenom;
    }
    public boolean equals(Employe e1){
        if (this.nom==e1.nom && this.prenom==e1.prenom && this.age==e1.age) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "Nom='" + nom + '\'' +
                ", Prénom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }
}
