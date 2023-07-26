public class c.f.a.l.m extends c.f.a.l.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float k0;
	 public Integer l0;
	 public Integer m0;
	 public c.f.a.l.g n0;
	 public Integer o0;
	 public Boolean p0;
	 /* # direct methods */
	 public c.f.a.l.m ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/f/a/l/i;-><init>()V */
		 /* const/high16 v0, -0x40800000 # -1.0f */
		 /* .line 2 */
		 /* iput v0, p0, Lc/f/a/l/m;->k0:F */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 3 */
		 /* iput v0, p0, Lc/f/a/l/m;->l0:I */
		 /* .line 4 */
		 /* iput v0, p0, Lc/f/a/l/m;->m0:I */
		 /* .line 5 */
		 v0 = this.t;
		 this.n0 = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 /* iput v0, p0, Lc/f/a/l/m;->o0:I */
		 /* .line 7 */
		 /* iput-boolean v0, p0, Lc/f/a/l/m;->p0:Z */
		 /* .line 8 */
		 /* new-instance v1, Lc/f/a/l/p; */
		 /* invoke-direct {v1}, Lc/f/a/l/p;-><init>()V */
		 /* .line 9 */
		 v1 = this.B;
		 (( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
		 /* .line 10 */
		 v1 = this.B;
		 v2 = this.n0;
		 (( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 11 */
		 v1 = this.A;
		 /* array-length v1, v1 */
	 } // :goto_0
	 /* if-ge v0, v1, :cond_0 */
	 /* .line 12 */
	 v2 = this.A;
	 v3 = this.n0;
	 /* aput-object v3, v2, v0 */
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Integer K ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/l/m;->o0:I */
} // .end method
public c.f.a.l.g a ( c.f.a.l.g$b p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = c.f.a.l.l.a;
v1 = (( java.lang.Enum ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* :pswitch_1 */
/* iget v0, p0, Lc/f/a/l/m;->o0:I */
/* if-nez v0, :cond_0 */
/* .line 3 */
p1 = this.n0;
/* .line 4 */
/* :pswitch_2 */
/* iget v0, p0, Lc/f/a/l/m;->o0:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 5 */
p1 = this.n0;
/* .line 6 */
} // :cond_0
} // :goto_0
/* new-instance v0, Ljava/lang/AssertionError; */
(( java.lang.Enum ) p1 ).name ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void a ( Integer p0 ) {
/* .locals 6 */
/* .line 7 */
(( c.f.a.l.i ) p0 ).l ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
/* if-nez p1, :cond_0 */
return;
/* .line 8 */
} // :cond_0
v0 = (( c.f.a.l.m ) p0 ).K ( ); // invoke-virtual {p0}, Lc/f/a/l/m;->K()I
/* const/high16 v1, -0x40800000 # -1.0f */
int v2 = -1; // const/4 v2, -0x1
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* if-ne v0, v4, :cond_3 */
/* .line 9 */
v0 = this.t;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v5 = this.t;
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v0 ).a ( v4, v5, v3 ); // invoke-virtual {v0, v4, v5, v3}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 10 */
v0 = this.v;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v5 = this.t;
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v0 ).a ( v4, v5, v3 ); // invoke-virtual {v0, v4, v5, v3}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 11 */
/* iget v0, p0, Lc/f/a/l/m;->l0:I */
/* if-eq v0, v2, :cond_1 */
/* .line 12 */
v0 = this.s;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v1 = this.s;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v2, p0, Lc/f/a/l/m;->l0:I */
(( c.f.a.l.q ) v0 ).a ( v4, v1, v2 ); // invoke-virtual {v0, v4, v1, v2}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 13 */
v0 = this.u;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
p1 = this.s;
(( c.f.a.l.g ) p1 ).d ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v1, p0, Lc/f/a/l/m;->l0:I */
(( c.f.a.l.q ) v0 ).a ( v4, p1, v1 ); // invoke-virtual {v0, v4, p1, v1}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* goto/16 :goto_0 */
/* .line 14 */
} // :cond_1
/* iget v0, p0, Lc/f/a/l/m;->m0:I */
/* if-eq v0, v2, :cond_2 */
/* .line 15 */
v0 = this.s;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v1 = this.u;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v2, p0, Lc/f/a/l/m;->m0:I */
/* neg-int v2, v2 */
(( c.f.a.l.q ) v0 ).a ( v4, v1, v2 ); // invoke-virtual {v0, v4, v1, v2}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 16 */
v0 = this.u;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
p1 = this.u;
(( c.f.a.l.g ) p1 ).d ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v1, p0, Lc/f/a/l/m;->m0:I */
/* neg-int v1, v1 */
(( c.f.a.l.q ) v0 ).a ( v4, p1, v1 ); // invoke-virtual {v0, v4, p1, v1}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* goto/16 :goto_0 */
/* .line 17 */
} // :cond_2
/* iget v0, p0, Lc/f/a/l/m;->k0:F */
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_6
(( c.f.a.l.i ) p1 ).k ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->k()Lc/f/a/l/i$a;
v1 = c.f.a.l.i$a.b;
/* if-ne v0, v1, :cond_6 */
/* .line 18 */
/* iget v0, p1, Lc/f/a/l/i;->E:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lc/f/a/l/m;->k0:F */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
/* .line 19 */
v1 = this.s;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v2 = this.s;
(( c.f.a.l.g ) v2 ).d ( ); // invoke-virtual {v2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v1 ).a ( v4, v2, v0 ); // invoke-virtual {v1, v4, v2, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 20 */
v1 = this.u;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
p1 = this.s;
(( c.f.a.l.g ) p1 ).d ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v1 ).a ( v4, p1, v0 ); // invoke-virtual {v1, v4, p1, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* goto/16 :goto_0 */
/* .line 21 */
} // :cond_3
v0 = this.s;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v5 = this.s;
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v0 ).a ( v4, v5, v3 ); // invoke-virtual {v0, v4, v5, v3}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 22 */
v0 = this.u;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v5 = this.s;
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v0 ).a ( v4, v5, v3 ); // invoke-virtual {v0, v4, v5, v3}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 23 */
/* iget v0, p0, Lc/f/a/l/m;->l0:I */
/* if-eq v0, v2, :cond_4 */
/* .line 24 */
v0 = this.t;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v1 = this.t;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v2, p0, Lc/f/a/l/m;->l0:I */
(( c.f.a.l.q ) v0 ).a ( v4, v1, v2 ); // invoke-virtual {v0, v4, v1, v2}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 25 */
v0 = this.v;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
p1 = this.t;
(( c.f.a.l.g ) p1 ).d ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v1, p0, Lc/f/a/l/m;->l0:I */
(( c.f.a.l.q ) v0 ).a ( v4, p1, v1 ); // invoke-virtual {v0, v4, p1, v1}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 26 */
} // :cond_4
/* iget v0, p0, Lc/f/a/l/m;->m0:I */
/* if-eq v0, v2, :cond_5 */
/* .line 27 */
v0 = this.t;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v1 = this.v;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v2, p0, Lc/f/a/l/m;->m0:I */
/* neg-int v2, v2 */
(( c.f.a.l.q ) v0 ).a ( v4, v1, v2 ); // invoke-virtual {v0, v4, v1, v2}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 28 */
v0 = this.v;
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
p1 = this.v;
(( c.f.a.l.g ) p1 ).d ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v1, p0, Lc/f/a/l/m;->m0:I */
/* neg-int v1, v1 */
(( c.f.a.l.q ) v0 ).a ( v4, p1, v1 ); // invoke-virtual {v0, v4, p1, v1}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 29 */
} // :cond_5
/* iget v0, p0, Lc/f/a/l/m;->k0:F */
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_6
(( c.f.a.l.i ) p1 ).r ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->r()Lc/f/a/l/i$a;
v1 = c.f.a.l.i$a.b;
/* if-ne v0, v1, :cond_6 */
/* .line 30 */
/* iget v0, p1, Lc/f/a/l/i;->F:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lc/f/a/l/m;->k0:F */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
/* .line 31 */
v1 = this.t;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v2 = this.t;
(( c.f.a.l.g ) v2 ).d ( ); // invoke-virtual {v2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v1 ).a ( v4, v2, v0 ); // invoke-virtual {v1, v4, v2, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 32 */
v1 = this.v;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
p1 = this.t;
(( c.f.a.l.g ) p1 ).d ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v1 ).a ( v4, p1, v0 ); // invoke-virtual {v1, v4, p1, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
} // :cond_6
} // :goto_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 9 */
/* .line 33 */
(( c.f.a.l.i ) p0 ).l ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
/* check-cast v0, Lc/f/a/l/j; */
/* if-nez v0, :cond_0 */
return;
/* .line 34 */
} // :cond_0
v1 = c.f.a.l.g$b.c;
(( c.f.a.l.i ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
/* .line 35 */
v2 = c.f.a.l.g$b.e;
(( c.f.a.l.i ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
/* .line 36 */
v3 = this.D;
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
if ( v3 != null) { // if-eqz v3, :cond_1
v3 = this.C;
/* aget-object v3, v3, v5 */
v6 = c.f.a.l.i$a.c;
/* if-ne v3, v6, :cond_1 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 37 */
} // :goto_0
/* iget v6, p0, Lc/f/a/l/m;->o0:I */
/* if-nez v6, :cond_3 */
/* .line 38 */
v1 = c.f.a.l.g$b.d;
(( c.f.a.l.i ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
/* .line 39 */
v2 = c.f.a.l.g$b.f;
(( c.f.a.l.i ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
/* .line 40 */
v0 = this.D;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.C;
/* aget-object v0, v0, v4 */
v3 = c.f.a.l.i$a.c;
/* if-ne v0, v3, :cond_2 */
} // :cond_2
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
/* move v3, v4 */
/* .line 41 */
} // :cond_3
/* iget v0, p0, Lc/f/a/l/m;->l0:I */
int v4 = 6; // const/4 v4, 0x6
int v6 = -1; // const/4 v6, -0x1
int v7 = 5; // const/4 v7, 0x5
/* if-eq v0, v6, :cond_4 */
/* .line 42 */
v0 = this.n0;
(( c.f.a.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 43 */
(( c.f.a.f ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 44 */
/* iget v6, p0, Lc/f/a/l/m;->l0:I */
(( c.f.a.f ) p1 ).a ( v0, v1, v6, v4 ); // invoke-virtual {p1, v0, v1, v6, v4}, Lc/f/a/f;->a(Lc/f/a/k;Lc/f/a/k;II)Lc/f/a/b;
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 45 */
(( c.f.a.f ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
(( c.f.a.f ) p1 ).b ( v1, v0, v5, v7 ); // invoke-virtual {p1, v1, v0, v5, v7}, Lc/f/a/f;->b(Lc/f/a/k;Lc/f/a/k;II)V
/* .line 46 */
} // :cond_4
/* iget v0, p0, Lc/f/a/l/m;->m0:I */
/* if-eq v0, v6, :cond_5 */
/* .line 47 */
v0 = this.n0;
(( c.f.a.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 48 */
(( c.f.a.f ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 49 */
/* iget v6, p0, Lc/f/a/l/m;->m0:I */
/* neg-int v6, v6 */
(( c.f.a.f ) p1 ).a ( v0, v2, v6, v4 ); // invoke-virtual {p1, v0, v2, v6, v4}, Lc/f/a/f;->a(Lc/f/a/k;Lc/f/a/k;II)Lc/f/a/b;
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 50 */
(( c.f.a.f ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
(( c.f.a.f ) p1 ).b ( v0, v1, v5, v7 ); // invoke-virtual {p1, v0, v1, v5, v7}, Lc/f/a/f;->b(Lc/f/a/k;Lc/f/a/k;II)V
/* .line 51 */
(( c.f.a.f ) p1 ).b ( v2, v0, v5, v7 ); // invoke-virtual {p1, v2, v0, v5, v7}, Lc/f/a/f;->b(Lc/f/a/k;Lc/f/a/k;II)V
/* .line 52 */
} // :cond_5
/* iget v0, p0, Lc/f/a/l/m;->k0:F */
/* const/high16 v3, -0x40800000 # -1.0f */
/* cmpl-float v0, v0, v3 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 53 */
v0 = this.n0;
(( c.f.a.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 54 */
(( c.f.a.f ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 55 */
(( c.f.a.f ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 56 */
/* iget v7, p0, Lc/f/a/l/m;->k0:F */
/* iget-boolean v8, p0, Lc/f/a/l/m;->p0:Z */
/* move-object v3, p1 */
/* .line 57 */
/* invoke-static/range {v3 ..v8}, Lc/f/a/f;->a(Lc/f/a/f;Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;FZ)Lc/f/a/b; */
/* .line 58 */
(( c.f.a.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
} // :cond_6
} // :goto_2
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public java.util.ArrayList c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList<", */
/* "Lc/f/a/l/g;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.B;
} // .end method
public void c ( Object p0 ) {
/* .locals 3 */
/* .line 2 */
(( c.f.a.l.i ) p0 ).l ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
/* if-nez v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
v0 = this.n0;
p1 = (( c.f.a.f ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/f;->b(Ljava/lang/Object;)I
/* .line 4 */
/* iget v0, p0, Lc/f/a/l/m;->o0:I */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-ne v0, v1, :cond_1 */
/* .line 5 */
(( c.f.a.l.i ) p0 ).s ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/l/i;->s(I)V
/* .line 6 */
(( c.f.a.l.i ) p0 ).t ( v2 ); // invoke-virtual {p0, v2}, Lc/f/a/l/i;->t(I)V
/* .line 7 */
(( c.f.a.l.i ) p0 ).l ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
p1 = (( c.f.a.l.i ) p1 ).j ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->j()I
(( c.f.a.l.i ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/l/i;->h(I)V
/* .line 8 */
(( c.f.a.l.i ) p0 ).p ( v2 ); // invoke-virtual {p0, v2}, Lc/f/a/l/i;->p(I)V
/* .line 9 */
} // :cond_1
(( c.f.a.l.i ) p0 ).s ( v2 ); // invoke-virtual {p0, v2}, Lc/f/a/l/i;->s(I)V
/* .line 10 */
(( c.f.a.l.i ) p0 ).t ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/l/i;->t(I)V
/* .line 11 */
(( c.f.a.l.i ) p0 ).l ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
p1 = (( c.f.a.l.i ) p1 ).t ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->t()I
(( c.f.a.l.i ) p0 ).p ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/l/i;->p(I)V
/* .line 12 */
(( c.f.a.l.i ) p0 ).h ( v2 ); // invoke-virtual {p0, v2}, Lc/f/a/l/i;->h(I)V
} // :goto_0
return;
} // .end method
public void e ( Float p0 ) {
/* .locals 1 */
/* const/high16 v0, -0x40800000 # -1.0f */
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_0 */
/* .line 1 */
/* iput p1, p0, Lc/f/a/l/m;->k0:F */
int p1 = -1; // const/4 p1, -0x1
/* .line 2 */
/* iput p1, p0, Lc/f/a/l/m;->l0:I */
/* .line 3 */
/* iput p1, p0, Lc/f/a/l/m;->m0:I */
} // :cond_0
return;
} // .end method
public void u ( Integer p0 ) {
/* .locals 2 */
int v0 = -1; // const/4 v0, -0x1
/* if-le p1, v0, :cond_0 */
/* const/high16 v1, -0x40800000 # -1.0f */
/* .line 1 */
/* iput v1, p0, Lc/f/a/l/m;->k0:F */
/* .line 2 */
/* iput p1, p0, Lc/f/a/l/m;->l0:I */
/* .line 3 */
/* iput v0, p0, Lc/f/a/l/m;->m0:I */
} // :cond_0
return;
} // .end method
public void v ( Integer p0 ) {
/* .locals 2 */
int v0 = -1; // const/4 v0, -0x1
/* if-le p1, v0, :cond_0 */
/* const/high16 v1, -0x40800000 # -1.0f */
/* .line 1 */
/* iput v1, p0, Lc/f/a/l/m;->k0:F */
/* .line 2 */
/* iput v0, p0, Lc/f/a/l/m;->l0:I */
/* .line 3 */
/* iput p1, p0, Lc/f/a/l/m;->m0:I */
} // :cond_0
return;
} // .end method
public void w ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/l/m;->o0:I */
/* if-ne v0, p1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iput p1, p0, Lc/f/a/l/m;->o0:I */
/* .line 3 */
p1 = this.B;
(( java.util.ArrayList ) p1 ).clear ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
/* .line 4 */
/* iget p1, p0, Lc/f/a/l/m;->o0:I */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_1 */
/* .line 5 */
p1 = this.s;
this.n0 = p1;
/* .line 6 */
} // :cond_1
p1 = this.t;
this.n0 = p1;
/* .line 7 */
} // :goto_0
p1 = this.B;
v0 = this.n0;
(( java.util.ArrayList ) p1 ).add ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 8 */
p1 = this.A;
/* array-length p1, p1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* if-ge v0, p1, :cond_2 */
/* .line 9 */
v1 = this.A;
v2 = this.n0;
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
return;
} // .end method
