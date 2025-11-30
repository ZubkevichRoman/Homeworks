package HomeworkLesson24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/age")
public class ServletCheckAge extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String age = req.getParameter("age");
        if (age != null && !age.isEmpty()) {
            try {
                int ageInt = Integer.parseInt(age);
                if (ageInt >= 18) {
                    resp.getWriter().println("Your age is 18 years old.");
                }
                if (ageInt <= 18){
                    resp.getWriter().println("Your age not is 18 years old.");
                    resp.getWriter().println("grow up.");
                }
            }catch (NumberFormatException e) {
                resp.getWriter().println("Please enter the correct age in digital format.");
            }
        }
    }
}
