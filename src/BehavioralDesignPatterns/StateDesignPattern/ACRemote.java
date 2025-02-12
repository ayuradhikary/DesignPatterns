package BehavioralDesignPatterns.StateDesignPattern;

public class ACRemote {
        private ACState offState;
        private ACState coolState;
        private ACState heatState;

        private ACState currentState;

        public ACRemote() {
            offState = new OffState(this);
            coolState = new CoolState(this);
            heatState = new HeatState(this);

            currentState = offState;
        }

        public void setState(ACState state) {
            this.currentState = state;
        }

        public ACState getOffState() {
            return offState;
        }

        public ACState getCoolState() {
            return coolState;
        }

        public ACState getHeatState() {
            return heatState;
        }

        public void pressPowerButton() {
            currentState.pressPowerButton();
        }

        public void pressCoolButton() {
            currentState.pressCoolButton();
        }

        public void pressHeatButton() {
            currentState.pressHeatButton();
        }
}
