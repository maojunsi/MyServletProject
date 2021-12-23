import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author MJS
 * @description
 * @date 2021/7/11
 */
public class ddd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String  filePath = this.getServletContext().getRealPath("C:\\Users\\MJS\\Desktop\\Snipaste_2021-07-11_00-33-33.png");

        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
        resp.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "utf-8"));

        FileInputStream is = new FileInputStream(filePath);
        //创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream os = resp.getOutputStream();
        len = is.read(buffer);
        while (len > 0) {
            os.write(buffer);
        }
        is.close();
        os.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
