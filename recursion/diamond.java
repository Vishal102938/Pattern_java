class diamond {

    static void star(int n) {
        if (n == 0)
            return;
        System.out.print("* ");
        star(n - 1);
    }

    static void print_space(int space) {
        if (space == 0)
            return;
        System.out.print(" ");
        System.out.print(" ");
        print_space(space - 1);
    }

    static void pattern_upper(int n, int num) {
        if (n == 0)
            return;
        star(n);
        print_space(2 * (num - n) + 1);
        star(n);
        System.out.print("\n");

        pattern_upper(n - 1, num);
    }

    static void pattern_lower(int n, int num) {
        if (n == 0)
            return;
        star(num - n + 1);
        print_space(2 * n - 1);
        star(num - n + 1);
        System.out.print("\n");

        pattern_lower(n - 1, num);
    }

    static void pattern(int n, int num) {
        pattern_upper(n, num);
        pattern_lower(n - 1, num);
    }

    public static void main(String[] args) {
        int n = 6;
        pattern(n, n);
    }
}