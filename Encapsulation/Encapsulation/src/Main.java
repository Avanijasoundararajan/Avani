import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name : ");
        String bookName = scanner.next();
        System.out.println("Enter price : ");
        double price = scanner.nextDouble();
        System.out.println("Enter quantity : ");
        int qtyInStock = scanner.nextInt();
        System.out.println("Enter author name : ");
        String authorName = scanner.next();
        System.out.println("Enter email : ");
        String authorEmail = scanner.next();
        System.out.println("Enetr the gender M/F : ");
        char gender = scanner.next().charAt(0);
        Author author = new Author(authorName,authorEmail,gender);
        Book book = new Book(bookName,author,price,qtyInStock);
        book.setAuthor(author);
        book.setName(bookName);
        book.setPrice(price);
        book.setQtyInStock(qtyInStock);
        System.out.println("Book Name : "+book.getName());
        System.out.println("Price  : "+book.getPrice());
        System.out.println("Quantity : "+book.getQtyInStock());
        Author authorDetails = book.getAuthor();
        System.out.println("Author : "+authorDetails.name);
        System.out.println("Author email : "+authorDetails.email);
        System.out.println("Author gender : "+authorDetails.gender);
    }
}