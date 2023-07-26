public class c.h.e.a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String b; //synthetic
	 public final android.app.Activity c; //synthetic
	 public final Integer d; //synthetic
	 /* # direct methods */
	 public c.h.e.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* iput p3, p0, Lc/h/e/a;->d:I */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 v0 = this.b;
		 /* array-length v0, v0 */
		 /* new-array v0, v0, [I */
		 /* .line 2 */
		 v1 = this.c;
		 (( android.app.Activity ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* .line 3 */
		 v2 = this.c;
		 (( android.app.Activity ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
		 /* .line 4 */
		 v3 = this.b;
		 /* array-length v3, v3 */
		 int v4 = 0; // const/4 v4, 0x0
	 } // :goto_0
	 /* if-ge v4, v3, :cond_0 */
	 /* .line 5 */
	 v5 = this.b;
	 /* aget-object v5, v5, v4 */
	 v5 = 	 (( android.content.pm.PackageManager ) v1 ).checkPermission ( v5, v2 ); // invoke-virtual {v1, v5, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
	 /* aput v5, v0, v4 */
	 /* add-int/lit8 v4, v4, 0x1 */
	 /* .line 6 */
} // :cond_0
v1 = this.c;
/* check-cast v1, Lc/h/e/c; */
/* iget v2, p0, Lc/h/e/a;->d:I */
v3 = this.b;
return;
} // .end method
