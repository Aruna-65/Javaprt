import java.util.*;
class Coll{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Rith");//Adding object in arraylist
        list.add("AAr");
        list.add("Rio");
        list.add("Aru");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}