package br.com.contmaitc.visitor.patten.formas;

import br.com.contmaitc.visitor.patten.visitor.Visitor;

public class Retangulo implements Forma {

    public Retangulo(int x, int y, int altura, int largura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
    }
    public int x;

    public int y;

    public int altura;

    public int largura;

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
