import java.util.ArrayList;

class Reverse{
    int quotient, remainder, num;

    int reverseNumber(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        this.quotient = n/10;
        this.remainder = n%10;

        while ((quotient != 0) || (remainder != 0)){
            arr.add(remainder);
            remainder = quotient%10;
            quotient /= 10;
        }

        int l = arr.size(), val = 0;
        for (int i=0; i<l; i++){
            val += (arr.get(i))*(Math.pow(10, (l-(i+1))));
        }

        return val;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Reverse rev = new Reverse();
        System.out.println(rev.reverseNumber(1234));
        System.out.println(rev.reverseNumber(53648));
    }
}
