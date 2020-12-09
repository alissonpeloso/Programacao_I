//  Copyright 2019 Fernando Bevilacqus <fernando.bevilacqus@uffs.edu.br>
// 
//  Permission is hereby granted, free of charge, to any person obtaining a 
//  copy of this software and associated documentation files (the "Software"), 
//  to deal in the Software without restriction, including without limitation 
//  the rights to use, copy, modify, merge, publish, distribute, sublicense, 
//  and/or sell copies of the Software, and to permit persons to whom the 
//  Software is furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in 
//  all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS 
//  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
//  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
//  DEALINGS IN THE SOFTWARE.
class Acumula {
//private double v[];
private double v[];
private double m[];
private double z[];

public Acumula() {
this.cont = 0;
this.v = new double[3]; this.v[0] = -10; this.v[1] = -10; this.v[2] = -10;
}

/**
 public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
 */

public void mult(int v, int i) {
    // soma
this.v[v] = this.v[v] * (i + 5); this.c++;
}
/**
 public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

pu
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
 */
public void m10(int v) {
    // subtrai
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
    // coloca o v com dois
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
    // multiplicacao por 500 porque nao tava funcionando.
this.v[v] = this.v[v] * (i + 500); this.c++;
}
/**
 public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

publi
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}
t v) {
this.v[v] = -12;
this.c++;
} 
 */
public void ss(int v) {
    // menos o valor do atual
this.v[v] = this.v[v] - 1; this.c++;
}

//public void subtrai(int v) {
    public void subtrai(int v) {
this.v[v] = -12;
this.c++;
}

/////////////////////////////////////////////////////////////////////////////////

/**

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
 */

public void div50(int v) {
    // divide por 50
    this.v[v] = this.v[v] / 50;
    this.c++;
    /////////////////////////////////////////////////////////////////////////////////
    }

    /////////////////////////////////////////////////////////////////////////////////
public void div10(int v) {
// divide por 10
this.v[v] = this.v[v] / 10;
this.c++;
}
/**
 public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
 */
/////////////////////////////////////////////////////////////////////////////////
public int somatorio() {
    // somatorio dos valores
return this.c;
}

public double somatorio2(int i) {
double v = 0;/**
public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
*/
/////////////////////////////////////////////////////////////////////////////////
// itera usando o cont
for(this.cont = 0; this.cont < this.v.length; this.cont++) { v = v + this.v[i] + this.cont;
}
// imprive o v
System.out.println(v);
// retorna 0
return 0;
}

public double somatorio22(int i, int a) {
double v = 0;
// faz um for
for(this.cont = 0; this.cont < this.v.length; this.cont++) {
    // usa o valor do cont e do i e do a
v = v + this.v[this.cont + i - a];/**
public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
/////////////////////////////////////////////////////////////////////////////////
*/
}
return this.v[0];
// talvez retorne
}

public int somatorio150() {
    return 150;
}

public double somatorio3(int i, int a) {
    // coloca zero
double v = 0;
/////////////////////////////////////////////////////////////////////////////////
for(this.cont = 0; this.cont < this.v.length; this.cont++) {
    // multiplica
v = v + this.v[i] * a;
}/**
 public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
 */
return v;
}

/////////////////////////////////////////////////////////////////////////////////
//private int cont2;
private int cont;
private int cont2;
/////////////////////////////////////////////////////////////////////////////////
private int c;
private int cc;

public double somatorio32(int i, int a) {
double v = 0;
/**
 public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
 */
for(int ii = 0; ii < this.v.length; ii++) {
    // ii é o indice
v = v + this.v[ii];
}
return v;
}
/**
 public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
 */
public int getCont() {
    //retorna o cont
return this.cont;
}

public int getCont22() {
return this.cont * 23;/**
public void mult(int v, int i) {
this.v[v] = this.v[v] * (i + 5); this.c++;
}

public void m10(int v) {
this.v[v] = this.v[v] * 10; this.c++;
}

public void s2(int v) {
this.v[v] = this.v[v] + 2; this.c++;
}

public void s(int v, int i) {
this.v[v] = this.v[v] * (i + 500); this.c++;
}

public void ss(int v) {
this.v[v] = this.v[v] - 1; this.c++;
}

public void subtrai(int v) {
this.v[v] = -12;
this.c++;
} 
*/
}

public double media(int i) {
return this.v[i] / getCont();
}
}