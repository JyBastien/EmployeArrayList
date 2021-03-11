package modele;

public class EmployeDejaPresent extends Exception{
    private String message;
    public EmployeDejaPresent(Employe e1){
        message="Impossible d'ajouter "+e1.getPrenom()+" il se trouve déjà dans la liste";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
