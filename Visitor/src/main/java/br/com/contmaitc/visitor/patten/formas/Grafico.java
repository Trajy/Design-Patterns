package br.com.contmaitc.visitor.patten.formas;

import br.com.contmaitc.visitor.patten.visitor.Visitor;
import java.util.List;

public class Grafico implements Forma {

    public List<Forma> formas;

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
