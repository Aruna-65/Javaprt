public class Datasirpi{
    String name;
    static String designation;
    public void display_data(){
        System.out.println("The name is: " + name);
        System.out.println("The designation of this team members is : " + designation);
    }
    public static void main(String s[]){
        Datasirpi.designation = "Intern";
        Datasirpi my_obj = new Datasirpi();
        my_obj.name = "Aruna";
        Datasirpi my_obj_2 = new Datasirpi();
        my_obj_2.name = "Arv";
        my_obj.display_data();
        my_obj_2.display_data();
        my_obj.designation = "Backend Developer";
        System.out.println("\nAfter the changes, the data is :\n");
        my_obj.display_data();
        my_obj_2.display_data();
    }
}

