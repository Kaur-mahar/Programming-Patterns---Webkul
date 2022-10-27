#include <stdio.h>

int main()
{
    static int a=100;
    if (a) {
        printf("%d\t",a);
        a--;
        main();
    }
    else printf("\n\nkhatm\n\n");

    return 0;
}
