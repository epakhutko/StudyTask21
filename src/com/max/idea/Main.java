package com.max.idea;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        System.out.println("����� ���, �� ��� ��� ����, ��� ��� ���������, ��� ����� ���������\n");
        System.out.println("���������, � ��� 3 �������\n");
        Scanner inp = new Scanner(System.in);
        String Answer;
        String RightAnswer = "���������������� �����";
        String Hint = "���������";
        for (int anum=0; anum<3; anum++) {
            Answer=inp.nextLine();
            System.out.printf("%d\n", anum);
            System.out.printf("%s\n", Answer);
            if (Answer.equals(RightAnswer)) {
                System.out.println("���������!");
                anum = 3;
                return;
             } else if (Answer.equals(Hint) && anum == 0) {
                System.out.println("�� ��������!");
                anum=1;

            }
            else  if (Answer.equals(Hint) && anum != 0) {
                System.out.println("��������� ��� ����������");
                anum--;
            }
            else  if (anum<2) {
                System.out.println("������� ���!");
            }
            //else break;

        }

        System.out.println("������, ������� � ������ ���");
        return;
    }
}
