// array repeater identifier by Angelo Bayla
#include <stdio.h>

int main() {
    // set initial limit.
    int arr[1000000], limit;

    printf("The given array is: ");
     do {
        scanf("%d", &arr[limit++]);
    } while
        (getchar() != '\n' && limit < 100);

    // set new limit to be dynamic.
    arr[limit];

    int repeat[limit];
    for (int i = 0; i < limit; i++) {
        if (repeat[i] == 0) {
            int count = 1;
            for (int k = i + 1; k < limit; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                    repeat[k] == 1;
                }
            }
            if (count > 1)
                printf("The element '%d' occured %d times.\n",arr[i],count);
        }
    }


return 0;
}
