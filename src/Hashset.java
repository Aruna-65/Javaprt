import java.util.HashSet;
public class HashSet
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
// add elements to HashSet
        hs.add("New York ");
        hs.add("Brazil");
        hs.add("india");
        hs.add("Abudabi");
        hs.add("Dubai");
        hs.add("Dubai");
        System.out.println("HashSet elements are: ");
        for (String temp : hs)
        {
            System.out.println(temp);
        }
    }
}