import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Введите число задания 1-3");
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    try {
        switch (count) {
            case 1:
                System.out.println("Введите два числа целые a>b");
                int a1 = in.nextInt();
                int b1 = in.nextInt();
                if (a1 < b1 || b1 == 0) throw new Exception("нельзя делить");
                System.out.printf("%d/%d= %d", a1, b1, (a1 / b1));
                break;
            case 2:
                System.out.println("Введите три числа целые");
                int a2 = in.nextInt();
                int b2 = in.nextInt();
                int d2 = in.nextInt();

                System.out.printf("Больше всех из %d %d %d это %d", a2, b2, d2, (((a2 > b2) && (a2 > d2)) ? a2 : (b2 > d2) ? b2 : d2)); //Math.max
                break;
            case 3:
                System.out.println("Введите число целое положительное");
                int a3 = in.nextInt();
                if (a3 <= 0) throw new Exception("не верное число");
                if (a3 >= 21) throw new Exception("это уже перебор");
                long sum = 1;
//                for (int i = 2; i < a3 + 1; i++) {
//                    sum *= i;
//                }
                int i = 1;
                do {
                    sum *= i;
                    i++;
                } while (i < (a3 + 1));
                System.out.printf("наше число %d", sum);
                break;
            default:
                System.out.println("Не верно введено число");
        }
    } catch (Exception ex) {
        System.err.println(ex.getMessage());
    } finally {
        in.close();
    }
}
