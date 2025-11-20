import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet("/beijing")
public class ServletTimeBeijing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer = resp.getWriter();
        ZoneId beijingTime = ZoneId.of("-05:00");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(beijingTime);
        writer.write(zonedDateTime.toString());
        writer.close();
    }
}
