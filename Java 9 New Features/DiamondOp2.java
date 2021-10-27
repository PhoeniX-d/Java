import java.util.Iterator;
import java.util.NoSuchElementException;

public class DiamondOp2 {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Rabbit", "Elephant", "Tiger", "Jaguar"};
        Iterator<String> itr = new Iterator<>(){
            int i = 0; 
            public boolean hasNext(){
                return i < animals.length;
            }

            public String next(){
                if(!hasNext())
                    throw new NoSuchElementException();
                return animals[i++];
            }
        };
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
