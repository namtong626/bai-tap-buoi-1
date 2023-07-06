import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        float chieuCao,
                dayHinhThang,
                dinhHinhThang;
                
        double dienTich;

        String hienThiDienTich = "Dien tich hinh thang:",
                nhapChieuCao = "Nhap chieu cao: ",
                nhapDinh = "Nhap dinh: ",
                nhapDay = "Nhap day: ";

        Scanner input = new Scanner(System.in);

        System.out.println(nhapChieuCao);
        chieuCao = input.nextFloat();

        System.out.println(nhapDinh);
        dinhHinhThang = input.nextFloat();

        System.out.println(nhapDay);
        dayHinhThang = input.nextFloat();

        dienTich = chieuCao * (dayHinhThang + dinhHinhThang) / 2;

        System.out.println(hienThiDienTich);
        
        System.out.format("%.2f%n", dienTich);
    }
}