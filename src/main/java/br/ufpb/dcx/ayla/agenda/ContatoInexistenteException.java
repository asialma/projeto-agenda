package br.ufpb.dcx.ayla.agenda;

public class ContatoInexistenteException extends Exception {
    public ContatoInexistenteException(String msg){
        super(msg);
    }

    public ContatoInexistenteException(){
        this("Contato inexistente");
    }
}
