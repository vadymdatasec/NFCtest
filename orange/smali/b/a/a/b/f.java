public class b.a.a.b.f implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer b;
	 public final android.os.Bundle c;
	 public final b.a.a.b.g d; //synthetic
	 /* # direct methods */
	 public b.a.a.b.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p2, p0, Lb/a/a/b/f;->b:I */
		 /* .line 3 */
		 this.c = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.d;
		 /* iget v1, p0, Lb/a/a/b/f;->b:I */
		 v2 = this.c;
		 (( b.a.a.b.g ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lb/a/a/b/g;->a(ILandroid/os/Bundle;)V
		 return;
	 } // .end method
