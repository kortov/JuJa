package com.juja.eugene.kortov.b_algorithms.Lab25;

public class Issue {
    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return "name=" + name +
                ",countPages=" + countPages;
    }

}
/*Необходимо реализовать конструктор Journal, который принимает на вход 4 параметра:  nameJournal, countPages, yearJournal, numberJournal и сохраняет их.

Необходимо реализовать метод toPrint() для класса Journal, который выводит на печать информацию про журнал в следующем формате:
 Journal{name=<name>,countPages=<countPages>,year=<yearJournal>,number=<numberJournal>}*/
class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String name, int countPages, String yearJournal, String numberJournal) {
        super(name, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    @Override
    public String toPrint() {
        String result = "Journal{" + super.toPrint();
        result += ",year=" + yearJournal +
                ",number=" + numberJournal + "}";
        return result;
    }

/*BODY*/
}