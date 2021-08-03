#include<stdio.h>
int main(){
    int n;
    printf("Enetr the year to be checked whether it is leap year or not:");
    scanf("%d",&n);
    if(n%400==0){
                 printf("\nThe number is leap");
                 }
    else if(n%100!=0&&n%4==0){
         printf("\nThe number is leap");
         }
    else{
         printf("\nThe number is not leap");
         }
    getch();
    return 0;
}
