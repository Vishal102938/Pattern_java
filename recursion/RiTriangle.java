class RiTriangle{
    static void star(int row){
        if(row==0){
            return;
        }
        System.out.print("*");
        star(row-1);
    }

    static void space(int count){
        if(count==0){
            return;
        }
        System.out.print(" ");
        space(count-1);
    }

    static void pattern(int currentRow,int row){
        if(currentRow>row){
            return;
        }
        space(row-currentRow);
        star(currentRow);
        System.out.println();
        pattern(currentRow+1, row);
    }
    public static void main(String[] args) {
        int row=3;
        pattern(1, row);
    }
}