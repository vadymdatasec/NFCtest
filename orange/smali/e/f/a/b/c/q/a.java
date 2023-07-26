public class e.f.a.b.c.q.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public e.f.a.b.c.q.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.a;
		 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 p1 = 		 (( android.content.pm.PackageManager ) v0 ).checkPermission ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
	 } // .end method
	 public android.content.pm.ApplicationInfo a ( java.lang.String p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/content/pm/PackageManager$NameNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.a;
	 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 (( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
} // .end method
public java.lang.CharSequence a ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Landroid/content/pm/PackageManager$NameNotFoundException; */
	 /* } */
} // .end annotation
/* .line 3 */
v0 = this.a;
/* .line 4 */
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
v1 = this.a;
/* .line 5 */
(( android.content.Context ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
(( android.content.pm.PackageManager ) v0 ).getApplicationLabel ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
} // .end method
public android.content.pm.PackageInfo b ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/pm/PackageManager$NameNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
} // .end method
