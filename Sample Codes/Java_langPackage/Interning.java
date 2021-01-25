class Test
{
    public static void main(String[] args) 
    {
        String s1 = new String("kaizoku");
        String s2 = s1.intern();
        System.out.println(s1 == s2);
        String s3 = "kaizoku";
        System.out.println(s2 == s3);
    }
}