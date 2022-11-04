// by Angelo Bayla

#include <stdio.h>

int main()
{
    int num, newn;
    int gn, last;
    
    printf("Enter numbers: ");
    scanf("%d", &num);
    
    for (gn=9; gn>0;gn--)
    {
        newn=num;
        int checker=0;
        while (newn!=0)
          {
            last = newn%10;
            newn = newn/10;
            
            if (last==gn)
                checker++;
          }
        if (checker>1)
        break;
    }
    printf("This is the greatest digit that occured more than once: %d", gn);
    
return 0;
}
