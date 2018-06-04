package view;

import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Historico extends Container{
	Container CTBody,CTTop;
	
	Button btRest;
	
	private Container cont, cont2, tex;

	public void initUI() {
		CTBody = new Container() {
			public void initUI() {
				setBackColor(0xffffff);
				CTTop = new Container() {
					public void initUI() {
						setBackColor(0x000000);
						Label h1 = new Label("Historico");
						h1.setForeColor(0xffffff);
						h1.setFont(Font.getFont(h1.getFont().size+10));
						add(h1, CENTER,CENTER,PARENTSIZE+90,PREFERRED); 

					}
				};
				add(CTTop,LEFT, TOP, PARENTSIZE,PREFERRED+200);
				
				tex = new Container() {
					public void initUI(){
						setBackColor(0xffffff);
						try {
							ImageControl ic = new ImageControl(new Image("img/choro.jpg"));
							add(ic, CENTER, TOP, PREFERRED, PREFERRED);
							
							Label ll = new Label("VOCÊ AINDA NÃO USOU SEU CHEF'S CLUB");
							
							add(ll, CENTER, AFTER+100, PREFERRED, PREFERRED);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				};
				
				add(tex, LEFT, AFTER+100, PARENTSIZE, PARENTSIZE+35);
				
				tex = new Container() {
					public void initUI(){
						setBackColor(0xffffff);
						try {
							
							Label ll = new Label("Encotre um restalrante com desconto para ir agora\ncom check-in, fazer uma reservaa ou pedir delivere em\ncasa");
							ll.setFont(Font.getFont(ll.getFont().size-4));
							add(ll, CENTER, AFTER+100, PREFERRED, PREFERRED);
							
							btRest = new Button("BUSCAR RESTALRANTES");
							btRest.setBackForeColors(Color.RED, Color.WHITE);
							add(btRest, CENTER, AFTER, PREFERRED+100, PREFERRED+100);
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				};
				
				add(tex, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);
			}

		};
		add(CTBody, CENTER,CENTER,PARENTSIZE,PARENTSIZE);
	}
}