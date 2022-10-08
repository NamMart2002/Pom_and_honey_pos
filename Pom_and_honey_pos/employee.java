public class employee { //this was originally called server in our plans but using an
    private int empId;  // employee class for both server and managers makes more sense imo
    private String name;
    private String password;
    private boolean manager; //if true then has more permissions

    public employee(){//should only be called if trying to create a new one

    }
    public employee(int empId, String inputPass){
        this.empId=empId;
        //should test if employee id is real before continuing
        //then pull password from our sql table and verfiy 
        verifyPass(inputPass);
        //if verification passed then pull the rest from sql;

    }
    
    public boolean verifyPass(String password){
        return password.equals(this.password);
    }
    public int getEmpNum(){
        return empId;
    }
    public void setEmpNum(int id){
        empId=id;
    }
    public void setPass(String password){
        this.password=password;
    }
    public String getPass(){
        return password;
    }
    
}
