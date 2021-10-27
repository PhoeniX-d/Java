public class DiamondOp1 {
    public static void main(String[] args) {
        MyGenClass<String> c1 = new MyGenClass<String>("Ashborn"){
            public void process(){
                System.out.println("Prcessing ..." + getObj());
            }
        };
        c1.process();

        MyGenClass<String> c2 = new MyGenClass<>("Kaisel"){
            public void process(){
                System.out.println("Prcessing ..." + getObj());
            }
        };
        c2.process();
    }
}

class MyGenClass<T>{
    T obj;
    public MyGenClass(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }

    public void process(){
        System.out.println("Processing obj ...");
    }
}
