
package com.mycompany.hotel.elysian.grove;

public class Funcionario {
    private String nomeFunc, cpfFunc, emailFunc;

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(String cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public String getEmailFunc() {
        return emailFunc;
    }

    public void setEmailFunc(String emailFunc) {
        this.emailFunc = emailFunc;
    }
    
    public String status(){
        return "------Dados do Cadastro:------"+
                "\nNome: "+this.nomeFunc+
                "\nCPF: "+this.cpfFunc+
                "\nEmail: "+this.emailFunc+
                "\n";
    }
}
