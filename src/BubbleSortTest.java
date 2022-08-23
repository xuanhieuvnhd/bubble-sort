import java.util.Scanner;

public class BubbleSortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai danh sach: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Nhap " + list.length + " gia tri: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Danh sach khi chua sap xep: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println();
            System.out.print(list[i] + "\t");
        }
        bubbleSortTest(list);
    }

    public static void bubbleSortTest(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Đổi list[i] với list[i + 1] */
                    System.out.println("Doi " + list[i] + " voi " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
            /*Mảng đã được sắp xếp và không cần thực hiện duyệt và so sánh*/
            if (!needNextPass) {
                System.out.println("Mang da duoc sap xep!");
                break;
            }
            /* Danh sách sau khi sắp xếp*/
            System.out.print("danh sach sau khi  " + k + "' sap xep: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
