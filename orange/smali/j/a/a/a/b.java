public class j.a.a.a.b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.hardware.Camera b; //synthetic
	 public final j.a.a.a.c c; //synthetic
	 /* # direct methods */
	 public j.a.a.a.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = this.c;
		 j.a.a.a.d .a ( v0 );
		 v1 = this.b;
		 v2 = this.c;
		 /* iget v2, v2, Lj/a/a/a/c;->b:I */
		 j.a.a.a.i .a ( v1,v2 );
		 (( j.a.a.a.a ) v0 ).setupCameraPreview ( v1 ); // invoke-virtual {v0, v1}, Lj/a/a/a/a;->setupCameraPreview(Lj/a/a/a/i;)V
		 return;
	 } // .end method
