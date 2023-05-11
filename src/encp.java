public class encp {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAcc_no(7560L);
        acc.setName("l");
        acc.setEmail("Aruna");
        acc.setAmount(500f);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
