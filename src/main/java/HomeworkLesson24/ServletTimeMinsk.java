package HomeworkLesson24;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.ZonedDateTime;

public class ServletTimeMinsk extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer = resp.getWriter();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        writer.write(zonedDateTime.toString());
        writer.close();
    }
}
