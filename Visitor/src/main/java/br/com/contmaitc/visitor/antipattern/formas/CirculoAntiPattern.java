package br.com.contmaitc.visitor.antipattern.formas;

import static java.lang.System.out;

public class CirculoAntiPattern implements FormaAntiPattern {

    public CirculoAntiPattern(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int x;

    public int y;

    public int radius;

    @Override
    public void desenhar() {

    }

    @Override
    public void pintar() {

    }

    @Override
    public void exportXml() {
        String xml = "<centerX>" + this.x + "</centerX>" +
                "<centerY>" + this.y + "</centerY>" +
                "<radius>" + this.radius + "</radius>";
        out.println("circle = " + xml);
    }

}
