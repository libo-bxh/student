import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @version 1.0
 * @Author: Beau li
 * @Date: Created in 21:05 2020/6/17
 */
@WebServlet(name = "Hello")
public class Hello extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("实例被创建了");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("处理Get请求。。。。。");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet-Get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("处理Post请求。。。。。");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet-Post");
    }
}
