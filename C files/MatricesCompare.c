#include<stdio.h>

int main(){
int row1,col1,row2,col2;

printf("Enter size of the 1st matrix: ");
scanf("%d %d", &row1, &col1);

printf("Enter size of the 2nd matrix: ");
scanf("%d %d", &row2, &col2);

int mat1[row1][col1];
printf("\nInput elements in the first matrix: \n");

for (int i = 0; i < row1; i++) {
  for (int k = 0; k < col1; k++) {
    printf("element - [%d],[%d] : ",i,k);
    scanf("%d", &mat1[i][k]);
  }
}

int mat2[row2][col2];
printf("Input elements in the second matrix: \n");
for (int i = 0; i < row2; i++) {
  for (int k = 0; k < col2; k++) {
    printf("element - [%d],[%d] : ",i,k);
    scanf("%d",&mat2[i][k]);
  }
}

printf("\nThe first matrix is: ");
for(int i = 0; i < row1; i++) {
  printf("\n");
  for (int k = 0; k < col1; k++) {
    printf("%d ", mat1[i][k]);
  }
}

printf("\nThe second matrix is: ");
for(int i = 0; i < row2; i++) {
  printf("\n");
  for (int k = 0; k < col2; k++) {
    printf("%d ", mat2[i][k]);
  }
}

int checker = 0, size = row1*col1;


if (row1==row2 && col1==col2) {
  for(int i = 0; i < row1; i++) {
  for (int k = 0; k < col1; k++) {
    if (mat1[i][k]==mat2[i][k])
      checker++;
    }
  }
}

if (checker==size)
  printf("\nThe two matrices are equal.");
else
  printf("\nThe two matrices are not equal.");


return 0;
}
