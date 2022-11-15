import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio0 = new Radio();
        radio0.currentVolume = 3;
        radio0.increaseVolume();

        int expected = 4;
        int actual = radio0.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio1 = new Radio();
        radio1.currentVolume = 3;
        radio1.decreaseVolume();

        int expected = 2;
        int actual = radio1.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNextStation() {
        Radio radio2 = new Radio();
        radio2.setRadioStation(8);
        radio2.nextStation();

        int expected = 0;
        int actual = radio2.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkPrevStation() {
        Radio radio3 = new Radio();
        radio3.setRadioStation(9);
        radio3.prevStation();

        int expected = 8;
        int actual = radio3.getRadioStation();

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void checkPrevStation2() {
        Radio radio4 = new Radio();
        radio4.setRadioStation(1);
        radio4.prevStation();

        int expected = 0;
        int actual = radio4.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkSetRadioStation() {
        Radio radio5 = new Radio();
        radio5.setRadioStation(5);
        int expected = 5;
        int actual = radio5.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
