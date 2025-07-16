class solid  {

    static void printPattern(int rows, int columns) {
        if (rows == 0) {
            return; 
        }

        if (columns > 0) {
            System.out.print("* ");
            printPattern(rows, columns - 1); 
        } else {
            System.out.println(); 
            printPattern(rows - 1, 4); 
        }
    }

    public static void main(String[] args) 
    {
        int n = 4; 
        printPattern(n, n);
    }
}