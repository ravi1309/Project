/*
Anonymous Class
(name less classes)
by using abstract modifier
by using interface
if you don't know the behaviour then we use abstract modifier
use it with class and with method
illegal combinations are private and abstract
final and abstract
 */
/*abstract class Result
{
    abstract public void calcResult();
}*/
/*class Cresult extends Result
{

    @Override
    public void calcResult()
    {
        System.out.println("Welcome");
    }
}*/
interface Result1
{
    public void calcResult();
    default public void m2()
    {

    }
    public static void m3()
    {

    }
    private void m4()
    {

    }
}
public class test
{
    public static void main(String[] args) {
        new Result1(){
            @Override
            public void calcResult() {

            }
        };
    }
}
