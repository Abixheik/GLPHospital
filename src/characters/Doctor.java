package characters;
import java.util.Random;
public class Doctor {
	public String name;
	public int mark;
	public Doctor() {
		Random random=new Random();
		NameRepository nameRepository=NameRepository.getInstance();
		name=nameRepository.getValue(random.nextInt(91));
		mark=random.nextInt(91);
	}
	public String getName() {
		return name;
	}
	public int getMark() {
		return mark;
	}
	public String toString() {
		return "Bonjour je suis " + this.getName() + " j'ai une note de "+ this.getMark();
	}
}
