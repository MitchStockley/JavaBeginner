package Book3.chapter4;

public class Product {
    public Product(double price) throws ProductDataException
    {
        if (price < 0)
        {
            throw new ProductDataException("");
        }
    }
}
