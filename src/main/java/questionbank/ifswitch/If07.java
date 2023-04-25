package questionbank.ifswitch;

public class If07 {
    /*
         Type code to check the grammatical rules for full name
    a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
    b) Your code should print "First name or last name missed" for single words like "Ali" or "Can" or "ali"
    c) Your code should print "Format error" for all the format like "ALI CAN"
    d) Your code should print "Name was not entered" for one or more space
    characters like " " or " "
    e) Your code should print "Invalid Name" if the name has any character different
    from letters and space.
     */

    public static void main(String[] args) {

        String name = "Ali can?";

        String initialFirstName = name.substring(0,1);
        Integer indexOfSpace = name.trim().indexOf(" ");
        String initialOfLastName = name.substring(indexOfSpace+1, indexOfSpace+2);
        Boolean isFirstNameCapital = initialFirstName.charAt(0)>='A' && initialFirstName.charAt(0)<='Z';
        Boolean isLAstNameCapital = initialOfLastName.charAt(0)>='A' && initialOfLastName.charAt(0)<='Z';

        if(indexOfSpace==-1){
            System.out.println("First name or last name missed");
        }if(!isFirstNameCapital || !isLAstNameCapital){
            System.out.println("Error in initials");
        }if(name.equals(name.toUpperCase())){
            System.out.println("Format error");
        }if(name.replaceAll("\\s", "").length()==0){
            System.out.println("Name was not entered");
        }if(name.replaceAll("\\s", "").replaceAll("[a-zA-Z]", "").length()>0){
            System.out.println( "Invalid Name");

        }
    }
}
