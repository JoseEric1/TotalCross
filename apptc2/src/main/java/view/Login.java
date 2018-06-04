package view;

import control.Controle;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;

public class Login extends Container {
private ImageControl ci;
private Image lgfb,lggo;
private Container cont;
	
	public void initUI() {
	setBackColor(Color.WHITE);
	
	try {
		lgfb = new Image("img/fb_icon.png");
		lggo = new Image("img/logoGo.jpg");
		ci = new ImageControl(new Image("img/logoCF.png"));
		ci.scaleToFit = true;
		ci.centerImage = true;
		add(ci, LEFT, TOP-60, FILL, PARENTSIZE+20);

	}catch(Exception e) {
		new MessageBox("Deu erro", "A imagem fudeu").popup();
	}
	
		Label text = new Label("Para iniciar, faça login ou\ncadastre-se abaixo");
		add(text,CENTER,AFTER,PREFERRED, PREFERRED);

	
	Button EntraF = new Button("ENTRAR COM O FACEBOOK", lgfb, RIGHT, 200);
	EntraF.setBackForeColors(0x3b5998, Color.WHITE);
	add(EntraF, CENTER, AFTER+50, PARENTSIZE+90, PREFERRED+30);
	
	Button EntraG = new Button("ENTRAR COM O GOOGLE", lggo, RIGHT, 200);
	add(EntraG, CENTER, AFTER+30, PARENTSIZE+90, PREFERRED+30);
	
	Label ou = new Label("-------------ou--------------");
	ou.setForeColor(0xbbbbbb);
	add(ou, CENTER, AFTER+100, PREFERRED, PREFERRED);
	
	Edit lg = new Edit();
	lg.caption = "E-mail";
	lg.setBackForeColors(0x627870, Color.BLACK);
	add(lg, CENTER, AFTER+80, PARENTSIZE+90, PREFERRED+10);

	
	Button bt = new Button("Continuar");
	bt.setBackForeColors(Color.RED, Color.WHITE);
	add(bt, CENTER, AFTER+200, PARENTSIZE+90, PREFERRED+80);
	
	bt.addPressListener((e) -> {
		try {
		
		String login = lg.getText();
		String[] usuario = Controle.Logando(login);
		
		if(usuario != null) {
			new Home().swapToTopmostWindow();
		}else {
			new Cadastro(lg.getText()).swapToTopmostWindow();
		}
		}catch(Exception f) {
			f.printStackTrace();
		}
	});

	
	}
}
