/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Aluno;

/**
 *
 * @author Carlos Matos RGM: 29622182
 */
public class Aluno {
    public String nome;
    public int RGM;
    public float media;
    public int faltas;
    
    public Aluno(){
        // Construtor vazio
    }
    
    public Aluno(float media, int faltas){
        this.media = media;
        this.faltas = faltas;
    }
    
    public void ExibeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("RGM: " + this.RGM);
        System.out.println("Media: " + this.media);
        System.out.println("Faltas: " + this.faltas);
    }
}
