#include<stdio.h>
void main(){
  int n;
  printf("Enter a number to make it's multiplication table: ");
  scanf("%d",&n);
  for(int i=1;i<=10;i++){
    printf("%d X %d = %d\n",n,i,n*i);
  }
}
  
