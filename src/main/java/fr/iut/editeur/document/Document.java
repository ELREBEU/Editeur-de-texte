package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin){
        String portion = texte.substring(debut, fin+1);
        portion = portion.toUpperCase();
        remplacer(debut, fin, portion);
    }

    public void effacer(int debut, int fin){
        String portion = "";
        remplacer(debut, fin, portion);
    }

    public void clear(){
        setTexte("");
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
