
package com.mycompany.sumaarreglo;

/**
 *
 * @author Rafa
 */
public class Arreglo {
    public int sum(int [] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i]; 
        }
        return res;
    }
}