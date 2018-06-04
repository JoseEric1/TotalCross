package view;


import control.Controle;
import totalcross.sys.Settings;
import totalcross.ui.MainWindow;
import totalcross.ui.dialog.MessageBox;


public class Apptc2 extends MainWindow{

	static {
		Settings.companyInfo = "Aplicativo";
		Settings.appVersion = "1.00";
		Settings.windowSize = Settings.WINDOWSIZE_480X640;
	}
	
	public Apptc2() {
		setUIStyle(Settings.MATERIAL_UI);
		Settings.uiAdjustmentsBasedOnFontHeight = true;
		Settings.scrollDistanceOnMouseWheelMove = fmH*10;
	}
	
	public void initUI() {
		Controle.CriarConexao();
		if(Controle.CriarTabelas()) {
			
		}else{
			new MessageBox("Deu Erro", "Não criou ou ja existe essas tabelas").popup();
		}
		String e = "";
		new Login().swapToTopmostWindow();
	}
	
}
