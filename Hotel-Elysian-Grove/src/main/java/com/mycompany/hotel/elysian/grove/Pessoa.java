package com.mycompany.hotel.elysian.grove;

public class Pessoa {
    private String nome, cpf, email, receberemail; //private

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReceberemail() {
        return receberemail;
    }

    public void setReceberemail(String receberemail) {
        this.receberemail = receberemail;
    }
    
    public String status(){
        return "------Dados do Cadastro:------"+
                "\nNome: "+this.nome+
                "\nCPF: "+this.cpf+
                "\nEmail: "+this.email+
                "\nReceber email? "+this.receberemail+
                "\n";
    }
}