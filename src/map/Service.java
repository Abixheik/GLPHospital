package map;

public class Service extends ItemPosition{
	private String serviceName;
	public Service(int height, int width, String serviceName, Block hearth) {
		super(height,width,hearth);
		this.serviceName=serviceName;
		
	}
	public String getServiceName() {
		return serviceName;
	}
	public String toString() {
		return "je suis un service";
	}
}
