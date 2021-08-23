package com.kunal.adam;

import java.util.Arrays;

public class bubble{
    public static void main(String[] args){
        
        int[] arr={3,5,1,7,8};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        
               for(int i=0;i<arr.length;i++){boolean x=false;
                   for(int j=1;j<arr.length-i;j++){
                       if(arr[j]<arr[j-1]){
                           int temp=arr[j];
                           arr[j]=arr[j-1];
                           arr[j-1]=temp;
                        x=true;
                       }
                      
                   } if(!x){
                    break;
                }
                   
                }
                
                
               }
               
    }
