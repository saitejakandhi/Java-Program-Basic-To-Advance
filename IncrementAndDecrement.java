public class IncrementAndDecrement {
    public static void main(String[] args){
        int x = 3;
        int y = 5;
        int z = x++ -  ++y - --x + y-- +2+ ++y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}

