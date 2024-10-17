public class GradeModel implements Grading {
    private int gradeId;
    private int studentId;
    private String gradeType;
    private double grade;
    private double weight;

    public GradeModel(int gradeId, int studentId, String gradeType, double grade, double weight) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.gradeType = gradeType;
        this.grade = grade;
        this.weight = weight;
    }

    @Override
    public void calculateFinalGrade() {
        // Implementar lógica para calcular la nota final usando el peso
        System.out.println("Final grade calculated using weight.");
    }

    @Override
    public void getGrades() {
        // Mostrar la información de las notas
        System.out.println("Grade ID: " + gradeId + ", Student ID: " + studentId + 
                           ", Grade Type: " + gradeType + ", Grade: " + grade + 
                           ", Weight: " + weight);
    }
}
