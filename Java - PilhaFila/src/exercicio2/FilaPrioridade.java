/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mborges
 */
public class FilaPrioridade extends Fila{

    public FilaPrioridade() {
    }
    
    public FilaPrioridade(ArrayList<Integer> array) {
        super(array);
        Collections.sort(valores);
    }

    @Override
    public void Adicionar(int n) {
        valores.add(n);
        Collections.sort(valores);
    }

    @Override
    public void Remover(int i) {
       valores.remove(i);
    }
}
