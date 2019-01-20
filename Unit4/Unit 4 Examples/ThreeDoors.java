public class ThreeDoors {
    private int d1Code;
    private String d2Code, d3Code;
    private int ans1;
    private String ans2, ans3;
    private boolean d1Status, d2Status, d3Status; 
    
    public ThreeDoors() {
        d1Code = 123;
        d2Code = "abc";
        d3Code = "$%^";
    }
    
    public void setA1(int a1) {
        ans1 = a1;
    }
    
    public void setA2(String a2) {
        ans2 = a2;
    }
    
    //usually, you will need a "get" method also ...
    public void unlockD1() {
        if (ans1 == d1Code) {
            d1Status = true; //"unlocked" (flag)
        }
        else {
            d1Status = false; //"locked" (flag
        }
    }
    
    public boolean getAuth1() {
        return d1Status;
    }
    
    //usually, you will need a "get" method also ...
    public void unlockD2() {
        if (ans2 == d2Code) {
            d2Status = true; //"unlocked" (flag)
        }
        else {
            d2Status = false; //"locked" (flag)
        }
    }
    
    public boolean getAuth2() {
        return d2Status;
    }
    
    //usually, you will need a "get" method also ...
    public void unlockD3() {
        if (ans3 == d3Code) {
            d2Status = true; //"unlocked" (flag)
        }
        else {
            d2Status = false; //"locked" (flag)
        }
    }
    
    public boolean getAuth3() {
        return d3Status;
    }
}