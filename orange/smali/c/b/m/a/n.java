public abstract class c.b.m.a.n extends c.b.m.a.k {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public I J;
	 /* # direct methods */
	 public c.b.m.a.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lc/b/m/a/k;-><init>(Lc/b/m/a/k;Lc/b/m/a/l;Landroid/content/res/Resources;)V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 p1 = this.J;
			 this.J = p1;
			 /* .line 3 */
		 } // :cond_0
		 p1 = 		 (( c.b.m.a.k ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/m/a/k;->d()I
		 /* new-array p1, p1, [[I */
		 this.J = p1;
	 } // :goto_0
	 return;
} // .end method
/* # virtual methods */
public Integer a ( Integer[] p0 ) {
	 /* .locals 4 */
	 /* .line 3 */
	 v0 = this.J;
	 /* .line 4 */
	 v1 = 	 (( c.b.m.a.k ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/m/a/k;->e()I
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* .line 5 */
/* aget-object v3, v0, v2 */
v3 = android.util.StateSet .stateSetMatches ( v3,p1 );
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
} // .end method
public Integer a ( Integer[] p0, android.graphics.drawable.Drawable p1 ) {
/* .locals 1 */
/* .line 1 */
p2 = (( c.b.m.a.k ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/m/a/k;->a(Landroid/graphics/drawable/Drawable;)I
/* .line 2 */
v0 = this.J;
/* aput-object p1, v0, p2 */
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 6 */
/* invoke-super {p0, p1, p2}, Lc/b/m/a/k;->a(II)V */
/* .line 7 */
/* new-array p2, p2, [[I */
/* .line 8 */
v0 = this.J;
int v1 = 0; // const/4 v1, 0x0
java.lang.System .arraycopy ( v0,v1,p2,v1,p1 );
/* .line 9 */
this.J = p2;
return;
} // .end method
