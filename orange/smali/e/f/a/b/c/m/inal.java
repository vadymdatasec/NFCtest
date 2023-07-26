public class inal extends e.f.a.b.c.m.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Intent b; //synthetic
	 public final android.app.Activity c; //synthetic
	 public final Integer d; //synthetic
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* iput p3, p0, Le/f/a/b/c/m/k;->d:I */
		 /* invoke-direct {p0}, Le/f/a/b/c/m/d;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = this.c;
			 /* iget v2, p0, Le/f/a/b/c/m/k;->d:I */
			 (( android.app.Activity ) v1 ).startActivityForResult ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
		 } // :cond_0
		 return;
	 } // .end method
