class Fctoring{
    private int n;
    public factoring(int n ){
        this. n=n;
    }
    public int calculater(){
        int result =1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
    } return result;
}
public class Main{
	public static void main(String[] args) {
		factoring Factoring=new Factouring (5);
		System. out. println("Factoring of 5 is"+ Factoring.calculater());
	}
}