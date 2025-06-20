public class ConcreteProduct1 extends  Product {
    private String info;

    public ConcreteProduct1(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public void transform() {
        String infoTemp = "";
        for (int i = 0; i < info.length(); i++) {
            if (info.charAt(i) != ' ' && i != info.length()-1) {
                infoTemp +=  info.charAt(i) + " ";
            } else {
                infoTemp += info.charAt(i) + "";
            }
        }
        info = infoTemp;
    }
}
