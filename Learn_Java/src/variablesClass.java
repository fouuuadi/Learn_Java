public class variablesClass {

    public static void main(String[] args){
        byte monAge = 127;
        System.out.println(monAge);
        // Prix de la voiture que je veux acheter
        double prixVoiture = 50000;
        double frais = 50;
        double prixMensuel = (prixVoiture / 12.0)+ frais;

        prixVoiture = prixMensuel * 12;
        System.out.println(prixVoiture);
    }
}