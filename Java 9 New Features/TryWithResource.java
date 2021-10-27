class MyResource implements AutoCloseable{
    MyResource(){
        System.out.println("Resource Creation ...");
    }

    public void doProcess(){
        System.out.println("Resource Processing ...");
    }

    public void close(){
        System.out.println("Resource Closing ...");
    }
}

class Test{
    public static void preJDK7(){
        MyResource r = null;
        try{
            r = new MyResource();
            r.doProcess();
        }
        catch(Exception e){
            System.out.println("Handling : " + e);
        }
        finally{
            try{
                if(r != null){
                    r.close();
                }
            }
            catch(Exception e){
                System.out.println("Handling : " + e);
            }
        }
    }

    public static void JDK7(){
        try(MyResource r = new MyResource()){
            r.doProcess();
        }
        catch(Exception e){
            System.out.println("Handling : " + e);
        }
    }

    public static void JDK9(){
        MyResource r = new MyResource();
        try(r){
            r.doProcess();
        }
        catch(Exception e){
            System.out.println("Handling : " + e);
        }
    }

    public static void multipleJDK9(){
        MyResource r1 = new MyResource();
        MyResource r2 = new MyResource();
        MyResource r3 = new MyResource();
        MyResource r4 = new MyResource();
        try(r1;r2;r3;r4){
            r1.doProcess();
            r2.doProcess();
            r3.doProcess();
            r4.doProcess();
        }
        catch(Exception e){
            System.out.println("Handling : " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Program Execution With PreJDK7");
        preJDK7();

        System.out.println("Program Execution With JDK7");
        JDK7();

        System.out.println("Program Execution With JDK9");
        JDK9();

        System.out.println("Program Execution Multiple Resources With JDK9");
        multipleJDK9();
    }
}
