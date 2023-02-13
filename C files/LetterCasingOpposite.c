#include<stdio.h>
#include<string.h>

int main(){
    char name[60];
    int subset;
    
    printf("Enter character: ");
    fgets(name, sizeof(name), stdin);
    

    for(subset=0;subset<strlen(name);subset++)
    {
        if(name[subset]<97)
        {
            printf("%c",tolower(name[subset]));
        }
        else if(name[subset]>96)
        {
            printf("%c", toupper(name[subset]));
        }
    }

    return 0;
}
