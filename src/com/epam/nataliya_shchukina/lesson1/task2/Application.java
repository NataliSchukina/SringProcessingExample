package com.epam.nataliya_shchukina.lesson1.task2;

import java.util.Scanner;

public class Application {
    public String[] stringArrayInit() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }else {
            System.out.print("Введены некорректные данные!");
            return;
        }

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку номер " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }  return strings;
    }
    public void runApplication() {

        ApplicationProcessing strArrayProcessing = new ApplicationProcessing();
        var strarray = stringArrayInit();
    }
}
