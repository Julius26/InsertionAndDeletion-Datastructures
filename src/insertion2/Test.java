/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion2;

/**
 *
 * @author rmrf
 */
public class Test {
    public void insertionass(){
        int LA[] = {1,3,5,7,8,9,10,11,15};
        int item = 20, k = 3, n = 5;
        int i = 0, j = n;
        
//        for(i=0;i<n;i++){
//        System.out.println("The Original elements are: "+LA[i]);
//        }
        
        n+=1;
        while(j >= k){
            LA[j+1] = LA[j];
            j = j - 1;
        }
        
        LA[k] = item;
        
        for(i=0;i<n;i++){
            System.out.println("Elements after insertion: "+LA[i]);
        }
    }
}
