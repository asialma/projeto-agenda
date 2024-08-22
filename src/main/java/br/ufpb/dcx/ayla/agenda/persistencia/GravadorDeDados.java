package br.ufpb.dcx.ayla.agenda.persistencia;

import br.ufpb.dcx.ayla.agenda.Contato;

import java.io.*;
import java.util.HashMap;

public class GravadorDeDados {
   public static final String ARQUIVO_CONTATOS = "contatos.dat";

   public HashMap<String, Contato> recuperarContatos() throws IOException {
       try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_CONTATOS))){
           return (HashMap<String, Contato>) in.readObject();
       } catch (ClassNotFoundException e) {
           throw new IOException(e);
       }
   }

   public void salvarContatos(HashMap<String, Contato> contatos) throws IOException{
       try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream(ARQUIVO_CONTATOS))){
           in.writeObject(contatos);
       }
   }
}
