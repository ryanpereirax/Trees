package br.unicap.ed2.arvore;

import br.unicap.ed2.avl.ArvoreAVL;

class TestAVLTerminal {
    public static void main(String[] args) {
        // showcase de inserção

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

        a.imprimir("", a.raiz, false);

    }

}
