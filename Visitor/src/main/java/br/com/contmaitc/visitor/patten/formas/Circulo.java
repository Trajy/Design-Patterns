package br.com.contmaitc.visitor.patten.formas;

import br.com.contmaitc.visitor.patten.visitor.Visitor;

public class Circulo implements Forma {

    public Circulo(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int x;

    public int y;

    public int radius;

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
