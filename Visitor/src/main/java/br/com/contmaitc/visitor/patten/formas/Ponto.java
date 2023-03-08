package br.com.contmaitc.visitor.patten.formas;

import br.com.contmaitc.visitor.patten.visitor.Visitor;

public class Ponto implements Forma {

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int x;

    public int y;

    @Override
    public void desenhar() {

    }

    @Override
    public void pintar() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
