package HomeworkLesson28;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/saveRequest")
public class SaveRequestServlet extends HttpServlet {
    String LINK_SUCCESS = ("/WEB-INF/Homework28JspFiles/success.jsp");
    String LINK_SAVE_REQUEST = ("/WEB-INF/Homework28JspFiles/save-request.jsp");
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String userEmail = req.getParameter("email");
        String userMessage = req.getParameter("message");
        if (username == null || userEmail == null || userMessage == null){
            req.setAttribute("error", "Please fill all the fields");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(LINK_SAVE_REQUEST);
            dispatcher.forward(req, resp);
        }else {
            req.setAttribute("name", username);
            req.setAttribute("email", userEmail);
            req.setAttribute("message", userMessage);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(LINK_SUCCESS);
            dispatcher.forward(req, resp);
        }

        resp.sendRedirect(LINK_SUCCESS);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(LINK_SAVE_REQUEST).forward(req, resp);
    }
}
