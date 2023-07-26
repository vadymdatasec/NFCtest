public class e.b.a.c0.g {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.b.a.c0.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( java.lang.Object ) p1 ).notifyAll ( ); // invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
		 return;
	 } // .end method
	 public void a ( java.lang.Object p0, Long p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/InterruptedException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( java.lang.Object ) p1 ).wait ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Ljava/lang/Object;->wait(J)V
	 return;
} // .end method
