import java.util.Scanner;
class Publisher {
    String publisher;
    Publisher(String pub) {
        this.publisher = pub;
    }
}
class Book extends Publisher {
    String book;
    Book(String pub, String boo) {
        super(pub);
        this.book = boo;
    }
}
class Literature extends Book {
    Literature(String pub, String boo) {
        super(pub, boo);
    }
    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Book: " + book);
    }
}
class Fiction extends Book {
    Fiction(String pub, String boo) {
        super(pub, boo);
    }
    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Book: " + book);
    }
}
public class bookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of Literature books: ");
        int num = sc.nextInt();
        sc.nextLine();
        Literature[] literatureBooks = new Literature[num];
        System.out.println("\nEnter the Literature book details\n");
        for (int i = 0; i < num; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.print("Book Name: ");
            String boo = sc.nextLine();
            System.out.print("Publisher: ");
            String pub = sc.nextLine();
            literatureBooks[i] = new Literature(pub, boo);
        }
        System.out.println("\nEnter the number of Fiction books: ");
        int num1 = sc.nextInt();
        sc.nextLine(); 
        Fiction[] fictionBooks = new Fiction[num1];
      	System.out.println("\nEnter the Fiction book details\n");
        for (int i = 0; i < num1; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.print("Book Name: ");
            String boo = sc.nextLine();
            System.out.print("Publisher: ");
            String pub = sc.nextLine();
            fictionBooks[i] = new Fiction(pub, boo);
        }
        
        sc.close(); 
        System.out.println("\n************ Information of all Literature books **************");
        for (int i = 0; i < num; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            literatureBooks[i].display();
        }
        System.out.println("\n************ Information of all Fiction books **************");
        for (int i = 0; i < num1; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            fictionBooks[i].display();
        }
    }
}
