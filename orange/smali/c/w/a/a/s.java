public abstract class c.w.a.a.s extends c.w.a.a.r {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.h.g.d a;
	 public java.lang.String b;
	 public Integer c;
	 public Integer d;
	 /* # direct methods */
	 public c.w.a.a.s ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Lc/w/a/a/r;-><init>(Lc/w/a/a/n;)V */
		 /* .line 2 */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Lc/w/a/a/s;->c:I */
		 return;
	 } // .end method
	 public c.w.a.a.s ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* invoke-direct {p0, v0}, Lc/w/a/a/r;-><init>(Lc/w/a/a/n;)V */
		 /* .line 5 */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 /* iput v0, p0, Lc/w/a/a/s;->c:I */
		 /* .line 7 */
		 v0 = this.b;
		 this.b = v0;
		 /* .line 8 */
		 /* iget v0, p1, Lc/w/a/a/s;->d:I */
		 /* iput v0, p0, Lc/w/a/a/s;->d:I */
		 /* .line 9 */
		 p1 = this.a;
		 c.h.g.e .a ( p1 );
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Path p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.graphics.Path ) p1 ).reset ( ); // invoke-virtual {p1}, Landroid/graphics/Path;->reset()V
		 /* .line 2 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 c.h.g.d .a ( v0,p1 );
		 } // :cond_0
		 return;
	 } // .end method
	 public Boolean b ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public c.h.g.d getPathData ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public java.lang.String getPathName ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public void setPathData ( Object[] p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = 		 c.h.g.e .a ( v0,p1 );
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 c.h.g.e .a ( p1 );
		 this.a = p1;
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.a;
	 c.h.g.e .b ( v0,p1 );
} // :goto_0
return;
} // .end method
