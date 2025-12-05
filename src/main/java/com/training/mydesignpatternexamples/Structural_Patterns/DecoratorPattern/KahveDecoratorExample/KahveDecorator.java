public abstract class KahveDecorator implements Kahve {
    protected Kahve geciciKahve; // İçine sarılacak kahve

    public KahveDecorator(Kahve kahve) {
        this.geciciKahve = kahve;
    }

    public String getAciklama() {
        return geciciKahve.getAciklama();
    }

    public double getUcret() {
        return geciciKahve.getUcret();
    }
}