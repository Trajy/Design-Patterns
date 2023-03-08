package br.com.contmaitc.visitor.antipattern.formas;

import static java.lang.System.out;

public class RetanguloAntiPattern implements FormaAntiPattern {

    public RetanguloAntiPattern(int x, int y, int altura, int largura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
    }
    public int x;

    public int y;

    public int altura;

    public int largura;

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
                "<heigth>" + this.altura + "</heigth>" +
                "<width>" + this.largura + "</width>";
        out.println("rectangle = " + xml);
    }
}
