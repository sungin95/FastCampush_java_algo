module com.example.fastcampus_java_algo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fastcampus_java_algo to javafx.fxml;
    exports com.example.fastcampus_java_algo;
}