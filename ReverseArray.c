#include<stdio.h>

int main(){
    
    int lim;
    printf("Input the number of elements to store in the array :");
    scanf("%d",&lim);

    int num[lim], ph[50];
    
    for(int i=0;i<lim;i++){
         printf("element - %d : ", i);
        scanf("%d",&num[i]);
    }

    printf("The values store into the array are :\n");
    
    for(int i=0;i<lim;i++){
        printf("%d ", num[i]);
    }

    printf("\nThe values store into the array in arranged reverse are :\n");

    for(int i=lim-1;i>=0;i--){
        printf("%d ", num[i]);
    }

    for(int i=0;i<lim;i++){
         for(int k=i+1;k<lim;k++){
             if(num[k]>num[i])
             {
                 ph[i]=num[k];
                 num[k]=num[i];
                 num[i]=ph[i];
             }
         }
      
return 0;  
}
