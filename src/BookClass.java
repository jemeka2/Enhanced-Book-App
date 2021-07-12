

public class BookClass {
    private String bookTitle, author, desc, sku;
    double price;

    public BookClass(){
        this.bookTitle = "";
        this.author = "";
        this.desc = "";
        this.price = 0;
        this.sku = "";
    }

    public BookClass(String sku, String bookTitle, String author, String desc, double price){

        this.bookTitle = bookTitle;
        this.author = author;
        this.desc = desc;
        this.price = price;
        this.sku = sku;
    }

    public String getDisplaytext(){
        String output = "SKU: " + this.sku + "\nTitle: " + this.bookTitle + "\nAuthor: " + this.author + "\nDescription: " + this.desc + "\nPrice: $" + this.price + "\n";
        return output;
    }
}
