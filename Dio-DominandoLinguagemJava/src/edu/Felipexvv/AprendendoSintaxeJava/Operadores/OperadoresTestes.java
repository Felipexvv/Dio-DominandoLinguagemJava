package edu.Felipexvv.AprendendoSintaxeJava.Operadores;

public class OperadoresTestes {
    public static void main(String[] args) {
        
        //Repeticao

        int numero = 5;
        //numero = numero + 1; Mesma coisa do que o de baixo
        //numero++;

        System.out.println(numero++);
        //Aqui entendemos que é o 'numero' e depois incrementar e (++numero) é incrementar depois imprimiar
        
        System.out.println(numero--);
        //Aqui ele imprime depois incrementa

        System.out.println(numero);

        //Negando Valores Booleanos

        boolean variavel = true;

        System.out.println(!variavel);
        //Aqui ele imprimio com o valor invertido porem nao atribuiu o resultado assim se imprimimos novamente o valor voltara o que foi anteriormente
        
        System.out.println(variavel);

        //Para atribuirmos seria desse jeito

        variavel = !variavel;

        System.out.println(variavel);
    }
}
