public class starter {
    private String itemName;
    private int itemId;
    private float price;
    //add arrays of names and prices where index corresponds to itemId

    public starter(int itemId){ //itemId shold be enough to set name and price
        setItem(itemId);// dry coding :)
    }
    public void setItem(int newId){ //we should only need to use this to change everything

    }
    public String getItem(){
        return itemName;
    }
    public int getItemId(){
        return itemId;
    }
    public float getPrice(){
        return price;
    }
    public String toString(){//use for tesing implicitly called by print
        return "";
    }
    public String toInputString(){//use to prepare to add order to sql
        return "";
    }
}
