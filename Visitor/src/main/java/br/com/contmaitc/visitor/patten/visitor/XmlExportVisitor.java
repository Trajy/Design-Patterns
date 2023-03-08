package br.com.contmaitc.visitor.patten.visitor;

import br.com.contmaitc.visitor.patten.formas.Circulo;
import br.com.contmaitc.visitor.patten.formas.Forma;
import br.com.contmaitc.visitor.patten.formas.Ponto;
import br.com.contmaitc.visitor.patten.formas.Retangulo;
import static java.lang.System.out;

public class XmlExportVisitor implements Visitor {

    public void visit(Forma forma) {
        out.println("Esta e uma forma composta: " + forma.getClass().getSimpleName());
    }

    @Override
    public void visit(Circulo circulo) {
        String xml = "<centerX>" + circulo.x + "</centerX>" +
                "<centerY>" + circulo.y + "</centerY>" +
                "<radius>" + circulo.radius + "</radius>";
        out.println("circle = " + xml);
    }

    @Override
    public void visit(Ponto ponto) {
        String xml = "<centerX>" + ponto.x + "</centerX>" +
                "<centerY>" + ponto.y + "</centerY>";
        out.println("dot = " + xml);
    }

    @Override
    public void visit(Retangulo retangulo) {
        String xml = "<centerX>" + retangulo.x + "</centerX>" +
                "<centerY>" + retangulo.y + "</centerY>" +
                "<heigth>" + retangulo.altura + "</heigth>" +
                "<width>" + retangulo.largura + "</width>";
        out.println("rectangle = " + xml);
    }
}
