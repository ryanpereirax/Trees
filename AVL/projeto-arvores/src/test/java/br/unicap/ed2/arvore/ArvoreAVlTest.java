package br.unicap.ed2.arvore;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.unicap.ed2.avl.NoAVL;
import br.unicap.ed2.avl.ArvoreAVL;

public class ArvoreAVlTest {

    @Test
    public void testaLLRaiz() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(3);
        a.inserir(2);
        a.inserir(1);
        NoAVL aux = a.procurar(2);
        assertTrue(aux != null);
        NoAVL auxDir = aux.getDireita();
        NoAVL auxEsq = aux.getEsquerda();
        assertTrue(auxEsq != null);
        assertTrue(auxEsq.getData() == 1);
        assertTrue(auxDir != null);
        assertTrue(auxDir.getData() == 3);
        assertTrue(a.isRoot(2));

    }

    @Test
    public void testaLLMeio() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(10);
        a.inserir(20);
        a.inserir(5);
        a.inserir(4);
        a.inserir(7);
        a.inserir(30);
        a.inserir(15);
        a.inserir(2);
        a.inserir(1);
        NoAVL aux = a.procurar(2);
        assertTrue(aux != null);
        NoAVL auxDir = aux.getDireita();
        NoAVL auxEsq = aux.getEsquerda();
        assertTrue(auxEsq != null);
        assertTrue(auxEsq.getData() == 1);
        assertTrue(auxDir != null);
        assertTrue(auxDir.getData() == 4);

    }

    @Test
    public void testaBalanceamento() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(1);
        a.inserir(2);
        a.inserir(3);
        a.inserir(4);
        a.inserir(5);
        a.inserir(6);
        a.inserir(7);
        a.deletar(2);
        a.deletar(6);
    }

    @Test
    public void testaRR2Raiz() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(1);
        a.inserir(2);
        a.inserir(3);
        NoAVL aux = a.procurar(2);
        assertTrue(aux != null);
        NoAVL auxDir = aux.getDireita();
        NoAVL auxEsq = aux.getEsquerda();
        assertTrue(auxEsq != null);
        assertTrue(auxEsq.getData() == 1);
        assertTrue(auxDir != null);
        assertTrue(auxDir.getData() == 3);
        assertTrue(a.isRoot(2));

    }

    @Test
    public void testaRRMeio() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(50);
        a.inserir(10);
        a.inserir(60);
        a.inserir(20);
        a.inserir(5);
        a.inserir(70);
        a.inserir(40);
        a.inserir(80);
        a.inserir(90);
        NoAVL aux = a.procurar(80);
        assertTrue(aux != null);
        NoAVL auxDir = aux.getDireita();
        NoAVL auxEsq = aux.getEsquerda();
        assertTrue(auxEsq == null);
        // assertTrue( auxEsq.getData() == 70 );
        assertTrue(auxDir != null);
        assertTrue(auxDir.getData() == 90);

    }

    @Test
    public void testaDelete() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(1);
        a.inserir(2);
        a.inserir(3);
        a.inserir(4);
        a.inserir(5);
        a.inserir(6);
        a.deletar(2);

        NoAVL aux = a.procurar(2);
        assertTrue(aux == null);
    }

    @Test
    public void testaLRMeio() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(10);
        a.inserir(20);
        a.inserir(5);
        a.inserir(4);
        a.inserir(7);
        a.inserir(30);
        a.inserir(15);
        a.inserir(2);
        a.inserir(3);
        NoAVL aux = a.procurar(3);
        assertTrue(aux != null);
        NoAVL auxDir = aux.getDireita();
        NoAVL auxEsq = aux.getEsquerda();
        assertTrue(auxEsq != null);
        assertTrue(auxEsq.getData() == 2);
        assertTrue(auxDir != null);
        assertTrue(auxDir.getData() == 4);

    }

    @Test
    public void testaRotação() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(1);
        a.inserir(2);
        a.inserir(5);
        a.inserir(3);
        a.inserir(4);
        a.deletar(4);
        NoAVL aux = a.procurar(2);
        NoAVL auxDir = aux.getDireita();
        assertTrue(auxDir.getData() == 5);

    }

    @Test
    public void testaRLMeio() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(50);
        a.inserir(10);
        a.inserir(60);
        a.inserir(20);
        a.inserir(5);
        a.inserir(70);
        a.inserir(40);
        a.inserir(80);
        a.inserir(75);
        NoAVL aux = a.procurar(75);
        assertTrue(aux != null);
        NoAVL auxDir = aux.getDireita();
        NoAVL auxEsq = aux.getEsquerda();
        assertTrue(auxEsq == null);
        // assertTrue( auxEsq.getData() == 70 );
        assertTrue(auxDir == null);
        // assertTrue( auxDir.getData() == 80 );
    }
}
