import java.util.List;

public class GradeView {
    public void displayGrades(List<GradeModel> grades) {
        for (GradeModel grade : grades) {
            grade.getGrades(); // Llamamos al método para mostrar la información
        }
    }
}
