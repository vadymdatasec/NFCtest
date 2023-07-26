public class e.b.a.y.x.g1.k implements e.b.a.y.x.g1.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a; //synthetic
	 public final java.lang.String b; //synthetic
	 /* # direct methods */
	 public e.b.a.y.x.g1.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.File a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.content.Context ) v0 ).getCacheDir ( ); // invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
		 /* if-nez v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
	 } // :cond_0
	 v1 = this.b;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 3 */
		 /* new-instance v1, Ljava/io/File; */
		 v2 = this.b;
		 /* invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 } // :cond_1
} // .end method
