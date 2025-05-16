public class ProductA1 implements AbstractProductA {
    private String info;

    public ProductA1() {
    }

    public ProductA1(int num) {
        this.info = String.valueOf(num);
    }

    public String getInfo() {
        return info;
    }

    //In product type A define method A without parameters
    //Для класса-продукта ProductA1 метод A переводит поле info в целое число,
    // удваивает его и сохраняет строковое представление результата в поле info;
    public void a() {
        int temp = Integer.parseInt(info);
        temp *= 2;
        info = String.valueOf(temp);
    }

}
