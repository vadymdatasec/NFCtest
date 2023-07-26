public class e.f.c.l.e.m.g2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.concurrent.Callable b; //synthetic
	 public final e.f.a.b.h.h c; //synthetic
	 /* # direct methods */
	 public e.f.c.l.e.m.g2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.b;
			 /* .line 2 */
			 /* check-cast v0, Le/f/a/b/h/g; */
			 /* new-instance v1, Le/f/c/l/e/m/f2; */
			 /* invoke-direct {v1, p0}, Le/f/c/l/e/m/f2;-><init>(Le/f/c/l/e/m/g2;)V */
			 /* .line 3 */
			 (( e.f.a.b.h.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/a;)Le/f/a/b/h/g;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 4 */
			 v1 = this.c;
			 (( e.f.a.b.h.h ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Exception;)V
		 } // :goto_0
		 return;
	 } // .end method
