public class b.a.a.b.e extends b.a.a.b.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final b.a.a.b.g a; //synthetic
	 /* # direct methods */
	 public b.a.a.b.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Lb/a/a/b/b;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( Integer p0, android.os.Bundle p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 v1 = this.b;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 2 */
			 /* new-instance v2, Lb/a/a/b/f; */
			 /* invoke-direct {v2, v0, p1, p2}, Lb/a/a/b/f;-><init>(Lb/a/a/b/g;ILandroid/os/Bundle;)V */
			 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
			 /* .line 3 */
		 } // :cond_0
		 (( b.a.a.b.g ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lb/a/a/b/g;->a(ILandroid/os/Bundle;)V
	 } // :goto_0
	 return;
} // .end method
