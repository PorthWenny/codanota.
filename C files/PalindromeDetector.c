// by Angelo bayla
// palindrome detector for integer with for loop
// palindrome detector for string with string.h
#include <stdio.h>

#include <string.h>

int main() {
  int num, result = 0, orig, rem;

  // for integer, doesnt work with numbers like '010'
  printf("Enter number: ");
  scanf("%d", & num);

  // declare a placeholder since the value of num will change in for loop
  orig = num;

  // for loop states that while the number is not equal or less than 0,
  // it will continue to loop.
  for (orig = num; num > 0; num = num / 10) {
    rem = num % 10;
    result = result * 10 + rem;
  }

  if (result == orig)
    printf("The number is a palindrome.\n\n");
  else
    printf("The number is not a palindrome.\n\n");

  // for string, works with numbers like '010'
  char input[60], norm[60];

  printf("Enter your character: ");
  gets(input);
  gets(input);

  // copies the initial input into a placeholder, then reverses it.
  strcpy(norm, input);
  strrev(input);

  // if condition states that when you compare the value of the reversed input with the normal one and it results to 0,
  // it is a palindrome.
  if (strcmp(norm, input) == 0)
    printf("%s is a palindrome.", norm);
  else
    printf("%s is not a palindrome.", norm);

  return 0;
}
