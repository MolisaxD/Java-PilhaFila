/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;

/**
 *
 * @author mborges
 */
public abstract class ED {
    protected ArrayList<Integer> valores = new ArrayList();

    public ED() {

    }

    public ED(ArrayList<Integer> valores) {
        this.valores = valores;
    }
    
    public int getValor(int i) {
        return this.valores.get(i);
    }
    
    public abstract void Adicionar(int n);

    
    public abstract void Remover(int i);
        
}
