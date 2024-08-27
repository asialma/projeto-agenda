package br.ufpb.dcx.ayla.agenda.gui;

import br.ufpb.dcx.ayla.agenda.Agenda;
import br.ufpb.dcx.ayla.agenda.AgendaAyla;
import br.ufpb.dcx.ayla.agenda.controller.*;

import javax.swing.*;
import java.awt.*;

public class AgendaGUI3 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon boloImg = new ImageIcon("./imgs/bolo.jpg");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_person.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_person.png");
    JButton botaoAdcionar, botaoPesquisar, botaoRemover;
    Agenda agenda = new AgendaAyla();

    public AgendaGUI3(){
        setTitle("Agenda de Aniversários");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);

        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(boloImg, JLabel.CENTER);

        botaoAdcionar = new JButton("Adicionar", addImg);
        botaoAdcionar.addActionListener(new AgendaAddController(agenda, this));
        botaoPesquisar = new JButton("Pesquisar", addImg);
        botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
        botaoRemover = new JButton("Remover", addImg);
        botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));

        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdcionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
