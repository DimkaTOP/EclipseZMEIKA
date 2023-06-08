
public abstract class ZADAN {
	class Box{
		double width;
		double height;
		double depth;
	
		void volume() {
			System.out.print("the volume is: ");
			System.out.print("the volume" + width * height * depth);
		}
	}
	class BoxDemo{
		public static void main(String args[] ) {
			Box myBox = new Box();
			myBox.width = 10;
			myBox.height = 20;
			myBox.depth = 15;
			myBox.volume();
		}
	}
}
