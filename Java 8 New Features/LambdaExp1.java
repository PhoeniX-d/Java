@FunctionalInterface
interface Interf1{
    public void display();
}
class LambdaExp1{
    public static void main(String[] args) {
        Interf1 i = ()->System.out.println("This is Lambda Expression");
        i.display();
    }
}