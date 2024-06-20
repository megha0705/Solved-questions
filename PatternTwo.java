/*1. Print the following pattern.
                0
			1	2
		3	4	5
	6	7	8	9
10	11	12	13
14	15	16
17	18
19

*/
class PatternTwo{
    public static void main(String [] args){
        int n = 4;
        int num = 0;
            for(int i = 0; i <= n; i++){
           
            for(int j = n; j > i; j--){
                System.out.print(/t);
            }
            for(int j = 0; j < i; j++){
                System.out.print( num);
               num += 1;
            }  
            System.out.println();
        }
       
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
             System.out.print( num);
             num +=1;
           }
           
            for(int j = 0; j < i; j++){
             System.out.print(/t);
            }
            System.out.println();
        }
    }
}