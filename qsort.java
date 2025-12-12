import java.util.Random;
import java.util.ArrayList;

static void Pol(ArrayList<Integer> a, ArrayList<Integer> b){
	for (int i = 0; i < b.size(); i++) a.add(b.get(i));
}

static ArrayList<Integer> QS(ArrayList<Integer> x){
	if (x.size() <= 1) return x;
	Integer piv = x.get(x.size()-1);
	ArrayList<Integer> w = new ArrayList<Integer>();
	ArrayList<Integer> m = new ArrayList<Integer>();
	ArrayList<Integer> y = new ArrayList<Integer>();
	for (int i = 0; i < x.size(); i ++){
		if (piv < x.get(i)) 	 w.add(x.get(i));
		else if (piv > x.get(i)) m.add(x.get(i));
	}
	y = QS(m);
	y.add(piv);
	Pol(y, QS(w));
	return y;
}

//class t1{
void main(){
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random rand = new Random();
	for (int i = 0; i < 100; i ++){
		//IO.println(rand.nextInt(1000));
		a.add(rand.nextInt(10000));
	}
	ArrayList<Integer> b = QS(a);
	//for (int i = 0; i < 100; i ++){
	//	IO.println(a.get(i));
	//}
	IO.println(b);
}
//}
