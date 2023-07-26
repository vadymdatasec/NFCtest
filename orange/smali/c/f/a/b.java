public class c.f.a.b implements c.f.a.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.f.a.k a;
	 public Float b;
	 public Boolean c;
	 public final c.f.a.a d;
	 public Boolean e;
	 /* # direct methods */
	 public c.f.a.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Lc/f/a/b;->b:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lc/f/a/b;->e:Z */
		 /* .line 5 */
		 /* new-instance v0, Lc/f/a/a; */
		 /* invoke-direct {v0, p0, p1}, Lc/f/a/a;-><init>(Lc/f/a/b;Lc/f/a/c;)V */
		 this.d = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.f.a.b a ( Float p0, Float p1, Float p2, Object p3, Object p4, Object p5, Object p6 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 14 */
		 /* iput v0, p0, Lc/f/a/b;->b:F */
		 /* const/high16 v1, -0x40800000 # -1.0f */
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 /* cmpl-float v3, p2, v0 */
		 if ( v3 != null) { // if-eqz v3, :cond_3
			 /* cmpl-float v3, p1, p3 */
			 /* if-nez v3, :cond_0 */
		 } // :cond_0
		 /* cmpl-float v3, p1, v0 */
		 /* if-nez v3, :cond_1 */
		 /* .line 15 */
		 p1 = this.d;
		 (( c.f.a.a ) p1 ).a ( p4, v2 ); // invoke-virtual {p1, p4, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
		 /* .line 16 */
		 p1 = this.d;
		 (( c.f.a.a ) p1 ).a ( p5, v1 ); // invoke-virtual {p1, p5, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
	 } // :cond_1
	 /* cmpl-float v0, p3, v0 */
	 /* if-nez v0, :cond_2 */
	 /* .line 17 */
	 p1 = this.d;
	 (( c.f.a.a ) p1 ).a ( p6, v2 ); // invoke-virtual {p1, p6, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
	 /* .line 18 */
	 p1 = this.d;
	 (( c.f.a.a ) p1 ).a ( p7, v1 ); // invoke-virtual {p1, p7, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :cond_2
/* div-float/2addr p1, p2 */
/* div-float/2addr p3, p2 */
/* div-float/2addr p1, p3 */
/* .line 19 */
p2 = this.d;
(( c.f.a.a ) p2 ).a ( p4, v2 ); // invoke-virtual {p2, p4, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 20 */
p2 = this.d;
(( c.f.a.a ) p2 ).a ( p5, v1 ); // invoke-virtual {p2, p5, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 21 */
p2 = this.d;
(( c.f.a.a ) p2 ).a ( p7, p1 ); // invoke-virtual {p2, p7, p1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 22 */
p2 = this.d;
/* neg-float p1, p1 */
(( c.f.a.a ) p2 ).a ( p6, p1 ); // invoke-virtual {p2, p6, p1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 23 */
} // :cond_3
} // :goto_0
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p4, v2 ); // invoke-virtual {p1, p4, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 24 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p5, v1 ); // invoke-virtual {p1, p5, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 25 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p7, v2 ); // invoke-virtual {p1, p7, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 26 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p6, v1 ); // invoke-virtual {p1, p6, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :goto_1
} // .end method
public c.f.a.b a ( Object p0, Integer p1 ) {
/* .locals 3 */
/* .line 46 */
v0 = this.d;
final String v1 = "ep"; // const-string v1, "ep"
(( c.f.a.f ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/f/a/f;->a(ILjava/lang/String;)Lc/f/a/k;
/* const/high16 v2, 0x3f800000 # 1.0f */
(( c.f.a.a ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 47 */
v0 = this.d;
final String v1 = "em"; // const-string v1, "em"
(( c.f.a.f ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/f/a/f;->a(ILjava/lang/String;)Lc/f/a/k;
/* const/high16 p2, -0x40800000 # -1.0f */
(( c.f.a.a ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // .end method
public c.f.a.b a ( Object p0, Integer p1 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.d;
/* int-to-float p2, p2 */
(( c.f.a.a ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // .end method
public c.f.a.b a ( Object p0, Object p1, Integer p2 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
if ( p3 != null) { // if-eqz p3, :cond_1
/* if-gez p3, :cond_0 */
/* mul-int/lit8 p3, p3, -0x1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* int-to-float p3, p3 */
/* .line 1 */
/* iput p3, p0, Lc/f/a/b;->b:F */
} // :cond_1
/* const/high16 p3, -0x40800000 # -1.0f */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* if-nez v0, :cond_2 */
/* .line 2 */
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1, p3 ); // invoke-virtual {v0, p1, p3}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 3 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 4 */
} // :cond_2
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 5 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :goto_0
} // .end method
public c.f.a.b a ( Object p0, Object p1, Integer p2, Float p3, Object p4, Object p5, Integer p6 ) {
/* .locals 5 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* if-ne p2, p5, :cond_0 */
/* .line 27 */
p3 = this.d;
(( c.f.a.a ) p3 ).a ( p1, v0 ); // invoke-virtual {p3, p1, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 28 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p6, v0 ); // invoke-virtual {p1, p6, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 29 */
p1 = this.d;
/* const/high16 p3, -0x40000000 # -2.0f */
(( c.f.a.a ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :cond_0
/* const/high16 v1, 0x3f000000 # 0.5f */
/* const/high16 v2, -0x40800000 # -1.0f */
/* cmpl-float v1, p4, v1 */
/* if-nez v1, :cond_2 */
/* .line 30 */
p4 = this.d;
(( c.f.a.a ) p4 ).a ( p1, v0 ); // invoke-virtual {p4, p1, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 31 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 32 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p5, v2 ); // invoke-virtual {p1, p5, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 33 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p6, v0 ); // invoke-virtual {p1, p6, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* if-gtz p3, :cond_1 */
/* if-lez p7, :cond_6 */
} // :cond_1
/* neg-int p1, p3 */
/* add-int/2addr p1, p7 */
/* int-to-float p1, p1 */
/* .line 34 */
/* iput p1, p0, Lc/f/a/b;->b:F */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v1, p4, v1 */
/* if-gtz v1, :cond_3 */
/* .line 35 */
p4 = this.d;
(( c.f.a.a ) p4 ).a ( p1, v2 ); // invoke-virtual {p4, p1, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 36 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* int-to-float p1, p3 */
/* .line 37 */
/* iput p1, p0, Lc/f/a/b;->b:F */
} // :cond_3
/* cmpl-float v1, p4, v0 */
/* if-ltz v1, :cond_4 */
/* .line 38 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p5, v2 ); // invoke-virtual {p1, p5, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 39 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p6, v0 ); // invoke-virtual {p1, p6, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* int-to-float p1, p7 */
/* .line 40 */
/* iput p1, p0, Lc/f/a/b;->b:F */
/* .line 41 */
} // :cond_4
v1 = this.d;
/* sub-float v3, v0, p4 */
/* mul-float v4, v3, v0 */
(( c.f.a.a ) v1 ).a ( p1, v4 ); // invoke-virtual {v1, p1, v4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 42 */
p1 = this.d;
/* mul-float v1, v3, v2 */
(( c.f.a.a ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 43 */
p1 = this.d;
/* mul-float v2, v2, p4 */
(( c.f.a.a ) p1 ).a ( p5, v2 ); // invoke-virtual {p1, p5, v2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 44 */
p1 = this.d;
/* mul-float v0, v0, p4 */
(( c.f.a.a ) p1 ).a ( p6, v0 ); // invoke-virtual {p1, p6, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* if-gtz p3, :cond_5 */
/* if-lez p7, :cond_6 */
} // :cond_5
/* neg-int p1, p3 */
/* int-to-float p1, p1 */
/* mul-float p1, p1, v3 */
/* int-to-float p2, p7 */
/* mul-float p2, p2, p4 */
/* add-float/2addr p1, p2 */
/* .line 45 */
/* iput p1, p0, Lc/f/a/b;->b:F */
} // :cond_6
} // :goto_0
} // .end method
public c.f.a.b a ( Object p0, Object p1, Object p2, Float p3 ) {
/* .locals 2 */
/* .line 48 */
v0 = this.d;
/* const/high16 v1, -0x40800000 # -1.0f */
(( c.f.a.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 49 */
p1 = this.d;
/* const/high16 v0, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, p4 */
(( c.f.a.a ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 50 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p3, p4 ); // invoke-virtual {p1, p3, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // .end method
public c.f.a.b a ( Object p0, Object p1, Object p2, Integer p3 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
if ( p4 != null) { // if-eqz p4, :cond_1
/* if-gez p4, :cond_0 */
/* mul-int/lit8 p4, p4, -0x1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* int-to-float p4, p4 */
/* .line 7 */
/* iput p4, p0, Lc/f/a/b;->b:F */
} // :cond_1
/* const/high16 p4, -0x40800000 # -1.0f */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* if-nez v0, :cond_2 */
/* .line 8 */
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1, p4 ); // invoke-virtual {v0, p1, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 9 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 10 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p3, v1 ); // invoke-virtual {p1, p3, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 11 */
} // :cond_2
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 12 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 13 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p3, p4 ); // invoke-virtual {p1, p3, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :goto_0
} // .end method
public c.f.a.b a ( Object p0, Object p1, Object p2, Object p3, Float p4 ) {
/* .locals 2 */
/* .line 51 */
v0 = this.d;
/* const/high16 v1, -0x40800000 # -1.0f */
(( c.f.a.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 52 */
p1 = this.d;
/* const/high16 v0, 0x3f800000 # 1.0f */
(( c.f.a.a ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 53 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p3, p5 ); // invoke-virtual {p1, p3, p5}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 54 */
p1 = this.d;
/* neg-float p2, p5 */
(( c.f.a.a ) p1 ).a ( p4, p2 ); // invoke-virtual {p1, p4, p2}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // .end method
public c.f.a.k a ( Object p0, Boolean[] p1 ) {
/* .locals 1 */
/* .line 62 */
p1 = this.d;
int v0 = 0; // const/4 v0, 0x0
(( c.f.a.a ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/f/a/a;->a([ZLc/f/a/k;)Lc/f/a/k;
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 55 */
/* iget v0, p0, Lc/f/a/b;->b:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v1, v0, v1 */
/* if-gez v1, :cond_0 */
/* const/high16 v1, -0x40800000 # -1.0f */
/* mul-float v0, v0, v1 */
/* .line 56 */
/* iput v0, p0, Lc/f/a/b;->b:F */
/* .line 57 */
v0 = this.d;
(( c.f.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lc/f/a/a;->b()V
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 5 */
/* .line 63 */
/* instance-of v0, p1, Lc/f/a/b; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 64 */
/* check-cast p1, Lc/f/a/b; */
int v0 = 0; // const/4 v0, 0x0
/* .line 65 */
this.a = v0;
/* .line 66 */
v0 = this.d;
(( c.f.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/f/a/a;->a()V
int v0 = 0; // const/4 v0, 0x0
/* .line 67 */
} // :goto_0
v1 = this.d;
/* iget v2, v1, Lc/f/a/a;->a:I */
/* if-ge v0, v2, :cond_0 */
/* .line 68 */
(( c.f.a.a ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lc/f/a/a;->a(I)Lc/f/a/k;
/* .line 69 */
v2 = this.d;
v2 = (( c.f.a.a ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lc/f/a/a;->b(I)F
/* .line 70 */
v3 = this.d;
int v4 = 1; // const/4 v4, 0x1
(( c.f.a.a ) v3 ).a ( v1, v2, v4 ); // invoke-virtual {v3, v1, v2, v4}, Lc/f/a/a;->a(Lc/f/a/k;FZ)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 71 */
/* iget v0, p1, Lc/f/a/k;->d:I */
/* const/high16 v1, 0x3f800000 # 1.0f */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_0 */
} // :cond_0
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_1 */
/* const/high16 v1, 0x447a0000 # 1000.0f */
} // :cond_1
int v2 = 3; // const/4 v2, 0x3
/* if-ne v0, v2, :cond_2 */
/* const v1, 0x49742400 # 1000000.0f */
} // :cond_2
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_3 */
/* const v1, 0x4e6e6b28 # 1.0E9f */
} // :cond_3
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_4 */
/* const v1, 0x5368d4a5 # 1.0E12f */
/* .line 72 */
} // :cond_4
} // :goto_0
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 2 */
/* .line 58 */
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/a;->a(Lc/f/a/f;)Lc/f/a/k;
int v0 = 1; // const/4 v0, 0x1
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 59 */
} // :cond_0
(( c.f.a.b ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/b;->d(Lc/f/a/k;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 60 */
} // :goto_0
v1 = this.d;
/* iget v1, v1, Lc/f/a/a;->a:I */
/* if-nez v1, :cond_1 */
/* .line 61 */
/* iput-boolean v0, p0, Lc/f/a/b;->e:Z */
} // :cond_1
} // .end method
public c.f.a.b b ( Object p0, Integer p1 ) {
/* .locals 0 */
/* .line 3 */
this.a = p1;
/* int-to-float p2, p2 */
/* .line 4 */
/* iput p2, p1, Lc/f/a/k;->e:F */
/* .line 5 */
/* iput p2, p0, Lc/f/a/b;->b:F */
int p1 = 1; // const/4 p1, 0x1
/* .line 6 */
/* iput-boolean p1, p0, Lc/f/a/b;->e:Z */
} // .end method
public c.f.a.b b ( Object p0, Object p1, Object p2, Integer p3 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
if ( p4 != null) { // if-eqz p4, :cond_1
/* if-gez p4, :cond_0 */
/* mul-int/lit8 p4, p4, -0x1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* int-to-float p4, p4 */
/* .line 7 */
/* iput p4, p0, Lc/f/a/b;->b:F */
} // :cond_1
/* const/high16 p4, -0x40800000 # -1.0f */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* if-nez v0, :cond_2 */
/* .line 8 */
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1, p4 ); // invoke-virtual {v0, p1, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 9 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 10 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p3, p4 ); // invoke-virtual {p1, p3, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 11 */
} // :cond_2
v0 = this.d;
(( c.f.a.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 12 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 13 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p3, v1 ); // invoke-virtual {p1, p3, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :goto_0
} // .end method
public c.f.a.b b ( Object p0, Object p1, Object p2, Object p3, Float p4 ) {
/* .locals 2 */
/* .line 14 */
v0 = this.d;
/* const/high16 v1, 0x3f000000 # 0.5f */
(( c.f.a.a ) v0 ).a ( p3, v1 ); // invoke-virtual {v0, p3, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 15 */
p3 = this.d;
(( c.f.a.a ) p3 ).a ( p4, v1 ); // invoke-virtual {p3, p4, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 16 */
p3 = this.d;
/* const/high16 p4, -0x41000000 # -0.5f */
(( c.f.a.a ) p3 ).a ( p1, p4 ); // invoke-virtual {p3, p1, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* .line 17 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Lc/f/a/a;->a(Lc/f/a/k;F)V
/* neg-float p1, p5 */
/* .line 18 */
/* iput p1, p0, Lc/f/a/b;->b:F */
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.g;
v1 = c.f.a.j.b;
/* if-eq v0, v1, :cond_0 */
/* iget v0, p0, Lc/f/a/b;->b:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean b ( Object p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
p1 = (( c.f.a.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/a;->a(Lc/f/a/k;)Z
} // .end method
public c.f.a.b c ( Object p0, Integer p1 ) {
/* .locals 1 */
/* if-gez p2, :cond_0 */
/* mul-int/lit8 p2, p2, -0x1 */
/* int-to-float p2, p2 */
/* .line 1 */
/* iput p2, p0, Lc/f/a/b;->b:F */
/* .line 2 */
p2 = this.d;
/* const/high16 v0, 0x3f800000 # 1.0f */
(( c.f.a.a ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :cond_0
/* int-to-float p2, p2 */
/* .line 3 */
/* iput p2, p0, Lc/f/a/b;->b:F */
/* .line 4 */
p2 = this.d;
/* const/high16 v0, -0x40800000 # -1.0f */
(( c.f.a.a ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Lc/f/a/a;->a(Lc/f/a/k;F)V
} // :goto_0
} // .end method
public c.f.a.k c ( Object p0 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
(( c.f.a.a ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/f/a/a;->a([ZLc/f/a/k;)Lc/f/a/k;
} // .end method
public Boolean c ( ) {
/* .locals 2 */
/* .line 6 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lc/f/a/b;->b:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
v0 = this.d;
/* iget v0, v0, Lc/f/a/a;->a:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void clear ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( c.f.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/f/a/a;->a()V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Lc/f/a/b;->b:F */
return;
} // .end method
public void d ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.a = v0;
/* .line 2 */
v0 = this.d;
(( c.f.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/f/a/a;->a()V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Lc/f/a/b;->b:F */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Lc/f/a/b;->e:Z */
return;
} // .end method
public void d ( Object p0 ) {
/* .locals 3 */
/* .line 5 */
v0 = this.a;
/* const/high16 v1, -0x40800000 # -1.0f */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
v2 = this.d;
(( c.f.a.a ) v2 ).a ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lc/f/a/a;->a(Lc/f/a/k;F)V
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
this.a = v0;
/* .line 8 */
} // :cond_0
v0 = this.d;
int v2 = 1; // const/4 v2, 0x1
v0 = (( c.f.a.a ) v0 ).a ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Lc/f/a/a;->a(Lc/f/a/k;Z)F
/* mul-float v0, v0, v1 */
/* .line 9 */
this.a = p1;
/* const/high16 p1, 0x3f800000 # 1.0f */
/* cmpl-float p1, v0, p1 */
/* if-nez p1, :cond_1 */
return;
/* .line 10 */
} // :cond_1
/* iget p1, p0, Lc/f/a/b;->b:F */
/* div-float/2addr p1, v0 */
/* iput p1, p0, Lc/f/a/b;->b:F */
/* .line 11 */
p1 = this.d;
(( c.f.a.a ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/a;->a(F)V
return;
} // .end method
public java.lang.String e ( ) {
/* .locals 10 */
/* .line 1 */
v0 = this.a;
final String v1 = ""; // const-string v1, ""
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "0"; // const-string v1, "0"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 4 */
} // :goto_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " = "; // const-string v0, " = "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 5 */
/* iget v1, p0, Lc/f/a/b;->b:F */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float v1, v1, v4 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Lc/f/a/b;->b:F */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
} // :goto_1
v5 = this.d;
/* iget v5, v5, Lc/f/a/a;->a:I */
} // :goto_2
/* if-ge v2, v5, :cond_8 */
/* .line 8 */
v6 = this.d;
(( c.f.a.a ) v6 ).a ( v2 ); // invoke-virtual {v6, v2}, Lc/f/a/a;->a(I)Lc/f/a/k;
/* if-nez v6, :cond_2 */
/* goto/16 :goto_6 */
/* .line 9 */
} // :cond_2
v7 = this.d;
v7 = (( c.f.a.a ) v7 ).b ( v2 ); // invoke-virtual {v7, v2}, Lc/f/a/a;->b(I)F
/* cmpl-float v8, v7, v4 */
/* if-nez v8, :cond_3 */
/* goto/16 :goto_6 */
/* .line 10 */
} // :cond_3
(( c.f.a.k ) v6 ).toString ( ); // invoke-virtual {v6}, Lc/f/a/k;->toString()Ljava/lang/String;
/* const/high16 v9, -0x40800000 # -1.0f */
/* if-nez v1, :cond_4 */
/* cmpg-float v1, v7, v4 */
/* if-gez v1, :cond_6 */
/* .line 11 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "- "; // const-string v0, "- "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_4
/* if-lez v8, :cond_5 */
/* .line 12 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " + "; // const-string v0, " + "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 13 */
} // :cond_5
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " - "; // const-string v0, " - "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_3
/* mul-float v7, v7, v9 */
} // :cond_6
} // :goto_4
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v1, v7, v1 */
/* if-nez v1, :cond_7 */
/* .line 14 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 15 */
} // :cond_7
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_5
int v1 = 1; // const/4 v1, 0x1
} // :goto_6
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_2 */
} // :cond_8
/* if-nez v1, :cond_9 */
/* .line 16 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "0.0"; // const-string v0, "0.0"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_9
} // .end method
public c.f.a.k getKey ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( c.f.a.b ) p0 ).e ( ); // invoke-virtual {p0}, Lc/f/a/b;->e()Ljava/lang/String;
} // .end method
