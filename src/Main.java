import java.util.Scanner;

/**
 * Created by irisochka on 19.01.16.
 */
public class Main {


  static Toast tt = new Toast();
    static  String kk;




    public static void main(String[] args) {
//CharAlpabeth();
//Opt();
        Matrix();
    }


   static private void Opt(){
       tt.toastPrintLn("Введите количество циклов");

       Scanner sc = new Scanner(System.in);

       int ff = sc.nextInt();

       tt.toastPrintLn("---Start---");

       for (int i = 0; i < ff; i++){
           kk = (i+1) + "-й член последовательности равен : " + String.valueOf((int)(Math.random()*9)+1);
           tt.toastPrintLn(kk);

       }

       tt.toastPrintLn("---End---");
       tt.toastPrintLn("Продолжить? (Да/Нет)");
       String xx = sc.next();
       if(xx.equals("Да")){
        tt.toast_space();
           Opt();
       }
    }



    static private void CharAlpabeth(){
        char ch = 0;


        for (int i = 0; i <100; i++){

            tt.toastPrintLn(i+" "+ch);
            ch++;
        }
    }

    static private void Matrix(){

        int[][] A = new int[10][10];


        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                A[i][j] = (int)(Math.random()*99)+1;
                tt.toastPrint(A[i][j] + "\t");
            }
            tt.toastPrintLn("");
        }
    }


}
