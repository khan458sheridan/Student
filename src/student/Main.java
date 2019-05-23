package student;

/**
 *
 * @author Mohammad Mohaiminul Hasan Khan
 */
public class Main {
    private static Student[] arr = new Student[5];
    
    private static String[] name = {"Hasan", "Jawad", "Kiran", "Parth", "Pavneet"};
    private static int[] age = {32, 28, 19, 20, 21};
    private static boolean[] sex = {true, true, false, true, false};
    private static String[] studentID = {"123456789", "987654321", "432156789", "456123789", "987612345"};
    
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student(name[i], age[i], sex[i], studentID[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].repr());
        }
    }
}
