public class Application {

    static class A{
        static int a = 1 + B.b;
    }

    static class B{
        static int b = 1 + C.c;
    }

    static class C{
        static int c = 1 + A.a;
    }

    public static void main(String[] args) {

        System.out.println(A.a);
        System.out.println(B.b);
        System.out.println(C.c);
    }
}
