package HomeworkLesson25.Listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.annotation.WebListener;

import java.time.LocalDateTime;

@WebListener
public class ServletRequestListener implements jakarta.servlet.ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request received in :"+ sre.getClass() + LocalDateTime.now());
    }
}
