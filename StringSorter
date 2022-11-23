// name sorter by oleg alyab
#include <stdio.h>
#include<string.h>

int main() {
    char name[4][50], ph[50];
    
    for(int i=0;i<5;i++){
        printf("Enter name: ");
        scanf("%s", name[i]);
    }
    
    for(int i=0;i<5;i++){
        for(int k=i+1;k<5;k++){
            if(name[k][0] < name[i][0]){
                strcpy(ph,name[i]);
                strcpy(name[i],name[k]);
                strcpy(name[k],ph);
            }
            else if(name[k][0]==name[i][0]){
                if(name[k][1] < name[i][1]){
                strcpy(ph,name[i]);
                strcpy(name[i],name[k]);
                strcpy(name[k],ph);
                }
            }
            else if(name[k][1]==name[i][1]){
                if(name[k][2] < name[i][2]){
                strcpy(ph,name[i]);
                strcpy(name[i],name[k]);
                strcpy(name[k],ph);
                }
            }
        }
        printf("%s",name[i]);
    }

    
return 0;
}
