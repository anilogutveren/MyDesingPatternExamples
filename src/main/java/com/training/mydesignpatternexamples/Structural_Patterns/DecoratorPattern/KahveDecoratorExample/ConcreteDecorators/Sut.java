// Süt Eklentisi
public class Sut extends KahveDecorator {
    public Sut(Kahve kahve) {
        super(kahve);
    }

    @Override
    public String getAciklama() {
        return super.getAciklama() + ", Sütlü";
    }

    @Override
    public double getUcret() {
        return super.getUcret() + 15.0; // Süt ücretini ekle
    }
}