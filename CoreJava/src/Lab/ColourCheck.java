package Lab;
import java.awt. *;

public class ColourCheck {

	public static void main(String[] args) {

		Color rgb, hsb;
		rgb = new Color(193, 255, 183);
		int red, green, blue;
		red = rgb.getRed();
		green = rgb.getGreen();
		blue = rgb.getBlue();
		float x[] = { 0.0f, 0.0f, 0.0f };
		rgb.RGBtoHSB(red, green, blue, x);
		System.out.println("RGB Combination");
		System.out.println("Red : " + red + "\tGreen: " + green + "\tBlue : " + blue);
		System.out.println("Hue : " + x[0] + "\tSaturation: " + x[1] + "\tBrightness: " + x[2]);
		int r = rgb.HSBtoRGB(0.75f, 0.2375f, 0.95f);
		System.out.println("\n HSB Combination");
		System.out.println(" Red, Blue and Green Combination : " + r);

	}

}
