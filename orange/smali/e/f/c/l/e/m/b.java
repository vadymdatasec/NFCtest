public class e.f.c.l.e.m.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.lang.String b;
	 public final java.lang.String c;
	 public final java.lang.String d;
	 public final java.lang.String e;
	 public final java.lang.String f;
	 /* # direct methods */
	 public e.f.c.l.e.m.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 /* .line 5 */
		 this.d = p4;
		 /* .line 6 */
		 this.e = p5;
		 /* .line 7 */
		 this.f = p6;
		 return;
	 } // .end method
	 public static e.f.c.l.e.m.b a ( android.content.Context p0, e.f.c.l.e.m.q1 p1, java.lang.String p2, java.lang.String p3 ) {
		 /* .locals 7 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/content/pm/PackageManager$NameNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 /* .line 2 */
	 (( e.f.c.l.e.m.q1 ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/l/e/m/q1;->c()Ljava/lang/String;
	 /* .line 3 */
	 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 4 */
	 (( android.content.pm.PackageManager ) p0 ).getPackageInfo ( v4, p1 ); // invoke-virtual {p0, v4, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
	 /* .line 5 */
	 /* iget p1, p0, Landroid/content/pm/PackageInfo;->versionCode:I */
	 java.lang.Integer .toString ( p1 );
	 /* .line 6 */
	 p0 = this.versionName;
	 /* if-nez p0, :cond_0 */
	 final String p0 = "0.0"; // const-string p0, "0.0"
} // :cond_0
/* move-object v6, p0 */
/* .line 7 */
/* new-instance p0, Le/f/c/l/e/m/b; */
/* move-object v0, p0 */
/* move-object v1, p2 */
/* move-object v2, p3 */
/* invoke-direct/range {v0 ..v6}, Le/f/c/l/e/m/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
} // .end method
