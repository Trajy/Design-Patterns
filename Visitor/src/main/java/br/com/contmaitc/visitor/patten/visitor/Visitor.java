package br.com.contmaitc.visitor.patten.visitor;

import br.com.contmaitc.visitor.patten.formas.Circulo;
import br.com.contmaitc.visitor.patten.formas.Forma;
import br.com.contmaitc.visitor.patten.formas.Ponto;
import br.com.contmaitc.visitor.patten.formas.Retangulo;

public interface Visitor {

    void visit(Forma forma);

    void visit(Circulo circulo);

    void visit(Ponto ponto);

    void visit(Retangulo retangulo);

}
