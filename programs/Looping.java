package programs;

public class Looping {
    public static void main(String[] args) {

        //***If and For Loop
        for(int i=1;i<=10;i++){
            System.out.print(i);
            if(i%2==0){
                System.out.print(":even");
            }
            else{
                System.out.print(":odd");
            }
            //***Terenary Operator
            System.out.print(i%2==0?":even":":odd");

            //***Switch case
            switch (i) {
                case 1,2,3 -> System.out.println(": switch 1,2,3");
                default-> System.out.println(": switch Others");
            }

        }
        //***While Loop
        while (true) {
            System.out.println("Inside While Loop");
            break;
        }

        //*** DO While

        do{
            System.out.println("Inside Do While");
            break;
        }while(true);

        int[] arr = {1,2,3,4,5};

        // For Each Loop
        for(int i: arr){
            System.out.println("i:"+i);
        }
        


    }
}
