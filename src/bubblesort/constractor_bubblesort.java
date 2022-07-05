/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Jam-PC
 */
public class constractor_bubblesort {

    int[] array;

    public constractor_bubblesort() {
        
       
        array = new int[]{4, 3, 1, 2, 45, 1, 52, 1};

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        constractor_bubblesort bs = new constractor_bubblesort();
        createBubblesort(bs.array);
    }

    public static void createBubblesort(int[] intarray) {
        
        for (int j = 0; j < intarray.length; j++) {
            for (int i = 0; i < intarray.length - 1; i++) {
                if (intarray[i] > intarray[i + 1]) {
                    int temp = intarray[i];
                    intarray[i] = intarray[i + 1];
                    intarray[i + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }
        
    }

}
