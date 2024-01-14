class Square{
    boolean isPerfectSqaure(int n){
        double val = Math.pow(n, 0.5);
        if ((val - (int)val) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    double calSqaure(double x){
        return Math.pow(x, 2);
    }

    double calSqaureRoot(double x){
        return Math.pow(x, 0.5);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Square sq = new Square();
        System.out.println(sq.isPerfectSqaure(36));
        System.out.println(sq.isPerfectSqaure(101));

        System.out.println(sq.calSqaure(31));
        System.out.println(sq.calSqaureRoot(12.1));
    }
}
