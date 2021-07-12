import java.util.Scanner;

public class BookApp {

    public static void main(String[]  args){
        Scanner kybd = new Scanner(System.in);
        String userInput = "";
        double copyCount = 0, total;

        BookClass book1 = new BookClass("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook", 47.50);
        BookClass book2 = new BookClass("Java1002","Thinking in Java","Bruce Eckel", "Details about Java under the hood",20.00);
        BookClass book3 = new BookClass("Orcl1003", "OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky","Everything you need to know in one place", 45.00);
        BookClass book4 = new BookClass("Python1004", "Automate the Boring Stuff with Python","Al Sweigart","Fun with Python", 10.50);
        BookClass book5 = new BookClass("Zombie1005", "The Maker's Guide to the Zombie Apocalypse","Simon Monk" , "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
        BookClass book6 = new BookClass("Rasp1006", "Raspberry Pi Projects for the Evil Genius","Donald Norris","Everything you need to know in one place", 14.75);

        System.out.println("Enter SKU Code: ");
        userInput = kybd.nextLine();
        System.out.println("How many copies do you want: ");
        copyCount = kybd.nextInt();

        switch(userInput){
            case "Java1001":
                book1.price *= copyCount;
                System.out.println(book1.getDisplaytext());
                break;
            case "Java1002":
                book2.price *= copyCount;
                System.out.println(book2.getDisplaytext());
                break;
            case "Orcl1003":
                book3.price *= copyCount;
                System.out.println(book3.getDisplaytext());
                break;
            case "Python1004":
                book4.price *= copyCount;
                System.out.println(book4.getDisplaytext());
                break;
            case "Zombie1005":
                book5.price *= copyCount;
                System.out.println(book5.getDisplaytext());
                break;
            case "Rasp1006":
                book6.price *= copyCount;
                System.out.println(book6.getDisplaytext());
                break;
        }
    }
}
