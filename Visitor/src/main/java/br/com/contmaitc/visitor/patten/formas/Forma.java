package br.com.contmaitc.visitor.patten.formas;

import br.com.contmaitc.visitor.patten.visitor.Visitor;

public interface Forma {

     void desenhar();

     void pintar();
     void accept(Visitor visitor);
}
