package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document,parameters);
    }

    @Override
    public void CommandeExecuter(){
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String chaine;
        if(parameters.length==3){
            chaine ="";
        }
        else{
            chaine = parameters[3];
        }
        this.document.remplacer(debut,fin,chaine);
    }
}
