/*
 * 版权所有(C)，wanghaidi，2022，所有权利保留。
 *
 * 项目名： day01
 * 文件名： TowTickets.java
 * 模块说明：
 * 修改历史:
 * 2022年-02月-19日 - wanghaidi - 创建。
 *
 */

package com.whd.pojo;

/**
 * 使用同步方法解决继承Thread类的线程安全问题
 * @ClassName TowTickets
 * @Author WangHaiDi
 * @Date 2022年02月19日 15:11
 * @description TODO
 * @Version 1.0
 */
public class TowTickets extends Thread{
    private static int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true) {
           show();
        }
    }
    public static synchronized void show(){//同步监视器为当前这个类 Tickets.class
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + "卖票，票号为:" + ticket);
            ticket--;
        }else{
            System.exit(0);
        }
    }
}
