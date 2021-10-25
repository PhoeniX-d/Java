class Sample {
    private String s;
    Sample(String s){
        this.s = s;
        System.out.println("Constructor Executed : " + s);
    }
}

interface Inter{
    public Sample get(String s);
}

public class ConstructorRef1{
    public static void main(String[] args) {
        Inter f1 = s -> new Sample(s);
        f1.get("From Lambda Expression");

        Inter f2 = Sample::new;
        f2.get("From Constructor Reference");
    }
}

