import java.util.ArrayList;

public class CryptoMarche {

    private ArrayList<Portefeuille> portefeuilles;
    private static CryptoMarche marche;

    private CryptoMarche(){
        portefeuilles = new ArrayList<Portefeuille>();
    }

    public static CryptoMarche getInstance(){
        if(marche == null){ marche = new CryptoMarche();}
		return marche;
    }

    public void ajouter(Portefeuille p){
        portefeuilles.add(p);
    }

    /**
     * Cette fonction recherche sur le marché tous les portefeuilles
     * du propriétaire et calcule son capital en euros.
     * @param proprietare
     * @return capital en euros du propriétare.
     */
    public double capitalEnEuros(String proprietaire)
    {
        double tmp=0.0;

        for (Portefeuille portefeuil : portefeuilles)
        {
            if(portefeuil.estProprietaire(proprietaire))
                tmp+=portefeuil.valeurEnEuros();
        }
        return tmp;
    }

    /**
     * Cette fonction recherche sur le marché tous les portefeuilles
     * d'un type de devise et calcule le volume total de capital de
     * cette devise sur le marché
     * @param monnaie
     * @return capital total en circulation de la cryptomonnaie (en euros).
     */
    public double capitalMonneaie(Cryptomonnaie monnaie)
    {
        double tmp =0.0;

        for (Portefeuille portefeuille : portefeuilles)
        {
            if(portefeuille.getMonnaie().equals(monnaie))
            tmp+= portefeuille.valeurEnEuros();
        }


        return tmp;

    }

    @Override
    public String toString() {
        String ret = "";
        for(Portefeuille p : this.portefeuilles){
            ret += p.toString() + "\n";
        }
        return ret;
    }



}
