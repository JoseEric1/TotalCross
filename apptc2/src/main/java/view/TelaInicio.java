package view;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;

public class TelaInicio extends Container {
	Container CTBody, tex,ctTop;

	private Container cont;
	private Container cont2,but;
	private ImageControl imgIcon;
	private Label lbValue;
	private Label lbText;
	
	public void initUI(){
		CTBody = new Container() {
			public void initUI() {
				ctTop = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);
						Label h1 = new Label("Chef's Club");
						
						add(h1, CENTER,CENTER,PARENTSIZE+90,PREFERRED); 
						
					}
				};

				add(ctTop,LEFT, TOP, PARENTSIZE,PREFERRED+200);
				
				ScrollContainer sc = new ScrollContainer() {
					public void initUI() {
						setBackColor(0xeeeeee);
						but = new Container() {
							public void initUI() {
						
								try {
									Image i = new Image("img/now.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									i.applyColor2(0x000000);
									Button b1 = new Button("Agora",i,BOTTOM,8);
									b1.setBackColor(0xfffffe);
									
									b1.setBorder(BORDER_NONE);
									add(b1,LEFT-20, TOP, PARENTSIZE+25, PARENTSIZE);
									
									i = new Image("img/food2.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									i.applyColor2(0x000000);
									Button b2 = new Button("Almoço",i,BOTTOM,8);
									b2.setBackColor(0xfffffe);
									
									b2.setBorder(BORDER_NONE);
									add(b2,AFTER+10, TOP, PARENTSIZE+25, PARENTSIZE);
									
									i = new Image("img/food3.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									i.applyColor2(0x000000);
									Button b3 = new Button("Jantar",i,BOTTOM,8);
									b3.setBackColor(0xfffffe);
									
									b3.setBorder(BORDER_NONE);
									add(b3,AFTER+10, TOP, PARENTSIZE+25, PARENTSIZE);
									
									i = new Image("img/calendar-2561.png").getSmoothScaledInstance(but.getWidth()*9/100, but.getHeight()*40/100);
									i.applyColor2(0x000000);
									Button b4 = new Button("Reserva",i,BOTTOM,8);
									b4.setBackColor(0xfffffe);
									
									b4.setBorder(BORDER_NONE);
									add(b4,AFTER+10, TOP, PARENTSIZE+25, PARENTSIZE);
									
								}catch(Exception e) {
									e.printStackTrace();
								}
						
								
								Button b4 = new Button("b4");
								b4.setBorder(BORDER_NONE);
								b4.setBackColor(0xfffffe);
								add(b4,AFTER+10, TOP,PARENTSIZE+25, PARENTSIZE);
							}
						};
						add(but,LEFT,TOP,ctTop.getWidth(),PREFERRED+250);
						
						cont = new Container() {
							public void initUI() {
								setBackColor(Color.WHITE);
								Label ll = new Label("RESTAURANTES RECOMENDADOS");
								add(ll, CENTER, CENTER, PARENTSIZE+90, PREFERRED);
							
							}
						};
						add(cont, LEFT, AFTER+10, ctTop.getWidth(),PREFERRED+130);
						
						tex = new Container() {
							public void initUI() {
								setBackColor(0xFFFFFF);
								tex = new Container() {
								
									public void initUI() {		
										tex = new Container() {
											public void initUI() {
				
												try {
													
													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/imgFood2ed.png").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};
													
													add(cont, LEFT, TOP, PARENTSIZE, PARENTSIZE+50);
													
													cont2 = new Container() {
														public void initUI() {
															
															cont.borderColor = 0xffffff;
																	
															lbValue = new Label("Vó Jandira");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Lanchonete");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);
															
															Button o = new Button("-30%");
															
															o.setBackForeColors( Color.RED,0xffffff);
															
															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);
						

														}
													};
													
													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);
															
												} catch (Exception e) {
													e.printStackTrace();
												} 
				
											}
										};
				
										add(tex, LEFT,AFTER,PARENTSIZE+95/2,PARENTSIZE);
				
										tex = new Container() {
											public void initUI() {
				
												try {
													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/imgFood1ed.jpg").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};
													
													add(cont, AFTER, TOP, PARENTSIZE, PARENTSIZE+50);
													
													cont2 = new Container() {
														public void initUI() {
															
															cont.borderColor = 0xffffff;
																	
															lbValue = new Label("Siri Caascudo");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Lanchonete");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);
															
															Button o = new Button("-30%");
															
															o.setBackForeColors( Color.RED,0xffffff);
															
															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);
						

														}
													};
													
													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);
				
												} catch (Exception e) {
													e.printStackTrace();
												} 
											}
										};
				
										add(tex, RIGHT,SAME,PARENTSIZE+95/2,PARENTSIZE);
										
									}
								};
								add(tex,CENTER,CENTER,PARENTSIZE + 90,PARENTSIZE+90);
							}
						};
						add(tex,LEFT,AFTER+10,ctTop.getWidth(),PREFERRED+1100);
						
						//anuncios de baixo
						
						tex = new Container() {
							public void initUI() {
								setBackColor(0xFFFFFF);
								tex = new Container() {
								
									public void initUI() {		
										tex = new Container() {
											public void initUI() {
				
												try {
													
													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/pic.jpg").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};
													
													add(cont, LEFT, TOP, PARENTSIZE, PARENTSIZE+50);
													
													cont2 = new Container() {
														public void initUI() {
															
															cont.borderColor = 0xffffff;
																	
															lbValue = new Label("Sabor da Carne");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Churrascaria");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);
															
															Button o = new Button("-30%");
															
															o.setBackForeColors( Color.RED,0xffffff);
															
															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);
						

														}
													};
													
													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);
															
												} catch (Exception e) {
													e.printStackTrace();
												} 
				
											}
										};
				
										add(tex, LEFT,AFTER,PARENTSIZE+95/2,PARENTSIZE);
				
										tex = new Container() {
											public void initUI() {
				
												try {
													cont = new Container() {
														public void initUI() {
															try {
																imgIcon = new ImageControl(new Image("img/Batata-Frita.jpg").getSmoothScaledInstance(cont.getWidth(), cont.getHeight()));
																add(imgIcon, CENTER, TOP, PREFERRED, PREFERRED);
															}catch(Exception e) {
																e.printStackTrace();
															}
														}
													};
													
													add(cont, AFTER, TOP, PARENTSIZE, PARENTSIZE+50);
													
													cont2 = new Container() {
														public void initUI() {
															
															cont.borderColor = 0xffffff;
																	
															lbValue = new Label("Pegue Petiscos");
															Font f = Font.getFont(true,Font.NORMAL_SIZE+2);
															lbValue.setFont(f);
															lbValue.setForeColor(0x363636);
															lbText = new Label("Petiscaria");
															lbText.setForeColor(0x215968);
															add(lbValue, CENTER, AFTER, PREFERRED, PREFERRED);
															add(lbText, CENTER, AFTER, PREFERRED, PREFERRED);
															
															Button o = new Button("-30%");
															
															o.setBackForeColors( Color.RED,0xffffff);
															
															add(o,LEFT, BOTTOM, PREFERRED + 50, PREFERRED+20);
						

														}
													};
													
													add(cont2, LEFT, AFTER, PARENTSIZE, PARENTSIZE+50);
				
												} catch (Exception e) {
													e.printStackTrace();
												} 
											}
										};
				
										add(tex, RIGHT,SAME,PARENTSIZE+95/2,PARENTSIZE);
										
									}
								};
								add(tex,CENTER,CENTER,PARENTSIZE + 90,PARENTSIZE+90);
							}
						};
						add(tex,LEFT,AFTER+10,ctTop.getWidth(),PREFERRED+1100);
					}
				};

				add(sc,LEFT,AFTER,PARENTSIZE,CTBody.getHeight() - ctTop.getHeight());
				
				

			}

		};

		add(CTBody,LEFT,TOP,PARENTSIZE,PARENTSIZE);
	}
}
