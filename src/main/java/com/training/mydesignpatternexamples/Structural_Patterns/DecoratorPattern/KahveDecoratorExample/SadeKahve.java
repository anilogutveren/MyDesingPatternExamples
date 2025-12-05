public class SadeKahve implements Kahve {
    @Override
    public String getAciklama() {
        return "Sade Kahve";
    }

    @Override
    public double getUcret() {
        return 50.0; // Baz fiyat
    }
}