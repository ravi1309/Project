public class Door
{
    public static void iscorrect(String key)
    {
        class check
        {
            public void m2()
            {
                if(key.equals("Ravi"))
                {
                    System.out.println("Correct");
                }
                else
                {
                    System.out.println("Incorrect");
                }
            }
        }
        new check().m2();
    }
}
class test2
{

    public static void main(String args[])
    {
        Door obj = new Door();
        Door.iscorrect("Ravi");
    }
}
