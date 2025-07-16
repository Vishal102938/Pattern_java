class lrhombus{
    static void star(int row){
        if(row==0){
            return;
        }
        System.out.print(" *");
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
        star(row);
        System.out.println();
        if(currentRow!=row){
            space(row-(row-currentRow));
            pattern(currentRow+1, row);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        int row=4;
        pattern(1, row);
    }
}