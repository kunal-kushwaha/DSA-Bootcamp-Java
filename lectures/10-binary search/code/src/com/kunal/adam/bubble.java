package com.kunal.adam;
public class bubble{
    public static void main(String[] args){
        
        int[] arr={3,5,1,7,8};
        bubblesort(arr);
    }
    static void bubblesort(int[] arr){
        boolean x=false;
               for(int i=0;i<arr.length;i++){
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
                for(int p=0;p<arr.length;p++){
                    System.out.println(arr[p]);
                }
                
               }
               
    }
