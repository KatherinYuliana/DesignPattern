package Bridge;

// implementasi dari implementor
public class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Berwarna biru");
    }
}
