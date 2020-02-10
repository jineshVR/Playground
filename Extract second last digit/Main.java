#include<stdio.h>
int main()
{
 int a,b,num;
  scanf("%d",&num);
  a = num%100;
  b = a/10;
  printf("%d",b);
  return 0;
}