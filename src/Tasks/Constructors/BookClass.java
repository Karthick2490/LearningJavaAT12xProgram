package Tasks.Constructors;

import java.awt.print.Book;

public class BookClass {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "Karthick", 12000);
        book.DisplayBookDetails();
    }
    public static class Book{
        private String Title;
        private String Author;
        private int Price;

        public Book(String Title, String Author, int Price)
        {
            this.Title = Title;
            this.Author = Author;
            this.Price = Price;
        }

        public void DisplayBookDetails(){
            System.out.println("Title: " +Title);
            System.out.println("Author: " +Author);
            System.out.println("Price: " +Price);
        }
    }
}
