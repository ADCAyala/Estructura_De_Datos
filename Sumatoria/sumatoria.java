public class sumatoria {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("La sumatoria " + n);
        for(int i=n; i > 0; i--){
            System.out.println(i);
        }
        System.out.println(" = " + sumatoria(n));
    } 

    static int sumatoria (int n){

        if (n==0) return n;

        return n + sumatoria(n-1);


    }

}