import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @description
 * @author MJS
 * @date 2021/7/11
 *
 */public class DownServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String  filePath = "C:\\Users\\MJS\\Desktop\\美女.png";

        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
        resp.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "utf-8"));

        FileInputStream is = new FileInputStream(filePath);
        //创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream os = resp.getOutputStream();
        while ((len = is.read(buffer)) > 0) {
            os.write(buffer, 0, len);
        }
        is.close();
        os.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
