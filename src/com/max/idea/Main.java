package com.max.idea;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\n");
        System.out.println("Отгадайте, у вас 3 попытки\n");
        Scanner inp = new Scanner(System.in);
        String Answer;
        String RightAnswer = "Заархивированный вирус";
        String Hint = "Подсказка";
        for (int anum=0; anum<3; anum++) {
            Answer=inp.nextLine();
            System.out.printf("%d\n", anum);
            System.out.printf("%s\n", Answer);
            if (Answer.equals(RightAnswer)) {
                System.out.println("Правильно!");
                anum = 3;
                return;
             } else if (Answer.equals(Hint) && anum == 0) {
                System.out.println("Не открывай!");
                anum=1;

            }
            else  if (Answer.equals(Hint) && anum != 0) {
                System.out.println("Подсказка уже недоступна");
                anum--;
            }
            else  if (anum<2) {
                System.out.println("Подумай еще!");
            }
            //else break;

        }

        System.out.println("Обидно, приходи в другой раз");
        return;
    }
}
