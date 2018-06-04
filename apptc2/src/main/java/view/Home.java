package view;

import totalcross.io.IOException;
import totalcross.res.Resources;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.TabbedContainer;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Home extends Container{
	Container ctP,ctBottom,ctTop,ctCenter;
	Button ini,pesq,hist,perf;
	TabbedContainer tb;
	Image perfi, histo, inic, busc;
	
	

	public void initUI() {
		
		try {
			inic = new Image("img/restB.jpg");
			histo = new Image("img/historico.png");
			perfi = new Image("img/perfB.png");
			busc = new Image("img/pesquisa.png");
		}catch(Exception f){
			
		}
		
		ctP = new Container() {
			public void initUI() {
				

				ctBottom = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);
						ini  = new Button("Inicio", inic, BOTTOM, 0);
						ini.setBorder(BORDER_NONE);
						add(ini,LEFT,TOP,PARENTSIZE+55,PARENTSIZE);

						pesq  = new Button(busc);
						pesq.setBorder(BORDER_NONE);
						add(pesq,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

						hist  = new Button(histo);
						hist.setBorder(BORDER_NONE);
						add(hist,AFTER,TOP,SAME,PARENTSIZE);

						perf  = new Button(perfi);
						perf.setBorder(BORDER_NONE);
						add(perf,AFTER,TOP,SAME,PARENTSIZE);
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);

				ctCenter = new Container() {
					public void initUI() {
						String[] tits = {"","","",""};
						tb = new TabbedContainer(tits);
						add(tb,LEFT,TOP - 160,PARENTSIZE,ctCenter.getHeight()+30);
						tb.setContainer(0, new TelaInicio());
						tb.setContainer(1, new Buscar());
						tb.setContainer(2, new Historico());
						tb.setContainer(3, new Perfil());
						tb.setActiveTab(0);

					}
				};

				add(ctCenter,LEFT, TOP, PARENTSIZE,ctP.getHeight()-ctBottom.getHeight());
			}
		};

		add(ctP,LEFT, TOP, PARENTSIZE,PARENTSIZE);
	}

	public void onEvent(Event e) {

		switch(e.type) {
		case ControlEvent.PRESSED:
			if(e.target == ini) {
				ctBottom.removeAll();
				
				ctBottom = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);
						ini  = new Button("Inicio", inic, BOTTOM, 0);
						ini.setBorder(BORDER_NONE);
						add(ini,LEFT,TOP,PARENTSIZE+55,PARENTSIZE);

						pesq  = new Button(busc);
						pesq.setBorder(BORDER_NONE);
						add(pesq,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

						hist  = new Button(histo);
						hist.setBorder(BORDER_NONE);
						add(hist,AFTER,TOP,SAME,PARENTSIZE);

						perf  = new Button(perfi);
						perf.setBorder(BORDER_NONE);
						add(perf,AFTER,TOP,SAME,PARENTSIZE);
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);

				tb.setActiveTab(0);
			}
			if(e.target == pesq) {
				ctBottom.removeAll();
				
				
				ctBottom = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);
						ini  = new Button(inic);
						ini.setBorder(BORDER_NONE);
						add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

						pesq  = new Button("Buscar", busc, BOTTOM, 0);
						pesq.setBorder(BORDER_NONE);
						add(pesq,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

						hist  = new Button(histo);
						hist.setBorder(BORDER_NONE);
						add(hist,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

						perf  = new Button(perfi);
						perf.setBorder(BORDER_NONE);
						add(perf,AFTER,TOP,SAME,PARENTSIZE);
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
				
				tb.setActiveTab(1);
			}
			if(e.target == hist) {
				ctBottom.removeAll();

				ctBottom = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);
						ini  = new Button(inic);
						ini.setBorder(BORDER_NONE);
						add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

						pesq  = new Button(busc);
						pesq.setBorder(BORDER_NONE);
						add(pesq,AFTER,TOP,SAME,PARENTSIZE);

						hist  = new Button("Historico", histo, BOTTOM, 0);
						hist.setBorder(BORDER_NONE);
						add(hist,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

						perf  = new Button(perfi);
						perf.setBorder(BORDER_NONE);
						add(perf,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);

				tb.setActiveTab(2);
			}
			if(e.target == perf) {
				ctBottom.removeAll();

				ctBottom = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);
						ini  = new Button(inic);
						ini.setBorder(BORDER_NONE);
						add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

						pesq  = new Button(busc);
						pesq.setBorder(BORDER_NONE);
						add(pesq,AFTER,TOP,SAME,PARENTSIZE);

						hist  = new Button(histo);
						hist.setBorder(BORDER_NONE);
						add(hist,AFTER,TOP,SAME,PARENTSIZE);

						perf  = new Button("Perfi", perfi, BOTTOM, 0);
						perf.setBorder(BORDER_NONE);
						add(perf,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);
					}
				};

				add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
				tb.setActiveTab(3);
			}

			if(tb == e.target && tb.focusTraversable) {
				switch(tb.getActiveTab()) {
				case 0 :
					ctBottom.removeAll();

					ctBottom = new Container() {
						public void initUI() {
							setBackColor(0xFFFFFF);
							ini  = new Button("Inicio", inic, BOTTOM, 0);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+55,PARENTSIZE);

							pesq  = new Button(busc);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

							hist  = new Button(histo);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,SAME,PARENTSIZE);

							perf  = new Button(perfi);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,SAME,PARENTSIZE);
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				case 1:
					ctBottom.removeAll();

					ctBottom = new Container() {
						public void initUI() {
							setBackColor(0xFFFFFF);
							ini  = new Button(inic);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

							pesq  = new Button("Buscar", busc, BOTTOM, 0);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

							hist  = new Button(histo);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);

							perf  = new Button(perfi);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,SAME,PARENTSIZE);
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				case 2:
					ctBottom.removeAll();

					ctBottom = new Container() {
						public void initUI() {
							setBackColor(0xFFFFFF);
							ini  = new Button(inic);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

							pesq  = new Button(busc);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,SAME,PARENTSIZE);

							hist  = new Button("Historico", histo, BOTTOM, 0);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);

							perf  = new Button(perfi);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,PARENTSIZE+15,PARENTSIZE);
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				case 3:
					ctBottom.removeAll();

					ctBottom = new Container() {
						public void initUI() {
							setBackColor(0xFFFFFF);
							ini  = new Button(inic);
							ini.setBorder(BORDER_NONE);
							add(ini,LEFT,TOP,PARENTSIZE+15,PARENTSIZE);

							pesq  = new Button(busc);
							pesq.setBorder(BORDER_NONE);
							add(pesq,AFTER,TOP,SAME,PARENTSIZE);

							hist  = new Button(histo);
							hist.setBorder(BORDER_NONE);
							add(hist,AFTER,TOP,SAME,PARENTSIZE);

							perf  = new Button("Perfil", perfi, BOTTOM, 0);
							perf.setBorder(BORDER_NONE);
							add(perf,AFTER,TOP,PARENTSIZE+55,PARENTSIZE);
						}
					};

					add(ctBottom,LEFT, BOTTOM, PARENTSIZE,PREFERRED+200);
					break;
				}
			}
			break;

		}
	}
}
