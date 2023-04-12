public class Homework2 {
    public static void main(String[] args) {
        int a = 637%2;// 1
        System.out.println(637/2);//318 и остаток 1
        System.out.println(a);
        int b = 318%2;
        System.out.println(b);
        int c = 159%2;
        System.out.println(c);
        int d = 79%2;
        System.out.println(d);
        int e = 39%2;
        System.out.println(e);
        int p = 19%2;
        System.out.println(p);
        int f = 9%2;
       System.out.println(f);
       int g = 4%2;
       System.out.println(g);
       int h = 2%2;
        System.out.println(h);
       int l = 1%2;
        System.out.println(l);

        System.out.println();

// ответ:1011111001
        //Следующая задача. дано:11100111 перевести из двоичной в десятичную
       // long a = 1 * 2^7 + 1 * 2^6 + 1 * 2^5 + 0 * 2^4 + 0 * 2^3 + 1 * 2^2 + 1 * 2^1 + 1 * 2^0;
    //    System.out.println(a);
        int i = 637;
        System.out.println(Integer.toBinaryString(637));
        // тут ответ получается 1001111101. но пока не знаю почему
    }
}
