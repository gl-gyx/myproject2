package com.tom.score;

import com.tom.score.Printable;

public class Student implements Printable {
    String name;
    int english;
    int math;

    public Student(String name){
        this.name=name;
    }
    public Student(String name,int english,int math){
        this.name=name;
        this.english=english;
        this.math=math;
    }
    public Student(){
        this("john",-1,-1);
    }
    public void print(){
        int average=(english+math)/2;
        System.out.print(name+"\t"+english+"\t"+math+"\t"+average);
        if(average<60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage(){
        return((math + english) / 2);
    }
}