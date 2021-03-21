package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;


public class ImplementationWebcrawler implements Webcrawler {
    public static void main(String[] args) {
        Apotheek apotheek = new Apotheek();
        apotheek.getInformation();

        Farmaco farmaco = new Farmaco();
        farmaco.getInformation();

        RichtlijnenNhg richtlijnenNhg = new RichtlijnenNhg();
        richtlijnenNhg.getInformation();

        GgzStandaarden ggzStandaarden = new GgzStandaarden();
        ggzStandaarden.getInformation();
    }
}
