/*
 * 版权所有(C)，wanghaidi，2022，所有权利保留。
 *
 * 项目名： day01
 * 文件名： TowTicket.java
 * 模块说明：
 * 修改历史:
 * 2022年-02月-19日 - wanghaidi - 创建。
 *
 */

package com.whd.pojo;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 * @ClassName TowTicket
 * @Author WangHaiDi
 * @Date 2022年02月19日 14:31
 * @description TODO
 * @Version 1.0
 */
public class TowTicket implements Runnable{

    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
           show();
        }
    }
    /**
     *功能描述 同步代码方法实现同步机制（锁）
     * @author wanghaidi
     * @date 2022/2/19 14:49
     * @param
     * @return void
     */
    private synchronized void show(){//同步监视器this
        if(ticket > 0){
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
