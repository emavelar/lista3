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
public class Peixes extends Animal {
    
    String caracteristica;

    public Peixes(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Peixes(String caracteristica, String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        super(nome, cor, ambiente, comprimento, velocidade, patas);
        this.caracteristica = caracteristica;
    }
    
    

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void dados(){
        System.out.println("Peixe");
        System.out.println("Nome animal : " + this.nome);
        System.out.println("Cor :" + this.cor);
        System.out.println("Ambiente :" + this.ambiente);
        System.out.println("Comprimento : "+ this.comprimento);
        System.out.println("Velocidade : " + this.velocidade);
        System.out.println("Caracteristica :" + this.caracteristica);
    
    }
    
    
    
    
    
}
