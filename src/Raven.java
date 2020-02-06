public class Raven {

    private String input;

    public Raven(){

    }

    public String answer(String input){
        String [ ] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
        String [ ] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};
        String [ ] inputArray = input.split(" ");
        int positiveE = 0;
        int negativeE = 0;


        for (String s : inputArray) {
            for (String value : positive) {
                if (s.equals(value)) {
                    positiveE++;
                }
            }

            for(String value1: negative){
                if(s.equals(value1)){
                    negativeE++;
                }
            }
        }

        if(positiveE > negativeE){
            return "I am so happy for you...Yay...";
        }else if(negativeE > positiveE){
            return "Really! Why, tell me more!";
        }else {
            return "Meh.";
        }



    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

}
