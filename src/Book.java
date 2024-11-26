public class Book {
    public String Title;
    public String Author;
    public int AmountOfPages;

    Book(String NewTitle, String NewAuthor){
        Title = NewTitle;
        Author = NewAuthor;
        AmountOfPages = 0;
    }

    void displayBookInfo() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Amount of pages: " + AmountOfPages);
    }
}
