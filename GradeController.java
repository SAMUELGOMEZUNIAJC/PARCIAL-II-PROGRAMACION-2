import java.util.ArrayList;
import java.util.List;

public class GradeController {
    public List<GradeModel> fetchGradesForCourse(int courseId) {
        // Simulación de ejecución de la query SQL que mencionaste
        List<GradeModel> grades = new ArrayList<>();
        
        // Datos de ejemplo que podrían provenir de una consulta SQL
        grades.add(new GradeModel(1, 101, "Exam", 85.5, 0.4));
        grades.add(new GradeModel(2, 101, "Homework", 92.0, 0.1));
        grades.add(new GradeModel(3, 102, "Exam", 78.0, 0.4));
        grades.add(new GradeModel(4, 102, "Homework", 88.0, 0.1));
        
        return grades;
    }
}
