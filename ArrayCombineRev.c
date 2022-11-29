#include<stdio.h>

int main(){
    
    int lim;
    printf("Input the number of elements to be stored in the first array :");
    scanf("%d",&lim);

    int num[100];
    for(int i=0;i<lim;i++){
         printf("element - %d : ", i);
        scanf("%d",&num[i]);
    }

    int lim2;
    printf("Input the number of elements to be stored in the second array :");
    scanf("%d",&lim2);

    for(int i=0;i<lim2;i++){
         printf("element - %d : ", i);
        scanf("%d",&num[i+lim]);
    }

    int lim3=lim+lim2, ph[50];

     for(int i=0;i<lim3;i++){
         for(int k=i+1;k<lim3;k++){
             if(num[k]>num[i])
             {
                 ph[i]=num[k];
                 num[k]=num[i];
                 num[i]=ph[i];
             }
         }
     }

    printf("\nThe merged array in decending order is :\n");
    for(int i=0;i<lim3;i++){
         printf("%d ", num[i]);
        }

return 0;
}
