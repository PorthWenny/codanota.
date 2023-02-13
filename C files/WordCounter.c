//How many words in your sentence?
//Counter by Angelo Bayla
#include <stdio.h>

int main()
{

// array can be edited for maximum inputs collected.
	char sen[200];
	int i, count = 1;

	printf("Enter your sentence: ");
	scanf("%[^\n]", sen);

// The if condition detects if you've inputted a valid word or character for it to be considered a sentence.
	if (sen[0] >= '!' && sen[0] <= '~')
	{
		for (i = 0; sen[i] != '\0'; i++)
		{
			if (sen[i] == ' ')
			{
				count++;
			}
		}
	}
    
// if invalid characted was detected, it returns count to 0 and invalidates the input.
	else
	{
		count = 0;
		printf("\nNo word has been detected, please try again.", count);
	}

// this part shows how many words were detected, with grammar being corrected by if else statement.
	if (count == 1)
		printf("\nYour sentence has %d word in it.", count);
	else if (count > 1)
		printf("\nYour sentence have %d words in it.", count);

	return 0;
}
