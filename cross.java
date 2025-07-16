public class cross {
    static void star(int start, int Ccol,int Tcol){
        if(start>(2*Tcol)){
            System.out.println();
            return;
        }
        if(start==Ccol || start==(2*Tcol)-Ccol){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        star(start+1, Ccol, Tcol);
    }

    static void pattern(int currentRow,int row){
        if(currentRow>row){
            return;
        }
        star(1, currentRow, row);
        pattern(currentRow+1, row);
        if(currentRow!=row){
            star(1,currentRow, row);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        int row=3;
        pattern(1, row);
    }
}
