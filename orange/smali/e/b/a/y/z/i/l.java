public class e.b.a.y.z.i.l implements android.os.Handler$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.z.i.n a; //synthetic
	 /* # direct methods */
	 public e.b.a.y.z.i.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean handleMessage ( android.os.Message p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p1, Landroid/os/Message;->what:I */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne v0, v1, :cond_0 */
		 /* .line 2 */
		 p1 = this.obj;
		 /* check-cast p1, Le/b/a/y/z/i/j; */
		 /* .line 3 */
		 v0 = this.a;
		 (( e.b.a.y.z.i.n ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/z/i/n;->a(Le/b/a/y/z/i/j;)V
	 } // :cond_0
	 int v1 = 2; // const/4 v1, 0x2
	 /* if-ne v0, v1, :cond_1 */
	 /* .line 4 */
	 p1 = this.obj;
	 /* check-cast p1, Le/b/a/y/z/i/j; */
	 /* .line 5 */
	 v0 = this.a;
	 v0 = this.d;
	 (( e.b.a.u ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/u;->a(Le/b/a/c0/o/h;)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
