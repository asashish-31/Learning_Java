package day1;

public class SwapNumbers {
    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 100;

        System.out.println("Before Swapping: ");
        System.out.println("n1= " +n1);
        System.out.println("n2= " +n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping: ");
        System.out.println("n1= " +n1);
        System.out.println("n2= " +n2);

    }
}
