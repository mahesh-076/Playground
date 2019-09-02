#include<stdio.h>
void main()
{
  int i,j,temp = 0;
  int len,arr[30];
  scanf("%d",&len);
  for(i = 0;i < len;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i = 0;i < len;i++)
  {
    for(j = i+1;j< len;j++)
    {
      if(arr[i]>arr[j])
      {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  printf("Sorted array is:\n");
  for(i = 0;i < len;i++)
    printf("%d\n",arr[i]);
}