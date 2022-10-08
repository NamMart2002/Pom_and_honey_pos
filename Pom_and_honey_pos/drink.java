public class drink {

    private String flavor;
    private int flavorId;
    //add array of flavors where index corresponds to itemId

    public drink(int flavorId){ //itemId shold be enough to set name and price
        setFlavor(flavorId);// dry coding :)
    }
    public void setFlavor(int flavorId){ //we should only need to use this to change everything

    }
    public String getFlavor(){
        return flavor;
    }
    public int getFlavorId(){
        return flavorId;
    }
    public String toString(){//use for tesing implicitly called by print
        return "";
    }
    public String toInputString(){//use to prepare to add order to sql
        return "";
    }

}
