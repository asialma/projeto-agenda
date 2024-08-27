package br.ufpb.dcx.ayla.agenda.controller;

import br.ufpb.dcx.ayla.agenda.Agenda;
import br.ufpb.dcx.ayla.agenda.Contato;
import br.ufpb.dcx.ayla.agenda.gui.AgendaGUI3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class AgendaSearchController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaSearchController(Agenda agenda, JFrame janelaPrincipal) {
        this.agenda = agenda;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o dia do mês em que nasceu? [1-31]"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o mês em que nasceu? [1-12]"));
        Collection<Contato> aniversariantesPesq = agenda.pesquisaAniversariantes(dia, mes);

        if (aniversariantesPesq.size() > 0) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariantes encontrados:");
            for (Contato c : aniversariantesPesq) {
                JOptionPane.showMessageDialog(janelaPrincipal, c.toString());
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Não foi encontrado nenhum aniversariante!");
        }
    }
}
