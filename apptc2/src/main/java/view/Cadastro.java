package view;

import control.Controle;
import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Cadastro extends Container{
	String email = "";
	Image volt, i;
	Container CTbody, CTmid,cont2;
	Edit Nome,CPF,Login,Senha;
	ImageControl icon;

	public Cadastro(String est) {
		setBackColor(Color.WHITE);
		email = est;
	}

	public void initUI() {
		CTbody = new Container() {
			public void initUI() {
				setBackColor(0xeeeeee);
				Container cont = new Container() {
					public void initUI() {
						setBackColor(Color.WHITE);
						try {
							volt = new Image("img/volta.png");
							Button voltar = new Button(volt);
							voltar.setBorder(BORDER_NONE);
							add(voltar, LEFT+50, CENTER, PARENTSIZE+10,PARENTSIZE);
							Label l = new Label("Cadastre-se no clube");
							l.setFont(Font.getFont(l.getFont().size+5));
							l.setForeColor(Color.BLACK);

							add(l, AFTER+100, CENTER, PARENTSIZE, PREFERRED);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				};

				add(cont, LEFT, TOP, PARENTSIZE, PREFERRED+150);

				cont = new Container() {
					public void initUI() {
						setBackColor(Color.WHITE);
						try {

							Label l = new Label("Periodo de degustação:");
							l.setForeColor(Color.BLACK);
							add(l, LEFT+30, CENTER, PREFERRED, PREFERRED);

							Label ll = new Label("1 mês gratis");
							ll.setForeColor(Color.BLACK);
							add(ll, RIGHT-30, CENTER, PREFERRED, PREFERRED);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				};

				add(cont, LEFT, AFTER+20, PARENTSIZE, PREFERRED+150);

				CTmid = new Container() {
					public void initUI() {
						setBackColor(0xffffff);
						cont2 = new Container() {
							public void initUI() {

								Image i;
								try {
									
									icon = new ImageControl(new Image("img/CPFofic.png"));
									add(icon, LEFT+100, BOTTOM, PARENTSIZE+10, PREFERRED);
									CPF = new Edit();
									CPF.setBackForeColors(Color.BLACK, Color.BLACK);
									CPF.caption = "CPF";
									add(CPF, AFTER+10, TOP, PARENTSIZE+70, PREFERRED+10);
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								

							}
						};
						add(cont2, LEFT, TOP+100, PARENTSIZE, PREFERRED+100);
						
						cont2 = new Container() {
							public void initUI() {

								Image i;
								try {
									
									icon = new ImageControl(new Image("img/emailofi.png"));
									add(icon, LEFT+100, BOTTOM, PARENTSIZE+10, PREFERRED);
									Login = new Edit();
									Login.setBackForeColors(Color.BLACK, Color.BLACK);
									Login.caption = "E-mail";
									add(Login, AFTER+10, TOP, PARENTSIZE+70, PREFERRED+10);
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								

							}
						};
						add(cont2, LEFT, AFTER+100, PARENTSIZE, PREFERRED+100);
						
						cont2 = new Container() {
							public void initUI() {

								Image i;
								try {
									
									icon = new ImageControl(new Image("img/perfofi.png"));
									add(icon, LEFT+100, BOTTOM, PARENTSIZE+10, PREFERRED);
									Nome = new Edit();
									Nome.setBackForeColors(Color.BLACK, Color.BLACK);
									Nome.caption = "Nome";
									add(Nome, AFTER+10, TOP, PARENTSIZE+70, PREFERRED+10);
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								

							}
						};
						add(cont2, LEFT, AFTER+100, PARENTSIZE, PREFERRED+100);
						
						cont2 = new Container() {
							public void initUI() {

								Image i;
								try {
									
									icon = new ImageControl(new Image("img/chaveofi.png"));
									add(icon, LEFT+100, BOTTOM, PARENTSIZE+10, PREFERRED);
									Senha = new Edit();
									Senha.setBackForeColors(Color.BLACK, Color.BLACK);
									Senha.caption = "Senha";
									Senha.setMode(Edit.PASSWORD_ALL);
									add(Senha, AFTER+10, TOP, PARENTSIZE+70, PREFERRED+10);
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								

							}
						};
						add(cont2, LEFT, AFTER+100, PARENTSIZE, PREFERRED+100);

//						CPF = new Edit();
//						CPF.setBackForeColors(Color.BLACK, Color.BLACK);
//						CPF.caption = "CPF";
//						add(CPF, CENTER, AFTER+100, PARENTSIZE+70, PREFERRED+10);
//
//						Login = new Edit();
//						Login.setBackForeColors(Color.BLACK, Color.BLACK);
//						Login.caption = "Login";
//						Login.setText(email);
//						add(Login, SAME, AFTER+100, SAME, SAME);
//
//						Senha = new Edit();
//						Senha.setBackForeColors(Color.BLACK, Color.BLACK);
//						Senha.caption = "Senha";
//						Senha.setMode(Edit.PASSWORD_ALL);
//						add(Senha, SAME, AFTER+100, SAME, SAME);

						Button cadas = new Button("Cadastrar-se");
						cadas.setBackForeColors(Color.RED, Color.WHITE);
						add(cadas, CENTER, AFTER+250, PARENTSIZE+70, PREFERRED+80);

						cadas.addPressListener((e) -> {
							String n = Nome.getText();
							String c = CPF.getText();
							String lo = Login.getText();
							String se = Senha.getText();

							boolean t = Controle.AddUsuario(n, c, lo, se);

							if(t) {
								new MessageBox("Cadastrado com sucesso", "Cadastrado com sucesso").popup();
							}
						});

					}
				};
				add(CTmid, CENTER,AFTER+20,PARENTSIZE,PARENTSIZE+80);
			}
		};

		add(CTbody, CENTER, CENTER, PARENTSIZE, PARENTSIZE);
	}
}
