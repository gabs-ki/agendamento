package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

//	Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade() { //Construtor Default / Padrão
        this.contador++;
        this.codigo = contador;
    }

    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    

//	Métodos de acesso aos atributos
    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;

            JOptionPane.showMessageDialog(null, "Especialidade " + "> " + nome + " <" + " setada com sucesso! ");

        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido!\nDeve conter pelo menos 3 letras! ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;

        } else {
            JOptionPane.showMessageDialog(null, descricao + " não é válida para uma descrição!\n digite novamente! ");
        }
    }

    public String getDescricao() {
        return this.descricao;
    }

}
