package day1;

public class SwapTwoWithoutThird {
    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 40;

        System.out.println("Before Swapping: ");
        System.out.println("n1= " +n1);
        System.out.println("n2= " +n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After Swapping: ");
        System.out.println("n1= " +n1);
        System.out.println("n2= " +n2);
    }
}
