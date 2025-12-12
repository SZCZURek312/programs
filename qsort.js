function RandInt(max){
	return Math.floor(Math.random() * max);
}

function Add(a, b){
	for (let i=0; i<b.length; i++){
		a.push(b[i]);
	}
	return a;
}

function Qsort(a){
	if (a.length <= 1) return a;
	//const x = []; const more = []; const less = [];
	let x = new Array(); let more = new Array(); let less = new Array();
	let piv = a[a.length-1]
	for (let i=0; i<a.length-1; i++){
		if (a[i]>piv) more.push(a[i]);
		else          less.push(a[i]);
	}
	Add(x, (Qsort(less)));
	x.push(piv);
	Add(x, (Qsort(more)));
	return x;
}


//let tab = [3, 5, 4, 2, 1];
let tab = [];

for (let i = 0; i < 100000; i ++){
	tab.push(RandInt(1000000));
}

console.log(tab);
console.log(Qsort(tab));
