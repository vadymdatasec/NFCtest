public class c.l.d.e implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.List b; //synthetic
	 public final c.l.d.h3 c; //synthetic
	 public final c.l.d.r d; //synthetic
	 /* # direct methods */
	 public c.l.d.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 this.b = p2;
		 this.c = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 v1 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.b;
			 v1 = this.c;
			 /* .line 3 */
			 v0 = this.d;
			 v1 = this.c;
			 (( c.l.d.r ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/r;->a(Lc/l/d/h3;)V
		 } // :cond_0
		 return;
	 } // .end method
