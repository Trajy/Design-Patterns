package br.com.contmaitc.visitor.patten.formas;

import br.com.contmaitc.visitor.patten.visitor.Visitor;

public class TelaDesenho implements Forma {



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
