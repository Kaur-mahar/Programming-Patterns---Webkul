let n=5;
let string = "";
for (let i = 0; i < n; i++) {
  for (let j = 0; j < 2*n; j++) {
      if ((j<n && j<=i) || (j>=n && j<=n+i))
      string += "*";
      else
      string += " ";
      
  }
  if(i<n-1)
      string += "\n";
}
console.log(string);

// sol 2

n=5;
string = "";
for (let i = 0; i < n; i++) {
  for (let j = 0; j < 2*n; j++) {
      if ((j<n && j<=i) || (j>=n && j<=n+i))
      string += "*";
      else if (j<n && j>i)
      string += " ";
      
  }
  if(i<n-1)
      string += "\n";
}
console.log(string);

