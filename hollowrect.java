public class hollowrect {
    public static void main(String[] args) {
        int  n = 4; //number of rows
        int m = 5; //number of columns
        for(int i = 1; i<=n ; i++) {        //outer loop for rows
            for(int j = 1; j <= m ; j++) {   //inner loop for coloumns
                if(i==1||i==n||j==1||j==m) {   //condition for printing star or space
                    System.out.print(" * ");
                }                                       
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}