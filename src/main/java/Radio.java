public class Radio {
    public int currentVolume;
    protected int radioStation;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation >= 0 && radioStation <= 9) {
            this.radioStation = radioStation;
        } else {
            System.out.println("err");


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
            radioStation--;
        } else {
            radioStation = 9;
        }
    }
}

