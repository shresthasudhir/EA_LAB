package cs544.exercise5_2;

public interface IBookSupplier {
	public double computePrice(String isbn);
	public void order(Book book);
}
