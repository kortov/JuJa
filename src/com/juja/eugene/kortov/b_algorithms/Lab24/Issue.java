package com.juja.eugene.kortov.b_algorithms.Lab24;

public class Issue {
    public static void main(String[] args) {
        String testNameBook = "TestNameBook";
        String testAuthorBook = "TestBookAuthor";
        int countPages = 100;
        Issue book = new Book(testNameBook, countPages, testAuthorBook);
        System.out.println(book.toPrint());
    }
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

class Book extends Issue {
    private String authorBook;
          /*BODY*/

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    @Override
    public String toPrint() {
        return "Book{" +
                super.toPrint() + ",author=" + authorBook
                + "}";
    }
}

