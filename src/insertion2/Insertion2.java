
package insertion2;

import java.util.Scanner;

public class Insertion2 {
//create an array 
    public void insert(){
    int V[]={78,79,80,81,82,83,84,85};
    int i=2,n=5,x=55,j=n;
//    i is position to insert,j=variable,n is number of elements,V=array
//output the original elements

        for(int a=0;a<n;a++){
            System.out.println("Old elements are: "+V[a]);
        }
            n=n+1;//increase the number of elements
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter the position to insert");
    i=scan.nextInt();
    
//    if(i>n){
//    System.out.println("Error!!!");
//    }
 //use while loop 
    while(j>=i){ 
        V[j+1]=V[j];//shift elements in pos 4 to 5
        j=j-1;//3       
    }
        V[i]=x;//set x in to the empty position
        
    for(int a=0;a<n;a++){       
        System.out.println("The new elements are: "+V[a]);
    }  
    }
    
    public void delete(){
        int V[]={78,79,80,81,82,83,84};
        int i,j,n=5;

        for(int a=0;a<n;a++){
            System.out.println("Old elements before deletion are: "+V[a]);
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the position to delete");
        i=scan.nextInt();
        
        if(i>=n){
        System.out.println("Error! no such item");
        }
        
        else {
        j=i;
        while(j<=n-1){
            V[j]=V[j+1];
            j=j+1;
        }
        }
        n=n-1;
            for(int a=0;a<n;a++){       
            System.out.println("The new elements after deletion are: "+V[a]);
            }  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Insertion2 ins=new Insertion2();
       
        ins.insert();
        ins.insert();
        ins.delete();
    }
    
}
