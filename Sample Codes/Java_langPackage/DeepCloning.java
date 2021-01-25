class Cat 
{
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

    /* for deep cloning we jave to override clone() of Object class */
    public Object clone()throws CloneNotSupportedException
    {
        Cat c1 = new Cat(this.c.j);
        Dog d2 = new Dog(c1, this.i);
        return d2;
    }
}

class DeepCloning 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Cat c = new Cat(20);
        Dog d1 = new Dog(c, 10);
        System.out.println("Original before clone\t:" + d1.c.j + "..." + d1.i);
        
        // Deep cloning
        Dog d2 = (Dog) d1.clone();

        d2.i = 800;
        d2.c.j = 777;
        System.out.println("Original after clone\t:" + d1.c.j + "..." + d1.i);

    }
}
