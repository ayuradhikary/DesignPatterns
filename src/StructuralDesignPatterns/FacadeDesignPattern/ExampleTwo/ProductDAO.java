package StructuralDesignPatterns.FacadeDesignPattern.ExampleTwo;

public class ProductDAO {
    public Product getProduct(int productId){
        return new Product();
    }
}
