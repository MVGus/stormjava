package com.mgab;

import java.util.List;

public class Question {

    private Long id;
    private Status status;
    private Content content;
    private List<Answer> answers;

    public Question(Long id, Status status, Content content, List<Answer> answers) {
        this.id = id;
        this.status = status;
        this.content = content;
        this.answers = answers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
