public class c.l.d.n1 implements c.l.d.z {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Boolean a;
	 public final c.l.d.a b;
	 public Integer c;
	 /* # direct methods */
	 public c.l.d.n1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput-boolean p2, p0, Lc/l/d/n1;->a:Z */
		 /* .line 3 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/l/d/n1;->c:I */
		 /* add-int/lit8 v0, v0, -0x1 */
		 /* iput v0, p0, Lc/l/d/n1;->c:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
			 /* .line 2 */
		 } // :cond_0
		 v0 = this.b;
		 v0 = this.q;
		 (( c.l.d.o1 ) v0 ).N ( ); // invoke-virtual {v0}, Lc/l/d/o1;->N()V
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/l/d/n1;->c:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lc/l/d/n1;->c:I */
		 return;
	 } // .end method
	 public void c ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.q;
		 /* iget-boolean v2, p0, Lc/l/d/n1;->a:Z */
		 int v3 = 0; // const/4 v3, 0x0
		 (( c.l.d.o1 ) v1 ).a ( v0, v2, v3, v3 ); // invoke-virtual {v1, v0, v2, v3, v3}, Lc/l/d/o1;->a(Lc/l/d/a;ZZZ)V
		 return;
	 } // .end method
	 public void d ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/l/d/n1;->c:I */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-lez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
} // :goto_0
v2 = this.b;
v2 = this.q;
/* .line 3 */
(( c.l.d.o1 ) v2 ).z ( ); // invoke-virtual {v2}, Lc/l/d/o1;->z()Ljava/util/List;
} // :cond_1
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v3, Landroidx/fragment/app/Fragment; */
int v4 = 0; // const/4 v4, 0x0
/* .line 4 */
(( androidx.fragment.app.Fragment ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->a(Lc/l/d/z;)V
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v4 = (( androidx.fragment.app.Fragment ) v3 ).V ( ); // invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->V()Z
if ( v4 != null) { // if-eqz v4, :cond_1
	 /* .line 6 */
	 (( androidx.fragment.app.Fragment ) v3 ).y0 ( ); // invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->y0()V
	 /* .line 7 */
} // :cond_2
v2 = this.b;
v3 = this.q;
/* iget-boolean v4, p0, Lc/l/d/n1;->a:Z */
/* xor-int/2addr v0, v1 */
(( c.l.d.o1 ) v3 ).a ( v2, v4, v0, v1 ); // invoke-virtual {v3, v2, v4, v0, v1}, Lc/l/d/o1;->a(Lc/l/d/a;ZZZ)V
return;
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/l/d/n1;->c:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
