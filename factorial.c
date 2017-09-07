#include<stdio.h>
 
long int multiplyNumber(int n);
 
int main()

 {
  int n;
  printf("Enter the factorial number");
  scanf("%d", &n);
  printf("factorial of number %d= %ld ",n,multiplyNumber(n));
  return 0;
  }

long int multiplyNumber(int n)
 {

  if(n>=1)
    return n*multiplyNumber(n-1);
  else 
    return 1;
}  

