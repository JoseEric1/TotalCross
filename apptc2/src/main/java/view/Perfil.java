package view;

import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Perfil extends Container {
	Container CTBody,CTTop;
	ImageControl perfil;
	Button btRest, DadosP, Favor, CodProm, MesaAss, Sair;

	private Container cont, cont2, tex;

	public void initUI() {
		CTBody = new Container() {
			public void initUI() {
				setBackColor(0xeeeeee);

				ScrollContainer sc = new ScrollContainer() {
					public void initUI() {
						setBackColor(0xeeeeee);
						CTTop = new Container() {
							public void initUI() {

								cont = new Container() {
									public void initUI() {

										try {
											perfil = new ImageControl(new Image("img/perfil.png"));

											add(perfil, CENTER,CENTER, PARENTSIZE, PARENTSIZE);
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								};
								cont.setBorderStyle(BORDER_ROUNDED);
								add(cont, CENTER, TOP+50, PARENTSIZE+27, PARENTSIZE+35);
								setBackColor(0xffffff);

								Label h1 = new Label("NOME");
								h1.setForeColor(0x000000);
								h1.setFont(Font.getFont(h1.getFont().size-1));
								add(h1, CENTER,AFTER+50,PREFERRED,PREFERRED); 

								Label email = new Label("E-mail");
								email.setForeColor(0x000000);
								email.setFont(Font.getFont(h1.getFont().size-1));
								add(email, CENTER,AFTER,PREFERRED,PREFERRED); 

								Label dias = new Label("Faltam 21 dias");
								dias.setForeColor(Color.GREEN);
								dias.setFont(Font.getFont(h1.getFont().size));
								add(dias, CENTER,AFTER,PREFERRED,PREFERRED); 

								Label expirar = new Label("Faltam 21 dias");
								expirar.setForeColor(0xdddddd);
								expirar.setFont(Font.getFont(h1.getFont().size));
								add(expirar, CENTER,AFTER,PREFERRED,PREFERRED); 

								cont2 = new Container() {
									public void initUI() {
										Button det = new Button("VER DETALHES");
										det.setBackForeColors(Color.WHITE, Color.BLUE);
										det.setBorder(BORDER_NONE);
										add(det, LEFT, CENTER, PREFERRED+80 ,PREFERRED+80);

										Button RENOV = new Button("VER DETALHES");
										RENOV.setBackForeColors(Color.RED, Color.WHITE);
										RENOV.setBorder(BORDER_NONE);
										add(RENOV, RIGHT, SAME, PREFERRED+80,PREFERRED+80);
									}
								};
								add(cont2, CENTER, AFTER+50, PARENTSIZE+80, PREFERRED+50);
								
							}
						};
						add(CTTop,LEFT, TOP, PARENTSIZE,PARENTSIZE+55);

						tex = new Container() {
							public void initUI(){
								setBackColor(0xffffff);
								try {
									Label ll = new Label("Conta");
									add(ll, LEFT, AFTER+30, PREFERRED, PREFERRED);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/iconePers.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Dados pessoais");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+50, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/iconeCora.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Favoritos");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/food2.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Insira o codigo promocional");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/food2.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Ganhe meses de assinatura");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/iconeSair.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Sair");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							}
						};

						add(tex, LEFT, AFTER+30, PARENTSIZE, PARENTSIZE+60);

						tex = new Container() {
							public void initUI(){
								setBackColor(0xffffff);
								try {
									Label ll = new Label("Duvidas e sugestoes");
									add(ll, LEFT, AFTER+30, PREFERRED, PREFERRED);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/inserirRest.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Sugira um restalrane");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+50, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/iconeConf.jpg"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Como funciona");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/perguntas.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Perguntas Frequentes");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/enviar.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Envie sua duvida ou feedback");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
									cont = new Container() {
										public void initUI() {
											
											ImageControl ic;
											try {
												
												ic = new ImageControl(new Image("img/faleConos.png"));
												add(ic, LEFT, TOP, PARENTSIZE+10, PREFERRED);
												DadosP = new Button("Fale com nosso concierge");
												DadosP.setBorder(BORDER_NONE);
												add(DadosP, AFTER, SAME, PARENTSIZE+85, PARENTSIZE);
												
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									};
									add(cont, LEFT, AFTER+3, PARENTSIZE, PARENTSIZE+17);
									
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							}
						};

						add(tex, LEFT, AFTER+50, PARENTSIZE, PARENTSIZE+50);

					}
				};
				add(sc,LEFT,AFTER,PARENTSIZE,CTBody.getHeight());
			}
		};
		add(CTBody, CENTER,CENTER,PARENTSIZE,PARENTSIZE);
	}

}

