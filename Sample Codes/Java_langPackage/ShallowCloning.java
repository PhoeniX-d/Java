class Cat {
    int j;

    Cat(int x) {
        this.j = x;
    }
}

class Dog implements Cloneable 
{
    Cat c;
    int i;

    Dog(Cat c, int i)
    {
        this.c = c;
        this.i = i;
    }

    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class ShallowCloning 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cat c = new Cat(20);
        Dog d1 = new Dog(c, 10);
        System.out.println("Original before clone\t:" + d1.c.j + "..." + d1.i);
        
        // shallow cloning (Object class follows this)
        Dog d2 = (Dog) d1.clone();

        d2.i = 800;
        d2.c.j = 777;
        System.out.println("Original after clone\t:" + d1.c.j + "..." + d1.i);

    }
}
