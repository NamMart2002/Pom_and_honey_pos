import java.util.*;
public class entree{
    private String type;
    private int typeId;
    private String proteins;
    private int[] toppings;
    private String[] toppingOptions={"None","Pickled Onions","Diced Cucumber","Citrius Couscous","Roasted Cauliflower","Tomato-onion Salad","Kalamata Olives","Roasted Peppers","Red Cabbage Slaw"};

    public entree(int inType){ //entree orders should start with type, rest should be modified with sets as added
        typeId=inType;
    }

    public void setType(){

    }
    public String getType(){
        return "";
    }
    public void setProtein(){

    }
    public String getProtein(){
        return "";
    }
    public void addTopping(){

    }
    public String getToppings(){
        return "";
    }
    public void setDressing(){

    }
    public String getDressing(){
        return "";
    }
    public float getPrice(){
        return 1;
    }
    public String toString(){//sysout.println calls tostring so it would make sense to use this for testing
        return "";
    }
    public String toInputString(){ //we should use this to return a string ready to be added to order and sent into the data base
        return "";
    }
    
}