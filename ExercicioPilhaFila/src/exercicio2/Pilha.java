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
public class Pilha extends ED {

    public Pilha() {
    }

    public Pilha(ArrayList<Integer> valores) {
        super(valores);
    }

    @Override
    public void Adicionar(int n) {
        valores.add(0, n);
    }

    @Override
    public void Remover(int i) {
        valores.remove(i);
    }
    
}
