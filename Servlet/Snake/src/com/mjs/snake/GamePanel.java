package com.mjs.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author MJS
 * @description 画板
 * @date 2021/10/25 22:14
 */
public class GamePanel extends JPanel implements KeyListener {

    private int length;

    private int[] SNAKE_X = new int[600];

    private int[] SNAKE_Y = new int[600];


    /**
     * 画板：画界面，画蛇
     * @param g 画笔
     */
    @Override
    protected void paintComponent(Graphics g) {
        //清屏
        super.paintComponent(g);
        //设置背景色
        this.setBackground(Color.WHITE);
        //绘制图片的广告栏
        Data.header.paintIcon(this, g, 25, 11);
        //绘制游戏区域
        g.fillRect(25, 75, 850, 600);
    }

    /**
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 按下按键
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {

    }

    /**
     * 释放按键
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
