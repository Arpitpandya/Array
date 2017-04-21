/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting_Algorithms;

/**
 *
 * @author Arpit Pandya
 */
public class Bubble_Sort {
    
    private static void bubbleSort(int a[]){
        int n = a.length;
        int temp = 0;
        
        for(int i=0; i < n-1; i++){
            for(int j = 0; j < (n-i-1); j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }   
    }
    
    
    
    public void display(int a[]){
        int count = a.length;
        for(int i = 0; i<count; i++){
            System.out.print(a[i]+" ");
        }
    }
    
    
    public static void main(String[] args) {
        Bubble_Sort bs = new Bubble_Sort();
        int a[]={24,3,45,2,1};
        
        System.out.println("Before Sorting :");
        bs.display(a);
        
        System.out.println("\n");
        bubbleSort(a);
        
        System.out.println("After Sorting : ");
        
        bs.display(a);
        
    }
    
    
    
}
