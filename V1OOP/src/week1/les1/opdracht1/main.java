package week1.les1.opdracht1;

public class main {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            System.out.println("The for count is: " + i);
        }
        System.out.println("---------------------");

        int count = 1;

        while(count < 11){
            System.out.println("The while count is: " + count);
            count++;
        }
        System.out.println("---------------------");

        int countRandom = 1;

        while(countRandom < 11){
            System.out.println("The random number is: " + Math.random());
            countRandom++;
        }
        System.out.println("---------------------");

        int countAddingUp = 0;
        int answer = 0;

        while(countAddingUp < 40){
            answer = answer + countAddingUp;
            countAddingUp++;
        }
        System.out.println(answer);
        System.out.println("---------------------");

        for(int p=1; p<11; p++){
            if(p % 2 == 0){
                System.out.println("ss");
            }
            else{
                System.out.println("s");
            }
        }
    }
}
