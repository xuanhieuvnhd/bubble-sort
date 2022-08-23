public class BubbleSort {
    static int[] list = {1,3,5,7,8,9,-3};
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /*Mảng đã được xắp sếp sẵn không cần thực hiện so sánh */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /*Đổi list[i] với list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Mang sau khi sap xep: ");
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + "   ");
    }
}
