#include<stdio.h>

int main(){

    int lim;
    printf("Input the number of elements to be stored in the first array: ");
    scanf("%d",&lim);

    int num[lim];
    for(int i=0;i<lim;i++){
         printf("element - %d : ", i+1);
        scanf("%d",&num[i]);
    }

    int lim2;
    printf("Input the number of elements to be stored in the second array: ");
    scanf("%d",&lim2);

    int lim3=lim+lim2;
    int combo[lim3];

    for(int i=0;i<lim;i++){
        combo[i]=num[i];
    }

    for(int i=0;i<lim2;i++){
        printf("element - %d : ", i+1);
        scanf("%d",&combo[i+lim]);
    }

     for(int i=0;i<lim3;i++){
         for(int k=i+1;k<lim3;k++){
             if(combo[k]>combo[i])
             {
                 int ph[lim3];
                 ph[i]=combo[k];
                 combo[k]=combo[i];
                 combo[i]=ph[i];
             }
         }
     }

    printf("\nThe merged array in decending order is :\n");
    for(int i=0;i<lim3;i++){
         printf("%d ", combo[i]);
        }

return 0;
}
