package _java.unidad9.teoria.enums;

public enum TrafficLight {
	RED("stop"), GREEN("start"), ORANGE("slow down");

	private String action;

	private TrafficLight(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}
}
