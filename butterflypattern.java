public class butterflypattern {
    public static void main(String args[]) {
            int n = 5;  //rows
            //printing first half of pattern
            for(int i = 1; i <= n; i++) {  //outer loop
                for(int j = 1; j < i+1; j++) {
                    System.out.print(" * ");  //inner loop to print stars
                }
                for(int k = 1; k <= ((n*2)-(i*2)); k++) {  //inner loop to print spaces
                    System.out.print("   ");
                }
                for(int j = 1; j < i+1; j++) {  //inner loop to print stars
                    System.out.print(" * ");
                }
                System.out.println();
            }
            //printing second loop is same as first but difference is polarity of condition is changed
            for(int i = n; i >= 1; i--) {
                for(int j = i+1; j > 1; j--) {
                    System.out.print(" * ");
                }
                for(int k = ((n*2)-(i*2)); k >= 1; k--) {
                    System.out.print("   ");
                }
                for(int j = i+1; j > 1; j--) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
    }
}