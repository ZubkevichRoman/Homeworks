package HomeworkLesson24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet("/washington")
public class ServletTimeWashington extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer = resp.getWriter();
        ZoneId washingtonTime = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(washingtonTime);
        writer.write(zonedDateTime.toString());
        writer.close();
    }
}
