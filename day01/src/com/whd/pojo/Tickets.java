/*
 * 版权所有(C)，wanghaidi，2022，所有权利保留。
 *
 * 项目名： day01
 * 文件名： Tickets.java
 * 模块说明：
 * 修改历史:
 * 2022年-02月-19日 - wanghaidi - 创建。
 *
 */

package com.whd.pojo;

/**
 * @ClassName Tickets
 * @Author WangHaiDi
 * @Date 2022年02月19日 10:39
 * @description TODO
 * @Version 1.0
 */
public class Tickets extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (Tickets.class) {//obj
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + "卖票，票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}



