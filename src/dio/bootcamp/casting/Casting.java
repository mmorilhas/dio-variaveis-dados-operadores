package dio.bootcamp.casting;

public class Casting {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte)s1;

        long l;
        int a = 10;
        l = a;

        int b;
        long l1 = 1000000000000L;
        b = (int)l1;

        double d;
        float f = 10.5f;
        d = f;

        float f1;
        double d1 = 1000.55555555d;
        f1 = (float)d1;

        int c;
        float f2 = 4.56f;
        c = (int)f2;

        System.out.println(b1);
        System.out.println(l);
        System.out.println(b);
        System.out.println(d);
        System.out.println(f1);
        System.out.println(c);

    }
}
