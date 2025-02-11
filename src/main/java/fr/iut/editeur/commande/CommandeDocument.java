package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    abstract public void CommandeExecuter();

    @Override
    public void executer(){
        this.CommandeExecuter();
        System.out.println(this.document.toString());
    }
}
