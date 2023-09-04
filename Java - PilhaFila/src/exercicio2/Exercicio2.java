/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author mborges
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pilha teste = new Pilha();
        teste.Adicionar(1); teste.Adicionar(2); teste.Adicionar(3); teste.Adicionar(4); teste.Adicionar(5);
        
        teste.Remover(0);
        
         for (int t : teste.valores) {
            System.out.println(t);
         }
         
         System.out.println("---------------------------------------");
         
         Fila teste2 = new Fila();
         teste2.Adicionar(8); teste2.Adicionar(4); teste2.Adicionar(3); teste2.Adicionar(6); teste2.Adicionar(9);
         
         teste2.Remover(2);
         
         for (int t : teste2.valores) {
             System.out.println(t);
         }
         
         System.out.println("---------------------------------------");
         
         FilaPrioridade teste3 = new FilaPrioridade();
         teste3.Adicionar(8); teste3.Adicionar(4); teste3.Adicionar(3); teste3.Adicionar(6); teste3.Adicionar(9);    
        
         teste3.Remover(4);
         
         for (int t : teste3.valores) {
             System.out.println(t);
         }
        
        
    }
    
}
