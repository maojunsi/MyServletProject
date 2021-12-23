import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author MJS
 * @description
 * @date 2021/7/11
 */
public class ImageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //让浏览器5秒自动刷新一次
        resp.setHeader("refresh", "5");

        //在内存中创建一个图片
        BufferedImage image = new BufferedImage(400, 200, BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 400);
        //给图片写数据
        g.setColor(Color.BLACK);
        g.setFont(new Font(null, Font.ITALIC, 100));
        g.drawString(getNum(), 0, 100);

        //告诉浏览器，这个请求用图片的方式打开
        resp.setContentType("image/jpeg");
        resp.setHeader("cache-control", "no-cache");
        resp.setHeader("pragma", "no-cache");

        //把图片写给浏览器
        ImageIO.write(image, "jpg", resp.getOutputStream());

    }

    public String getNum() {
        Random random = new Random();
        String num = random.nextInt(9999999) + "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 7 - num.length(); i ++) {
            sb.append("0");
        }
        num = sb.toString() + num;
        System.out.println(num);
        return num;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
