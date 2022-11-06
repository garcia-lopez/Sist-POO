/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author lopez
 */
public class ArrayNum {

    private int arrayNum[] = {2, 33, 1, 3, 90, 34, 23, 98, 23, 44, 37,
        87, 20};

    public ArrayNum() {
    }

    public int[] getArrayNum() {
        return arrayNum;
    }

    public void setArrayNum(int[] arrayNum) {
        this.arrayNum = arrayNum;
    }

    public int biggerNum() {

        int i = 0;
        int bigger = 0;
        int max = this.arrayNum.length;
        do {
            if (this.arrayNum[i] > bigger) {
                bigger = this.arrayNum[i];
            }
            i++;

        } while (i < max);
        return bigger;
      
    }
    
    public int minorNum() {
        
        int minor = this.arrayNum[0];
        int i = 0;
        int max = this.arrayNum.length;
        while(i < max){
            if(this.arrayNum[i] < minor){
                minor = this.arrayNum[i];
            }
            i++;
        }
        
        return minor;
        
        
    }

    


}
