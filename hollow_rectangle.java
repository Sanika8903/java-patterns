public class hollow_rectangle {
    
    public static void hollowRectangle(int RowNo, int ColNo){
        for (int i =1; i<= RowNo; i++){
            for (int j = 1; j<=ColNo; j++){
                if(i==1||j==1||i==RowNo||j==ColNo){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        hollowRectangle(4, 5);
    }
}
