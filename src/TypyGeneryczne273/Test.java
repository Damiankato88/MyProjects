package TypyGeneryczne273;

public class Test {
    public static void main(String[] args) {
        Pair<Integer,String>nov=new Pair<>(4500,"Kowalski");
        Pair<Double,Integer>nov1=new Pair<>(5.4,45600);
        Pair<String,String>nov2=new Pair<>("Jan","Kowalski");
        print(nov);
        print(nov1);
        print(nov2);

    }
    public static <T,V> void print(V arg){
        System.out.println(arg);


    }
}
