@FunctionalInterface
interface Interf2{
    public int getLength(String str);
}
class LambdaExp2{
    public static void main(String[] args) {
        Interf2 i = (str)->str.length();
        System.out.println(i.getLength("The Lambda Exps"));
    }
}