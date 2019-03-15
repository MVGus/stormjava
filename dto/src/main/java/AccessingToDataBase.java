import com.mgab.Answer;
import com.mgab.Content;
import com.mgab.Question;
import com.mgab.Status;
import java.util.ArrayList;
import java.util.List;

public class AccessingToDataBase {
    public List<Question> getQuestionList(){
        List<Question> questions = new ArrayList<>();
        Answer answer1 = new Answer(1L, "Answer1Text", true);
        Answer answer2 = new Answer(2L, "Answer2Text", false);
        List<Answer> answers = new ArrayList<>();
        answers.add(answer1);
        answers.add(answer2);
        questions.add(new Question(1L, Status.ACTIVE,new Content(1L,"Контент","ТекстКонтента"), answers));
        return questions;
    }
}
