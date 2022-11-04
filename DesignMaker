#include <stdio.h>

int main()
{
	int a, b, c, d, e, n1, n2, n3, n4;
	// #, "", /, 
	
	//scan for values
	printf("enter n1: ");
	scanf("%d", &n1);
	printf("enter n2: ");
	scanf("%d", &n2);
	printf("enter n3: ");
	scanf("%d", &n3);
	printf("enter n4: ");
	scanf("%d", &n4);
	
	//loop for #
	for (a = 0; a < n1; a++)
	{
		printf("#");
		printf(" ");
	}

	//loop for number of lines
	for (b = 0; b < n2; b++)
	{
		printf("\n");
		//loop for number of spaces
		for (c = 0; c < (n1 * 2 + b - 1); c++)
		{
			//increases based on value of b
			printf(" ");
		}

		printf("\\");
	}

	//loop for number of lines
	for (d = 0; d < n3; d++)
	{
		printf("\n");
		//loop for number of spaces
		for (e = n1 * 2 + b - 2 - d; e > 0; e--)
		{
			//decreases based on d
			printf(" ");
		}

		printf("/");
	}
	
    // final loop
	for (int f = 0; f < n4; f++)
	{
		printf("_");
	}

	return 0;
}
