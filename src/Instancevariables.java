public class Instancevariables
{
    public String name; //public instance
    String division;    //default instance
    private int age;
    public Instancevariables(String sname)
    {
        name = sname;
    }
    public void setDiv(String sdiv)
    {
        division = sdiv;
    }
    public void setAge(int sage)
    {
        age = sage;
    }
    public void printstud()
    {
        System.out.println("Student Name: " + name );
        System.out.println("Student Division: " + division);
        System.out.println("Student Age: " + age);
    }
    public static void main(String args[])
    {
        Instancevariables s = new Instancevariables("Arunel");
        s.setAge(6);
        s.setDiv("A");
        s.printstud();
    }
}
