/*
 * 版权所有(C)，wanghaidi，2022，所有权利保留。
 *
 * 项目名： day01
 * 文件名： TicketsTest.java
 * 模块说明：
 * 修改历史:
 * 2022年-02月-19日 - wanghaidi - 创建。
 *
 */

package com.whd.domain;

import com.whd.pojo.Tickets;

/**
 * @ClassName TicketsTest
 * @Author WangHaiDi
 * @Date 2022年02月19日 10:43
 * @description Test
 * @Version 1.0
 */
public class TicketsTest {
    public static void main(String[] args) {
        Tickets t1 = new Tickets();
        t1.setName("窗口1");
        t1.start();
        Tickets t2 = new Tickets();
        t2.setName("窗口2");
        t2.start();
    }
}
