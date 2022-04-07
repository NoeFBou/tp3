public class Cryptomonnaie{
    private String nom;
    private double valeurDeJeton; // Imaginons en euros

    public Cryptomonnaie(String nom, double valeurDeJeton){
        this.nom = nom;
        this.valeurDeJeton = valeurDeJeton;
    }
    public String getNom(){return this.nom; }

    public double getValeurDeJeton(){return this.valeurDeJeton;}
}
