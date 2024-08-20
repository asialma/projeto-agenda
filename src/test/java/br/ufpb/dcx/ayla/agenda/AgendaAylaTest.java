package br.ufpb.dcx.ayla.agenda;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaAylaTest {

    @Test
    public void testaCadastroPesquisaRemocao(){
        AgendaAyla agenda = new AgendaAyla();
        //Verifica se tem algum aniversariante cadastrado
        Collection<Contato> contatosAchados = agenda.pesquisaAniversariantes(20, 8);
        assertTrue(contatosAchados.isEmpty());

        //Cadastra dois novos contatos e verifica se existe aniverssariantes com a data 20/08
        agenda.cadastraContato("Maria", 20, 8);
        agenda.cadastraContato("José", 20, 8);
        contatosAchados = agenda.pesquisaAniversariantes(20, 8);
        assertEquals(2, contatosAchados.size());

        //Cria os contatos maria e jose e verifica se em contatosAchados tem maria e jose
        Contato maria = new Contato("Maria", 20, 8);
        assertTrue(contatosAchados.contains(maria));
        Contato jose = new Contato("José", 20, 8);
        assertTrue(contatosAchados.contains(jose));

        //Remove e verifica se removeu
        try {
            boolean removeu = agenda.removeContato("José");
            assertTrue(removeu);
        } catch (ContatoInexistenteException e){
            fail("Lançou exceção quando não deveria!");
        }
    }
}
