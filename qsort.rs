fn Add(x: &[i32], y: &[i32]) -> Vec<i32>{
	let mut a = x.to_vec();
	for i in 0..y.len(){
		a.push(y[i]);
	}
	return a;
}

fn Qsort(x: &[i32]) -> Vec<i32>{
	let mut y = x;
	if y.len() <= 1 {
		return y.to_vec();
	}
	let mut a = Vec::new();
	let mut m = Vec::new();
	let mut w = Vec::new();
	let piv = y[y.len() - 1];
	for i in 0..y.len(){
		let c = y[i];
		if c > piv {
			w.push(y[i]);
		}
		else if c < piv {
			m.push(y[i]);
		}
	}
	a = Qsort(&m).to_vec();
	a.push(piv);
	a = Add(&a, &Qsort(&w).to_vec());
	return a;
}

fn main(){
	let mut v = Vec::new();
	v.push(3);
	v.push(5);
	v.push(2);
	v.push(1);
	v.push(4);
	let mut w = Qsort(&v).to_vec();
	for i in 0..w.len() {
		println!("{}", w[i]);
	}
	
}
