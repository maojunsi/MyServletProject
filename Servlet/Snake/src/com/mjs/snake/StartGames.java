package com.mjs.snake;

import javax.swing.*;

/**
 * @author MJS
 * @description 描述
 * @date 2021/10/25
 */
public class StartGames {

    public static void main(String[] args) {
        //1、绘制一个静态窗口
        JFrame jFrame = new JFrame("mjs-贪吃蛇");
        //设置界面的大小
        jFrame.setBounds(10, 10, 900, 720);
        //设置窗口大小不可改变，不可放大，也不可能缩小
        jFrame.setResizable(false);
        //设置关闭事件(游戏可以通过右上角的X可以关闭程序)
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //2、面板JPanel，可以加入到JFrame
        jFrame.add(new GamePanel());

        //让窗口能够展现出来
        jFrame.setVisible(true);
    }
}
