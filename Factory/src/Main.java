public class Main {

    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "String";
        strings[1] = "Main";
        strings[2] = "123456";
        strings[3] = "* * * ";
        strings[4] = "|||>><<<";

        Creator creator1 = new ConcreteCreator1();
        Creator creator2 = new ConcreteCreator2();

        for (int i = 0; i < 5; i++) {
            System.out.println(creator1.anOperation(strings[i]));
            System.out.println(creator2.anOperation(strings[i]));
        }

    }
}
