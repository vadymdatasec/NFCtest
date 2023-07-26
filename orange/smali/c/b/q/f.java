public class c.b.q.f implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.q.i b;
	 public final c.b.q.k c; //synthetic
	 /* # direct methods */
	 public c.b.q.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.c;
		 c.b.q.k .d ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.c;
			 c.b.q.k .e ( v0 );
			 (( c.b.p.o.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->a()V
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.c;
		 c.b.q.k .f ( v0 );
		 /* check-cast v0, Landroid/view/View; */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 (( android.view.View ) v0 ).getWindowToken ( ); // invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = this.b;
				 v0 = 				 (( c.b.p.o.y ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/p/o/y;->g()Z
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 5 */
					 v0 = this.c;
					 v1 = this.b;
					 this.x = v1;
					 /* .line 6 */
				 } // :cond_1
				 v0 = this.c;
				 int v1 = 0; // const/4 v1, 0x0
				 this.z = v1;
				 return;
			 } // .end method
