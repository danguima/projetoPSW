/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopsw2;

/**
 *
 * @author Daniel
 */
public class Aluno {
    
    int frequencia;
    float prova;
    float trabalho;
    float projetos;  
    float provaFinal;
    
    /**
     * Metodo para verificar se o aluno foi aprovado ou reprovado na disciplina de PSW /
     * 
     * calculo da media = 0.7 * ((prova+trabalho)/2) + (projetos * 0.3)
     * 
     * @param frequencia
     * @param prova
     * @param trabalho
     * @param projetos
     * @param provaFinal
     * @return true ou false
     */
    public boolean situacao(int frequencia, float prova, float trabalho, float projetos, float provaFinal){
        float media = 0;
        media = (float) (0.7 * ((prova+trabalho)/2) + (projetos * 0.3));
        
        if (frequencia >= 75){
            if (media >= 7){
                return true; // aprovado
            }else if (media < 3) {
                return false; // reprovado
            }else{
                // foi pra prova final
                if ( ((provaFinal + media)/2) >=5){
                    return true; // aprovado
                }else{
                    return false; // reprovado
                }  
            }
            
        }else{
            return false; // reprovado por faltas
        }
    }
    
}
