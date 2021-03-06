package com.mygdx.game.game;




import java.util.List;
import com.badlogic.gdx.graphics.Cursor.SystemCursor;
import com.mygdx.game.game.GameBoardPoint.StoneSide;
import com.mygdx.game.player.Human;
import com.mygdx.game.player.Player;

/**
 * Klasse für die Tests der Spielfeldlogik.
 * 
 * @author Jonathan
 *
 */
public class RuleTester {

	
	
	// Ab hier alles vor Code-Abgabe löschen!
	private GameBoardLogic field;
	private final int FIELD_LENGTH = 7;
	private Rule rule;

	public RuleTester(int num) {
		this.field = new GameBoardLogic();
		this.rule = new Rule(this.field);
	}

	public GameBoardLogic getField() {
		return this.field;
	}

	public void setField(GameBoardLogic field) {
		this.field = field;
	}

	/**
	 * WTF DELETE THIS SHIT xD
	 * 
	 * @param number
	 * @return
	 */
	private void printField() {
		int count = 0;
		int fields = 7;
		for (int i = 0; i < fields; i++) {
			for (int j = 0; j < fields; j++) {
				int pos = (i * fields) + j;
				if (i == 0 || i == fields - 1) {
					if (j == 0 || j == fields / 2 || j == fields - 1) {
						System.out.print(getElement(pos));
					} else {
						System.out.print("O");
					}
				}
				if (i == 1 || i == fields - 2) {
					if (j > 0 && j % 2 != 0) {
						System.out.print(getElement(pos));
					} else {
						System.out.print("O");
					}
				}
				if (i == 2 || i == fields - 3) {
					if (j > 1 && j < 5) {
						System.out.print(getElement(pos));
					} else {
						System.out.print("O");
					}
				}
				if (i == fields / 2) {
					if (j != fields / 2) {
						System.out.print(getElement(pos));
					} else {
						System.out.print("O");
					}
				}
			}
			System.out.println("");
		}
	}

	/**
	 * WTF DELETE THIS SHIT xD
	 * 
	 * @param number
	 * @return
	 */
	private String getElement(int number) {
		StoneSide side = null;
		switch (number) {
		case 0:
			side = this.field.getgbpList().get(0).getSide();
			break;
		case 3:
			side = this.field.getgbpList().get(1).getSide();
			break;
		case 6:
			side = this.field.getgbpList().get(2).getSide();
			break;
		case 8:
			side = this.field.getgbpList().get(8).getSide();
			break;
		case 10:
			side = this.field.getgbpList().get(9).getSide();
			break;
		case 12:
			side = this.field.getgbpList().get(10).getSide();
			break;
		case 16:
			side = this.field.getgbpList().get(16).getSide();
			break;
		case 17:
			side = this.field.getgbpList().get(17).getSide();
			break;
		case 18:
			side = this.field.getgbpList().get(18).getSide();
			break;
		case 21:
			side = this.field.getgbpList().get(7).getSide();
			break;
		case 22:
			side = this.field.getgbpList().get(15).getSide();
			break;
		case 23:
			side = this.field.getgbpList().get(23).getSide();
			break;
		case 25:
			side = this.field.getgbpList().get(19).getSide();
			break;
		case 26:
			side = this.field.getgbpList().get(11).getSide();
			break;
		case 27:
			side = this.field.getgbpList().get(3).getSide();
			break;
		case 30:
			side = this.field.getgbpList().get(22).getSide();
			break;
		case 31:
			side = this.field.getgbpList().get(21).getSide();
			break;
		case 32:
			side = this.field.getgbpList().get(20).getSide();
			break;
		case 36:
			side = this.field.getgbpList().get(14).getSide();
			break;
		case 38:
			side = this.field.getgbpList().get(13).getSide();
			break;
		case 40:
			side = this.field.getgbpList().get(12).getSide();
			break;
		case 42:
			side = this.field.getgbpList().get(6).getSide();
			break;
		case 45:
			side = this.field.getgbpList().get(5).getSide();
			break;
		case 48:
			side = this.field.getgbpList().get(4).getSide();
			break;
		}
		String sign;
		if (side == StoneSide.PLAYER1) {
			sign = "P";
		} else if (side == StoneSide.PLAYER2) {
			sign = "C";
		} else {
			sign = "X";
		}
		return sign;
	}

}
