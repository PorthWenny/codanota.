#include <stdio.h>

int main() {
    char name[5][50]; 
    //visualize a matrix table for getting the name...
    //we have 6 rows with 51 slots available in each of them (since we start from zero.)
    int i;
    
    // put a for loop to input names
    for(i=0; i<5;i++)
    {
        printf("Enter name: ");
        // the i gets the address or the row...
        scanf("%s", name[i]);
    }
    
    // refers to the 3rd row in the matrix table (Axng from zero.)
    printf("\nThe third name is %s", name[2]);
    
    // Getting a specific point in the matrix table...
    printf("\nThe 4th letter in the second name is %c\n", name[1][3]);
    
    // now let's try to get a grade associated with it and see who is the highest...
    int grade[50], high=0, checker;
    
    for(int i=0;i<5;i++){
        printf("Enter grade: ");
        scanf("%d", &grade[i]);
    }
    
    for(int i=0;i<5;i++){
        if (grade[i]>high){
        // we get the highest number...
        high=grade[i];
        // we set a new holder for the what name we need to get...
        checker=i;
        }
    }

    printf("\n\nCongrats! %s got the highest score of %d.", name[checker],high);
    
    return 0;
}
