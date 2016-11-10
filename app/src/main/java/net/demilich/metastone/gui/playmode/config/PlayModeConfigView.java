package net.demilich.metastone.gui.playmode.config;

import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import net.demilich.metastone.GameNotification;
import net.demilich.metastone.NotificationProxy;
import net.demilich.metastone.game.decks.Deck;
import net.demilich.metastone.game.decks.DeckFormat;
import net.demilich.metastone.game.gameconfig.GameConfig;
import net.demilich.metastone.gui.common.DeckFormatStringConverter;
import net.demilich.metastone.gui.gameconfig.PlayerConfigView;

import java.io.IOException;
import java.util.List;

public class PlayModeConfigView extends BorderPane implements EventHandler<ActionEvent> {

	@FXML
	protected ComboBox<DeckFormat> formatBox;

	@FXML
	protected HBox playerArea;

	@FXML
	protected Button startButton;

	@FXML
	protected Button backButton;

	@FXML
	protected TextField hostBox;

	@FXML
	protected TextField portBox;

	protected PlayerConfigView player1Config;
	protected PlayerConfigView player2Config;

	@FXML
	protected VBox multiplayerGroup;

	private boolean isMultiplayer;

	private List<DeckFormat> deckFormats;

	public PlayModeConfigView(boolean isMultiplayer) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/PlayModeConfigView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

		this.isMultiplayer = isMultiplayer;

		if (!isMultiplayer) {
			multiplayerGroup.getStyleClass().add("hidden");
		}

		formatBox.setConverter(new DeckFormatStringConverter());

		player1Config = new PlayerConfigView(PlayerConfigType.HUMAN);
		player2Config = new PlayerConfigView(PlayerConfigType.OPPONENT);

		playerArea.getChildren().add(player1Config);

		if (!isMultiplayer) {
			playerArea.getChildren().add(player2Config);
		}

		startButton.setOnAction(this);
		backButton.setOnAction(this);

		formatBox.valueProperty().addListener((ChangeListener<DeckFormat>) (observableProperty, oldDeckFormat, newDeckFormat) -> {
			setDeckFormats(newDeckFormat);
		});
	}

	private void setupDeckFormats() {
		ObservableList<DeckFormat> deckFormatList = FXCollections.observableArrayList();

		for (DeckFormat deckFormat : deckFormats) {
			deckFormatList.add(deckFormat);
		}

		formatBox.setItems(deckFormatList);
		formatBox.getSelectionModel().selectFirst();
	}

	private void setDeckFormats(DeckFormat newDeckFormat) {
		player1Config.setDeckFormat(newDeckFormat);
		player2Config.setDeckFormat(newDeckFormat);
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		if (actionEvent.getSource() == startButton) {
			GameConfig gameConfig = new GameConfig();
			gameConfig.setNumberOfGames(1);
			gameConfig.setPlayerConfig1(player1Config.getPlayerConfig());
			gameConfig.setPlayerConfig2(player2Config.getPlayerConfig());
			gameConfig.setDeckFormat(formatBox.getValue());
			gameConfig.setHost(hostBox.getText());
			gameConfig.setPort(Integer.parseInt(portBox.getText()));
			gameConfig.setMultiplayer(this.isMultiplayer);
			NotificationProxy.sendNotification(GameNotification.COMMIT_PLAYMODE_CONFIG, gameConfig);
		} else if (actionEvent.getSource() == backButton) {
			NotificationProxy.sendNotification(GameNotification.MAIN_MENU);
		}
	}

	public void injectDecks(List<Deck> decks) {
		player1Config.injectDecks(decks);
		player2Config.injectDecks(decks);
	}

	public void injectDeckFormats(List<DeckFormat> deckFormats) {
		this.deckFormats = deckFormats;
		setupDeckFormats();
		player1Config.setDeckFormat(formatBox.getValue());
		player2Config.setDeckFormat(formatBox.getValue());
	}

}
