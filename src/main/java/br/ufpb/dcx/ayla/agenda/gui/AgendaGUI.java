package br.ufpb.dcx.ayla.agenda.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUI extends JFrame {
    public AgendaGUI(){
        //Título da janela
        setTitle("Agenda de Aniversários");
        //Tamanho da janela
        setSize(400, 200);
        //Localização da janela na tela
        setLocation(150, 150);
        //Janela não redimensionável
        setResizable(false);
        //Pegar o contexto da tela e colocar uma cor de fundo
        getContentPane().setBackground(Color.lightGray);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
             public void windowClosing(WindowEvent e){
                 System.exit(0);
             }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
