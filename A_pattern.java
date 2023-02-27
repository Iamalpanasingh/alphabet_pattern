public class A_pattern {
    public static void main(String arg[]) {
        int m=8;
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                if(i==0 || j==0 || i==4 || j==7){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
