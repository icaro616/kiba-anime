package application;
import java.net.URL;
import java.net.URLConnection;

import org.controlsfx.control.Notifications;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	Label ep1 = new Label("Kiba - Episódio 1 - O vento do Destino") ;
	Label ep2 = new Label("Kiba - Episódio 2 - Um novo mundo");
	Label ep3 = new Label("Kiba - Episódio 3 - Aqueles que possuem a força");
	Label ep4 = new Label("Kiba - Episódio 4 - A determinação do vento");
	Label ep5 = new Label("Kiba - Episódio 5 - O País de Canon");
	Label ep6 = new Label("Kiba - Episódio 6 - O Final que foi rápido demais");
	Label ep7 = new Label("Kiba - Episódio 7 - Sentimentos Despertados");
	Label ep8 = new Label("Kiba - Episódio 8 - O local da Traição");
	Label ep9 = new Label("Kiba - Episódio 9 - Após a batalha");
	Label ep10 = new Label("Kiba - Episódio 10 - A princesa solitária");
	Label ep11 = new Label("Kiba - Episódio 11 - Pressentimento de Conspiração");
	Label ep12 = new Label("Kiba - Episódio 12 - Progresso para a verdade");
	Label ep13 = new Label("Kiba - Episódio 13 - O poder da velocidade");
	Label ep14 = new Label("Kiba - Episódio 14 - A tentação do poder");
	Label ep15 = new Label("Kiba - Episódio 15 - Um pequeno tesouro");
	Label ep16 = new Label("Kiba - Episódio 16 - Pessoas trágicas");
	Label ep17 = new Label("Kiba - Episódio 17 - O desejo que não vem");
	Label ep18 = new Label("Kiba - Episódio 18 - A prece hesitante");
	Label ep19 = new Label("Kiba - Episódio 19 - A Terra da Escuridão");
	Label ep20 = new Label("Kiba - Episódio 20 - Reunião");
	Label ep21 = new Label("Kiba - Episódio 21 - Sentimentos Tardios");
	Label ep22 = new Label("Kiba - Episódio 22 - A confusão das lembranças");
	Label ep23 = new Label("Kiba - Episódio 23 - Laços");
	Label ep24 = new Label("Kiba - Episódio 24 - O Shard amarelo da felicidade");
	Label ep25 = new Label("Kiba - Episódio 25 - Introdução a Batalha");
	Label ep26 = new Label("Kiba - Episódio 26 - Lembranças Solitárias");
	Label ep27 = new Label("Kiba - Episódio 27 - Os Guerreiros");
	Label ep28 = new Label("Kiba - Episódio 28 - Prova de Existência");
	Label ep29 = new Label("Kiba - Episódio 29 - Amizade em Discórdia");
	Label ep30 = new Label("Kiba - Episódio 30 - Confronto");
	Label ep31 = new Label("Kiba - Episódio 31 - Reparação da Ambição");
	Label ep32 = new Label("Kiba - Episódio 32 - Expectativas do País");
	Label ep33 = new Label("Kiba - Episódio 33 - A Luz Perdida");
	Label ep34 = new Label("Kiba - Episódio 34 - A Ascensão das Chamas da Guerra");
	Label ep35 = new Label("Kiba - Episódio 35 - Aquele que se Tornará um Sacrifício");
	Label ep36 = new Label("Kiba - Episódio 36 - A asa que desperta");
	Label ep37 = new Label("Kiba - Episódio 37 - A Queda da Capital");
	Label ep38 = new Label("Kiba - Episódio 38 - A Batalha Final");
	Label ep39 = new Label("Kiba - Episódio 39 - Olhos Abertos");
	Label ep40 = new Label("Kiba - Episódio 40 - O poder que é apontado");
	Label ep41 = new Label("Kiba - Episódio 41 - Sentimento de Confiança");
	Label ep42 = new Label("Kiba - Episódio 42 - A pequena salvadora");
	Label ep43 = new Label("Kiba - Episódio 43 - A Verdade Revelada");
	Label ep44 = new Label("Kiba - Episódio 44 - A Maldição Eterna");
	Label ep45 = new Label("Kiba - Episódio 45 - A Dama Confinada");
	Label ep46 = new Label("Kiba - Episódio 46 - Para a Terra da Resolução");
	Label ep47 = new Label("Kiba - Episódio 47 - O Salvador Perdido");
	Label ep48 = new Label("Kiba - Episódio 48 - O Advento");
	Label ep49 = new Label("Kiba - Episódio 49 - Mãe e Filho");
	Label ep50 = new Label("Kiba - Episódio 50 - Feridas Eternas");
	Label ep51 = new Label("Kiba - Episódio 51 - Para Onde o Vento Sopra FINAL");
			
	
	VBox container = new VBox();

	 ScrollPane scrlPane = new ScrollPane(container);
	

	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane angel = new BorderPane();
			Scene scene = new Scene(angel,800,600);
			scene.setFill(null);
			primaryStage.getIcons().add(new Image("https://www.icaro1234.com/shimazu/icon.png"));
			angel.setLeft(scrlPane);
			 
			scrlPane.setMaxWidth(ScrollPane.USE_PREF_SIZE);
			scrlPane.setMaxHeight(ScrollPane.USE_PREF_SIZE);
			scrlPane.setPrefViewportWidth(100);
			scrlPane.setPrefViewportHeight(50);
		      // Enable panning.
		      scrlPane.setPannable(true);
		  	scrlPane.setPrefSize(350, 333);
		      // Create a reset label.
		   
	       
		  	ep1.setOnMouseMoved((MouseEvent e) -> {
		  	    ep1.setStyle("-fx-background-color:#FF4D4D;");
		  	});	  	

ep1.setOnMouseClicked((MouseEvent e) -> {
    ep1.setStyle("-fx-background-color:#00D936;");

   
    getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/01.mp4");	
        
        
	
});
ep1.setOnMouseExited((MouseEvent e) -> {
    ep1.setStyle("-fx-background-color:transparent;");
});

ep2.setOnMouseMoved((MouseEvent e) -> {
	    ep2.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep2.setOnMouseClicked((MouseEvent e) -> {
ep2.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/02.mp4");	



});
ep2.setOnMouseExited((MouseEvent e) -> {
ep2.setStyle("-fx-background-color:transparent;");
});
ep3.setOnMouseMoved((MouseEvent e) -> {
	    ep3.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep3.setOnMouseClicked((MouseEvent e) -> {
ep3.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/03.mp4");	



});
ep3.setOnMouseExited((MouseEvent e) -> {
ep3.setStyle("-fx-background-color:transparent;");
});
ep4.setOnMouseMoved((MouseEvent e) -> {
	    ep4.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep4.setOnMouseClicked((MouseEvent e) -> {
ep4.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/04.mp4");	



});
ep4.setOnMouseExited((MouseEvent e) -> {
ep4.setStyle("-fx-background-color:transparent;");
});
ep5.setOnMouseMoved((MouseEvent e) -> {
	    ep5.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep5.setOnMouseClicked((MouseEvent e) -> {
ep5.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/05.mp4");	



});
ep5.setOnMouseExited((MouseEvent e) -> {
ep5.setStyle("-fx-background-color:transparent;");
});
ep6.setOnMouseMoved((MouseEvent e) -> {
	    ep6.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep6.setOnMouseClicked((MouseEvent e) -> {
ep6.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/06.mp4");	



});
ep6.setOnMouseExited((MouseEvent e) -> {
ep6.setStyle("-fx-background-color:transparent;");
});
ep7.setOnMouseMoved((MouseEvent e) -> {
	    ep7.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep7.setOnMouseClicked((MouseEvent e) -> {
ep7.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/07.mp4");	



});
ep7.setOnMouseExited((MouseEvent e) -> {
ep7.setStyle("-fx-background-color:transparent;");
});
ep8.setOnMouseMoved((MouseEvent e) -> {
	    ep8.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep8.setOnMouseClicked((MouseEvent e) -> {
ep8.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/08.mp4");	



});
ep8.setOnMouseExited((MouseEvent e) -> {
ep8.setStyle("-fx-background-color:transparent;");
});
ep9.setOnMouseMoved((MouseEvent e) -> {
	    ep9.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep9.setOnMouseClicked((MouseEvent e) -> {
ep9.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/09.mp4");	



});
ep9.setOnMouseExited((MouseEvent e) -> {
ep9.setStyle("-fx-background-color:transparent;");
});
ep10.setOnMouseMoved((MouseEvent e) -> {
	    ep10.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep10.setOnMouseClicked((MouseEvent e) -> {
ep10.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/10.mp4");	



});
ep10.setOnMouseExited((MouseEvent e) -> {
ep10.setStyle("-fx-background-color:transparent;");
});
ep11.setOnMouseMoved((MouseEvent e) -> {
	    ep11.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep11.setOnMouseClicked((MouseEvent e) -> {
ep11.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/11.mp4");	



});
ep11.setOnMouseExited((MouseEvent e) -> {
ep11.setStyle("-fx-background-color:transparent;");
});
ep12.setOnMouseMoved((MouseEvent e) -> {
	    ep12.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep12.setOnMouseClicked((MouseEvent e) -> {
ep12.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/12.mp4");	



});
ep12.setOnMouseExited((MouseEvent e) -> {
ep12.setStyle("-fx-background-color:transparent;");
});
ep13.setOnMouseMoved((MouseEvent e) -> {
	    ep13.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep13.setOnMouseClicked((MouseEvent e) -> {
ep13.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/13.mp4");	



});
ep13.setOnMouseExited((MouseEvent e) -> {
ep13.setStyle("-fx-background-color:transparent;");
});
ep14.setOnMouseMoved((MouseEvent e) -> {
	    ep14.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep14.setOnMouseClicked((MouseEvent e) -> {
ep14.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/14.mp4");	



});
ep14.setOnMouseExited((MouseEvent e) -> {
ep14.setStyle("-fx-background-color:transparent;");
});
ep15.setOnMouseMoved((MouseEvent e) -> {
	    ep15.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep15.setOnMouseClicked((MouseEvent e) -> {
ep15.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/15.mp4");	



});
ep15.setOnMouseExited((MouseEvent e) -> {
ep15.setStyle("-fx-background-color:transparent;");
});
ep16.setOnMouseMoved((MouseEvent e) -> {
	    ep16.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep16.setOnMouseClicked((MouseEvent e) -> {
ep16.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/16.mp4");	



});
ep16.setOnMouseExited((MouseEvent e) -> {
ep16.setStyle("-fx-background-color:transparent;");
});
ep17.setOnMouseMoved((MouseEvent e) -> {
	    ep17.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep17.setOnMouseClicked((MouseEvent e) -> {
ep17.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/17.mp4");	



});
ep17.setOnMouseExited((MouseEvent e) -> {
ep17.setStyle("-fx-background-color:transparent;");
});
ep18.setOnMouseMoved((MouseEvent e) -> {
	    ep18.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep18.setOnMouseClicked((MouseEvent e) -> {
ep18.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/18.mp4");	



});
ep18.setOnMouseExited((MouseEvent e) -> {
ep18.setStyle("-fx-background-color:transparent;");
});
ep19.setOnMouseMoved((MouseEvent e) -> {
	    ep19.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep19.setOnMouseClicked((MouseEvent e) -> {
ep19.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/19.mp4");	



});
ep19.setOnMouseExited((MouseEvent e) -> {
ep19.setStyle("-fx-background-color:transparent;");
});
ep20.setOnMouseMoved((MouseEvent e) -> {
	    ep20.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep20.setOnMouseClicked((MouseEvent e) -> {
ep20.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/20.mp4");	



});
ep20.setOnMouseExited((MouseEvent e) -> {
ep20.setStyle("-fx-background-color:transparent;");
});
ep21.setOnMouseMoved((MouseEvent e) -> {
	    ep21.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep21.setOnMouseClicked((MouseEvent e) -> {
ep21.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/21.mp4");	



});
ep21.setOnMouseExited((MouseEvent e) -> {
ep21.setStyle("-fx-background-color:transparent;");
});
ep22.setOnMouseMoved((MouseEvent e) -> {
	    ep22.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep22.setOnMouseClicked((MouseEvent e) -> {
ep22.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/22.mp4");	



});
ep22.setOnMouseExited((MouseEvent e) -> {
ep22.setStyle("-fx-background-color:transparent;");
});
ep23.setOnMouseMoved((MouseEvent e) -> {
	    ep23.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep23.setOnMouseClicked((MouseEvent e) -> {
ep23.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/23.mp4");	



});
ep23.setOnMouseExited((MouseEvent e) -> {
ep23.setStyle("-fx-background-color:transparent;");
});
ep23.setOnMouseMoved((MouseEvent e) -> {
	    ep23.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep23.setOnMouseClicked((MouseEvent e) -> {
ep23.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/23.mp4");	



});
ep23.setOnMouseExited((MouseEvent e) -> {
ep23.setStyle("-fx-background-color:transparent;");
});
ep24.setOnMouseMoved((MouseEvent e) -> {
	    ep24.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep24.setOnMouseClicked((MouseEvent e) -> {
ep24.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/24.mp4");	



});
ep24.setOnMouseExited((MouseEvent e) -> {
ep24.setStyle("-fx-background-color:transparent;");
});
ep25.setOnMouseMoved((MouseEvent e) -> {
	    ep25.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep25.setOnMouseClicked((MouseEvent e) -> {
ep25.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/25.mp4");	



});
ep25.setOnMouseExited((MouseEvent e) -> {
ep25.setStyle("-fx-background-color:transparent;");
});
ep26.setOnMouseMoved((MouseEvent e) -> {
	    ep26.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep26.setOnMouseClicked((MouseEvent e) -> {
ep26.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/26.mp4");	



});
ep26.setOnMouseExited((MouseEvent e) -> {
ep26.setStyle("-fx-background-color:transparent;");
});
ep27.setOnMouseMoved((MouseEvent e) -> {
	    ep27.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep27.setOnMouseClicked((MouseEvent e) -> {
ep27.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/27.mp4");	



});
ep27.setOnMouseExited((MouseEvent e) -> {
ep27.setStyle("-fx-background-color:transparent;");
});
ep28.setOnMouseMoved((MouseEvent e) -> {
	    ep28.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep28.setOnMouseClicked((MouseEvent e) -> {
ep28.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/28.mp4");	



});
ep28.setOnMouseExited((MouseEvent e) -> {
ep28.setStyle("-fx-background-color:transparent;");
});
ep29.setOnMouseMoved((MouseEvent e) -> {
	    ep29.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep29.setOnMouseClicked((MouseEvent e) -> {
ep29.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/29.mp4");	



});
ep29.setOnMouseExited((MouseEvent e) -> {
ep29.setStyle("-fx-background-color:transparent;");
});
ep30.setOnMouseMoved((MouseEvent e) -> {
	    ep30.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep30.setOnMouseClicked((MouseEvent e) -> {
ep30.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/30.mp4");	



});
ep30.setOnMouseExited((MouseEvent e) -> {
ep30.setStyle("-fx-background-color:transparent;");
});
ep31.setOnMouseMoved((MouseEvent e) -> {
	    ep31.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep31.setOnMouseClicked((MouseEvent e) -> {
ep31.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/31.mp4");	



});
ep31.setOnMouseExited((MouseEvent e) -> {
ep31.setStyle("-fx-background-color:transparent;");
});
ep32.setOnMouseMoved((MouseEvent e) -> {
	    ep32.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep32.setOnMouseClicked((MouseEvent e) -> {
ep32.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/32.mp4");	



});
ep32.setOnMouseExited((MouseEvent e) -> {
ep32.setStyle("-fx-background-color:transparent;");
});
ep33.setOnMouseMoved((MouseEvent e) -> {
	    ep33.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep33.setOnMouseClicked((MouseEvent e) -> {
ep33.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/33.mp4");	



});
ep33.setOnMouseExited((MouseEvent e) -> {
ep33.setStyle("-fx-background-color:transparent;");
});

ep34.setOnMouseMoved((MouseEvent e) -> {
	    ep34.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep34.setOnMouseClicked((MouseEvent e) -> {
ep34.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/34.mp4");	



});
ep34.setOnMouseExited((MouseEvent e) -> {
ep34.setStyle("-fx-background-color:transparent;");
});
ep35.setOnMouseMoved((MouseEvent e) -> {
	    ep35.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep35.setOnMouseClicked((MouseEvent e) -> {
ep35.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/35.mp4");	



});
ep35.setOnMouseExited((MouseEvent e) -> {
ep35.setStyle("-fx-background-color:transparent;");
});
ep36.setOnMouseMoved((MouseEvent e) -> {
	    ep36.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep36.setOnMouseClicked((MouseEvent e) -> {
ep36.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/36.mp4");	



});
ep36.setOnMouseExited((MouseEvent e) -> {
ep36.setStyle("-fx-background-color:transparent;");
});
ep37.setOnMouseMoved((MouseEvent e) -> {
	    ep37.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep37.setOnMouseClicked((MouseEvent e) -> {
ep37.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/37.mp4");	



});
ep37.setOnMouseExited((MouseEvent e) -> {
ep37.setStyle("-fx-background-color:transparent;");
});
ep38.setOnMouseMoved((MouseEvent e) -> {
	    ep38.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep38.setOnMouseClicked((MouseEvent e) -> {
ep38.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/38.mp4");	



});
ep38.setOnMouseExited((MouseEvent e) -> {
ep38.setStyle("-fx-background-color:transparent;");
});
ep39.setOnMouseMoved((MouseEvent e) -> {
	    ep39.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep39.setOnMouseClicked((MouseEvent e) -> {
ep39.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/39.mp4");	



});
ep39.setOnMouseExited((MouseEvent e) -> {
ep39.setStyle("-fx-background-color:transparent;");
});
ep40.setOnMouseMoved((MouseEvent e) -> {
	    ep40.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep40.setOnMouseClicked((MouseEvent e) -> {
ep40.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/40.mp4");	



});
ep40.setOnMouseExited((MouseEvent e) -> {
ep40.setStyle("-fx-background-color:transparent;");
});
ep41.setOnMouseMoved((MouseEvent e) -> {
	    ep41.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep41.setOnMouseClicked((MouseEvent e) -> {
ep41.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/41.mp4");	



});
ep41.setOnMouseExited((MouseEvent e) -> {
ep41.setStyle("-fx-background-color:transparent;");
});
ep42.setOnMouseMoved((MouseEvent e) -> {
	    ep42.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep42.setOnMouseClicked((MouseEvent e) -> {
ep42.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/42.mp4");	



});
ep42.setOnMouseExited((MouseEvent e) -> {
ep42.setStyle("-fx-background-color:transparent;");
});
ep43.setOnMouseMoved((MouseEvent e) -> {
	    ep43.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep43.setOnMouseClicked((MouseEvent e) -> {
ep43.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/43.mp4");	



});
ep43.setOnMouseExited((MouseEvent e) -> {
ep43.setStyle("-fx-background-color:transparent;");
});
ep44.setOnMouseMoved((MouseEvent e) -> {
	    ep44.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep44.setOnMouseClicked((MouseEvent e) -> {
ep44.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/44.mp4");	



});
ep44.setOnMouseExited((MouseEvent e) -> {
ep44.setStyle("-fx-background-color:transparent;");
});
ep45.setOnMouseMoved((MouseEvent e) -> {
	    ep45.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep45.setOnMouseClicked((MouseEvent e) -> {
ep45.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/45.mp4");	



});
ep45.setOnMouseExited((MouseEvent e) -> {
ep45.setStyle("-fx-background-color:transparent;");
});
ep46.setOnMouseMoved((MouseEvent e) -> {
	    ep46.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep46.setOnMouseClicked((MouseEvent e) -> {
ep46.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/46.mp4");	



});
ep46.setOnMouseExited((MouseEvent e) -> {
ep46.setStyle("-fx-background-color:transparent;");
});
ep47.setOnMouseMoved((MouseEvent e) -> {
	    ep47.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep47.setOnMouseClicked((MouseEvent e) -> {
ep47.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/47.mp4");	



});
ep47.setOnMouseExited((MouseEvent e) -> {
ep47.setStyle("-fx-background-color:transparent;");
});
ep48.setOnMouseMoved((MouseEvent e) -> {
	    ep48.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep48.setOnMouseClicked((MouseEvent e) -> {
ep48.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/48.mp4");	



});
ep48.setOnMouseExited((MouseEvent e) -> {
ep48.setStyle("-fx-background-color:transparent;");
});
ep49.setOnMouseMoved((MouseEvent e) -> {
	    ep49.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep49.setOnMouseClicked((MouseEvent e) -> {
ep49.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/49.mp4");	



});
ep49.setOnMouseExited((MouseEvent e) -> {
ep49.setStyle("-fx-background-color:transparent;");
});
ep50.setOnMouseMoved((MouseEvent e) -> {
	    ep50.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep50.setOnMouseClicked((MouseEvent e) -> {
ep50.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/50.mp4");	



});
ep50.setOnMouseExited((MouseEvent e) -> {
ep50.setStyle("-fx-background-color:transparent;");
});
ep51.setOnMouseMoved((MouseEvent e) -> {
	    ep51.setStyle("-fx-background-color:#FF4D4D;");
	});	  	

ep51.setOnMouseClicked((MouseEvent e) -> {
ep51.setStyle("-fx-background-color:#00D936;");


getHostServices().showDocument("https://sv2.animesgratisbr.biz/pubfolder/Animes/Kiba/51.mp4");	



});
ep51.setOnMouseExited((MouseEvent e) -> {
ep51.setStyle("-fx-background-color:transparent;");
});
		scrlPane.setFitToHeight(true);
		 scrlPane.setFitToWidth(true);

		      scrlPane.setTranslateX(120);
		      scrlPane.setTranslateY(175);
		      scrlPane.setLayoutX(0);
		      scrlPane.maxWidth(300);
		      scrlPane.maxHeight(0);
  scrlPane.setStyle("-fx-background-color:transparent;  -fx-base:white;");
		      
			angel.setStyle("-fx-background-image: url(https://icaro1234.com/shimazu/bg.png);\r\n"
					+ "-fx-background-repeat: no-repeat; \r\n"
					+ "-fx-background-size: 800 600; \r\n"
					+ "-fx-background-position: center center} \r\n"
					+"-fx-background-color: transparent;");
			
		
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("good'.css").toExternalForm());
			primaryStage.show();
		
			
		      
			ImageView img1 = new ImageView();
			Image image1 = new Image("https://icaro1234.com/shimazu/close.png");
		    img1.setImage(image1);
		    img1.setTranslateX(692);
			img1.setTranslateY(90);
		    img1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
		    ImageView img2 = new ImageView();
		    Image image2 = new Image("https://icaro1234.com/shimazu/min2.png");
		    img2.setImage(image2);
		    img2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
		    	  Stage obj = (Stage) img2.getScene().getWindow();
		    	  obj.setIconified(true);
		    	});
		
		   
		
			img2.setTranslateX(650);
			img2.setTranslateY(94);
			
			   String imgUrl = "https://icaro1234.com/shimazu/cat.gif";
			    URLConnection connection = new URL(imgUrl).openConnection();
			    connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			    Image image = new Image(connection.getInputStream());
			    ImageView imageView = new ImageView();
			    imageView.setImage(image);
			    imageView.setTranslateX(650);
			    imageView.setTranslateY(15);
			    
			    
			    
	       angel.getChildren().addAll(img2,img1, imageView);
	  
	        container.getChildren().addAll(ep1,ep2,ep3,ep4,ep5,ep6,ep7,ep8,ep9,ep10,ep11,ep12,ep13,ep14,ep15,ep16,ep17,ep18,ep19
	        		,ep20,ep21,ep22,ep23,ep24,ep25,ep26,ep27,ep28,ep29,ep30,ep31,ep32,ep33,ep34,ep35,ep36,ep37,ep38,ep39,ep40
	        		,ep41,ep42,ep43,ep44,ep45,ep46,ep47,ep48,ep49,ep50,ep51);
	     
	            }
	            
	             catch(Exception e) {
	            	 Notifications.create()
	 				.position(Pos.TOP_RIGHT)
	 				.title("Kiba visualizador")
	 				.text("Você precisa estar conectado a internet!")
	 				.showError();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
	
}
