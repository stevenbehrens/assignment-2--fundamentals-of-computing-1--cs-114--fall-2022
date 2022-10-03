import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Please enter a positive integer");
        Scanner input = new Scanner(System.in);
        int inputnumber = input.nextInt();
        if (inputnumber % 2 == 0){
            int addAstrisk = 0;
            int numberOfSpaces = (inputnumber);
            for(int i = 0; i <= inputnumber + 2; i++){
                for(int s = numberOfSpaces + 2; s >= 1; s--){
                    System.out.print(" ");
                }
                for(int a = 1; a <= addAstrisk - 2; a++){

                    System.out.print("*");
                    System.out.print(" ");
                }
                if(addAstrisk == 2){
                    System.out.print("\b" + "*");
                }
                System.out.println();
                if(i < inputnumber / 2 + 1){
                    addAstrisk = addAstrisk + 2;
                    numberOfSpaces = numberOfSpaces - 2;
                } else{
                    addAstrisk = addAstrisk - 2;
                    numberOfSpaces = numberOfSpaces + 2;
                }
            }

        } else{
            int addAstrisk = 1;
            int numberOfSpaces = (inputnumber / 2);
            for(int i = 1; i <= inputnumber; i++){
                for(int s = numberOfSpaces; s >= 1; s--){
                    System.out.print(" ");
                }
                for(int a = 1; a <= addAstrisk ; a++){
                    System.out.print("*");
                }
                System.out.println();
                if(i < inputnumber / 2 + 1){
                    addAstrisk = addAstrisk + 2;
                    numberOfSpaces = numberOfSpaces - 1;
                } else{
                    addAstrisk = addAstrisk - 2;
                    numberOfSpaces = numberOfSpaces + 1;
                }
            }

        }
    }
}
