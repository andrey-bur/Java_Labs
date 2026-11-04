
void main() {
    System.out.println("Введите задание");
    Scanner in = new Scanner(System.in);
    int col = in.nextInt();
    System.out.println("Введите строку");
    switch (col) {
        case 1:
            String a = in.nextLine();
            System.out.println(a.isEmpty());
            break;
        case 2:
            String b = in.nextLine();
            String[] words = b.split(" ");
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                res.append(new StringBuilder(words[i]).reverse());
                if (i < words.length - 1) res.append(" ");
            }
            System.out.println("Результат: " + res);
            break;
        case 3:
            Employee[] employees = new Employee[]{
                    new Employee("Иванов И.И.", 125000.50),
                    new Employee("Петров П.П.", 85000.00),
                    new Employee("Сидорова А.В.", 94500.753),
                    new Employee("Кузнецов К.К.", 150000.0)
            };
            Report.generateReport(employees);
            break;
        case 4:
            String i = in.nextLine();
            if (i.isEmpty()) {
                System.out.println("Количество слов из латинских букв: 0");
            } else {
                String[] words2 = i.split("\\s+");
                int count = 0;
                for (String word : words2) {
                    if (word.matches("[a-zA-Z]+")) {
                        count++;
                    }
                }
                System.out.println("Количество латинских слов: " + count);
            }
            break;
        default:
            System.out.println("нет такого задания");
    }
}

