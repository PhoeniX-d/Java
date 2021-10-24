@FunctionalInterface
interface Interf3{
    public int getSquare(int n);
}
class LambdaExp3{
    public static void main(String[] args) {
        Interf3 i = x->x*x;
        System.out.println("The Square is " + i.getSquare(10));
    }
}
