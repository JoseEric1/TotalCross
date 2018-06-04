package view;

import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Buscar extends Container {
	Container CTBody, tex,ctTop;
	private Button btpesq, filtro;
	private Container cont;
	private Container cont2,but;
	private ImageControl imgIcon;
	private Edit proc;
	private Label lbValue;
	private Label lbText;


	public void initUI() {
		CTBody = new Container() {
			public void initUI() {

				setBackColor(0xeeeeee);

				tex = new Container() {
					public void initUI() {
						setBackColor(0xffffff);
						cont = new Container() {

							public void initUI() {
								setBackColor(0xeeeeee);
								try {
									Image i = new Image("img/lupa2.0.png");

									btpesq = new Button(i);
									btpesq.setBorder(BORDER_NONE);
									proc = new Edit("Pesquisar Ex:Petiscos");
									proc.setBackForeColors(0xbbbbbb, 0xbbbbbb);
									add(btpesq, LEFT, CENTER, PARENTSIZE+20, PREFERRED);
									add(proc, RIGHT-10, CENTER, PARENTSIZE+80, PREFERRED);
								}catch(Exception e) {

								}
							}
						};
						add(cont, CENTER, TOP+50, PARENTSIZE+90, PREFERRED+100);

						cont = new Container() {
							public void initUI() {
								setBackColor(0xffffff);
								try {
									ImageControl i = new ImageControl(new Image("img/iconelado.jpg"));

									Label l = new Label("Disponivel hoje as 12:00h");

									filtro = new Button("FILTRO");
									filtro.setBackForeColors(Color.WHITE, Color.BLUE);
									filtro.setBorder(BORDER_NONE);
									add(i, LEFT, AFTER, PARENTSIZE+10, PREFERRED);
									add(l, AFTER, SAME, PARENTSIZE+70, PREFERRED);
									add(filtro, AFTER, SAME, PARENTSIZE+20, PREFERRED);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						};

						add(cont, CENTER, AFTER+150, PARENTSIZE+95, PREFERRED+100);
					}
				};
				add(tex, CENTER, TOP, PARENTSIZE, PARENTSIZE+25);

				//RESTO

				tex = new Container() {
					public void initUI() {
						setBackColor(0xffffff);
						tex = new Container() {
							public void initUI() {

								Label ResEnc = new Label("RESTALRANTES ENCONTRADOS:");
								add(ResEnc, CENTER,CENTER,PARENTSIZE,PREFERRED);
							}
						};

						add(tex, LEFT,AFTER,PARENTSIZE,PARENTSIZE);

					}
				};
				add(tex, CENTER, AFTER+30, PARENTSIZE, PARENTSIZE+5);	

				tex = new Container() {
					public void initUI() {
						setBackColor(0xffffff);
						tex = new Container() {
							public void initUI() {

								try {

									cont = new Container() {
										public void initUI() {
											but = new Container() {
												public void initUI() {
													try {
														imgIcon = new ImageControl(new Image("img/imgFood2ed.png").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));

														add(imgIcon, CENTER, CENTER, PARENTSIZE, PARENTSIZE);
													}catch(Exception e) {
														e.printStackTrace();
													}
												}
											};
											but.setBorderStyle(BORDER_ROUNDED);

											add(but, CENTER, CENTER, PARENTSIZE+80, PARENTSIZE+80);
										}
									};

									add(cont, LEFT, TOP, PARENTSIZE+50, PARENTSIZE);

									cont2 = new Container() {
										public void initUI() {

											cont.borderColor = 0xffffff;

											lbValue = new Label("Vó Jandira");
											Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
											lbValue.setFont(f);
											lbValue.setForeColor(0x363636);
											lbText = new Label("Lanchonete");
											lbText.setForeColor(0x215968);
											add(lbValue, CENTER, TOP, PREFERRED, PREFERRED);
											add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);

											Button o = new Button("-30%");

											o.setBackForeColors( Color.RED,0xffffff);

											add(o,CENTER, AFTER+50, PREFERRED+50, PREFERRED+20);


										}
									};

									add(cont2, AFTER, TOP, PARENTSIZE+50, PARENTSIZE);

								} catch (Exception e) {
									e.printStackTrace();
								} 

							}
						};

						add(tex, LEFT,AFTER,PARENTSIZE,PARENTSIZE);

					}
				};
				add(tex, CENTER, AFTER+30, PARENTSIZE, PARENTSIZE+25);

				tex = new Container() {
					public void initUI() {
						setBackColor(0xffffff);
						tex = new Container() {
							public void initUI() {

								try {

									cont = new Container() {
										public void initUI() {
											but = new Container() {
												public void initUI() {

													try {
														imgIcon = new ImageControl(new Image("img/Batata-Frita.jpg").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
														add(imgIcon, LEFT, TOP, PREFERRED, PREFERRED);
													}catch(Exception e) {
														e.printStackTrace();
													}
												}
											};
											but.setBorderStyle(BORDER_ROUNDED);

											add(but, CENTER, CENTER, PARENTSIZE+80, PARENTSIZE+80);
										}
									};

									add(cont, LEFT, TOP, PARENTSIZE+50, PARENTSIZE);

									cont2 = new Container() {
										public void initUI() {

											cont.borderColor = 0xffffff;

											lbValue = new Label("Pegue Petiscos");
											Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
											lbValue.setFont(f);
											lbValue.setForeColor(0x363636);
											lbText = new Label("Petiscaria");
											lbText.setForeColor(0x215968);
											add(lbValue, CENTER, TOP, PREFERRED, PREFERRED);
											add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);

											Button o = new Button("-30%");

											o.setBackForeColors( Color.RED,0xffffff);

											add(o,CENTER, AFTER+50, PREFERRED+50, PREFERRED+20);


										}
									};

									add(cont2, AFTER, TOP, PARENTSIZE+50, PARENTSIZE);

								} catch (Exception e) {
									e.printStackTrace();
								} 

							}
						};

						add(tex, LEFT,AFTER,PARENTSIZE,PARENTSIZE);

					}
				};
				add(tex, CENTER, AFTER+30, PARENTSIZE, PARENTSIZE+25);	
			}


		};
		add(CTBody, CENTER, CENTER, PARENTSIZE, PARENTSIZE);
	}
}
