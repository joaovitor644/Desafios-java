#include <stdio.h>

int main(){
    float media;
    int sum,num,cont;

    sum = 0;
    cont = 0;

    while(cont < 20){
        printf("Digite um valor:");
        scanf("%d",&num);
        sum = sum + num;
        cont = cont + 1;
    }

    media = sum / cont;
    printf("A media dos valores é %2.f \n",media);

    return 0;
}
