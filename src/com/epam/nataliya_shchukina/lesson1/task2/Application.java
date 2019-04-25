package com.epam.nataliya_shchukina.lesson1.task2;

import java.util.Scanner;

public class Application {

    public void runApplication() {

        ApplicationProcessing strArrayProcessing = new ApplicationProcessing();
        var strarray = strArrayProcessing.stringArrayInit();
       strArrayProcessing.GetMinString(strarray);
       strArrayProcessing.GetMaxString(strarray);
    }
}
