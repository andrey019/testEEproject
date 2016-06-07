import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class QuestServlet extends HttpServlet {
    private static Answers answers = new Answers();
    private static final String RESPONSE =
    "<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"UTF-8\"> <title>Research results</title> </head>" +
    "<body> total amount of participants: %s <br><br> people that liked java courses: %s<br>" +
    "people that don't like java courses: %s<br><br> people that attend english classes: %s<br>" +
    "people that don't attend english classes: %s </body> </html>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ((req.getParameter("courses") == null) || (req.getParameter("english") == null) ||
                (req.getParameter("name") == "") || (req.getParameter("surname") == "") ||
                (req.getParameter("age") == "")) {
            resp.getWriter().write("Error! You must fill all fields!");
        }

        HashMap<String, String> questions = new HashMap<>();
        questions.put("courses", req.getParameter("courses"));
        questions.put("english", req.getParameter("english"));
        answers.addAnswer(req.getParameter("name"), req.getParameter("surname"), req.getParameter("age"), questions);
        HashMap<String, String> stats = answers.getStatistics();
        resp.getWriter().write(String.format(RESPONSE, stats.get("participants"), stats.get("courses.yes"),
                stats.get("courses.no"), stats.get("english.yes"), stats.get("english.no")));
    }
}
