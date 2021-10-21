





/// Code By Sanket Reja
package demo;

public class CarPaint {

	public static void main(String[] args) {

		
		System.out.println("Car paint begins..");
		Car c1 = new Car();
		c1.setBrand("GM");
		c1.setModel("Beat");
		c1.setColor("White");
		c1.setCost(10000);
		c1.setStatus("Black");

		System.out.println("Before Paint " + c1);

		PaintWorks p1 = new PaintWorks();
		System.out.println("After Paint Color Changed "  +p1.paint("White", 3));
		
		c1.setStatus("White");

		System.out.println("After paint : " + c1); // will invoke toString()

	}

}

class Car {
	private String brand;
	private String model;
	private String color;
	private int cost;
	private String status;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", cost=" + cost + ", status=" + status
				+ "]";
	}

}

class PaintShop {

}

class PaintWorks extends PaintShop {
	private Painter paint1 = new Painter();
	

//void paint()
	// System.out.println("Paint work undefined");
// }
	String paint(String ColorChan, int Layer) {
		System.out.println("Paint work Selected is " + ColorChan + " And the  " + Layer + " Layers. ");
		paint1.wash();
		paint1.Scrape();
		paint1.Priming();
		return ColorChan;
	}

	String paint(String ColorChan, int layer, String design) {
		System.out.println("Color Change to" + ColorChan + "and Design selected" + design + " with " + layer + "layers");
		paint1.wash();
		paint1.Scrape();
		paint1.Priming();
		return ColorChan;

	}

	class Worker {

	}

	class Painter extends Worker {

		  void wash() {
			System.out.println("Washing....");
		                  }

		  void Scrape() {
			System.out.println("Paint Scraping...");
		                }

		  void Priming() {
			System.out.println("Priming..");
		                 }

	}
}
