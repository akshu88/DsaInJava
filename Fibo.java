public class Fibo {
    public static void main(String[] args) {
        int ans = f(4);
        System.out.println(ans);
    }

    static int f(int n){

        // base condition

        if(n < 2){
            return n;
        }
        return f(n - 1) + f(n - 2);
    }
}
