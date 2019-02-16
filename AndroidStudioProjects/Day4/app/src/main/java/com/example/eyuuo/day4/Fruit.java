package com.example.eyuuo.day4;

public class Fruit {
    private  int imagid;
    private String name;
    //private는 밖에서 접근하는 게 안됨, 접근ㄴ 가능하게 하려면 set,get

    Fruit(){
    }

    Fruit(int imagid ,String name){
        this.imagid = imagid;
        this.name = name;
    }
    public int getImagid() {
        return imagid;
    }

    public void setImagid(int Imagid) {
        this.imagid = Imagid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
