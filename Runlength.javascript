class RunLengthEncode {}
RunLengthEncode.Runlength = (s) => {
  let max = 4;
  let i = 0;
  let a = '';
  for (let n = 0; n < s.length(); n++) {
    let count = 1;
    while (n < s.length() - 1 && s.charAt(n) === s.charAt(n + 1)) {
      count++;
      n++;
    }
    if (count > 1 && count <= 4) {
      for (let t = 1; t < count; t++) {
        a = a + s.charAt(n);
      }
      count = 1;
    }
    if (count > max) {
      a = a + '/';
      if (count < 10) {
        a = a + '0';
      }
      a = a + count;
    }
    a = a + s.charAt(n);
  }
  return a;
};
RunLengthEncode.main = (args) => {
  let scan = new Scanner(System.in);
  System.out.println('input a RunLength');
  let string = scan.nextLine();
  System.out.println(this.Runlength(string));
};
