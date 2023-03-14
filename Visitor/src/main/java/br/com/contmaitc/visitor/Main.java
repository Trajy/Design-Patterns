package br.com.contmaitc.visitor;

import static java.lang.System.out;

import br.com.contmaitc.visitor.antipattern.formas.FormaAntiPattern;
import br.com.contmaitc.visitor.antipattern.util.ListAntiPatternFactory;
import br.com.contmaitc.visitor.antipattern.util.XmlExportUtil;
import br.com.contmaitc.visitor.patten.formas.Forma;
import br.com.contmaitc.visitor.patten.util.ListPatternFactory;
import br.com.contmaitc.visitor.patten.visitor.XmlExportVisitor;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        antiPattern();
        earlyBinding();
        lateBinding();
    }

    // this implementation violates SRP and Open-Closed principles
    public static void antiPattern() {
        out.println("----- Visitor Anti Pattern -----\n");
        List<FormaAntiPattern> formasAntiPattern = ListAntiPatternFactory.createList();
        formasAntiPattern.forEach(
                formaAntiPattern -> formaAntiPattern.exportXml()
        );
    }

    // Just Overload Method visit()
    public static void earlyBinding() {
        out.println("\n\n----- Problem Solved by Visitor -----\n");
        List<FormaAntiPattern> formasAntiPattern = ListAntiPatternFactory.createList();
        formasAntiPattern.forEach(
                formaAntiPattern -> XmlExportUtil.visit(formaAntiPattern)
        );
    }

    // Double Dispach
    // Overload method visit() and Override method accept();
    public static void lateBinding() {
        out.println("\n\n----- Visitor Pattern -----\n");
        List<Forma> formas = ListPatternFactory.createListPattern();
        XmlExportVisitor xmlExportVisitor = new XmlExportVisitor();
        formas.forEach(
            forma -> forma.accept(xmlExportVisitor
        ));
    }
}
