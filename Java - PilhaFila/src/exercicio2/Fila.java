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
public class Fila extends ED {

    public Fila() {
    }

    public Fila(ArrayList<Integer> array) {
        super(array);
    }

    
    @Override
    public void Adicionar(int n) {
        valores.add(n);
    }

    @Override
    public void Remover(int i) {
        valores.remove(i);
    }
}
