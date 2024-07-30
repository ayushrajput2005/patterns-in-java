public class characterpattern{
    public static void main(String[] args) {
        int n = 5; //number of rows
        for(int i=1;i<=n;i++){
            //outer loop for rows
            int charindex = 65; //starts with A
            for(int j=0;j<i;j++){
                System.out.print((char)charindex+" "); //printing char at 65(A)
                charindex ++; //updating charindex value
            }
            System.out.println(); //printing new
        }
    }
}