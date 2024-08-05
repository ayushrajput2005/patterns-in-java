public class floyds_triangle {
    public static void main(String[] args) {
        int  n = 5; //rows
        int counter = 1;  //counter insures that consucative numbers get printed in consol
        for(int i = 1 ; i <= n ; i++) { //outer loop
            //inner loop
            for(int j = 0; j < i; j++) {
                System.out.print(" "+counter+" ");
                counter ++; //increment in counter 
            }
            System.out.println();
        }
    }
} 
/*in this code i got confused why it works as counter is outside of loop and i used to suppose that if 
if control enters loop with counter = 1; even after updating counter inside loop it should take counter
as 1 through out process, later I revised my concepts regarding control flow in java and how java runtime 
behaves so im clear now, it works as control sees counter ++, it updates counter at instent and take updated
value for next cycle :)
*/