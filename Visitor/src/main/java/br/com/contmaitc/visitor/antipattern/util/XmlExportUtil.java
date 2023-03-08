package br.com.contmaitc.visitor.antipattern.util;

import static java.lang.System.out;

import br.com.contmaitc.visitor.antipattern.formas.CirculoAntiPattern;
import br.com.contmaitc.visitor.antipattern.formas.FormaAntiPattern;
import br.com.contmaitc.visitor.patten.formas.Ponto;
import br.com.contmaitc.visitor.patten.formas.Retangulo;

public final class XmlExportUtil {

    private XmlExportUtil() { }

    public static void visit(FormaAntiPattern formaAntiPattern) {
        out.println("Esta e uma forma composta: " + formaAntiPattern.getClass().getSimpleName());
    }

    public static void visit(CirculoAntiPattern circuloAntiPattern) {
        String xml = "<centerX>" + circuloAntiPattern.x + "</centerX>" +
                "<centerY>" + circuloAntiPattern.y + "</centerY>" +
                "<radius>" + circuloAntiPattern.radius + "</radius>";
        out.println("circle = " + xml);
    }

    public static void visit(Ponto pontoAntiPattern) {
        String xml = "<centerX>" + pontoAntiPattern.x + "</centerX>" +
                "<centerY>" + pontoAntiPattern.y + "</centerY>";
        out.println("dot = " + xml);
    }

    public static void visit(Retangulo retanguloAntiPattern) {
        String xml = "<centerX>" + retanguloAntiPattern.x + "</centerX>" +
                "<centerY>" + retanguloAntiPattern.y + "</centerY>" +
                "<heigth>" + retanguloAntiPattern.altura + "</heigth>" +
                "<width>" + retanguloAntiPattern.largura + "</width>";
        out.println("rectangle = " + xml);
    }
}
