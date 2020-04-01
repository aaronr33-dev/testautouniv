package chapter8b;

public class PassValid {
    public static void main(String[] args) {
        String user = "software";
        String oldPass = "entrance";
        String pass = "Passme#3get";
        String specChar=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";   // String of strings to compare it to

        if(pass.length() >= 8 ){ // length of 8 or more
            if(!pass.equals(oldPass)){  // not equal to old password
                if(!pass.contentEquals(user)){ //does contain the username
                    for(int i = 0; i < pass.length(); i++){
                        if(Character.isUpperCase(pass.charAt(i))){// specChar.contains(Character.toString(pass.charAt(i)))){// checks if string has uppercase letter
                            i++;
                        }
                        if(specChar.contains(Character.toString(pass.charAt(i)))){
                            i++;
                        }
                    }
                    System.out.println("Valid Password");
                }
            }
        } else { System.out.println("password has not met all requirements");}
    }
}

//specChar.contains(Character.toString(pass.charAt(i))
    //    if(pass.contains(Character.toString(specChar.charAt(i)))){ /// checks is string contain special character