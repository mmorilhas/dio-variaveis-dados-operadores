package dio.bootcamp.operadores;

public class Operadores {

    public static void main(String[] args) {


        //Pre-Pos fixado

        int a = 2;

        int i = ++a;
        int j = a--;
        int k = a;

        System.out.println(i); //
        System.out.println(j);
        System.out.println(k);

        //Aritmeticos

        int b = 10;
        int c = 5;
        int v = 3;

        int soma = b + c;
        int subtracao = b - c;
        int multiplicacao = b * c;
        int divisao = b / c;
        int resto = b % v;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);


        //Atribuição

        int e = 100;
        int g = 70;
        short s = 4;
        long l = 1000L;
        float f = 3.2f;
        double d = f;

        e += 5; // e = e + 5
        s -= 3; // s = s - 3
        d /= 2.7d;// d = d / 2.7d
        l *= 2; // l = l * 2;
        g %= 20; // g = g % 20;

        System.out.println(e);
        System.out.println(s);
        System.out.println(d);
        System.out.println(l);
        System.out.println(g);

    }
}
