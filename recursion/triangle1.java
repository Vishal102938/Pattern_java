class triangle1 {
    static void printRow(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("* ");
        printRow(n - 1);
    }

    static void printSquare(int n) {
        if (n == 0) {
            return;
        }
        printRow(n);
        System.out.println();
        printSquare(n - 1);
    }

    public static void main(String[] args) {
        int size = 5; 
        printSquare(size);
    }
}