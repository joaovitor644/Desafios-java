#include <stdio.h>

int main(){
    int n1;

    printf("Digite um número:");
    scanf("%d",&n1);

    for (int a = 0, b = 1 , i = 0;i < n1;b = b + a, a = b - a,i++){
        printf("%d ",a);
    }

    return 0;
}