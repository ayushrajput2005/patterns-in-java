public class rhombuspattern {
    public static void main(String[] args) {
        int n = 5; //rows
        for(int i = 1; i <= n; i++) {  //outer loop
            for(int j = 1; j <= (n-i); j++) {  //inner loop to print spaces
                System.out.print("   ");
            }
            for(int j = 1; j <= n; j++) {       //inner loop to print stars
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
