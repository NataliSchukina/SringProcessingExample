package com.epam.nataliya_shchukina.lesson1.task2;


import java.util.Scanner;

public class ApplicationProcessing {
    public String[] stringArrayInit() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        n = scanner.nextInt();
       /* if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.print("Введены некорректные данные!");
            return ;
        }*/

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку номер " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        return strings;
    }
    public void GetMinString ( String [] strarray) {
        int strinlengthgmin = strarray[0].length() ;
        String strminlength = strarray[0];
              for (String value : strarray) {

            if (value.length() < strinlengthgmin) {
                strinlengthgmin = value.length();
                strminlength = value;
            }
        }
        System.out.println("minlength is: "+ strinlengthgmin);
        System.out.println("Sring with minlength is: "+ strminlength );
    }
    public void GetMaxString ( String [] strarray) {
        int strinlengthgmax = strarray[0].length() ;
        String strmaxlength = strarray[0];
        for (String value : strarray) {

            if (value.length() >  strinlengthgmax) {
                strinlengthgmax = value.length();
                strmaxlength = value;
            }
        }
        System.out.println("maxlength is: "+ strinlengthgmax);
        System.out.println("Sring with maxlength is: "+ strmaxlength );
    }
}

