class Popcorn
{
    public void taste()
    {
        System.out.println("salty");
    }
}

class Test
{
    public static void main(String[] args)
    {
     
        Popcorn p = new Popcorn();
        p.taste();

        Popcorn p1 = new Popcorn()
        {
            public void taste()
            {
                System.out.println("spicy");
            }
        };

        p1.taste();
    }
}
