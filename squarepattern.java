public class squarepattern {
    public static void main(String args[]) {
        int n = 5; //number of rows
        int m = 5; //number of coloumns

        for(int i=1;i<=n;i++) {
            //loop making rows
            for(int j=1;j<=m;j++) {
                //loop printing element in cell
                System.out.print("*");
            }
            System.out.println(); // making sure next row will be print in next line
        }
        
    }    
}
