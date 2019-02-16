package com.example.eyuuo.day2_2;

public class Memo {
    private String title;
    private String content;
    //private는 밖에서 접근하는 게 안됨, 접근ㄴ 가능하게 하려면 set,get

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMemo(String title ,String content){
        this.title = title;
        this.content = content;
    }
}
