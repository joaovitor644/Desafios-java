#include <stdio.h>


int main(){
    int n1,n2;
    int intnum = 0;
    int posnum = 0;
    int parnum = 0;
    int imparnum = 0;
    int div73num = 0;
    int cout = 0;
    int media;
    int som = 0;

    printf("Digite o número de inicio:");
    scanf("%d",&n1);
    printf("Digite o número do fim:");
    scanf("%d",&n2);

    if(n1 > n2){
        printf("Erro, digite novamente");
        main();
    } else {
        cout = n1 + 1;

        while(cout <= n2){
            if(cout > 0){
                intnum = intnum + 1;
                posnum = posnum + 1;
            } else {
                intnum = intnum + 1;
            }

            if(cout % 2 == 0){
                parnum = parnum + 1;
            } else {
                imparnum = imparnum + 1;
            }

            if(cout % 2 == 1 && cout % 7 == 0 && cout % 3 == 0){
                div73num = div73num + 1;
            }
            som = som + cout;
            cout = cout + 1;
        }
        media = som / intnum;
        printf("Totalde numeros inteiros: %d \n",intnum);
        printf("Total de numeros Pares: %d \n",parnum);
        printf("Total de numeros positivos: %d \n",posnum);
        printf("Total de numeros impares: %d \n",imparnum);
        printf("Total de numeros divisiveis por 3 e 7: %d \n",div73num);
        printf("Media Total: %d",media);
    }

    return 0;
}
