public abstract class i.h.c.b implements i.j.a implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.Object h;
	 /* # instance fields */
	 public transient i.j.a b;
	 public final java.lang.Object c;
	 public final java.lang.Class d;
	 public final java.lang.String e;
	 public final java.lang.String f;
	 public final Boolean g;
	 /* # direct methods */
	 public static i.h.c.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 i.h.c.a .a ( );
		 return;
	 } // .end method
	 public i.h.c.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.c = p1;
		 /* .line 3 */
		 this.d = p2;
		 /* .line 4 */
		 this.e = p3;
		 /* .line 5 */
		 this.f = p4;
		 /* .line 6 */
		 /* iput-boolean p5, p0, Li/h/c/b;->g:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public i.j.a a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 (( i.h.c.b ) p0 ).b ( ); // invoke-virtual {p0}, Li/h/c/b;->b()Li/j/a;
		 /* .line 3 */
		 this.b = p0;
		 /* move-object v0, p0 */
	 } // :cond_0
} // .end method
public abstract i.j.a b ( ) {
} // .end method
public java.lang.Object c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
} // .end method
public java.lang.String d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.e;
} // .end method
public i.j.c e ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.d;
	 /* if-nez v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* iget-boolean v1, p0, Li/h/c/b;->g:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
	 i.h.c.n .b ( v0 );
} // :cond_1
i.h.c.n .a ( v0 );
} // :goto_0
} // .end method
public java.lang.String f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
