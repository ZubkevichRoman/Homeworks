package HomeworkLesson25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.Writer;

@WebServlet("/load-book")
@MultipartConfig(location = "D:\\",fileSizeThreshold = 1024 * 1024,maxFileSize = 1024 * 1024 * 10,maxRequestSize = 1024 * 1024 * 50)
public class LoadBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Writer writer = resp.getWriter();
            Part filePart = req.getPart("file");
            String fileName = filePart.getSubmittedFileName();
            filePart.write("D:\\" + fileName);
            writer.write("File uploaded successfully");
            resp.getWriter().print("File uploaded successfully");
        }catch(Exception e){
            resp.getWriter().print("File upload failed");
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/Load-book.jsp").forward(req, resp);
    }

}
