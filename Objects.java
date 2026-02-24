/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objects;

/**
 *
 * @author SMAM
 */
public class Objects {

    public static void main(String[] args) {
        arr A = new arr(6);
        A.setA(0,30);
        A.setA(1,60);
        A.setA(2,50);
        A.setA(3,10);
        A.setA(4,40);
        A.setA(5,20);
        A.search(50);
        A.delete(50);
        A.display();
        A.getMax();
        A.bubbleSort();
        A.display();
    }
}
