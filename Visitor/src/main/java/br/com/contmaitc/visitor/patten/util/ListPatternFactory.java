package br.com.contmaitc.visitor.patten.util;

import br.com.contmaitc.visitor.patten.formas.Circulo;
import br.com.contmaitc.visitor.patten.formas.Forma;
import br.com.contmaitc.visitor.patten.formas.Grafico;
import br.com.contmaitc.visitor.patten.formas.Ponto;
import br.com.contmaitc.visitor.patten.formas.Retangulo;
import br.com.contmaitc.visitor.patten.formas.TelaDesenho;
import java.util.ArrayList;
import java.util.List;

public final class ListPatternFactory {

    private ListPatternFactory() { }

    public static List<Forma> createListPattern() {
        List<Forma> formas =  new ArrayList<>();
        formas.add(new Circulo(4,6,10));
        formas.add(new Circulo(3,4,5));
        formas.add(new Ponto(2,5));
        formas.add(new Retangulo(1,3,4,8));
        formas.add(new Grafico() {{
            this.formas = new ArrayList<>();
            this.formas.add(new Circulo(3,4,5));
            this.formas.add(new Ponto(2,5));
        }});
        Grafico grafico = new Grafico();
        grafico.formas = new ArrayList<>();
        grafico.formas.add(new Circulo(3,4,5));
        grafico.formas.add(new Ponto(2,5));
        formas.add(grafico);
        formas.add(new TelaDesenho());
        return formas;
    }
}
