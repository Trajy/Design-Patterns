package br.com.contmaitc.visitor.antipattern.util;

import br.com.contmaitc.visitor.antipattern.formas.CirculoAntiPattern;
import br.com.contmaitc.visitor.antipattern.formas.FormaAntiPattern;
import br.com.contmaitc.visitor.antipattern.formas.PontoAntiPattern;
import br.com.contmaitc.visitor.antipattern.formas.RetanguloAntiPattern;
import java.util.ArrayList;
import java.util.List;

public final class ListAntiPatternFactory {

    private ListAntiPatternFactory() { }

    public static List<FormaAntiPattern> createList() {
        return new ArrayList<>() {{
            add(new CirculoAntiPattern(2, 4, 5));
            add(new CirculoAntiPattern(100, 400, 600));
            add(new RetanguloAntiPattern(3, 5, 9, 8));
            add(new RetanguloAntiPattern(100, 500, 900, 300));
            add(new PontoAntiPattern(200, 500));
        }};
    }
}
