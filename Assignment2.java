import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Please enter a positive integer");
        Scanner input = new Scanner(System.in);
        int inputnumber = input.nextInt();

        if (inputnumber % 2 == 0){

        } else{
            int addAstrisk = 1;
            int numberOfSpaces = (inputnumber / 2);
            for(int i = 0; i < inputnumber + 1; i++){
                for(int s = numberOfSpaces; s > 1; s--){
                    System.out.print(" ");
                }
                for(int a = 1; a < add - 2; a++){
                    System.out.print("*");
                }
                if(i < (inputnumber / 2) + 1){
                    add = add + 2;
                    numberOfSpaces = numberOfSpaces - 1;
                } else{
                    add = add - 2;
                    numberOfSpaces = numberOfSpaces + 1;
                }
            }


        }
    }
}
