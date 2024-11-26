public class Main {
    public static void main(String[] args) {
        Book book = new Book("Always judge a book by its a cover", "Nino Goginashvili");
        book.displayBookInfo();

        System.out.println("");

        Rectangle Rec = new Rectangle(2, 2);
        Rec.perimeter();
        Rec.Area();
        Rec.diagonal();
        Rec.IsSquare();

        System.out.println("");
        
        Clock Clk = new Clock(24, 12, 1);
        Clk.print();
    }

}