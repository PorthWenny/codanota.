#include <stdio.h>

int main() {
    char name[50]; // 50 placeholders or slots available
    int grade[10], i, gr[3]; // the slots range from 0 to 9 (10 slots in total)
    int high=0, sum=0;
    
    printf("Enter name: ");
    scanf("%s", name);
    
    printf("Enter grade level: ");
    scanf("%d", &gr[0]); // you're putting an input in slot 0
    
    // so it is easier, create a loop to get more inputs...)
    for(i=0; i<10; i++) {
        printf("Enter %dth grade: ", i+1);
        scanf("%d", &grade[i]);
        
         // let's get the highest integer... 
         // (should be included in the loop)
       if (grade[i]>=high)
        high=grade[i];
        
        // let us try to get the average...
        sum=sum+grade[i];
        
    }
    
    printf("\n\nThe 3rd letter of your name is %c in Grade %d", name[2], 
    gr);
    printf("\nYour first 4 grades are %d, %d, %d, %d", grade[0],grade[1],
    grade[2], grade[3]);
    printf("\nThe 10th grade is %d", grade[9]);

    printf("\nThe highest grade is %d", high);
    
    int avg=sum/i;
    printf("\nThe average is %d", avg);
      
    // now let's try to sort the grades in ascBxng order...
    
    printf("\nYour grades in ascBxng order is...\n");
     for(i=0; i<10; i++) {
        for(int k=i+1; k<10;k++){
            // compare next grade to current grade.
            if(grade[k] < grade[i])
            {
                // replace the order with the sorted one...
                int newgrade = grade[i];
                grade[i] = grade[k];
                grade[k] = newgrade;
            }
        }
        printf("%d ", grade[i]);
     }
    
        
    return 0;
}
