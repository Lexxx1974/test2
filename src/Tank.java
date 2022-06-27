public class Tank {
    int position;
    public Tank(){
        this(0);
    }
    public Tank(int position){
        this.position = position;
    }

    void goForward(int pposition){
        position += pposition;
    }

    void goBackward(int mposition){
        position -= mposition;
    }
}
//dkdkdkdk kdkdkdk