public class m.b.k.r0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public m.b.k.s0 a;
	 /* # direct methods */
	 public m.b.k.r0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* move-object v1, p1 */
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 /* .line 1 */
		 v3 = this.a;
		 /* .line 2 */
		 v3 = 		 (( m.b.i.t ) v1 ).d ( ); // invoke-virtual {v1}, Lm/b/i/t;->d()I
		 /* if-lez v3, :cond_0 */
		 /* .line 3 */
		 (( m.b.i.t ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lm/b/i/t;->a(I)Lm/b/i/t;
		 /* add-int/lit8 v2, v2, 0x1 */
		 /* .line 4 */
	 } // :cond_0
} // :goto_1
(( m.b.i.t ) v1 ).h ( ); // invoke-virtual {v1}, Lm/b/i/t;->h()Lm/b/i/t;
/* if-nez v3, :cond_1 */
/* if-lez v2, :cond_1 */
/* .line 5 */
v3 = this.a;
/* .line 6 */
(( m.b.i.t ) v1 ).m ( ); // invoke-virtual {v1}, Lm/b/i/t;->m()Lm/b/i/t;
/* add-int/lit8 v2, v2, -0x1 */
/* .line 7 */
} // :cond_1
v3 = this.a;
/* if-ne v1, p1, :cond_2 */
/* .line 8 */
} // :cond_2
(( m.b.i.t ) v1 ).h ( ); // invoke-virtual {v1}, Lm/b/i/t;->h()Lm/b/i/t;
} // :cond_3
} // :goto_2
return;
} // .end method
