package paskaitos.septyni;

public class CheckText {
    public static void main(String[] args) {
        CheckText checkText=new CheckText();
        System.out.println(checkText.checkText("Man labai gerai sekasi","sekasi"));
    }

    private boolean checkText(String text, String textToCheck){
        return text.contains(textToCheck);
    }
}
