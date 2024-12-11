public class Homework {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;

        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println((a + b) / (b - a));

        double c = 1.5;

        System.out.println(b / c);
        System.out.println(a - c);
        System.out.println((b + c) * (a + c));

        System.out.println(b > a);
        System.out.println(b < c);
        System.out.println((a - b) <= b);
        System.out.println(100 <= b);

        float maxFloat = Float.MAX_VALUE;
        System.out.println(Float.MAX_VALUE * 2);

        double maxDouble = Double.MAX_VALUE;
        System.out.println(Double.MAX_VALUE * 2);


    }
}
