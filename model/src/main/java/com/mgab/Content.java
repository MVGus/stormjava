package com.mgab;

public class Content {
    private Long id;
    private String header;
    private String text;

    public Content(Long id, String header, String text) {
        this.id = id;
        this.header = header;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
