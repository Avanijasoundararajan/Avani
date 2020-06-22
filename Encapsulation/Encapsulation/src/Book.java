class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;

    public Book(String name, Author author,double price,int qtyInStock)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}