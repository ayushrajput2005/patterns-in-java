public class numbertriangle {
    public static void main(String[] args) {
        int n = 5; //number of rows
        for(int i=1;i<=n;i++){
            //outer loop for row
            for(int j=1;j<i+1;j++){
                System.out.print(j+" "); //inner loop for printing number
            }
            System.out.println(); //printing new line
        }
    }
}
