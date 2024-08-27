package br.ufpb.dcx.ayla.agenda.controller;

import br.ufpb.dcx.ayla.agenda.Agenda;
import br.ufpb.dcx.ayla.agenda.ContatoInexistenteException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaRemoveController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaRemoveController(Agenda agenda, JFrame janelaPrincipal){
        this.agenda = agenda;
        this.janelaPrincipal = janelaPrincipal;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome do aniversariante?");
        try {
            boolean removeu = agenda.removeContato(nome);

            if (removeu){
                JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante não foi encontrado. Operação não realizada!");
            }

        } catch (ContatoInexistenteException ex) {
            throw new RuntimeException(ex);
        }



    }
}
