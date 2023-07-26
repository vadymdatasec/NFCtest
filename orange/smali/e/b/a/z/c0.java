public class e.b.a.z.c0 extends android.net.ConnectivityManager$NetworkCallback {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.b.a.z.d0 a; //synthetic
	 /* # direct methods */
	 public e.b.a.z.c0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Boolean p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 e.b.a.e0.t .b ( );
		 /* .line 2 */
		 v0 = this.a;
		 /* iget-boolean v1, v0, Le/b/a/z/d0;->a:Z */
		 /* .line 3 */
		 /* iput-boolean p1, v0, Le/b/a/z/d0;->a:Z */
		 /* if-eq v1, p1, :cond_0 */
		 /* .line 4 */
		 v0 = this.b;
	 } // :cond_0
	 return;
} // .end method
public final void b ( Boolean p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Le/b/a/z/b0; */
	 /* invoke-direct {v0, p0, p1}, Le/b/a/z/b0;-><init>(Le/b/a/z/c0;Z)V */
	 e.b.a.e0.t .a ( v0 );
	 return;
} // .end method
public void onAvailable ( android.net.Network p0 ) {
	 /* .locals 0 */
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 1 */
	 (( e.b.a.z.c0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/c0;->b(Z)V
	 return;
} // .end method
public void onLost ( android.net.Network p0 ) {
	 /* .locals 0 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 1 */
	 (( e.b.a.z.c0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/z/c0;->b(Z)V
	 return;
} // .end method
