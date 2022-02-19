/*
 * 版权所有(C)，wanghaidi，2022，所有权利保留。
 *
 * 项目名： day01
 * 文件名： TowTicketTest.java
 * 模块说明：
 * 修改历史:
 * 2022年-02月-19日 - wanghaidi - 创建。
 *
 */

package com.whd.domain;

import com.whd.pojo.Ticket;
import com.whd.pojo.TowTicket;

/**
 * @ClassName TowTicketTest
 * @Author WangHaiDi
 * @Date 2022年02月19日 14:47
 * @description Test
 * @Version 1.0
 */
public class TowTicketTest {
    public static void main(String[] args) {
        //创建Ticket对象
        TowTicket ticket = new TowTicket();
        //创建线程传入ticket对象
        Thread t1 = new Thread(ticket);
        t1.setName("窗口1");
        t1.start();
        Thread t2 = new Thread(ticket);
        t2.setName("窗口2");
        t2.start();
    }
}
