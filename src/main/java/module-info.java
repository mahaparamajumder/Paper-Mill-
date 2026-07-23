module com.example.final_project_paper_mill {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.final_project_paper_mill to javafx.fxml;
    exports com.example.final_project_paper_mill;
    exports com.example.final_project_paper_mill.Mahapara;
    opens com.example.final_project_paper_mill.Mahapara to javafx.fxml;
}