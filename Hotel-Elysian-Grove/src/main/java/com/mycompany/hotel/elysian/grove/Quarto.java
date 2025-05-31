package com.mycompany.hotel.elysian.grove;

public class Quarto {
    private String numero, corredor, andar, valor;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String status() {
        return "------Dados do Quarto:------"+
                "\nNúmero: "+this.numero+
                "\nAndar: "+this.andar+
                "\nCorredor: "+this.corredor+
                "\nValor: R$"+this.valor+
                "\n";
    }
}
