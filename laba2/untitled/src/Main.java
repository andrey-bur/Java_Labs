import java.util.Scanner;

void main() {
    System.out.println("Ввдите длину масива");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println("Введите задание");
    int a = in.nextInt();
    switch (a) {
        case 1:
            int[] arr = new int[n];
            int max = -1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
                System.out.print(arr[i] + ", ");
                max = Math.max(arr[i], max);
            }
            System.out.printf("\nСамое большое число в массиве %d", max);
            break;
        case 2:
            System.out.println("Ввдите колво столбцов");
            int n2 = in.nextInt();
            int mas[][] = new int[n][n2];
            int[] max2 = new int[n2];
            for (int i = 0; i < mas.length; i++) {
                max2[i] = -1;
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = (int) (Math.random() * 100);
                    System.out.print(mas[i][j] + ", ");
                    max2[i] = Math.max(mas[i][j], max2[i]);
                }
                System.out.println();
            }
            System.out.println("Макс число в каждой строке");
            for (int el : max2) {
                System.out.print(el + ", ");
            }
            break;
        default:
            System.out.println("нет два только задания");
    }
    in.close();
}
