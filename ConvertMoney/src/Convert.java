import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rate , vnd, usd;

        System.out.print("Nhap gia tri chuyen doi giua VND/USD: ");
        rate = sc.nextFloat();
        System.out.print("Nhap gia tri tien USD: ");
        usd = sc.nextFloat();
        vnd = usd * rate;
        System.out.format("%.2f USD quy doi ra duoc: %.2f VND",usd,vnd);

    }
}
