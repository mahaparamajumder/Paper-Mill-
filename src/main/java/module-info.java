module com.example.final_project_paper_mill {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final_project_paper_mill to javafx.fxml;
    exports com.example.final_project_paper_mill;
}