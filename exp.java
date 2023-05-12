public class exp {
    public static void main(String[] args) {
        int a = 20, b = 0;
        int c=0;
        try {
            c = a / b;
        }
        catch (Exception e){
            System.out.println("error occured");
        }
        System.out.println(c);
        System.out.println("End of program");
    }
}


