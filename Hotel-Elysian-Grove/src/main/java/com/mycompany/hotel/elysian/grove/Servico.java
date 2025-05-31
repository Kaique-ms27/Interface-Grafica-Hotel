
package com.mycompany.hotel.elysian.grove;

public class Servico {
    private String nome, descricao, valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String status () {
        return "------Dados do Serviço:------"+
                "\nNome: "+this.nome+
                "\nDescrição:\n"+this.descricao+
                "\n\nValor: R$"+this.valor+
                "\n";
    }
}
