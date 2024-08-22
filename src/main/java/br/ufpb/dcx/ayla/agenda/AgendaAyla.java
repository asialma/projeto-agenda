package br.ufpb.dcx.ayla.agenda;

import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;

public class AgendaAyla implements Agenda {
    private HashMap<String, Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla(Map<String, Contato> contatos) {
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    public AgendaAyla() {
        this(new HashMap<>());
    }

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        Contato contato = new Contato(nome, dia, mes);
        if (this.contatos.containsKey(nome)) {
            return false;
        } else {
            contatos.put(nome, contato);
            return true;
        }
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        Collection<Contato> aniversariantesPesquisados = new ArrayList<>();
        for (Contato c : contatos.values()) {
            if (c.getDiaAniversario() == dia && c.getMesAniversario() == mes) ;
            {
                aniversariantesPesquisados.add(c);
            }
        }
        return aniversariantesPesquisados;
    }

    @Override
    public boolean removeContato(String nome) throws ContatoInexistenteException {
        if (this.contatos.containsKey(nome)) {
            contatos.remove(nome);
            return true;
        }
        throw new ContatoInexistenteException("Contato inexistente na agenda");
    }

    @Override
    public void salvarDados() throws IOException {
        try {
            gravador.salvarContatos(this.contatos);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void recuperarDados() throws IOException {
        try {
            this.contatos = gravador.recuperarContatos();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
