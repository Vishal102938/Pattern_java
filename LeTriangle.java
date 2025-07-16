public class LeTriangle {
    static void star(int currentRow){
        if(currentRow==0){
            return;
        }
        System.out.print("*");
        star(currentRow-1);
    }

    static void pattern(int currentRow,int rows){
        if(currentRow>rows){
            return;
        }
        star(currentRow);
        System.out.println();
        pattern(currentRow+1, rows);
    }
    public static void main(String[] args) {
        pattern(1,4);
    }
}
