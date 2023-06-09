public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString != null){
            for(int i = 0; i < myString.length(); i++){
                char current = myString.charAt(i);
                if (current > 64 && current < 91){
                    return true;
                }
            }
        }
        return false;
    }

}

