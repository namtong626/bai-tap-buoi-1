import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        float banKinh;

        double dienTich, chuVi;

        String nhapBanKinh = "Nhap ban kinh: ",
                hienThiDienTichHinhTron = "Dien tich hinh trong:",
                hienThiChuViHinhTron = "Chu vi hinh trong:";

        Scanner input = new Scanner(System.in);

        System.out.println(nhapBanKinh);
        banKinh = input.nextFloat();
        input.close();

        chuVi = 2 * banKinh * Math.PI;

        System.out.println(hienThiChuViHinhTron);
        System.out.format("%.2f%n", chuVi);

        dienTich = Math.pow(banKinh, 2) * Math.PI;

        System.out.println(hienThiDienTichHinhTron);
        System.out.format("%.2f%n", dienTich);
    }
}