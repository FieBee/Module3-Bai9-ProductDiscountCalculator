import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet (name = "ProductDiscountCalculator", value = "/product")
public class ProductDiscountCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String str = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int percent = Integer.parseInt(request.getParameter("percent"));

        int discountAmount = (int) (price * percent * 0.01);
        int discountPrice = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<br>");
        writer.println("<h1>Lượng chiết khấu là: " + discountAmount + "</h1>");
        writer.println("<br>");
        writer.println("<h1>Giá tiền sau khi chiết khấu là: " + discountPrice + "</h1>");

    }
}
