// Şeker Eklentisi
public class Seker extends KahveDecorator {
    public Seker(Kahve kahve) {
        super(kahve);
    }

    @Override
    public String getAciklama() {
        return super.getAciklama() + ", Şekerli";
    }

    @Override
    public double getUcret() {
        return super.getUcret() + 5.0; // Şeker ücretini ekle
    }
}