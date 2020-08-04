package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.lang.Math;

public class Main extends Application {

	double num1, num2, result;

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Title of program
        primaryStage.setTitle("Calculator Project");

        // Value 1
        Text textLabel1 = new Text("Value 1: ");
        TextField inputNum1 = new TextField();

        // Value 2
        Text textLabel2 = new Text("Value 2: \n do not include anything in this field for log");
        TextField inputNum2 = new TextField();

        // function selector
        Text textLabel3 = new Text("Select a function: ");
        
        // label field which displays the answer
        Text textLabel4 = new Text("Answer: ");
        Label answer = new Label("                   ");
        
        // label field which displays the input numbers and the results
        answer.setAlignment(Pos.CENTER_RIGHT);

        //Buttons
        Button addBtn = new Button(" + ");
        Button subBtn = new Button(" - ");
        Button multiBtn = new Button(" * ");
        Button divBtn = new Button(" / ");
        Button logBtn = new Button(" Log ");
        Button clrBtn = new Button(" C ");      
   
        // Grid, UI, etc
        GridPane gridPane = new GridPane();
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Row 1: Input of value 1
        gridPane.add(textLabel1, 0, 0);
        gridPane.add(inputNum1, 1, 0);
        
        //Row 2: Input of value 2
        gridPane.add(textLabel2, 0, 1);
        gridPane.add(inputNum2, 1, 1);
      
        //Row 3: Function Selector
        gridPane.add(textLabel3,  2,  0);
        gridPane.add(clrBtn, 3, 0);
        gridPane.add(addBtn, 3, 1);
        gridPane.add(subBtn, 4, 1);
        gridPane.add(multiBtn, 3, 2);
        gridPane.add(divBtn, 4, 2);
        gridPane.add(logBtn, 3, 3);
        
        //Row 5: Display Answer
        gridPane.add(textLabel4, 0, 4);
        gridPane.add(answer, 1, 4);
        
        //Calculator UI setup
        BorderPane bp = new BorderPane();

        bp.setCenter(gridPane);

        primaryStage.setScene(new Scene(bp, 700, 200));

        primaryStage.show();
        
        //Convert input from string to double        
        
        		
        //Button Event
	    clrBtn.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent event) {
	            inputNum1.setText("");
	            inputNum2.setText("");
	            answer.setText("");
	        }
	    });
	    addBtn.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent event) {
	        	num1 = Double.parseDouble(inputNum1.getText());
	            num2 = Double.parseDouble(inputNum2.getText()); 
	        	result = num1 + num2;
	            answer.setText(result + "");
	        }
	    });
	    subBtn.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent event) {
	        	num1 = Double.parseDouble(inputNum1.getText());
	            num2 = Double.parseDouble(inputNum2.getText()); 
	        	result = num1 - num2;
	            answer.setText(result + "");
	        }
	    });
	    divBtn.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent event) {
	        	num1 = Double.parseDouble(inputNum1.getText());
	            num2 = Double.parseDouble(inputNum2.getText()); 
	        	result = num1 / num2;
	            answer.setText(result + "");
	        }
	    });
	    multiBtn.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent event) {
	        	num1 = Double.parseDouble(inputNum1.getText());
	            num2 = Double.parseDouble(inputNum2.getText()); 
	        	result = num1 * num2;
	            answer.setText(result + "");
	        }
	    });
	    logBtn.setOnAction(new EventHandler<ActionEvent>() {
	        public void handle(ActionEvent event) {
	        	num1 = Double.parseDouble(inputNum1.getText());
	            //num2 = Double.parseDouble(inputNum2.getText()); 
	        	result = Math.log(num1);
	            answer.setText(result + "");
	        }
	    });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

