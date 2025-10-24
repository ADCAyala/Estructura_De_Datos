
public class fibonacci{
    public static void main(String[] args){
        int num = 5;
        for(int i= 0; i< num;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int  fibonacci (int num){
        if (num<=1) return num;
        return fibonacci(num - 1) + fibonacci (num-2);
    }
}