import java.io.FileWriter;

// Question 2
class HaveDeprecatedMethod{
    @Deprecated
    int factorial(int n){
        int val;
        if (n==0 || n==1){
            val = 1;
        }
        else{
            val = n * factorial(n-1);
        }
        return val;
    }
}

// Question 3
interface Poet{
    void writePoem(String topic);
    void recitePoem(String poem);
}

public class App2 {
    // Question 4
    static void writeTable(int n) throws Exception{
        FileWriter fw = new FileWriter("Table.txt",true);

        for (int i=1; i<=10; i++){
            fw.write(n+" X "+i+" = "+(n*i)+"\n");
        }

        fw.close();
    }

    @SuppressWarnings("Deprecation")
    public static void main(String[] args) throws Exception{
        /*
        HaveDeprecatedMethod obj = new HaveDeprecatedMethod();
        System.out.println(obj.factorial(5));
        // Since a deprecated method is used, following warning is displayed
        // Note: App2.java uses or overrides a deprecated API.
        */

        /*
        Poet p = new Poet(){
            public void writePoem(String topic){
                System.out.println("Writing on "+topic);
            }

            public void recitePoem(String poem){
                System.out.println("Reciting "+poem);
            }
        };

        p.writePoem("Cheetah");
        p.recitePoem("Fire & Ice");
        */

        writeTable(16);
    }
}
