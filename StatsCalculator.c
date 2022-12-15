#include<stdio.h>
#include <math.h> // only for using "sqrt" smh...

int main(){

int num[50],stop=0,stop2, x[50];
int high;
float sum=0;

printf("== STATISTICS CALCULATOR (for GEMATH) ==\n");
printf(" Enter '0' to end the loop.\n\n");
for(int i=0;i<1000;i++){
printf(" Enter number: ");
scanf("%d", &num[i]);

x[i] = num[i];

if (num[i]>high)
    high=num[i];

if(num[i]==0){
    stop=i;
    stop2=stop;
    printf("\n Your set have %d element/s in it.", i);
    break;
    }

sum = sum + num[i];
}

printf("\n YOUR SET: [ ");
for(int i=0; i < stop; i++){
          for(int k=i+1; k<stop;k++){
            if(num[k] < num[i]){
                int emp = num[i];
                num[i] = num[k];
                num[k] = emp;
        }
     }
      printf("%d ", num[i]);
    }
printf("]\n");

// GETTING THE MEAN
float mean = sum/stop;
printf("\n Mean = %g / %d = %.2f", sum, stop, mean);

// GETTING THE MEDIAN
printf("\n Median = ");

int mid = stop/2;

float center = num[mid] + num[mid-1];
float median = center / 2;

if(stop%2!=0)
printf("Number %d = %d", mid+1, num[mid]);
else
printf("%d + %d = %d / 2 = %.1f", num[mid-1], num[mid], num[mid]+num[mid-1], median);

// GETTING THE MODE
printf("\n Mode = ");

int max = 0, hold[20], count=0, k=0;

for (int i = 0; i < stop; i++){
        int mode = 0;

        for (int j = i + 1; j < stop; j++){
            if (num[i] == num[j]) {
                mode++;
            }
        }
        if ((mode > max) && (mode != 0)) {
            k = 0;
            max = mode;
            hold[k] = num[i];
            k++;
        }
        else if (mode == max) {
            hold[k] = num[i];
            k++;
        }
    }

    for (int i = 0; i < stop; i++){
        if (num[i] == hold[i])
            count++;
        }

    if (count == stop)
        printf("DNE.");
    else{
      for (int i = 0; i < k; i++)
        printf("%d ", hold[i]);
      }

// GETTING THE RANGE
int range = num[stop-1] - num[0];
printf ("\n Range = %d - %d = %d", num[stop-1], num[0], range);

char what;
printf("\n\nContinue? [Y/n] ");
scanf("%s", &what);

switch (what){
	case 'N':
	case 'n':
		printf("\nGood job! Mr. Mojares would be happy.");
		return 0;
	case 'Y':
	case 'y':
		break;
	default:
		printf("Invalid input. Automatically exiting...");
		return 0;
}

printf("\nSAMPLE STANDARD DEVIATION CALCULATOR:\n");
printf("[================================================================]\n");
printf("[     x     ][     x - %.2f     ][      (x - %.2f)^2      ]\n", mean, mean);

double summ = 0;

for (int i = 0;i < stop2; i++) {

	int value = x[i] - mean;
	int sqrd = value * value;

	printf("  %d\t\t", x[i]);

	printf("%d\t\t", value);

	printf(" %d\t\t\t\n", sqrd);

	summ = summ + sqrd;
}

float var = summ / (stop2 - 1);
double ssd = sqrt(var);

printf("[================================================================]\n");
	printf("               TOTAL  =  %g \n", summ);
	printf("	VARIANCE  =  TOTAL / %d  =  %.2f \n", stop2-1, var);
	printf("   STANDARD DEVIATION  =  sqrt(VAR)  = %.2lf  \n", ssd);
printf("[================================================================]\n");


return 0;
}
