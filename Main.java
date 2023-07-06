import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String maCanBo1,
                maCanBo2,
                maCanBo3,
                hoVaten1,
                hoVaten2,
                hoVaten3,
                ngaySinh1,
                ngaySinh2,
                ngaySinh3;

        int tongNgayLam1,
                tongNgayLam2,
                tongNgayLam3,
                soGioLamThem1,
                soGioLamThem2,
                soGioLamThem3;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ma 1: ");
        maCanBo1 = input.nextLine();
        System.out.println("Nhap ma 2: ");
        maCanBo2 = input.nextLine();
        System.out.println("Nhap ma 3: ");
        maCanBo3 = input.nextLine();

        System.out.println("Nhap ten 1: ");
        hoVaten1 = input.nextLine();
        System.out.println("Nhap ten 2: ");
        hoVaten2 = input.nextLine();
        System.out.println("Nhap ten 3: ");
        hoVaten3 = input.nextLine();

        System.out.println("Nhap ngay sinh 1: ");
        ngaySinh1 = input.nextLine();
        System.out.println("Nhap ngay sinh 2: ");
        ngaySinh2 = input.nextLine();
        System.out.println("Nhap ngay sinh 3: ");
        ngaySinh3 = input.nextLine();

        System.out.println("tong so ngay lam 1: ");
        tongNgayLam1 = input.nextInt();
        System.out.println("tong so ngay lam 2: ");
        tongNgayLam2 = input.nextInt();
        System.out.println("tong so ngay lam 3: ");
        tongNgayLam3 = input.nextInt();

        System.out.println("tong so gio lam 1: ");
        soGioLamThem1 = input.nextInt();
        System.out.println("tong so gio lam 2: ");
        soGioLamThem2 = input.nextInt();
        System.out.println("tong so gio lam 3: ");
        soGioLamThem3 = input.nextInt();
        input.close();

        int luong1 = tongNgayLam1 * 350000 + soGioLamThem1 * 45000,
                luong2 = tongNgayLam2 * 350000 + soGioLamThem2 * 45000,
                luong3 = tongNgayLam3 * 350000 + soGioLamThem3 * 45000;

        System.out.printf("--------------------------------------------------------------------------------%n");
        System.out.printf("| %-5s | %-12s | %-12s| %-12s| %-12s | %-10s |%n", "STT", "Ho va ten", "Ngay sinh",
                "So ngay LV", "Gio lam them", "Luong");
        System.out.printf("--------------------------------------------------------------------------------%n");
        System.out.printf("| %-5s | %-12s | %-11s | %-12s| %-12s | %-10s |%n",
                maCanBo1, hoVaten1, ngaySinh1, tongNgayLam1, soGioLamThem1, luong1);
        System.out.printf("--------------------------------------------------------------------------------%n");
        System.out.printf("| %-5s | %-12s | %-11s | %-12s| %-12s | %-10s |%n",
                maCanBo2, hoVaten2, ngaySinh2, tongNgayLam2, soGioLamThem2, luong2);
        System.out.printf("--------------------------------------------------------------------------------%n");
        System.out.printf("| %-5s | %-12s | %-11s | %-12s| %-12s | %-10s |%n",
                maCanBo3, hoVaten3, ngaySinh3, tongNgayLam3, soGioLamThem3, luong3);
        System.out.printf("--------------------------------------------------------------------------------%n");

        long tongLuong = luong1 + luong2 + luong3;

        System.out.println("Tong luong: " + tongLuong);
        System.out.println("--------------------------------------------------------------------------------");

    }
}
