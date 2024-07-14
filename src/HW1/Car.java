package HW1;

import java.math.BigDecimal;

public class Car {
        // model
        private String model;
//    power
        private BigDecimal power;
// volumeEngine
        private BigDecimal volume;
// turbo
        private String turbo;

     public Car(String model, BigDecimal power, BigDecimal volume, String turbo) {
            this.model = model;
            this.power = power;
            this.volume = volume;
            this.turbo = turbo;
        }

        //    Getters

        public String getModel () {
            return model;
        }

        public String getTurbo () {
            return turbo;
        }

        public BigDecimal getPower () {
            return power;
        }

        public BigDecimal getVolume () {
            return volume;
        }
//    Setters

        public void setModel (String model){
            this.model = model;
        }

        public void setPower (BigDecimal power){
            this.power = power;
        }

        public void setTurbo (String turbo){
            this.turbo = turbo;
        }

        public void setVolume (BigDecimal volume){
            this.volume = volume;
        }

}
