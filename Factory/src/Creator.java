public abstract class Creator {
    public abstract Product factoryMethod(String info);
    public String anOperation(String info) {
        Product product = factoryMethod(info);
        product.transform();
        product.transform();
        return product.getInfo();
    }
}
