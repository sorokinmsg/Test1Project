import java.util.Scanner;


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



        tt.toastPrintLn("---Матрица случайных чисел---");


        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                A[i][j] = (int)(Math.random()*99)+1;

                tt.toastPrint(A[i][j] + "\t");
            }
            tt.toastPrintLn("");
        }


tt.toast_space();
        tt.toastPrintLn("---Матрица четных элементов---");

    for (int i=0; i<10; i++){
        for (int j=0; j<10; j++){
            if(A[i][j]%2 == 0){
                tt.toastPrint(1 + "\t");
            }
            else {
                tt.toastPrint(0 + "\t");
            }
        }
        tt.toastPrintLn("");
    }



        tt.toast_space();
        tt.toastPrintLn("---Обратная матрица---");

    for (int i=9; i>=0; i--){
        for (int j=9; j>=0; j--){

            tt.toastPrint(A[i][j] + "\t");
        }
        tt.toastPrintLn("");
    }

        tt.toast_space();

        tt.toastPrintLn("---Транспонированная матрица---");

        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){

                tt.toastPrint(A[j][i] + "\t");
            }
            tt.toastPrintLn("");
        }
        tt.toast_space();
        tt.toast_space();

        int min;
        int temp;


        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){


                for (int l=0; l<10; l++){
                    for (int k=0; k<10; k++){
                    if(A[i][j]<A[l][k]){
                        min = A[l][k];
                        temp = A[i][j];

                        A[i][j] = min;
                        A[l][k] = temp;
                    }

                    }

                }

            }

        }

        tt.toastPrintLn("---Упорядоченная матрица---");

        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){

                tt.toastPrint(A[i][j] + "\t");
            }
            tt.toastPrintLn("");
        }






    }


}
