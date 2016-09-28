/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

/**
 *
 * @author a1502522
 */
class Animal {

    String nome;
    String cor;
    String ambiente;
    int comprimento;
    float velocidade;
    int patas;

    Animal() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }
    
    public void dados(){
        
          
        System.out.println("Nome animal : " + this.nome);
        System.out.println("Cor :" + this.cor);
        System.out.println("Ambiente :" + this.ambiente);
        System.out.println("Comprimento : "+ this.comprimento);
        System.out.println("Velocidade : " + this.velocidade);
        System.out.println("Patas : " + this.patas);
    }

}
