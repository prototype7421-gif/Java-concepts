class student{
    String name;
    int marks[] = new int[5];

public static double average(int[] marks) {
    int sum = 0;
    for (int i = 0; i < marks.length; i++) {
        sum += marks[i];
    }
    return (double) sum / marks.length;
}
public static String passingcriteria(int[] marks) {
       for (int i = 0; i < marks.length; i++) {
        if (marks[i] < 40) {    
            return "Fail";
        }else {
            return "Pass";  
        }
    }
   return "Pass"; 
 }// Default return if all marks are above 40  
  public static void main(String[] args) {
    student s1 = new student();
    s1.name = "John";
    s1.marks[0] = 85;
    s1.marks[1] = 90;
    s1.marks[2] = 78;
    s1.marks[3] = 92;
    s1.marks[4] = 88;

    double avgMarks = average(s1.marks);
    System.out.println("Average marks for " + s1.name + ": " + avgMarks);
    String result = passingcriteria(s1.marks);
    System.out.println("Result for " + s1.name + ": " + result);
}
}