package com.mjs.snake;

import javax.swing.*;
import java.net.URL;

/**
 * @author MJS
 * @description 存放外部数据
 * @date 2021/10/25 22:19
 */
public class Data {

    /**
     * 广告的图片,URL：定位图片的地址
     */
    public static URL headerUrl = Data.class.getResource("/statics/header.png");

    /**
     * 广告的图片,ImageIcon：图片
     */
    public static ImageIcon header = new ImageIcon(headerUrl);

    /**
     * 头部位置
     */
    public static URL upUrl = Data.class.getResource("/statics/up.png");
    public static URL downUrl = Data.class.getResource("/statics/down.png");
    public static URL leftUrl = Data.class.getResource("/statics/left.png");
    public static URL rightUrl = Data.class.getResource("/statics/right.png");

    public static ImageIcon up = new ImageIcon(upUrl);
    public static ImageIcon down = new ImageIcon(downUrl);
    public static ImageIcon left = new ImageIcon(leftUrl);
    public static ImageIcon right = new ImageIcon(rightUrl);

    /**
     * 身体
     */
    public static URL bodyUrl = Data.class.getResource("/statics/body.png");
    public static ImageIcon body = new ImageIcon(bodyUrl);


    /**
     * 食物
     */
    public static URL foodUrl = Data.class.getResource("/statics/food.png");
    public static ImageIcon food = new ImageIcon(foodUrl);
}
