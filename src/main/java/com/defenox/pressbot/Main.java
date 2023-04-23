package com.defenox.pressbot;

import java.awt.*;

import static java.awt.event.KeyEvent.*;

public class Main {
    public static void main(String[] args) throws AWTException {
        Thread thread = new Thread(() -> {
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            robot.setAutoDelay(100);
        });

        Thread thread2 = new Thread(() -> {
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            robot.setAutoDelay(30);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);
            robot.keyPress(VK_I);
            robot.keyRelease(VK_I);

            robot.keyPress(VK_J);
            robot.keyPress(VK_K);
            robot.keyRelease(VK_K);
            robot.keyRelease(VK_J);

            robot.keyPress(VK_J);
            robot.keyPress(VK_K);
            robot.keyRelease(VK_K);
            robot.keyRelease(VK_J);

            robot.keyPress(VK_H);
            robot.keyPress(VK_G);
            robot.keyPress(VK_K);
            robot.keyRelease(VK_K);
            robot.keyRelease(VK_G);
            robot.keyRelease(VK_H);
        });

        thread.start();
        thread2.start();
    }
}
