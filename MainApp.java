import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Crear controlador y vista
        GradeController controller = new GradeController();
        GradeView view = new GradeView();
        
        // Obtener las calificaciones para un curso (ID = 123)
        List<GradeModel> grades = controller.fetchGradesForCourse(123);
        
        // Mostrar las calificaciones en la vista
        view.displayGrades(grades);
    }
}
