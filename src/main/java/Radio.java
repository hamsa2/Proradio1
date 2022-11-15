public class Radio {
    public int currentVolume;
    protected int radioStation;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0 && newRadioStation > 9) {
            System.out.println("Нет такой станции");
        } else {
            radioStation = newRadioStation;
        }
    }
    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

    public void nextStation() {
        if (radioStation < 9) {
            radioStation++;
        }
        radioStation = 0;
        }

    public void prevStation() {
        if (radioStation > 0) {
        }
        radioStation = 9;
        }
    }

