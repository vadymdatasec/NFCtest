public class e.f.a.c.s.s implements android.os.Handler$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.a.c.s.v a; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean handleMessage ( android.os.Message p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p1, Landroid/os/Message;->what:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 2 */
		 } // :cond_0
		 v0 = this.a;
		 p1 = this.obj;
		 /* check-cast p1, Le/f/a/c/s/u; */
		 (( e.f.a.c.s.v ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;)V
		 int p1 = 1; // const/4 p1, 0x1
	 } // .end method
