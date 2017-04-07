package jurnal1;

import java.util.Scanner;

public class Jurnal1 {

    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        int nj = show.nextInt();
        long fib[] = new long[nj];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i < nj; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
       for(int i = nj-1; i >= 1; i--){
            System.out.print(fib[i]+ " ");
        }
        System.out.println("");
        int result = 0;
        for(int i = 1; i < nj; i++){
            result += fib[i];
        }
        System.out.println(result);
    }
    
}
