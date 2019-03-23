package com.mgab.endpoint;

import com.mgab.AccessingToDataBase;
import com.mgab.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsEndPoint {

    @Autowired
    AccessingToDataBase accessingToDataBase;

    @GetMapping
    public List<Question> getQuestions(){
        return accessingToDataBase.getQuestionList();
    }
}
