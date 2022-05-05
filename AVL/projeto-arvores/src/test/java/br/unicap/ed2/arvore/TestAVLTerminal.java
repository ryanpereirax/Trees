package br.unicap.ed2.arvore;

import br.unicap.ed2.avl.ArvoreAVL;

class TestAVLTerminal {
    public static void main(String[] args) {
        // showcase de inserção
        // arvoreSoInserção();
        // arvoreInserçãoAleatoria();
        // arvoreSoDeleção();
        arvoreDeleçãoAleatoria();
        // arvoregrande();
        // arvoreValorRepetido();

    }

    public static void arvoreSoInserção() {
        ArvoreAVL a = new ArvoreAVL();
        a.inserir(1);
        a.inserir(2);
        a.inserir(5);
        a.inserir(3);
        a.inserir(4);

        a.imprimir("", a.raiz, false);

    }

    public static void arvoreInserçãoAleatoria() {
        ArvoreAVL b = new ArvoreAVL();
        b.inserir(1);
        b.inserir(7);
        b.inserir(9);
        b.inserir(3);
        b.inserir(2);

        b.imprimir("", b.raiz, false);

    }

    public static void arvoreSoDeleção() {
        ArvoreAVL c = new ArvoreAVL();
        c.inserir(1);
        c.inserir(2);
        c.deletar(2);

        c.imprimir("", c.raiz, false);

    }

    public static void arvoreDeleçãoAleatoria() {
        ArvoreAVL f = new ArvoreAVL();
        f.inserir(67);
        f.inserir(30);
        f.inserir(90);
        f.inserir(108);
        f.deletar(30);
        f.imprimir("", f.raiz, false);

    }

    public static void arvoregrande() {
        ArvoreAVL d = new ArvoreAVL();

        d.inserir(1);
        d.inserir(2);
        d.inserir(3);
        d.inserir(4);
        d.inserir(5);
        d.inserir(6);
        d.inserir(7);
        d.inserir(8);
        d.inserir(9);
        d.inserir(10);
        d.inserir(11);
        d.inserir(12);
        d.inserir(13);
        d.inserir(14);
        d.inserir(15);
        d.inserir(16);
        d.inserir(16);
        d.inserir(17);
        d.inserir(18);
        d.inserir(19);
        d.inserir(20);

        d.imprimir("", d.raiz, false);

    }

    public static void arvoreValorRepetido() {
        ArvoreAVL e = new ArvoreAVL();

        e.inserir(2);
        e.inserir(2);
        e.inserir(2);
        e.imprimir("", e.raiz, false);
    }

}
