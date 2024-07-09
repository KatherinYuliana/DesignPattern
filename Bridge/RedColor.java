package Bridge;

// implementasi dari implementor
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Berwarna merah");
    }
}
