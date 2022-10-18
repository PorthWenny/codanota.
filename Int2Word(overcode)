// Made by: Angelo Bayla
// an example of overcoding...
#include<stdio.h>
#include<stdlib.h>

int main(){
	int i=0, c, d, a, num, ones, tens, hund, thou, tenthou, hunthou, mill, tenmill, hunmill, bill;
	
	printf("Enter your integer: ");
	scanf("%d", &num);
	
	// Getting all the digits from the integer...
	// code can only accept up to 10 digits.
	ones = num%10; // 10
	tens = (num/10)%10; // 9
	hund = ((num/10)/10)%10; // 8
	thou = (((num/10)/10)/10)%10; // 7
	tenthou = ((((num/10)/10)/10)/10)%10; // 6
	hunthou = (((((num/10)/10)/10)/10)/10)%10; // 5
	mill = ((((((num/10)/10)/10)/10)/10)/10)%10; // 4
	tenmill = (((((((num/10)/10)/10)/10)/10)/10)/10)%10; // 3
	hunmill = ((((((((num/10)/10)/10)/10)/10)/10)/10)/10)%10; // 2
	bill = (((((((((num/10)/10)/10)/10)/10)/10)/10)/10)/10)%10; // 1

	// BILLIONS
	switch (bill)
		{
			case 1:
			printf("one billion ");
			break;
			case 2:
			printf("two billion ");
			break;
			case 3:
			printf("three billion ");
			break;
			case 4:
			printf("four billion ");
			break;
			case 5:
			printf("five billion ");
			break;
			case 6:
			printf("six billion ");
			break;
			case 7:
			printf("seven billion ");
			break;
			case 8:
			printf("eight billion ");
			break;
			case 9:
			printf("nine billion ");
			break;
		}
	
	// HUNDRED MILLIONS 
	switch (hunmill)
		{
			case 1:
			printf("one hundred ");
			break;
			case 2:
			printf("two hundred ");
			break;
			case 3:
			printf("three hundred ");
			break;
			case 4:
			printf("four hundred ");
			break;
			case 5:
			printf("five hundred ");
			break;
			case 6:
			printf("six hundred ");
			break;
			case 7:
			printf("seven hundred ");
			break;
			case 8:
			printf("eight hundred ");
			break;
			case 9:
			printf("nine hundred ");
			break;
		}

	// TEN MILLION - MILLIONS
	if (tenmill!=1)
	{
		switch (tenmill)
			{
			case 2:
			printf("twenty ");
			break;
			case 3:
			printf("thirty ");
			break;
			case 4:
			printf("forty ");
			break;
			case 5:
			printf("fifty ");
			break;
			case 6:
			printf("sixty ");
			break;
			case 7:
			printf("seventy ");
			break;
			case 8:
			printf("eighty ");
			break;
			case 9:
			printf("ninety ");
			break;
			}
		
		switch (mill)
			{
			case 1:
			printf("one million ");
			break;
			case 2:
			printf("two million ");
			break;
			case 3:
			printf("three million ");
			break;
			case 4:
			printf("four million ");
			break;
			case 5:
			printf("five million ");
			break;
			case 6:
			printf("six million ");
			break;
			case 7:
			printf("seven million ");
			break;
			case 8:
			printf("eight million ");
			break;
			case 9:
			printf("nine million ");
			break;
			}
	}
	else
	{
		switch (mill)
		{          
			case 0:
			printf("ten million ");
			break;
			case 1:
			printf("eleven million ");
			break;
			case 2:
			printf("twelve million ");
			break;
			case 3:
			printf("thirteen million ");
			break;
			case 4:
			printf("fourteen million ");
			break;
			case 5:
			printf("fifteen million ");
			break;
			case 6:
			printf("sixteen million ");
			break;
			case 7:
			printf("seventeen million ");
			break;
			case 8:
			printf("eighteen million ");
			break;
			case 9:
			printf("nineteen million ");
			break;
		}
	}
	
	if(hunmill != 0 && tenmill == 0 && mill == 0)
		{
			printf("million ");
		}
		
		
	// HUNDRED THOUSANDS
	switch (hunthou)
		{
			case 1:
			printf("one hundred ");
			break;
			case 2:
			printf("two hundred ");
			break;
			case 3:
			printf("three hundred ");
			break;
			case 4:
			printf("four hundred ");
			break;
			case 5:
			printf("five hundred ");
			break;
			case 6:
			printf("six hundred ");
			break;
			case 7:
			printf("seven hundred ");
			break;
			case 8:
			printf("eight hundred ");
			break;
			case 9:
			printf("nine hundred ");
			break;
		}

	// TEN THOUSAND - THOUSANDS
	if (tenthou!=1)
	{
		switch (tenthou)
			{
			case 2:
			printf("twenty ");
			break;
			case 3:
			printf("thirty ");
			break;
			case 4:
			printf("forty ");
			break;
			case 5:
			printf("fifty ");
			break;
			case 6:
			printf("sixty ");
			break;
			case 7:
			printf("seventy ");
			break;
			case 8:
			printf("eighty ");
			break;
			case 9:
			printf("ninety ");
			break;
			}
		
		switch (thou)
			{
			case 1:
			printf("one thousand ");
			break;
			case 2:
			printf("two thousand ");
			break;
			case 3:
			printf("three thousand ");
			break;
			case 4:
			printf("four thousand ");
			break;
			case 5:
			printf("five thousand ");
			break;
			case 6:
			printf("six thousand ");
			break;
			case 7:
			printf("seven thousand ");
			break;
			case 8:
			printf("eight thousand ");
			break;
			case 9:
			printf("nine thousand ");
			break;
			}
	}
	else
	{
		switch (thou)
		{          
			case 0:
			printf("ten thousand ");
			break;
			case 1:
			printf("eleven thousand ");
			break;
			case 2:
			printf("twelve thousand ");
			break;
			case 3:
			printf("thirteen thousand ");
			break;
			case 4:
			printf("fourteen thousand ");
			break;
			case 5:
			printf("fifteen thousand ");
			break;
			case 6:
			printf("sixteen thousand ");
			break;
			case 7:
			printf("seventeen thousand ");
			break;
			case 8:
			printf("eighteen thousand ");
			break;
			case 9:
			printf("nineteen thousand ");
			break;
		}
	}
	
	if(hunthou != 0 && tenthou != 0 && thou == 0)
		{
			printf("thousand ");
		}
		
	// HUNDREDS
		switch (hund)
		{
			case 1:
			printf("one hundred ");
			break;
			case 2:
			printf("two hundred ");
			break;
			case 3:
			printf("three hundred ");
			break;
			case 4:
			printf("four hundred ");
			break;
			case 5:
			printf("five hundred ");
			break;
			case 6:
			printf("six hundred ");
			break;
			case 7:
			printf("seven hundred ");
			break;
			case 8:
			printf("eight hundred ");
			break;
			case 9:
			printf("nine hundred ");
			break;
		}
		
	// TEN - ONES
	if (tens!=1)
	{
		switch (tens)
		{
			case 2:
			printf("twenty ");
			break;
			case 3:
			printf("thirty ");
			break;
			case 4:
			printf("forty ");
			break;
			case 5:
			printf("fifty ");
			break;
			case 6:
			printf("sixty ");
			break;
			case 7:
			printf("seventy ");
			break;
			case 8:
			printf("eighty ");
			break;
			case 9:
			printf("ninety ");
			break;
		}
		
		switch (ones)
		{
			case 0:
			printf("");
			break;
			case 1:
			printf("one ");
			break;
			case 2:
			printf("two ");
			break;
			case 3:
			printf("three ");
			break;
			case 4:
			printf("four ");
			break;
			case 5:
			printf("five ");
			break;
			case 6:
			printf("six ");
			break;
			case 7:
			printf("seven ");
			break;
			case 8:
			printf("eight ");
			break;
			case 9:
			printf("nine ");
			break;
		}
	}
	else
	{
		switch (ones)
		{          
			case 0:
			printf("ten");
			break;
			case 1:
			printf("eleven ");
			break;
			case 2:
			printf("twelve ");
			break;
			case 3:
			printf("thirteen ");
			break;
			case 4:
			printf("fourteen ");
			break;
			case 5:
			printf("fifteen ");
			break;
			case 6:
			printf("sixteen ");
			break;
			case 7:
			printf("seventeen ");
			break;
			case 8:
			printf("eighteen ");
			break;
			case 9:
			printf("nineteen ");
			break;
		}
	}


return 0;
}
