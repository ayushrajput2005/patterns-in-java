public class triangle{
    public static void main(String[] args) {
        int n = 5; //number of rows
        for(int i=1;i<=n;i++){ 
            // outer loop for rows
            for(int j=0;j<i;j++){
                System.out.print("* ");
                //inner loop for coloumn
            }
            System.out.println(); // next line for next row
        }
    }
}