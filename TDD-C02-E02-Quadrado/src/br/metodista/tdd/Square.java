/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.metodista.tdd;

/**
 *
 * @author Leandro
 */
public class Square {
    private int heigth;
    public int width;
    
    public int area(int ladoa, int ladob) {
        return ladoa * ladob;
    }
    
    public void setHeigth(int newHeight) {
        if (newHeight < 0) {
            newHeight *= -1;
        }
        
        this.heigth = newHeight;
    }
    
    public void setWidth(int newWidth) {
        if (newWidth < 0) {
            newWidth *= -1;
        }
        
        this.width = newWidth;
    }
}