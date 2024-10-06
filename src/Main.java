import model.SingletonModel;

public class Main {
    public static void main(String[] args) {
        var singleton1 = SingletonModel.getInstancia();
        System.out.println(singleton1);
        var singleton2 = SingletonModel.getInstancia();
        System.out.println(singleton2);
    }
}