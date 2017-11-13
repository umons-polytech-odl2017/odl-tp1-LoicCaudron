package exercise3;

public class Ellipsis {

	private Point center;
	private int xAxislength;
	private int yAxis2length;

	public Ellipsis(Point center, int xAxislength, int yAxis2length) {

		this.center = center;
		this.xAxislength = xAxislength;
		this.yAxis2length = yAxis2length;
	}

	public Point getCenter() {

		return center;
	}

	public int getxAxislength() {

		return xAxislength;
	}

	public int getyAxis2length() {

		return yAxis2length;
	}
}
