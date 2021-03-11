package modele;

import java.util.ArrayList;

public class ListeEmploye {
    private ArrayList<Employe> liste;

    public ListeEmploye(){
        liste= new ArrayList();
    }
    public void ajouterEmploye(Employe nouvEmp) throws EmployeDejaPresent{
        boolean valide=true;
        for (Employe tmp : liste) {
            if (tmp.equals(nouvEmp)){
                valide = false;
                throw new EmployeDejaPresent(nouvEmp);
            }
        }
        liste.add(nouvEmp);
    }
    public void afficherListe(){
        for (Employe tmp : liste) {
            System.out.println(tmp);
        }
    }
}
