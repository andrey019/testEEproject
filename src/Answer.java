import java.util.HashMap;

public class Answer {
    private String name;
    private String surname;
    private int age;
    private HashMap<String, String> questions;

    public Answer(String name, String surname, int age, HashMap<String, String> questions) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public HashMap<String, String> getQuestions() {
        return questions;
    }

    public String getCoursesAnswer() {
        return questions.get("courses");
    }

    public String getEnglishAnswer() {
        return questions.get("english");
    }
}
