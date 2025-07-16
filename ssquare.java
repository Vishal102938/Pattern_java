public class ssquare {
    static void printstar(int count){
        if(count==0){
            return;
        }
        System.out.println("*");
        printstar(count-1);
    }
    static void printpattern(int row,int col){
        if(row ==0){
            return;
        }
        printstar(col);
        System.out.println();
        printpattern(row-1, col);
    }
    public static void main(String[] args) {
        printpattern(5,5);
    }
}
