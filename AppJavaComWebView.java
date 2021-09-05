package appjavacomwebview;

//importando bibliotecas JavaFX

import java.net.URL;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

//Criação da classe principal extendendo Application para criação de interface gráfica do JavaFX 

public class AppJavaComWebView extends Application{
    
    //Declaração de variáveis
    
    public static Scene cenario;
    public static VBox vertical;
    public static WebView webview;
    public static Label label;
    public static Button botaoFechar;
    public static URL url;

    //Declaração do método main(método principal para funcionar o java de uma forma geral)
    
    public static void main(String[] args) {
        launch(args);
    }
    
    //declaração do método start para iniciar a codificação relacionada a interface gráfica do JavaFX
    
    @Override
    public void start(Stage tela){
        
        //Continuação e finalização da declaração de variáveis
        
        vertical = new VBox(5);
        cenario = new Scene(vertical, 1100, 690);
        label = new Label("JavaFX WebView");
        botaoFechar = new Button("Fechar");
        webview = new WebView();
        url = this.getClass().getResource("teste.html");

        //Inserindo eventos nos objetos (evento no botão pra fechar a aplicação e evento no WebView para exibir a página html.
        
        botaoFechar.setOnAction(e -> tela.close());
        webview.getEngine().load(url.toString());

        //Definindo os estilos e propriedades para criação da interface GUI
        
        label.setStyle("-fx-font-weight: bold; -fx-font-size: 18pt");
        vertical.setAlignment(Pos.CENTER);
        vertical.getChildren().addAll(label, webview, botaoFechar);
        
        //Evento para inserir o cenário e iniciar o app
        
        tela.setScene(cenario);
        tela.show();
    }
    
}
