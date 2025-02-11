package process;
import config.*;
import game.*;
import map.*;

public class GameBuilder {
	public static Hospital buildHospital() {
		return new Hospital(GameConfiguration.LINE_COUNT, GameConfiguration.COLUMN_COUNT);
	}

}
