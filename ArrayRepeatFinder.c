// array repeater identifier by Angelo Bayla
#include <stdio.h>

int main() {
    // set initial limit.
    int arr[1000000], limit;
    
    // scan for elements in array with space acting as new element.
    printf("The given array is: ");
     do {
        scanf("%d", &arr[limit++]);
    } while
        (getchar() != '\n' && limit < 100);

    // set new limit to be dynamic.
    arr[limit];
    
    // sort first to easier locate the already calculated repeaters.
    for(int i = 0; i < limit; i++) {
        for (int k = i + 1; k < limit; k++) {
            if (arr[k] < arr[i]) {
                int hold[limit];
                hold[i] = arr[k];
                arr[k] = arr[i];
                arr[i] = hold[i];
            }
        }
    }
    
    // find how much an element repeated.
    int repeat;
    for (int i = 0; i < limit; i++) {
        int count = 1;
        for (int k = i + 1; k < limit; k++) {
            if (arr[i] == repeat) {
                break;
            }
            if (arr[i] == arr[k]) {
                count++;
            }
        }
        if (count > 1)
            printf("The element '%d' occured %d times.\n",arr[i],count);
        repeat = arr[i];
    }


return 0;
}
