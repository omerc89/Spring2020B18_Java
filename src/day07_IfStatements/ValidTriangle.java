package day07_IfStatements;

public class ValidTriangle {

    public static void main(String[] args) {

        double angle1 = 30;
        double angle2 = 50;
        double angle3 = 60;

        short sumOfAngles = (short) (angle1 + angle2 + angle3);

        boolean validTriangle = sumOfAngles == 180;

        if(validTriangle) {
            System.out.println("The shape is a triangle");
        }

        if(!validTriangle) {
            System.out.println("The shape is not a triangle");
        }





    }
}
