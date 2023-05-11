class bik1{
    int cube(final int n){
        n=n+2;//can't be changed as n is final
        n*n*n;
    }
    public static void main(String args[]){
        bik1 b=new bik1();
        b.cube(5);
    }
}
