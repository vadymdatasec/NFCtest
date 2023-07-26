public class e.f.a.a.j.t implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Runnable b;
	 /* # direct methods */
	 public e.f.a.a.j.t ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.b;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 final String v1 = "Executor"; // const-string v1, "Executor"
			 final String v2 = "Background execution failure."; // const-string v2, "Background execution failure."
			 /* .line 2 */
			 e.f.a.a.j.h0.a .a ( v1,v2,v0 );
		 } // :goto_0
		 return;
	 } // .end method
