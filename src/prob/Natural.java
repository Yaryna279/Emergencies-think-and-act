package prob;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Natural {
    public static void openWindow() {
        WebView webView = new WebView();

        // Завантажуємо HTML із ресурсів
        webView.getEngine().load(
            Natural.class.getResource("/html/natural_emergencies.html").toExternalForm()
        );

        Scene scene = new Scene(webView, 900, 700);
        Stage stage = new Stage();
        stage.setTitle("Надзвичайні ситуації природного характеру");
        stage.setScene(scene);
        stage.show();
    }
}