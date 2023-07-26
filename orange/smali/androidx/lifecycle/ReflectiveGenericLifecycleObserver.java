public class androidx.lifecycle.ReflectiveGenericLifecycleObserver implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Object a;
	 public final c.n.a$a b;
	 /* # direct methods */
	 public androidx.lifecycle.ReflectiveGenericLifecycleObserver ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 v0 = c.n.a.c;
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( c.n.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/n/a;->b(Ljava/lang/Class;)Lc/n/a$a;
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, c.n.g$a p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.a;
		 (( c.n.a$a ) v0 ).a ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/n/a$a;->a(Lc/n/j;Lc/n/g$a;Ljava/lang/Object;)V
		 return;
	 } // .end method
