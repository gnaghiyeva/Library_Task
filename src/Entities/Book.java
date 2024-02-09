package Entities;

public class Book {
    private int Id;
    private static int id;
    public String Name;
    public String Author;
    public String Language;
    public int Price;
    public int Count;

    public Book() {
        id++;
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void fullInfo() {
        System.out.println(
                        "ID: " + Id +
                        "\nName: " + Name +
                        "\nAuthor: " + Author +
                        "\nLanguage: " + Language +
                        "\nPrice: " + Price +
                        "\nCount: " + Count
        );
    }
}
