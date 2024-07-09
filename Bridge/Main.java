// Bridge Pattern digunakan untuk menjembatani antara abstraksi dan implementasi
// Pola ini memisahkan abstraksi dari implementasi sehingga memungkinkan mereka untuk berubah tanpa saling mempengaruhi.

// Cara kerja: mengkomposisikan objek Implementor ke dalam Abstraction. 
// Sehingga kita dapat menambahkan fungsionalitas baru ke bagian abstraksi atau implementasi tanpa mengubah kode yang ada.

package Bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();
        blueSquare.draw();
    }
}
