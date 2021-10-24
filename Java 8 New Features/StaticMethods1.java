interface Left{
    public static void m1(){
        System.out.println("Left Default Method");
    }
}


class Test implements Left{
    public static void main(String[] args) {
       Left.m1();
    }
}
