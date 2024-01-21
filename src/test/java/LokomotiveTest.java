//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.as;
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class LokomotiveTest {
//
//    @Test
//    void addwagonAtFirstPlace(){
//        Lokomotive loco = new Lokomotive();
//        Wagon w1 = new Personenwagon(17000, 20, 110, 80);
//        Wagon w2 = new Gueterwagon(9000, 21, 140, "Gold");
//        loco.addWagon(w1);
//        loco.addWagon(w2);
//
//        assertThat(w2.getNext()).isEqualTo(w1);
//    }
//    @Test
//    void addwagonNotAtLastPlace(){
//        Lokomotive loco = new Lokomotive();
//        Wagon w1 = new Personenwagon(17000, 20, 110, 80);
//        Wagon w2 = new Gueterwagon(9000, 21, 140, "Gold");
//        loco.addWagon(w1);
//        loco.addWagon(w2);
//
//        assertThat(w1.getNext()).isNotEqualTo(w2);
//    }
//
//    @Test
//    void nothingAfterTheLastWagon() {
//        Lokomotive loco = new Lokomotive();
//        Wagon w1 = new Personenwagon(17000, 20, 110, 80);
//        Wagon w2 = new Gueterwagon(9000, 21, 140, "Gold");
//        loco.addWagon(w1);
//        loco.addWagon(w2);
//
//        assertThat(w1.getNext()).isEqualTo(null);
//    }
//
//    @Test
//    void addwagonStatistics() {
//        Lokomotive loco = new Lokomotive();
//        Wagon w1 = new Personenwagon(17000, 20, 110, 80);
//        Wagon w2 = new Gueterwagon(9000, 21, 140, "Gold");
//        Wagon w3 = new Personenwagon(20000, 23, 100, 100);
//        Wagon w4 = new Gueterwagon(5000, 19, 130, "Schafe");
//        loco.addWagon(w1);
//        loco.addWagon(w2);
//        loco.addWagon(w3);
//        loco.addWagon(w4);
//
//        assertThat((w1.getSpeed() + w2.getSpeed() + w3.getSpeed() + w4.getSpeed()) / 4).isEqualTo(120);
//        assertThat((w1.getWeight() + w2.getWeight() + w3.getWeight() + w4.getWeight())/1000).isEqualTo(51);
//        assertThat((w1.getLength() + w2.getLength() + w3.getLength() + w4.getLength() +23)).isEqualTo(106);
//    }
//}