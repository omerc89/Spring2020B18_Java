package day10_Siwtch_Scanner;

public class days {
    public static void main(String[] args) {
        int num = 3;
        String result = "";

        //if (num > 0 && num < 8)

            result = (num == 1)?"monday" :(num==2)? "Tuesday" :(num==3)?"Wednesday":
                    (num==4)?"Thursday":(num==5)?"Friday":(num==6)?"Saturday":(num==7)?"sunday":"invalid";

        System.out.println(result);
    }
}
