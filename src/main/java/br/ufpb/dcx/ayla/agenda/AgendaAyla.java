package br.ufpb.dcx.ayla.agenda;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;

    public AgendaAyla(Map<String, Contato> contatos) {
        this.contatos = new HashMap<>();
    }

    public AgendaAyla(){
        this(null);
    }

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        return false;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        return null;
    }

    @Override
    public boolean removeContato(String nome) throws ContatoInexistenteException {
        return false;
    }

    @Override
    public void salvarDados() throws IOException {

    }

    @Override
    public void recuperarDados() throws IOException {

    }
}
