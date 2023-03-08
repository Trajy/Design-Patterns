package br.com.contmaitc.visitor.antipattern.formas;

import static java.lang.System.out;

public class PontoAntiPattern implements FormaAntiPattern {

    public PontoAntiPattern(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int x;

    public int y;

    @Override
    public void desenhar() {

    }

    @Override
    public void pintar() {

    }

    @Override
    public void exportXml() {
        String xml = "<centerX>" + this.x + "</centerX>" +
                "<centerY>" + this.y + "</centerY>";
        out.println("dot = " + xml);
    }
}
