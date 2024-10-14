
import java.util.*;

class Book{
    Scanner sc = new Scanner(System.in);
    String name, author;
    int price, num_pages;
    Book(String num, String aut, int pri, int np){
        name = num;
        author = aut;
        price = pri;
        num_pages=np;
    }
    void setDetails(){
        System.out.println("Enter Book Name:");
        name=sc.next();
        System.out.println("Enter Author's Name: ");
        author=sc.next();
        System.out.println("Price of Book: ");
        price= sc.nextInt();
        System.out.println("Enter No. of Pages in Book:");
        num_pages=sc.nextInt();
    }
    void getDetails(){
        System.out.print("Book Name: "+name);
        System.out.print("Author's Name: "+author);
        System.out.print("Book Price: "+price);
        System.out.print("No. of Pages: "+num_pages);
    }
    public String toString(){
        return "Book Name: "+name+"\nAuthor's Name: "+author+"\nBook Price: "+price+"\nNo. of Pages: "+num_pages;
//        return getDetails();
    }
}

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noBook, j = 0;
        String s = "NA";
        System.out.print("Enter no. of Books: ");
        noBook = sc.nextInt();
        Book[] bk = new Book[noBook];
        for (int i = 0; i < noBook; i++) {
            System.out.println("Book " + (i + 1));
            bk[i] = new Book(s, s, j, j);
            bk[i].setDetails();
        }
        System.out.println("\nBook Details");
        for (int k = 0; k < noBook; k++) {
            System.out.println();

            System.out.println(bk[k].toString());
        }
    }
}
