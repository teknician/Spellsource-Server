package net.pferdimanzug.hearthstone.analyzer.gui.playmode;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import net.pferdimanzug.hearthstone.analyzer.game.Player;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.Hero;
import net.pferdimanzug.hearthstone.analyzer.game.entities.weapons.Weapon;
import net.pferdimanzug.hearthstone.analyzer.gui.IconFactory;

public class HeroToken extends GameToken {

	@FXML
	private Text attackLabel;
	@FXML
	private Text hpLabel;
	@FXML
	private Label manaLabel;

	@FXML
	private Text armorLabel;
	@FXML
	private ImageView armorIcon;

	@FXML
	private Pane weaponPane;
	@FXML
	private Label weaponNameLabel;
	@FXML
	private Text weaponAttackLabel;
	@FXML
	private Text weaponDurabilityLabel;

	@FXML
	private ImageView portrait;

	@FXML
	private ImageView heroPowerIcon;

	@FXML
	private Pane secretsAnchor;

	public HeroToken() {
		super("HeroToken.fxml");
	}

	public void setHero(Player player) {
		Hero hero = player.getHero();
		attackLabel.setText(String.valueOf(hero.getAttack()));
		Image portraitImage = new Image(IconFactory.getHeroIconUrl(hero));
		portrait.setImage(portraitImage);
		Image heroPowerImage = new Image(IconFactory.getHeroPowerIconUrl(hero.getHeroPower()));
		heroPowerIcon.setImage(heroPowerImage);
		hpLabel.setText(String.valueOf(hero.getHp()));
		manaLabel.setText("Mana: " + player.getMana() + "/" + player.getMaxMana());
		updateArmor(hero.getArmor());
		updateWeapon(hero.getWeapon());
		updateSecrets(player);
	}

	public void highlight(boolean highlight) {
		StackPane targetAnchor = (StackPane) lookup("#targetAnchor");
		String cssBorder = null;
		if (highlight) {
			cssBorder = "-fx-border-color:greenyellow; \n" + "-fx-border-radius:7;\n" + "-fx-border-width:5.0;";
		} else {
			cssBorder = "-fx-border-color:transparent; \n" + "-fx-border-radius:7;\n" + "-fx-border-width:5.0;";
		}

		targetAnchor.setStyle(cssBorder);
	}

	private void updateArmor(int armor) {
		armorLabel.setText(String.valueOf(armor));
		boolean visible = armor > 0;
		armorIcon.setVisible(visible);
		armorLabel.setVisible(visible);
	}

	private void updateSecrets(Player player) {
		secretsAnchor.getChildren().clear();
		for (int i = 0; i < player.getSecrets().size(); i++) {
			ImageView secretIcon = new ImageView(IconFactory.getImageUrl("common/secret.png"));
			secretsAnchor.getChildren().add(secretIcon);
		}

	}

	private void updateWeapon(Weapon weapon) {
		boolean hasWeapon = weapon != null;
		weaponPane.setVisible(hasWeapon);
		if (hasWeapon) {
			weaponNameLabel.setText(weapon.getName());
			weaponAttackLabel.setText(String.valueOf(weapon.getWeaponDamage()));
			weaponDurabilityLabel.setText(String.valueOf(weapon.getDurability()));
		}
	}

}