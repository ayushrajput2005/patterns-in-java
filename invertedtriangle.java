public class invertedtriangle {
    public static void main(String[] args) {
        int n = 5; //number of rows
        for(int i=n;i>=1;i--){
            //outer loop for rows
            for(int j=i;j>1;j--){
                System.out.print("* ");
                // innter loop for printing stars
            }
            System.out.println();  //next line
        }
    }
}
