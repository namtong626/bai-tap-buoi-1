import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a, b;
        float x;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = input.nextInt();
        System.out.println("Nhap b:");
        b = input.nextInt();
        System.out.println("Nhap x:");
        x = input.nextFloat();
        input.close();

        // logb(n) = loge(n) / loge(b)

        double kq = a / 10 + 
                Math.pow(a, b) -
                Math.sin(Math.PI * x / 3) / Math.sqrt(Math.pow(a + b, 2) + 5) +
                Math.log(Math.pow(a, 2) + 1) -
                Math.log(Math.pow(4 * x, 2 * a) + 3) / Math.log(3) / 2.55;

        System.out.println("ket qua:");

        System.out.format("%.3f%n", kq);
    }
}