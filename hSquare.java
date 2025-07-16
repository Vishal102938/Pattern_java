public class hSquare {
    static void Sline(int rows){
        if(rows==0){
            return;
        }
        System.out.print("*");
        Sline(rows-1);
    }

    static void Hline(int col,int rows){
        if(col>rows){
            return;
        }
        if(col==1 || col==rows){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        Hline(col+1,rows);
    }

    static void pattern(int currentrows,int rows){
        if(currentrows>rows){
            return;
        }
        if(currentrows==1 || currentrows==rows){
            Sline(rows);
        }
        else{
            Hline(1, rows);
        }
        System.out.println();

        pattern(currentrows+1,rows);
    }
    public static void main(String[] args) {
        int rows=5;
        pattern(1, rows);
    }
}
