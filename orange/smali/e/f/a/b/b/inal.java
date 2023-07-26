public class inal implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.a.b.b.l b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 int v1 = 2; // const/4 v1, 0x2
		 final String v2 = "Service disconnected"; // const-string v2, "Service disconnected"
		 /* .line 2 */
		 (( e.f.a.b.b.l ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/b/b/l;->a(ILjava/lang/String;)V
		 return;
	 } // .end method
