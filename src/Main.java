public class Main {
        public static void main(String[] args) {
            int[] catsHangryLevel = {66, 4, 100, 199, 100};
            System.out.println(Arrays.toString(catsHangry(catsHangryLevel)));
        }
        public static int[] catsHangry(int[] cat) {
            int[] myArray = new int[cat.length];
            for (int i = 0; i < cat.length; i++) {
                if (cat[i] < 100) {
                    myArray[i] = i + (100 - i);
                } else if (cat[i] > 100) {  //ошибка входных данных, котик полностью сыт
                    myArray[i] = 100;
                } else
                    myArray[i] = 100;
            }
            return myArray;

        }
    }
/* 4. Добавляем функционал.
         Теперь процент сытости котиков не подаём на вход в виде массива, а вводим с консоли.
         Для этого хардкодим размер массива котиков (пусть для начала котиков будет три). Значение сытости вводим с консоли, для каждого котика своё.
         Перед вводом каждого значения выводить сообщение: "Введите процент сытости 1го котика: ", "Введите процент сытости 2го котика: " и т.д.
         Полученные значения записываем в массив котиков внутри метода.
         Остальное - без изменений.
         P.S. Не забываем закрывать поток данных после ввода.
public class Main {
    public static void main(String[] args) {
        int[] catsHangryLevel = {cat1, cat2, cat3};
        System.out.println(Arrays.toString(catsHangry(catsHangryLevel)));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите процент сытости 1го котика:");
        int pr1 = in.nextInt();
        System.out.print("Введите процент сытости 2го котика:");
        int pr2 = in.nextInt();
        System.out.print("Введите процент сытости 3го котика:");
        int pr3 = in.nextInt();
        in.close();
    }
    public static int[] catsHangry(int[] cat) {
        int[] myArray = new int[cat.length];
        for (int i = 0; i < cat.length; i++) {
            if (in.nextInt() < 100) {
                myArray[i] = i + (100 - i);
            } else if (in.nextInt() > 100) {  //ошибка входных данных, котик полностью сыт
                myArray[i] = 100;
            } else
                myArray[i] = 100;
        }
        return myArray;

    }
} */
