package d;
import java.util.Scanner;

public class TamGiacCan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height of triagle:  ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            // In khoảng trắng trước sao
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   "); // Sử dụng 3 dấu cách để tạo khoảng trắng rộng hơn
            }

            // In sao
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }

            // Xuống dòng để in dòng tiếp theo
            System.out.println();
        }
    }
}
