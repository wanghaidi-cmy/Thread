/*
 * 版权所有(C)，wanghaidi，2022，所有权利保留。
 *
 * 项目名： day01
 * 文件名： TowTicketsTest.java
 * 模块说明：
 * 修改历史:
 * 2022年-02月-19日 - wanghaidi - 创建。
 *
 */

package com.whd.domain;

import com.whd.pojo.TowTickets;

/**
 * @ClassName TowTicketsTest
 * @Author WangHaiDi
 * @Date 2022年02月19日 15:22
 * @description Test
 * @Version 1.0
 */
public class TowTicketsTest {
    public static void main(String[] args) {
        TowTickets tickets = new TowTickets();
        Thread t1 = new Thread(tickets);
        t1.setName("窗口1");
        t1.start();
        Thread t2 = new Thread(tickets);
        t2.setName("窗口2");
        t2.start();
        Thread t3 = new Thread(tickets);
        t3.setName("窗口3");
        t3.start();
    }
}
