public class Main {
    public static void main(String[] args) {
        SalesManager managerEx1 = new SalesManager(new long[]{1, 3, 6, 9});
        System.out.println("for 1,3,6,9 max is: " + managerEx1.max());
        System.out.println("The average is: " + managerEx1.avg());
        SalesManager managerEx2 = new SalesManager(new long[]{25, 88, 1000, -8, 0});
        System.out.println("for 25,88,1000,-8,0 max is: " + managerEx2.max());
        System.out.println("The average is: " + managerEx2.avg());
        SalesManager managerEx3 = new SalesManager(new long[]{25, 25, 1000, 1000, 50});
        System.out.println("for 25, 25, 1000, 1000, 50 max is: " + managerEx3.max());
        System.out.println("The average is: " + managerEx3.avg());
    }
}
