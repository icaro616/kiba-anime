module zed {
requires javafx.controls;
	
	requires java.desktop;
	requires javafx.graphics;
requires java.base;
requires javafx.swing;
requires org.controlsfx.controls;
opens application to javafx.graphics;

	
}
