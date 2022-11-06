/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.util.ArrayList;
import modelos._Color;

/**
 *
 * @author lopez
 */
public class DColor {
    
    ArrayList<_Color> lista = new ArrayList<>();

    public DColor() {
    }

    public ArrayList<_Color> getLista() {
        return lista;
    }

    public void setLista(ArrayList<_Color> lista) {
        this.lista = lista;
    }
    
    public void addColor(_Color colour){
        this.lista.add(colour);
    
    }
    
}
