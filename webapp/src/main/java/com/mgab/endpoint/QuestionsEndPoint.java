package com.mgab.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsEndPoint {

    @GetMapping
    public List<String> getQuestions(){
        return Collections.singletonList("Ok");
    }
}
