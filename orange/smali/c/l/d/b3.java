public class c.l.d.b3 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.d3 b; //synthetic
	 public final c.l.d.i3 c; //synthetic
	 /* # direct methods */
	 public c.l.d.b3 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = this.b;
		 v1 = this.b;
		 (( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 /* .line 2 */
		 v0 = this.c;
		 v0 = this.c;
		 v1 = this.b;
		 (( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 return;
	 } // .end method
