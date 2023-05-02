/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

/**
 *
 * @author Carlos Matos
 */
public class TestaAlunos {
    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno();
        
        Aluno1.nome = "Carlos";
        Aluno1.RGM = 29622182;
        Aluno1.media = 10;
        Aluno1.faltas = 3;
        
        Aluno Aluno2 = new Aluno(8, 6);
        
        Aluno2.RGM = 53688426;
        Aluno2.nome = "Paulo";
        
        Aluno1.ExibeDados();
        Aluno2.ExibeDados();
        
    }
    
}
