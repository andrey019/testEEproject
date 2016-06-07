import java.util.ArrayList;
import java.util.HashMap;

public class Answers {
    private ArrayList<Answer> answers;

    public Answers() {
        this.answers = new ArrayList<>();
    }

    public boolean addAnswer(String name, String surname, String age, HashMap<String, String> questions) {
        try {
            answers.add(new Answer(name, surname, Integer.valueOf(age), questions));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public HashMap<String, String> getStatistics() {
        if (answers.isEmpty()) {
            return null;
        }

        int likedCoursesYes = 0;
        int likedCoursesNo = 0;
        int attendedEnglishYes = 0;
        int attendedEnglishNo = 0;
        for (Answer answer : answers) {
            if (answer.getCoursesAnswer().equalsIgnoreCase("yes")) {
                likedCoursesYes++;
            } else {
                likedCoursesNo++;
            }
            if (answer.getEnglishAnswer().equalsIgnoreCase("yes")) {
                attendedEnglishYes++;
            } else {
                attendedEnglishNo++;
            }
        }

        HashMap<String, String> results = new HashMap<>();
        results.put("participants", Integer.toString(answers.size()));
        results.put("courses.yes", Integer.toString(likedCoursesYes));
        results.put("courses.no", Integer.toString(likedCoursesNo));
        results.put("english.yes", Integer.toString(attendedEnglishYes));
        results.put("english.no", Integer.toString(attendedEnglishNo));

        return results;
    }
}
