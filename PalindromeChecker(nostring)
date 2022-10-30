#include<stdio.h>
#include<string.h>

void removeSpaces(char * word) {
  int count = 0;

  for (int i = 0; word[i]; i++)
    if (word[i] != ' ')
      word[count++] = word[i];
  word[count] = '\0';
}

int main() {
  int sub, checker = 0;
  char word[50];

  printf("Enter word: ");
  fgets(word, sizeof(word), stdin);
  removeSpaces(word);

  for (sub = 0; sub <= strlen(word) - 2; sub++) {
    if (word[sub] >= 65 && word[sub] <= 90) {
      word[sub] = word[sub] + 32;
    }
    if (word[strlen(word) - sub - 2] >= 65 && word[strlen(word) - sub - 2] <= 90) {
      word[strlen(word) - sub - 2] = word[strlen(word) - sub - 2] + 32;
    }
    if (word[sub] != word[strlen(word) - sub - 2]) {
      checker++;
    }
  }

  printf("\n%d\n", checker);

  if (checker == 0)
    printf("Your word is a palindrome.");
  else
    printf("Your word is not a palindrome.");

  return 0;
}
