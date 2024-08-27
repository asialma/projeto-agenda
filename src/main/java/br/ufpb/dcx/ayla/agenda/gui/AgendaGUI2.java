package br.ufpb.dcx.ayla.agenda.gui;

import javax.swing.*;
import java.awt.*;

public class AgendaGUI2 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon boloImg = new ImageIcon("./imgs/bolo.jpg");

    public AgendaGUI2() {
        setTitle("Agenda de Aniversários");
        setSize(400, 600);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);

        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(boloImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3, 1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
