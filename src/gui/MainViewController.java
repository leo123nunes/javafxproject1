package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("OnMenuItemSeller");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.println("OnMenuItemDepartmentr");
	}
	
	@FXML
	public void onMenuItemAboutrAction() {
		System.out.println("OnMenuItemAbout");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	}
}
