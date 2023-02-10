// Matrix Multiplication Calculator by Angelo Bayla
#include <stdio.h>

int main() {
  int a[100][100], b[100][100], c[100][100];  // matrices a, b, and c
  int m, n, p, q, i, j, k;  // dimensions of the matrices and loop variables

  // read the dimensions of matrix a
  printf("Enter the number of rows and columns of matrix a: ");
  scanf("%d%d", &m, &n);

  // read the elements of matrix a
  printf("Enter the elements of matrix a: \n");
  for (i = 0; i < m; i++) {
    for (j = 0; j < n; j++) {
      scanf("%d", &a[i][j]);
    }
  }

  // read the dimensions of matrix b
  printf("Enter the number of rows and columns of matrix b: ");
  scanf("%d%d", &p, &q);

  // make sure the matrices can be multiplied
  if (n != p) {
    printf("The matrices can't be multiplied.\n");
    return 1;
  }

  // read the elements of matrix b
  printf("Enter the elements of matrix b: \n");
  for (i = 0; i < p; i++) {
    for (j = 0; j < q; j++) {
      scanf("%d", &b[i][j]);
    }
  }

  // initialize matrix c to all zeros
  for (i = 0; i < m; i++) {
    for (j = 0; j < q; j++) {
      c[i][j] = 0;
    }
  }

  // multiply the matrices
  for (i = 0; i < m; i++) {
    for (j = 0; j < q; j++) {
      for (k = 0; k < n; k++) {
        c[i][j] += a[i][k] * b[k][j];
      }
    }
  }

  // print the result
  printf("The product of the matrices is: \n");
  for (i = 0; i < m; i++) {
    for (j = 0; j < q; j++) {
      printf("%d ", c[i][j]);
    }
    printf("\n");
  }

  return 0;
}
