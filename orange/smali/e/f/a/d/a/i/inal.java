public class inal implements e.f.a.d.a.i.c implements e.f.a.d.a.i.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.concurrent.CountDownLatch a;
	 /* # direct methods */
	 public inal ( ) { //synthethic
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance p1, Ljava/util/concurrent/CountDownLatch; */
		 int v0 = 1; // const/4 v0, 0x1
		 /* invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/InterruptedException; */
		 /* } */
	 } // .end annotation
	 v0 = this.a;
	 (( java.util.concurrent.CountDownLatch ) v0 ).await ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
	 return;
} // .end method
public final void a ( java.lang.Exception p0 ) {
	 /* .locals 0 */
	 p1 = this.a;
	 (( java.util.concurrent.CountDownLatch ) p1 ).countDown ( ); // invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
	 return;
} // .end method
public final void a ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 p1 = this.a;
	 (( java.util.concurrent.CountDownLatch ) p1 ).countDown ( ); // invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
	 return;
} // .end method
