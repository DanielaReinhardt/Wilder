

public class Wilder{

    private String firstname;
    private boolean present;
    
public Wilder (String firstname){
    this.firstname = firstname;
    this.present = true;

      
    }

    public String whoIAm(){

        String output = "My name is " + this.firstname ;
        if (this.present)
            output += " and I am present.";
        else
            output += " and i am not present.";
        return output;


    }
    public String getName() {
        return firstname;
    }
    
    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}




