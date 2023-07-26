public abstract class c.f.a.l.o {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static a;
	 /* # direct methods */
	 public static c.f.a.l.o ( ) {
		 /* .locals 1 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Z */
		 /* .line 1 */
		 return;
	 } // .end method
	 public static void a ( Integer p0, Object p1 ) {
		 /* .locals 16 */
		 /* move-object/from16 v0, p1 */
		 /* .line 29 */
		 /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->J()V */
		 /* .line 30 */
		 v1 = this.s;
		 (( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
		 /* .line 31 */
		 v2 = this.t;
		 (( c.f.a.l.g ) v2 ).d ( ); // invoke-virtual {v2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
		 /* .line 32 */
		 v3 = this.u;
		 (( c.f.a.l.g ) v3 ).d ( ); // invoke-virtual {v3}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
		 /* .line 33 */
		 v4 = this.v;
		 (( c.f.a.l.g ) v4 ).d ( ); // invoke-virtual {v4}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
		 /* const/16 v5, 0x8 */
		 /* and-int/lit8 v6, p0, 0x8 */
		 int v7 = 0; // const/4 v7, 0x0
		 int v8 = 1; // const/4 v8, 0x1
		 /* if-ne v6, v5, :cond_0 */
		 int v6 = 1; // const/4 v6, 0x1
	 } // :cond_0
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 34 */
} // :goto_0
v9 = this.C;
/* aget-object v9, v9, v7 */
v10 = c.f.a.l.i$a.d;
/* if-ne v9, v10, :cond_1 */
/* .line 35 */
v9 = c.f.a.l.o .a ( v0,v7 );
if ( v9 != null) { // if-eqz v9, :cond_1
	 int v9 = 1; // const/4 v9, 0x1
} // :cond_1
int v9 = 0; // const/4 v9, 0x0
/* .line 36 */
} // :goto_1
/* iget v10, v1, Lc/f/a/l/q;->h:I */
int v11 = 3; // const/4 v11, 0x3
int v12 = 4; // const/4 v12, 0x4
int v13 = 0; // const/4 v13, 0x0
int v14 = -1; // const/4 v14, -0x1
int v15 = 2; // const/4 v15, 0x2
/* if-eq v10, v12, :cond_13 */
/* iget v10, v3, Lc/f/a/l/q;->h:I */
/* if-eq v10, v12, :cond_13 */
/* .line 37 */
v10 = this.C;
/* aget-object v10, v10, v7 */
v7 = c.f.a.l.i$a.b;
/* if-eq v10, v7, :cond_b */
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 38 */
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->s()I */
/* if-ne v7, v5, :cond_2 */
/* goto/16 :goto_2 */
} // :cond_2
if ( v9 != null) { // if-eqz v9, :cond_13
/* .line 39 */
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->t()I */
/* .line 40 */
(( c.f.a.l.q ) v1 ).b ( v8 ); // invoke-virtual {v1, v8}, Lc/f/a/l/q;->b(I)V
/* .line 41 */
(( c.f.a.l.q ) v3 ).b ( v8 ); // invoke-virtual {v3, v8}, Lc/f/a/l/q;->b(I)V
/* .line 42 */
v9 = this.s;
v9 = this.d;
/* if-nez v9, :cond_4 */
v9 = this.u;
v9 = this.d;
/* if-nez v9, :cond_4 */
if ( v6 != null) { // if-eqz v6, :cond_3
	 /* .line 43 */
	 /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
	 (( c.f.a.l.q ) v3 ).a ( v1, v8, v7 ); // invoke-virtual {v3, v1, v8, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
	 /* goto/16 :goto_3 */
	 /* .line 44 */
} // :cond_3
(( c.f.a.l.q ) v3 ).a ( v1, v7 ); // invoke-virtual {v3, v1, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* goto/16 :goto_3 */
/* .line 45 */
} // :cond_4
v9 = this.s;
v9 = this.d;
if ( v9 != null) { // if-eqz v9, :cond_6
v9 = this.u;
v9 = this.d;
/* if-nez v9, :cond_6 */
if ( v6 != null) { // if-eqz v6, :cond_5
	 /* .line 46 */
	 /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
	 (( c.f.a.l.q ) v3 ).a ( v1, v8, v7 ); // invoke-virtual {v3, v1, v8, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
	 /* goto/16 :goto_3 */
	 /* .line 47 */
} // :cond_5
(( c.f.a.l.q ) v3 ).a ( v1, v7 ); // invoke-virtual {v3, v1, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* goto/16 :goto_3 */
/* .line 48 */
} // :cond_6
v9 = this.s;
v9 = this.d;
/* if-nez v9, :cond_8 */
v9 = this.u;
v9 = this.d;
if ( v9 != null) { // if-eqz v9, :cond_8
if ( v6 != null) { // if-eqz v6, :cond_7
	 /* .line 49 */
	 /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
	 (( c.f.a.l.q ) v1 ).a ( v3, v14, v7 ); // invoke-virtual {v1, v3, v14, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
	 /* goto/16 :goto_3 */
} // :cond_7
/* neg-int v7, v7 */
/* .line 50 */
(( c.f.a.l.q ) v1 ).a ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* goto/16 :goto_3 */
/* .line 51 */
} // :cond_8
v9 = this.s;
v9 = this.d;
if ( v9 != null) { // if-eqz v9, :cond_13
v9 = this.u;
v9 = this.d;
if ( v9 != null) { // if-eqz v9, :cond_13
	 if ( v6 != null) { // if-eqz v6, :cond_9
		 /* .line 52 */
		 /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
		 (( c.f.a.l.s ) v9 ).a ( v1 ); // invoke-virtual {v9, v1}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
		 /* .line 53 */
		 /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
		 (( c.f.a.l.s ) v9 ).a ( v3 ); // invoke-virtual {v9, v3}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
		 /* .line 54 */
	 } // :cond_9
	 /* iget v9, v0, Lc/f/a/l/i;->G:F */
	 /* cmpl-float v9, v9, v13 */
	 /* if-nez v9, :cond_a */
	 /* .line 55 */
	 (( c.f.a.l.q ) v1 ).b ( v11 ); // invoke-virtual {v1, v11}, Lc/f/a/l/q;->b(I)V
	 /* .line 56 */
	 (( c.f.a.l.q ) v3 ).b ( v11 ); // invoke-virtual {v3, v11}, Lc/f/a/l/q;->b(I)V
	 /* .line 57 */
	 (( c.f.a.l.q ) v1 ).b ( v3, v13 ); // invoke-virtual {v1, v3, v13}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
	 /* .line 58 */
	 (( c.f.a.l.q ) v3 ).b ( v1, v13 ); // invoke-virtual {v3, v1, v13}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
	 /* goto/16 :goto_3 */
	 /* .line 59 */
} // :cond_a
(( c.f.a.l.q ) v1 ).b ( v15 ); // invoke-virtual {v1, v15}, Lc/f/a/l/q;->b(I)V
/* .line 60 */
(( c.f.a.l.q ) v3 ).b ( v15 ); // invoke-virtual {v3, v15}, Lc/f/a/l/q;->b(I)V
/* neg-int v9, v7 */
/* int-to-float v9, v9 */
/* .line 61 */
(( c.f.a.l.q ) v1 ).b ( v3, v9 ); // invoke-virtual {v1, v3, v9}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* int-to-float v9, v7 */
/* .line 62 */
(( c.f.a.l.q ) v3 ).b ( v1, v9 ); // invoke-virtual {v3, v1, v9}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* .line 63 */
(( c.f.a.l.i ) v0 ).p ( v7 ); // invoke-virtual {v0, v7}, Lc/f/a/l/i;->p(I)V
/* goto/16 :goto_3 */
/* .line 64 */
} // :cond_b
} // :goto_2
v7 = this.s;
v7 = this.d;
/* if-nez v7, :cond_d */
v7 = this.u;
v7 = this.d;
/* if-nez v7, :cond_d */
/* .line 65 */
(( c.f.a.l.q ) v1 ).b ( v8 ); // invoke-virtual {v1, v8}, Lc/f/a/l/q;->b(I)V
/* .line 66 */
(( c.f.a.l.q ) v3 ).b ( v8 ); // invoke-virtual {v3, v8}, Lc/f/a/l/q;->b(I)V
if ( v6 != null) { // if-eqz v6, :cond_c
/* .line 67 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.q ) v3 ).a ( v1, v8, v7 ); // invoke-virtual {v3, v1, v8, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* goto/16 :goto_3 */
/* .line 68 */
} // :cond_c
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->t()I */
(( c.f.a.l.q ) v3 ).a ( v1, v7 ); // invoke-virtual {v3, v1, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* goto/16 :goto_3 */
/* .line 69 */
} // :cond_d
v7 = this.s;
v7 = this.d;
if ( v7 != null) { // if-eqz v7, :cond_f
v7 = this.u;
v7 = this.d;
/* if-nez v7, :cond_f */
/* .line 70 */
(( c.f.a.l.q ) v1 ).b ( v8 ); // invoke-virtual {v1, v8}, Lc/f/a/l/q;->b(I)V
/* .line 71 */
(( c.f.a.l.q ) v3 ).b ( v8 ); // invoke-virtual {v3, v8}, Lc/f/a/l/q;->b(I)V
if ( v6 != null) { // if-eqz v6, :cond_e
/* .line 72 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.q ) v3 ).a ( v1, v8, v7 ); // invoke-virtual {v3, v1, v8, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* goto/16 :goto_3 */
/* .line 73 */
} // :cond_e
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->t()I */
(( c.f.a.l.q ) v3 ).a ( v1, v7 ); // invoke-virtual {v3, v1, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* .line 74 */
} // :cond_f
v7 = this.s;
v7 = this.d;
/* if-nez v7, :cond_11 */
v7 = this.u;
v7 = this.d;
if ( v7 != null) { // if-eqz v7, :cond_11
/* .line 75 */
(( c.f.a.l.q ) v1 ).b ( v8 ); // invoke-virtual {v1, v8}, Lc/f/a/l/q;->b(I)V
/* .line 76 */
(( c.f.a.l.q ) v3 ).b ( v8 ); // invoke-virtual {v3, v8}, Lc/f/a/l/q;->b(I)V
/* .line 77 */
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->t()I */
/* neg-int v7, v7 */
(( c.f.a.l.q ) v1 ).a ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
if ( v6 != null) { // if-eqz v6, :cond_10
/* .line 78 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.q ) v1 ).a ( v3, v14, v7 ); // invoke-virtual {v1, v3, v14, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 79 */
} // :cond_10
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->t()I */
/* neg-int v7, v7 */
(( c.f.a.l.q ) v1 ).a ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* .line 80 */
} // :cond_11
v7 = this.s;
v7 = this.d;
if ( v7 != null) { // if-eqz v7, :cond_13
v7 = this.u;
v7 = this.d;
if ( v7 != null) { // if-eqz v7, :cond_13
/* .line 81 */
(( c.f.a.l.q ) v1 ).b ( v15 ); // invoke-virtual {v1, v15}, Lc/f/a/l/q;->b(I)V
/* .line 82 */
(( c.f.a.l.q ) v3 ).b ( v15 ); // invoke-virtual {v3, v15}, Lc/f/a/l/q;->b(I)V
if ( v6 != null) { // if-eqz v6, :cond_12
/* .line 83 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.s ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
/* .line 84 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.s ) v7 ).a ( v3 ); // invoke-virtual {v7, v3}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
/* .line 85 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.q ) v1 ).b ( v3, v14, v7 ); // invoke-virtual {v1, v3, v14, v7}, Lc/f/a/l/q;->b(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 86 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.q ) v3 ).b ( v1, v8, v7 ); // invoke-virtual {v3, v1, v8, v7}, Lc/f/a/l/q;->b(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 87 */
} // :cond_12
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->t()I */
/* neg-int v7, v7 */
/* int-to-float v7, v7 */
(( c.f.a.l.q ) v1 ).b ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* .line 88 */
v7 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->t()I */
/* int-to-float v7, v7 */
(( c.f.a.l.q ) v3 ).b ( v1, v7 ); // invoke-virtual {v3, v1, v7}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* .line 89 */
} // :cond_13
} // :goto_3
v1 = this.C;
/* aget-object v1, v1, v8 */
v3 = c.f.a.l.i$a.d;
/* if-ne v1, v3, :cond_14 */
/* .line 90 */
v1 = c.f.a.l.o .a ( v0,v8 );
if ( v1 != null) { // if-eqz v1, :cond_14
int v7 = 1; // const/4 v7, 0x1
} // :cond_14
int v7 = 0; // const/4 v7, 0x0
/* .line 91 */
} // :goto_4
/* iget v1, v2, Lc/f/a/l/q;->h:I */
/* if-eq v1, v12, :cond_26 */
/* iget v1, v4, Lc/f/a/l/q;->h:I */
/* if-eq v1, v12, :cond_26 */
/* .line 92 */
v1 = this.C;
/* aget-object v1, v1, v8 */
v3 = c.f.a.l.i$a.b;
/* if-eq v1, v3, :cond_1e */
if ( v7 != null) { // if-eqz v7, :cond_15
/* .line 93 */
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->s()I */
/* if-ne v1, v5, :cond_15 */
/* goto/16 :goto_5 */
} // :cond_15
if ( v7 != null) { // if-eqz v7, :cond_26
/* .line 94 */
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->j()I */
/* .line 95 */
(( c.f.a.l.q ) v2 ).b ( v8 ); // invoke-virtual {v2, v8}, Lc/f/a/l/q;->b(I)V
/* .line 96 */
(( c.f.a.l.q ) v4 ).b ( v8 ); // invoke-virtual {v4, v8}, Lc/f/a/l/q;->b(I)V
/* .line 97 */
v3 = this.t;
v3 = this.d;
/* if-nez v3, :cond_17 */
v3 = this.v;
v3 = this.d;
/* if-nez v3, :cond_17 */
if ( v6 != null) { // if-eqz v6, :cond_16
/* .line 98 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v4 ).a ( v2, v8, v0 ); // invoke-virtual {v4, v2, v8, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* goto/16 :goto_a */
/* .line 99 */
} // :cond_16
(( c.f.a.l.q ) v4 ).a ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* goto/16 :goto_a */
/* .line 100 */
} // :cond_17
v3 = this.t;
v3 = this.d;
if ( v3 != null) { // if-eqz v3, :cond_19
v3 = this.v;
v3 = this.d;
/* if-nez v3, :cond_19 */
if ( v6 != null) { // if-eqz v6, :cond_18
/* .line 101 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v4 ).a ( v2, v8, v0 ); // invoke-virtual {v4, v2, v8, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* goto/16 :goto_a */
/* .line 102 */
} // :cond_18
(( c.f.a.l.q ) v4 ).a ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* goto/16 :goto_a */
/* .line 103 */
} // :cond_19
v3 = this.t;
v3 = this.d;
/* if-nez v3, :cond_1b */
v3 = this.v;
v3 = this.d;
if ( v3 != null) { // if-eqz v3, :cond_1b
if ( v6 != null) { // if-eqz v6, :cond_1a
/* .line 104 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v2 ).a ( v4, v14, v0 ); // invoke-virtual {v2, v4, v14, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* goto/16 :goto_a */
} // :cond_1a
/* neg-int v0, v1 */
/* .line 105 */
(( c.f.a.l.q ) v2 ).a ( v4, v0 ); // invoke-virtual {v2, v4, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* goto/16 :goto_a */
/* .line 106 */
} // :cond_1b
v3 = this.t;
v3 = this.d;
if ( v3 != null) { // if-eqz v3, :cond_26
v3 = this.v;
v3 = this.d;
if ( v3 != null) { // if-eqz v3, :cond_26
if ( v6 != null) { // if-eqz v6, :cond_1c
/* .line 107 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.s ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
/* .line 108 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.s ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
/* .line 109 */
} // :cond_1c
/* iget v3, v0, Lc/f/a/l/i;->G:F */
/* cmpl-float v3, v3, v13 */
/* if-nez v3, :cond_1d */
/* .line 110 */
(( c.f.a.l.q ) v2 ).b ( v11 ); // invoke-virtual {v2, v11}, Lc/f/a/l/q;->b(I)V
/* .line 111 */
(( c.f.a.l.q ) v4 ).b ( v11 ); // invoke-virtual {v4, v11}, Lc/f/a/l/q;->b(I)V
/* .line 112 */
(( c.f.a.l.q ) v2 ).b ( v4, v13 ); // invoke-virtual {v2, v4, v13}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* .line 113 */
(( c.f.a.l.q ) v4 ).b ( v2, v13 ); // invoke-virtual {v4, v2, v13}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* goto/16 :goto_a */
/* .line 114 */
} // :cond_1d
(( c.f.a.l.q ) v2 ).b ( v15 ); // invoke-virtual {v2, v15}, Lc/f/a/l/q;->b(I)V
/* .line 115 */
(( c.f.a.l.q ) v4 ).b ( v15 ); // invoke-virtual {v4, v15}, Lc/f/a/l/q;->b(I)V
/* neg-int v3, v1 */
/* int-to-float v3, v3 */
/* .line 116 */
(( c.f.a.l.q ) v2 ).b ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* int-to-float v3, v1 */
/* .line 117 */
(( c.f.a.l.q ) v4 ).b ( v2, v3 ); // invoke-virtual {v4, v2, v3}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* .line 118 */
(( c.f.a.l.i ) v0 ).h ( v1 ); // invoke-virtual {v0, v1}, Lc/f/a/l/i;->h(I)V
/* .line 119 */
/* iget v1, v0, Lc/f/a/l/i;->Q:I */
/* if-lez v1, :cond_26 */
/* .line 120 */
v1 = this.w;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v0, v0, Lc/f/a/l/i;->Q:I */
(( c.f.a.l.q ) v1 ).a ( v8, v2, v0 ); // invoke-virtual {v1, v8, v2, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* goto/16 :goto_a */
/* .line 121 */
} // :cond_1e
} // :goto_5
v1 = this.t;
v1 = this.d;
/* if-nez v1, :cond_20 */
v1 = this.v;
v1 = this.d;
/* if-nez v1, :cond_20 */
/* .line 122 */
(( c.f.a.l.q ) v2 ).b ( v8 ); // invoke-virtual {v2, v8}, Lc/f/a/l/q;->b(I)V
/* .line 123 */
(( c.f.a.l.q ) v4 ).b ( v8 ); // invoke-virtual {v4, v8}, Lc/f/a/l/q;->b(I)V
if ( v6 != null) { // if-eqz v6, :cond_1f
/* .line 124 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v4 ).a ( v2, v8, v1 ); // invoke-virtual {v4, v2, v8, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 125 */
} // :cond_1f
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->j()I */
(( c.f.a.l.q ) v4 ).a ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* .line 126 */
} // :goto_6
v1 = this.w;
v3 = this.d;
if ( v3 != null) { // if-eqz v3, :cond_26
/* .line 127 */
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v1 ).b ( v8 ); // invoke-virtual {v1, v8}, Lc/f/a/l/q;->b(I)V
/* .line 128 */
v1 = this.w;
/* .line 129 */
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v0, v0, Lc/f/a/l/i;->Q:I */
/* neg-int v0, v0 */
/* .line 130 */
(( c.f.a.l.q ) v2 ).a ( v8, v1, v0 ); // invoke-virtual {v2, v8, v1, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* goto/16 :goto_a */
/* .line 131 */
} // :cond_20
v1 = this.t;
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_22
v1 = this.v;
v1 = this.d;
/* if-nez v1, :cond_22 */
/* .line 132 */
(( c.f.a.l.q ) v2 ).b ( v8 ); // invoke-virtual {v2, v8}, Lc/f/a/l/q;->b(I)V
/* .line 133 */
(( c.f.a.l.q ) v4 ).b ( v8 ); // invoke-virtual {v4, v8}, Lc/f/a/l/q;->b(I)V
if ( v6 != null) { // if-eqz v6, :cond_21
/* .line 134 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v4 ).a ( v2, v8, v1 ); // invoke-virtual {v4, v2, v8, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 135 */
} // :cond_21
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->j()I */
(( c.f.a.l.q ) v4 ).a ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* .line 136 */
} // :goto_7
/* iget v1, v0, Lc/f/a/l/i;->Q:I */
/* if-lez v1, :cond_26 */
/* .line 137 */
v1 = this.w;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v0, v0, Lc/f/a/l/i;->Q:I */
(( c.f.a.l.q ) v1 ).a ( v8, v2, v0 ); // invoke-virtual {v1, v8, v2, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* goto/16 :goto_a */
/* .line 138 */
} // :cond_22
v1 = this.t;
v1 = this.d;
/* if-nez v1, :cond_24 */
v1 = this.v;
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_24
/* .line 139 */
(( c.f.a.l.q ) v2 ).b ( v8 ); // invoke-virtual {v2, v8}, Lc/f/a/l/q;->b(I)V
/* .line 140 */
(( c.f.a.l.q ) v4 ).b ( v8 ); // invoke-virtual {v4, v8}, Lc/f/a/l/q;->b(I)V
if ( v6 != null) { // if-eqz v6, :cond_23
/* .line 141 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v2 ).a ( v4, v14, v1 ); // invoke-virtual {v2, v4, v14, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 142 */
} // :cond_23
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->j()I */
/* neg-int v1, v1 */
(( c.f.a.l.q ) v2 ).a ( v4, v1 ); // invoke-virtual {v2, v4, v1}, Lc/f/a/l/q;->a(Lc/f/a/l/q;I)V
/* .line 143 */
} // :goto_8
/* iget v1, v0, Lc/f/a/l/i;->Q:I */
/* if-lez v1, :cond_26 */
/* .line 144 */
v1 = this.w;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v0, v0, Lc/f/a/l/i;->Q:I */
(( c.f.a.l.q ) v1 ).a ( v8, v2, v0 ); // invoke-virtual {v1, v8, v2, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
/* .line 145 */
} // :cond_24
v1 = this.t;
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_26
v1 = this.v;
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_26
/* .line 146 */
(( c.f.a.l.q ) v2 ).b ( v15 ); // invoke-virtual {v2, v15}, Lc/f/a/l/q;->b(I)V
/* .line 147 */
(( c.f.a.l.q ) v4 ).b ( v15 ); // invoke-virtual {v4, v15}, Lc/f/a/l/q;->b(I)V
if ( v6 != null) { // if-eqz v6, :cond_25
/* .line 148 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v2 ).b ( v4, v14, v1 ); // invoke-virtual {v2, v4, v14, v1}, Lc/f/a/l/q;->b(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 149 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.q ) v4 ).b ( v2, v8, v1 ); // invoke-virtual {v4, v2, v8, v1}, Lc/f/a/l/q;->b(Lc/f/a/l/q;ILc/f/a/l/r;)V
/* .line 150 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->m()Lc/f/a/l/r; */
(( c.f.a.l.s ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
/* .line 151 */
/* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->n()Lc/f/a/l/r; */
(( c.f.a.l.s ) v1 ).a ( v4 ); // invoke-virtual {v1, v4}, Lc/f/a/l/s;->a(Lc/f/a/l/s;)V
/* .line 152 */
} // :cond_25
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->j()I */
/* neg-int v1, v1 */
/* int-to-float v1, v1 */
(( c.f.a.l.q ) v2 ).b ( v4, v1 ); // invoke-virtual {v2, v4, v1}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* .line 153 */
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/f/a/l/i;->j()I */
/* int-to-float v1, v1 */
(( c.f.a.l.q ) v4 ).b ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Lc/f/a/l/q;->b(Lc/f/a/l/q;F)V
/* .line 154 */
} // :goto_9
/* iget v1, v0, Lc/f/a/l/i;->Q:I */
/* if-lez v1, :cond_26 */
/* .line 155 */
v1 = this.w;
(( c.f.a.l.g ) v1 ).d ( ); // invoke-virtual {v1}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iget v0, v0, Lc/f/a/l/i;->Q:I */
(( c.f.a.l.q ) v1 ).a ( v8, v2, v0 ); // invoke-virtual {v1, v8, v2, v0}, Lc/f/a/l/q;->a(ILc/f/a/l/q;I)V
} // :cond_26
} // :goto_a
return;
} // .end method
public static void a ( Object p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* mul-int/lit8 v0, p1, 0x2 */
/* add-int/lit8 v1, v0, 0x1 */
/* .line 242 */
v2 = this.A;
/* aget-object v2, v2, v0 */
(( c.f.a.l.g ) v2 ).d ( ); // invoke-virtual {v2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* .line 243 */
(( c.f.a.l.i ) p0 ).l ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
v3 = this.s;
(( c.f.a.l.g ) v3 ).d ( ); // invoke-virtual {v3}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
this.f = v3;
/* .line 244 */
v2 = this.A;
/* aget-object v2, v2, v0 */
(( c.f.a.l.g ) v2 ).d ( ); // invoke-virtual {v2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* int-to-float p2, p2 */
/* iput p2, v2, Lc/f/a/l/q;->g:F */
/* .line 245 */
p2 = this.A;
/* aget-object p2, p2, v0 */
(( c.f.a.l.g ) p2 ).d ( ); // invoke-virtual {p2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
int v2 = 1; // const/4 v2, 0x1
/* iput v2, p2, Lc/f/a/l/s;->b:I */
/* .line 246 */
p2 = this.A;
/* aget-object p2, p2, v1 */
(( c.f.a.l.g ) p2 ).d ( ); // invoke-virtual {p2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v3 = this.A;
/* aget-object v0, v3, v0 */
/* .line 247 */
(( c.f.a.l.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
this.f = v0;
/* .line 248 */
p2 = this.A;
/* aget-object p2, p2, v1 */
(( c.f.a.l.g ) p2 ).d ( ); // invoke-virtual {p2}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* .line 249 */
p1 = (( c.f.a.l.i ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/l/i;->d(I)I
/* int-to-float p1, p1 */
/* iput p1, p2, Lc/f/a/l/q;->g:F */
/* .line 250 */
p0 = this.A;
/* aget-object p0, p0, v1 */
(( c.f.a.l.g ) p0 ).d ( ); // invoke-virtual {p0}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* iput v2, p0, Lc/f/a/l/s;->b:I */
return;
} // .end method
public static void a ( Object p0, Object p1, Object p2 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.C;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
v2 = c.f.a.l.i$a.c;
int v3 = 2; // const/4 v3, 0x2
/* if-eq v0, v2, :cond_0 */
v0 = this.C;
/* aget-object v0, v0, v1 */
v1 = c.f.a.l.i$a.e;
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
v0 = this.s;
/* iget v0, v0, Lc/f/a/l/g;->e:I */
/* .line 3 */
v1 = (( c.f.a.l.i ) p0 ).t ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->t()I
v2 = this.u;
/* iget v2, v2, Lc/f/a/l/g;->e:I */
/* sub-int/2addr v1, v2 */
/* .line 4 */
v2 = this.s;
(( c.f.a.f ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
this.i = v4;
/* .line 5 */
v2 = this.u;
(( c.f.a.f ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
this.i = v4;
/* .line 6 */
v2 = this.s;
v2 = this.i;
(( c.f.a.f ) p1 ).a ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Lc/f/a/f;->a(Lc/f/a/k;I)V
/* .line 7 */
v2 = this.u;
v2 = this.i;
(( c.f.a.f ) p1 ).a ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lc/f/a/f;->a(Lc/f/a/k;I)V
/* .line 8 */
/* iput v3, p2, Lc/f/a/l/i;->a:I */
/* .line 9 */
(( c.f.a.l.i ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lc/f/a/l/i;->a(II)V
/* .line 10 */
} // :cond_0
v0 = this.C;
int v1 = 1; // const/4 v1, 0x1
/* aget-object v0, v0, v1 */
v2 = c.f.a.l.i$a.c;
/* if-eq v0, v2, :cond_3 */
v0 = this.C;
/* aget-object v0, v0, v1 */
v1 = c.f.a.l.i$a.e;
/* if-ne v0, v1, :cond_3 */
/* .line 11 */
v0 = this.t;
/* iget v0, v0, Lc/f/a/l/g;->e:I */
/* .line 12 */
p0 = (( c.f.a.l.i ) p0 ).j ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->j()I
v1 = this.v;
/* iget v1, v1, Lc/f/a/l/g;->e:I */
/* sub-int/2addr p0, v1 */
/* .line 13 */
v1 = this.t;
(( c.f.a.f ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
this.i = v2;
/* .line 14 */
v1 = this.v;
(( c.f.a.f ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
this.i = v2;
/* .line 15 */
v1 = this.t;
v1 = this.i;
(( c.f.a.f ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lc/f/a/f;->a(Lc/f/a/k;I)V
/* .line 16 */
v1 = this.v;
v1 = this.i;
(( c.f.a.f ) p1 ).a ( v1, p0 ); // invoke-virtual {p1, v1, p0}, Lc/f/a/f;->a(Lc/f/a/k;I)V
/* .line 17 */
/* iget v1, p2, Lc/f/a/l/i;->Q:I */
/* if-gtz v1, :cond_1 */
v1 = (( c.f.a.l.i ) p2 ).s ( ); // invoke-virtual {p2}, Lc/f/a/l/i;->s()I
/* const/16 v2, 0x8 */
/* if-ne v1, v2, :cond_2 */
/* .line 18 */
} // :cond_1
v1 = this.w;
(( c.f.a.f ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
this.i = v2;
/* .line 19 */
v1 = this.w;
v1 = this.i;
/* iget v2, p2, Lc/f/a/l/i;->Q:I */
/* add-int/2addr v2, v0 */
(( c.f.a.f ) p1 ).a ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lc/f/a/f;->a(Lc/f/a/k;I)V
/* .line 20 */
} // :cond_2
/* iput v3, p2, Lc/f/a/l/i;->b:I */
/* .line 21 */
(( c.f.a.l.i ) p2 ).e ( v0, p0 ); // invoke-virtual {p2, v0, p0}, Lc/f/a/l/i;->e(II)V
} // :cond_3
return;
} // .end method
public static Boolean a ( Object p0, Integer p1 ) {
/* .locals 5 */
/* .line 22 */
v0 = this.C;
/* aget-object v1, v0, p1 */
v2 = c.f.a.l.i$a.d;
int v3 = 0; // const/4 v3, 0x0
/* if-eq v1, v2, :cond_0 */
/* .line 23 */
} // :cond_0
/* iget v1, p0, Lc/f/a/l/i;->G:F */
int v2 = 0; // const/4 v2, 0x0
int v4 = 1; // const/4 v4, 0x1
/* cmpl-float v1, v1, v2 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* if-nez p1, :cond_1 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* .line 24 */
} // :goto_0
/* aget-object p0, v0, v4 */
p1 = c.f.a.l.i$a.d;
/* if-ne p0, p1, :cond_2 */
} // :cond_2
} // :cond_3
/* if-nez p1, :cond_6 */
/* .line 25 */
/* iget p1, p0, Lc/f/a/l/i;->e:I */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 26 */
} // :cond_4
/* iget p1, p0, Lc/f/a/l/i;->h:I */
/* if-nez p1, :cond_5 */
/* iget p0, p0, Lc/f/a/l/i;->i:I */
if ( p0 != null) { // if-eqz p0, :cond_8
} // :cond_5
/* .line 27 */
} // :cond_6
/* iget p1, p0, Lc/f/a/l/i;->f:I */
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 28 */
} // :cond_7
/* iget p1, p0, Lc/f/a/l/i;->k:I */
/* if-nez p1, :cond_9 */
/* iget p0, p0, Lc/f/a/l/i;->l:I */
if ( p0 != null) { // if-eqz p0, :cond_8
} // :cond_8
} // :cond_9
} // :goto_1
} // .end method
public static Boolean a ( Object p0, Object p1, Integer p2, Integer p3, Object p4 ) {
/* .locals 24 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
/* move-object/from16 v2, p4 */
/* .line 156 */
v3 = this.a;
/* .line 157 */
v4 = this.c;
/* .line 158 */
v5 = this.b;
/* .line 159 */
v6 = this.d;
/* .line 160 */
v7 = this.e;
/* .line 161 */
/* iget v8, v2, Lc/f/a/l/d;->k:F */
/* .line 162 */
v9 = this.f;
/* .line 163 */
v2 = this.g;
/* move-object/from16 v9, p0 */
/* .line 164 */
v2 = this.C;
/* aget-object v2, v2, v1 */
v9 = c.f.a.l.i$a.c;
int v2 = 2; // const/4 v2, 0x2
int v10 = 1; // const/4 v10, 0x1
/* if-nez v1, :cond_3 */
/* .line 165 */
/* iget v11, v7, Lc/f/a/l/i;->e0:I */
/* if-nez v11, :cond_0 */
int v11 = 1; // const/4 v11, 0x1
} // :cond_0
int v11 = 0; // const/4 v11, 0x0
/* .line 166 */
} // :goto_0
/* iget v12, v7, Lc/f/a/l/i;->e0:I */
/* if-ne v12, v10, :cond_1 */
int v12 = 1; // const/4 v12, 0x1
} // :cond_1
int v12 = 0; // const/4 v12, 0x0
/* .line 167 */
} // :goto_1
/* iget v7, v7, Lc/f/a/l/i;->e0:I */
/* if-ne v7, v2, :cond_2 */
} // :goto_2
int v2 = 1; // const/4 v2, 0x1
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 168 */
} // :cond_3
/* iget v11, v7, Lc/f/a/l/i;->f0:I */
/* if-nez v11, :cond_4 */
int v11 = 1; // const/4 v11, 0x1
} // :cond_4
int v11 = 0; // const/4 v11, 0x0
/* .line 169 */
} // :goto_3
/* iget v12, v7, Lc/f/a/l/i;->f0:I */
/* if-ne v12, v10, :cond_5 */
int v12 = 1; // const/4 v12, 0x1
} // :cond_5
int v12 = 0; // const/4 v12, 0x0
/* .line 170 */
} // :goto_4
/* iget v7, v7, Lc/f/a/l/i;->f0:I */
/* if-ne v7, v2, :cond_2 */
} // :goto_5
/* move-object v14, v3 */
int v10 = 0; // const/4 v10, 0x0
int v13 = 0; // const/4 v13, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
} // :goto_6
/* const/16 v7, 0x8 */
/* if-nez v13, :cond_14 */
/* .line 171 */
v9 = (( c.f.a.l.i ) v14 ).s ( ); // invoke-virtual {v14}, Lc/f/a/l/i;->s()I
/* if-eq v9, v7, :cond_9 */
/* add-int/lit8 v15, v15, 0x1 */
/* if-nez v1, :cond_6 */
/* .line 172 */
v9 = (( c.f.a.l.i ) v14 ).t ( ); // invoke-virtual {v14}, Lc/f/a/l/i;->t()I
/* .line 173 */
} // :cond_6
v9 = (( c.f.a.l.i ) v14 ).j ( ); // invoke-virtual {v14}, Lc/f/a/l/i;->j()I
} // :goto_7
/* int-to-float v9, v9 */
/* add-float v16, v16, v9 */
/* if-eq v14, v5, :cond_7 */
/* .line 174 */
v9 = this.A;
/* aget-object v9, v9, p3 */
v9 = (( c.f.a.l.g ) v9 ).b ( ); // invoke-virtual {v9}, Lc/f/a/l/g;->b()I
/* int-to-float v9, v9 */
/* add-float v16, v16, v9 */
} // :cond_7
/* if-eq v14, v6, :cond_8 */
/* .line 175 */
v9 = this.A;
/* add-int/lit8 v19, p3, 0x1 */
/* aget-object v9, v9, v19 */
v9 = (( c.f.a.l.g ) v9 ).b ( ); // invoke-virtual {v9}, Lc/f/a/l/g;->b()I
/* int-to-float v9, v9 */
/* add-float v16, v16, v9 */
/* .line 176 */
} // :cond_8
v9 = this.A;
/* aget-object v9, v9, p3 */
v9 = (( c.f.a.l.g ) v9 ).b ( ); // invoke-virtual {v9}, Lc/f/a/l/g;->b()I
/* int-to-float v9, v9 */
/* add-float v17, v17, v9 */
/* .line 177 */
v9 = this.A;
/* add-int/lit8 v19, p3, 0x1 */
/* aget-object v9, v9, v19 */
v9 = (( c.f.a.l.g ) v9 ).b ( ); // invoke-virtual {v9}, Lc/f/a/l/g;->b()I
/* int-to-float v9, v9 */
/* add-float v17, v17, v9 */
/* .line 178 */
} // :cond_9
v9 = this.A;
/* aget-object v9, v9, p3 */
/* .line 179 */
v9 = (( c.f.a.l.i ) v14 ).s ( ); // invoke-virtual {v14}, Lc/f/a/l/i;->s()I
/* if-eq v9, v7, :cond_10 */
v7 = this.C;
/* aget-object v7, v7, v1 */
v9 = c.f.a.l.i$a.d;
/* if-ne v7, v9, :cond_10 */
/* add-int/lit8 v10, v10, 0x1 */
/* if-nez v1, :cond_c */
/* .line 180 */
/* iget v7, v14, Lc/f/a/l/i;->e:I */
if ( v7 != null) { // if-eqz v7, :cond_a
int v7 = 0; // const/4 v7, 0x0
} // :cond_a
int v7 = 0; // const/4 v7, 0x0
/* .line 181 */
/* iget v9, v14, Lc/f/a/l/i;->h:I */
/* if-nez v9, :cond_b */
/* iget v9, v14, Lc/f/a/l/i;->i:I */
if ( v9 != null) { // if-eqz v9, :cond_e
} // :cond_b
} // :cond_c
int v7 = 0; // const/4 v7, 0x0
/* .line 182 */
/* iget v9, v14, Lc/f/a/l/i;->f:I */
if ( v9 != null) { // if-eqz v9, :cond_d
/* .line 183 */
} // :cond_d
/* iget v9, v14, Lc/f/a/l/i;->k:I */
/* if-nez v9, :cond_f */
/* iget v9, v14, Lc/f/a/l/i;->l:I */
if ( v9 != null) { // if-eqz v9, :cond_e
/* .line 184 */
} // :cond_e
/* iget v9, v14, Lc/f/a/l/i;->G:F */
/* const/16 v18, 0x0 */
/* cmpl-float v9, v9, v18 */
if ( v9 != null) { // if-eqz v9, :cond_10
} // :cond_f
} // :goto_8
/* .line 185 */
} // :cond_10
v7 = this.A;
/* add-int/lit8 v9, p3, 0x1 */
/* aget-object v7, v7, v9 */
v7 = this.d;
if ( v7 != null) { // if-eqz v7, :cond_12
/* .line 186 */
v7 = this.b;
/* .line 187 */
v9 = this.A;
/* move-object/from16 v20, v7 */
/* aget-object v7, v9, p3 */
v7 = this.d;
if ( v7 != null) { // if-eqz v7, :cond_12
/* aget-object v7, v9, p3 */
v7 = this.d;
v7 = this.b;
/* if-eq v7, v14, :cond_11 */
} // :cond_11
/* move-object/from16 v9, v20 */
} // :cond_12
} // :goto_9
int v9 = 0; // const/4 v9, 0x0
} // :goto_a
if ( v9 != null) { // if-eqz v9, :cond_13
/* move-object v14, v9 */
/* goto/16 :goto_6 */
} // :cond_13
int v13 = 1; // const/4 v13, 0x1
/* goto/16 :goto_6 */
/* .line 188 */
} // :cond_14
v9 = this.A;
/* aget-object v9, v9, p3 */
(( c.f.a.l.g ) v9 ).d ( ); // invoke-virtual {v9}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* .line 189 */
v13 = this.A;
/* add-int/lit8 v19, p3, 0x1 */
/* aget-object v13, v13, v19 */
(( c.f.a.l.g ) v13 ).d ( ); // invoke-virtual {v13}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* .line 190 */
v7 = this.d;
if ( v7 != null) { // if-eqz v7, :cond_3b
/* move-object/from16 v21, v3 */
v3 = this.d;
/* if-nez v3, :cond_15 */
/* goto/16 :goto_1f */
/* .line 191 */
} // :cond_15
/* iget v7, v7, Lc/f/a/l/s;->b:I */
int v0 = 1; // const/4 v0, 0x1
/* if-ne v7, v0, :cond_3a */
/* iget v3, v3, Lc/f/a/l/s;->b:I */
/* if-eq v3, v0, :cond_16 */
/* goto/16 :goto_1e */
} // :cond_16
/* if-lez v10, :cond_17 */
/* if-eq v10, v15, :cond_17 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_17
/* if-nez v2, :cond_19 */
/* if-nez v11, :cond_19 */
if ( v12 != null) { // if-eqz v12, :cond_18
} // :cond_18
int v0 = 0; // const/4 v0, 0x0
} // :cond_19
} // :goto_b
if ( v5 != null) { // if-eqz v5, :cond_1a
/* .line 192 */
v0 = this.A;
/* aget-object v0, v0, p3 */
v0 = (( c.f.a.l.g ) v0 ).b ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->b()I
/* int-to-float v0, v0 */
} // :cond_1a
int v0 = 0; // const/4 v0, 0x0
} // :goto_c
if ( v6 != null) { // if-eqz v6, :cond_1b
/* .line 193 */
v3 = this.A;
/* aget-object v3, v3, v19 */
v3 = (( c.f.a.l.g ) v3 ).b ( ); // invoke-virtual {v3}, Lc/f/a/l/g;->b()I
/* int-to-float v3, v3 */
/* add-float/2addr v0, v3 */
/* .line 194 */
} // :cond_1b
} // :goto_d
v3 = this.d;
/* iget v3, v3, Lc/f/a/l/q;->g:F */
/* .line 195 */
v6 = this.d;
/* iget v6, v6, Lc/f/a/l/q;->g:F */
/* cmpg-float v7, v3, v6 */
/* if-gez v7, :cond_1c */
/* sub-float/2addr v6, v3 */
} // :cond_1c
/* sub-float v6, v3, v6 */
} // :goto_e
/* sub-float v6, v6, v16 */
/* const-wide/16 v22, 0x1 */
/* if-lez v10, :cond_25 */
/* if-ne v10, v15, :cond_25 */
/* .line 196 */
(( c.f.a.l.i ) v14 ).l ( ); // invoke-virtual {v14}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
if ( v0 != null) { // if-eqz v0, :cond_1d
(( c.f.a.l.i ) v14 ).l ( ); // invoke-virtual {v14}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
v0 = this.C;
/* aget-object v0, v0, v1 */
v2 = c.f.a.l.i$a.c;
/* if-ne v0, v2, :cond_1d */
int v0 = 0; // const/4 v0, 0x0
} // :cond_1d
/* add-float v6, v6, v16 */
/* sub-float v6, v6, v17 */
/* move v0, v3 */
/* move-object/from16 v3, v21 */
} // :goto_f
if ( v3 != null) { // if-eqz v3, :cond_24
/* .line 197 */
v2 = c.f.a.f.q;
if ( v2 != null) { // if-eqz v2, :cond_1e
/* .line 198 */
/* iget-wide v11, v2, Lc/f/a/g;->z:J */
/* sub-long v11, v11, v22 */
/* iput-wide v11, v2, Lc/f/a/g;->z:J */
/* .line 199 */
/* iget-wide v11, v2, Lc/f/a/g;->r:J */
/* add-long v11, v11, v22 */
/* iput-wide v11, v2, Lc/f/a/g;->r:J */
/* .line 200 */
/* iget-wide v11, v2, Lc/f/a/g;->x:J */
/* add-long v11, v11, v22 */
/* iput-wide v11, v2, Lc/f/a/g;->x:J */
/* .line 201 */
} // :cond_1e
v2 = this.i0;
/* aget-object v2, v2, v1 */
/* if-nez v2, :cond_20 */
/* if-ne v3, v4, :cond_1f */
} // :cond_1f
/* move-object/from16 v7, p1 */
} // :cond_20
} // :goto_10
/* int-to-float v5, v10 */
/* div-float v5, v6, v5 */
int v7 = 0; // const/4 v7, 0x0
/* cmpl-float v11, v8, v7 */
/* if-lez v11, :cond_22 */
/* .line 202 */
v5 = this.g0;
/* aget v7, v5, v1 */
/* const/high16 v11, -0x40800000 # -1.0f */
/* cmpl-float v7, v7, v11 */
/* if-nez v7, :cond_21 */
/* const/16 v18, 0x0 */
/* .line 203 */
} // :cond_21
/* aget v5, v5, v1 */
/* mul-float v5, v5, v6 */
/* div-float/2addr v5, v8 */
} // :cond_22
/* move/from16 v18, v5 */
/* .line 204 */
} // :goto_11
v5 = (( c.f.a.l.i ) v3 ).s ( ); // invoke-virtual {v3}, Lc/f/a/l/i;->s()I
/* const/16 v7, 0x8 */
/* if-ne v5, v7, :cond_23 */
/* const/16 v18, 0x0 */
/* .line 205 */
} // :cond_23
v5 = this.A;
/* aget-object v5, v5, p3 */
v5 = (( c.f.a.l.g ) v5 ).b ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->b()I
/* int-to-float v5, v5 */
/* add-float/2addr v0, v5 */
/* .line 206 */
v5 = this.A;
/* aget-object v5, v5, p3 */
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v7 = this.f;
(( c.f.a.l.q ) v5 ).a ( v7, v0 ); // invoke-virtual {v5, v7, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;F)V
/* .line 207 */
v5 = this.A;
/* aget-object v5, v5, v19 */
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v7 = this.f;
/* add-float v0, v0, v18 */
(( c.f.a.l.q ) v5 ).a ( v7, v0 ); // invoke-virtual {v5, v7, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;F)V
/* .line 208 */
v5 = this.A;
/* aget-object v5, v5, p3 */
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
/* move-object/from16 v7, p1 */
(( c.f.a.l.q ) v5 ).a ( v7 ); // invoke-virtual {v5, v7}, Lc/f/a/l/q;->a(Lc/f/a/f;)V
/* .line 209 */
v5 = this.A;
/* aget-object v5, v5, v19 */
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v5 ).a ( v7 ); // invoke-virtual {v5, v7}, Lc/f/a/l/q;->a(Lc/f/a/f;)V
/* .line 210 */
v3 = this.A;
/* aget-object v3, v3, v19 */
v3 = (( c.f.a.l.g ) v3 ).b ( ); // invoke-virtual {v3}, Lc/f/a/l/g;->b()I
/* int-to-float v3, v3 */
/* add-float/2addr v0, v3 */
} // :goto_12
/* move-object v3, v2 */
/* goto/16 :goto_f */
} // :cond_24
int v0 = 1; // const/4 v0, 0x1
} // :cond_25
/* move-object/from16 v7, p1 */
int v8 = 0; // const/4 v8, 0x0
/* cmpg-float v8, v6, v8 */
/* if-gez v8, :cond_26 */
int v2 = 1; // const/4 v2, 0x1
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
} // :cond_26
if ( v2 != null) { // if-eqz v2, :cond_2b
/* sub-float/2addr v6, v0 */
/* move-object/from16 v2, v21 */
/* .line 211 */
v0 = (( c.f.a.l.i ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Lc/f/a/l/i;->b(I)F
/* mul-float v6, v6, v0 */
/* add-float/2addr v3, v6 */
/* move v0, v3 */
} // :cond_27
} // :goto_13
/* move-object v3, v2 */
if ( v3 != null) { // if-eqz v3, :cond_2c
/* .line 212 */
v2 = c.f.a.f.q;
if ( v2 != null) { // if-eqz v2, :cond_28
/* .line 213 */
/* iget-wide v5, v2, Lc/f/a/g;->z:J */
/* sub-long v5, v5, v22 */
/* iput-wide v5, v2, Lc/f/a/g;->z:J */
/* .line 214 */
/* iget-wide v5, v2, Lc/f/a/g;->r:J */
/* add-long v5, v5, v22 */
/* iput-wide v5, v2, Lc/f/a/g;->r:J */
/* .line 215 */
/* iget-wide v5, v2, Lc/f/a/g;->x:J */
/* add-long v5, v5, v22 */
/* iput-wide v5, v2, Lc/f/a/g;->x:J */
/* .line 216 */
} // :cond_28
v2 = this.i0;
/* aget-object v2, v2, v1 */
/* if-nez v2, :cond_29 */
/* if-ne v3, v4, :cond_27 */
} // :cond_29
/* if-nez v1, :cond_2a */
/* .line 217 */
v5 = (( c.f.a.l.i ) v3 ).t ( ); // invoke-virtual {v3}, Lc/f/a/l/i;->t()I
/* .line 218 */
} // :cond_2a
v5 = (( c.f.a.l.i ) v3 ).j ( ); // invoke-virtual {v3}, Lc/f/a/l/i;->j()I
} // :goto_14
/* int-to-float v5, v5 */
/* .line 219 */
v6 = this.A;
/* aget-object v6, v6, p3 */
v6 = (( c.f.a.l.g ) v6 ).b ( ); // invoke-virtual {v6}, Lc/f/a/l/g;->b()I
/* int-to-float v6, v6 */
/* add-float/2addr v0, v6 */
/* .line 220 */
v6 = this.A;
/* aget-object v6, v6, p3 */
(( c.f.a.l.g ) v6 ).d ( ); // invoke-virtual {v6}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v8 = this.f;
(( c.f.a.l.q ) v6 ).a ( v8, v0 ); // invoke-virtual {v6, v8, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;F)V
/* .line 221 */
v6 = this.A;
/* aget-object v6, v6, v19 */
(( c.f.a.l.g ) v6 ).d ( ); // invoke-virtual {v6}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v8 = this.f;
/* add-float/2addr v0, v5 */
(( c.f.a.l.q ) v6 ).a ( v8, v0 ); // invoke-virtual {v6, v8, v0}, Lc/f/a/l/q;->a(Lc/f/a/l/q;F)V
/* .line 222 */
v5 = this.A;
/* aget-object v5, v5, p3 */
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v5 ).a ( v7 ); // invoke-virtual {v5, v7}, Lc/f/a/l/q;->a(Lc/f/a/f;)V
/* .line 223 */
v5 = this.A;
/* aget-object v5, v5, v19 */
(( c.f.a.l.g ) v5 ).d ( ); // invoke-virtual {v5}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v5 ).a ( v7 ); // invoke-virtual {v5, v7}, Lc/f/a/l/q;->a(Lc/f/a/f;)V
/* .line 224 */
v3 = this.A;
/* aget-object v3, v3, v19 */
v3 = (( c.f.a.l.g ) v3 ).b ( ); // invoke-virtual {v3}, Lc/f/a/l/g;->b()I
/* int-to-float v3, v3 */
/* add-float/2addr v0, v3 */
} // :cond_2b
/* move-object/from16 v2, v21 */
/* if-nez v11, :cond_2d */
if ( v12 != null) { // if-eqz v12, :cond_2c
} // :cond_2c
int v0 = 1; // const/4 v0, 0x1
/* goto/16 :goto_1d */
} // :cond_2d
} // :goto_15
if ( v11 != null) { // if-eqz v11, :cond_2e
} // :goto_16
/* sub-float/2addr v6, v0 */
} // :cond_2e
if ( v12 != null) { // if-eqz v12, :cond_2f
} // :cond_2f
} // :goto_17
/* add-int/lit8 v0, v15, 0x1 */
/* int-to-float v0, v0 */
/* div-float v0, v6, v0 */
if ( v12 != null) { // if-eqz v12, :cond_31
int v8 = 1; // const/4 v8, 0x1
/* if-le v15, v8, :cond_30 */
/* add-int/lit8 v0, v15, -0x1 */
/* int-to-float v0, v0 */
} // :cond_30
/* const/high16 v0, 0x40000000 # 2.0f */
} // :goto_18
/* div-float v0, v6, v0 */
/* .line 225 */
} // :cond_31
v6 = (( c.f.a.l.i ) v2 ).s ( ); // invoke-virtual {v2}, Lc/f/a/l/i;->s()I
/* const/16 v8, 0x8 */
/* if-eq v6, v8, :cond_32 */
/* add-float v6, v3, v0 */
} // :cond_32
/* move v6, v3 */
} // :goto_19
if ( v12 != null) { // if-eqz v12, :cond_33
int v8 = 1; // const/4 v8, 0x1
/* if-le v15, v8, :cond_33 */
/* .line 226 */
v6 = this.A;
/* aget-object v6, v6, p3 */
v6 = (( c.f.a.l.g ) v6 ).b ( ); // invoke-virtual {v6}, Lc/f/a/l/g;->b()I
/* int-to-float v6, v6 */
/* add-float/2addr v6, v3 */
} // :cond_33
if ( v11 != null) { // if-eqz v11, :cond_34
if ( v5 != null) { // if-eqz v5, :cond_34
/* .line 227 */
v3 = this.A;
/* aget-object v3, v3, p3 */
v3 = (( c.f.a.l.g ) v3 ).b ( ); // invoke-virtual {v3}, Lc/f/a/l/g;->b()I
/* int-to-float v3, v3 */
/* add-float/2addr v6, v3 */
} // :cond_34
} // :goto_1a
/* move-object v3, v2 */
if ( v3 != null) { // if-eqz v3, :cond_2c
/* .line 228 */
v2 = c.f.a.f.q;
if ( v2 != null) { // if-eqz v2, :cond_35
/* .line 229 */
/* iget-wide v10, v2, Lc/f/a/g;->z:J */
/* sub-long v10, v10, v22 */
/* iput-wide v10, v2, Lc/f/a/g;->z:J */
/* .line 230 */
/* iget-wide v10, v2, Lc/f/a/g;->r:J */
/* add-long v10, v10, v22 */
/* iput-wide v10, v2, Lc/f/a/g;->r:J */
/* .line 231 */
/* iget-wide v10, v2, Lc/f/a/g;->x:J */
/* add-long v10, v10, v22 */
/* iput-wide v10, v2, Lc/f/a/g;->x:J */
/* .line 232 */
} // :cond_35
v2 = this.i0;
/* aget-object v2, v2, v1 */
/* if-nez v2, :cond_37 */
/* if-ne v3, v4, :cond_36 */
} // :cond_36
/* const/16 v8, 0x8 */
} // :cond_37
} // :goto_1b
/* if-nez v1, :cond_38 */
/* .line 233 */
v8 = (( c.f.a.l.i ) v3 ).t ( ); // invoke-virtual {v3}, Lc/f/a/l/i;->t()I
/* .line 234 */
} // :cond_38
v8 = (( c.f.a.l.i ) v3 ).j ( ); // invoke-virtual {v3}, Lc/f/a/l/i;->j()I
} // :goto_1c
/* int-to-float v8, v8 */
/* if-eq v3, v5, :cond_39 */
/* .line 235 */
v10 = this.A;
/* aget-object v10, v10, p3 */
v10 = (( c.f.a.l.g ) v10 ).b ( ); // invoke-virtual {v10}, Lc/f/a/l/g;->b()I
/* int-to-float v10, v10 */
/* add-float/2addr v6, v10 */
/* .line 236 */
} // :cond_39
v10 = this.A;
/* aget-object v10, v10, p3 */
(( c.f.a.l.g ) v10 ).d ( ); // invoke-virtual {v10}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v11 = this.f;
(( c.f.a.l.q ) v10 ).a ( v11, v6 ); // invoke-virtual {v10, v11, v6}, Lc/f/a/l/q;->a(Lc/f/a/l/q;F)V
/* .line 237 */
v10 = this.A;
/* aget-object v10, v10, v19 */
(( c.f.a.l.g ) v10 ).d ( ); // invoke-virtual {v10}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
v11 = this.f;
/* add-float v12, v6, v8 */
(( c.f.a.l.q ) v10 ).a ( v11, v12 ); // invoke-virtual {v10, v11, v12}, Lc/f/a/l/q;->a(Lc/f/a/l/q;F)V
/* .line 238 */
v10 = this.A;
/* aget-object v10, v10, p3 */
(( c.f.a.l.g ) v10 ).d ( ); // invoke-virtual {v10}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v10 ).a ( v7 ); // invoke-virtual {v10, v7}, Lc/f/a/l/q;->a(Lc/f/a/f;)V
/* .line 239 */
v10 = this.A;
/* aget-object v10, v10, v19 */
(( c.f.a.l.g ) v10 ).d ( ); // invoke-virtual {v10}, Lc/f/a/l/g;->d()Lc/f/a/l/q;
(( c.f.a.l.q ) v10 ).a ( v7 ); // invoke-virtual {v10, v7}, Lc/f/a/l/q;->a(Lc/f/a/f;)V
/* .line 240 */
v3 = this.A;
/* aget-object v3, v3, v19 */
v3 = (( c.f.a.l.g ) v3 ).b ( ); // invoke-virtual {v3}, Lc/f/a/l/g;->b()I
/* int-to-float v3, v3 */
/* add-float/2addr v8, v3 */
/* add-float/2addr v6, v8 */
if ( v2 != null) { // if-eqz v2, :cond_36
/* .line 241 */
v3 = (( c.f.a.l.i ) v2 ).s ( ); // invoke-virtual {v2}, Lc/f/a/l/i;->s()I
/* const/16 v8, 0x8 */
/* if-eq v3, v8, :cond_34 */
/* add-float/2addr v6, v0 */
/* goto/16 :goto_1a */
} // :goto_1d
} // :cond_3a
} // :goto_1e
int v0 = 0; // const/4 v0, 0x0
} // :cond_3b
} // :goto_1f
int v0 = 0; // const/4 v0, 0x0
} // .end method
