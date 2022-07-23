public class Main {
    public static void main(String[] args) {
        SalesManager managerEx1 = new SalesManager(new int[]{1, 3, 6, 9});
        System.out.println("for 1,3,6,9 max is: " + managerEx1.max());
        SalesManager managerEx2 = new SalesManager(new int[]{25,88,1000,-8,0});
        System.out.println("for 25,88,1000,-8,0 max is: " + managerEx2.max());
    }
}
