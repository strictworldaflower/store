package item;

public abstract class Item {
    String bookid;
    String name;
    int unitPrice;
    public Item(String bookId, String name, int unitPrice) {
        this.bookid = bookId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    abstract String getBookId();
    abstract String getName();
    abstract int getUnitPrice();

    abstract void setBookId(String bookId);
    abstract void setName(String name);
    abstract void setUnitPrice(int unitPrice);

}
