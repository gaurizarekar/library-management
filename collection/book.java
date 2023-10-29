package collection;

public class book {
private int isbn;
private String title;
private String author;
private int quantity ;
book()
{
	super();
}
public book(int isbn, String title, String author, int quantity) {
	super();
	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.quantity = quantity;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String toString()
{
	return isbn+""+author+""+title+""+quantity+"";
}
}
