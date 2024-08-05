public class bytetriangle {
    public static void main(String[] args) {
        int n = 5; //rows
        for(int i = 1; i <= n; i++) { //outer loop
            for(int j = 1; j <i+1; j++) {  //inner loop
                if((i+j)%2==0) {   //condition to print 0 or 1
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}