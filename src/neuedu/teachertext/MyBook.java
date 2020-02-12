package neuedu.teachertext;

public class MyBook {
    private String name;
    private Double price;
    private String press;
    private String auther;
    private String bookISBN;

    public MyBook(String name, Double price, String press, String auther, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.auther = auther;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", auther='" + auther + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
