public class c.i.a.a extends android.database.ContentObserver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.i.a.c a; //synthetic
	 /* # direct methods */
	 public c.i.a.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* .line 2 */
		 /* new-instance p1, Landroid/os/Handler; */
		 /* invoke-direct {p1}, Landroid/os/Handler;-><init>()V */
		 /* invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean deliverSelfNotifications ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
	 public void onChange ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 (( c.i.a.c ) p1 ).b ( ); // invoke-virtual {p1}, Lc/i/a/c;->b()V
		 return;
	 } // .end method
