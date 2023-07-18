module Fianko.userlogin {

    requires  javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires fontawesomefx;

//    opens Fianko768.finalproject to javafx.fxml;
    opens Fianko768.finalproject;
//    exports Fianko768.finalproject;
}s