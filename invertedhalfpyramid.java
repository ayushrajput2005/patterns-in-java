public class invertedhalfpyramid {
    public static void main(String[] args) {
        int n = 4; //rows
        int m = 4; //columns
        //outer loop
        for(int i = 1; i <=n ; i++) {
            // inner loops
            for(int j = 1; j <= (m-i) ; j++) {
                System.out.print("   ");
            }  //condition for printing spaces
            for(int k = 1; k <= i; k++) {
                System.out.print(" * ");
            } //condition for printing stars
            System.out.println();
        }        
    }
}