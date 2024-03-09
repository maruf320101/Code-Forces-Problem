#include <stdio.h>
int main ()
{
    int a, number, remainder;

    scanf ("%d",&number);
    remainder = number%2;
    if (remainder == 0 && number>2){
        printf ("YES");
    }
    else {
        printf("NO");
    }

    return 0;
}
