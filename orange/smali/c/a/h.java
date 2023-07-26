public class c.a.h implements c.a.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.a.g a;
	 public final androidx.activity.OnBackPressedDispatcher b; //synthetic
	 /* # direct methods */
	 public c.a.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void cancel ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = this.b;
		 v1 = this.a;
		 (( java.util.ArrayDeque ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z
		 /* .line 2 */
		 v0 = this.a;
		 (( c.a.g ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/a/g;->b(Lc/a/a;)V
		 return;
	 } // .end method
