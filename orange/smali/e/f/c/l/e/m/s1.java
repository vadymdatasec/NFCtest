public class e.f.c.l.e.m.s1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 /* # direct methods */
	 public e.f.c.l.e.m.s1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String b ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* .line 2 */
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 /* .line 3 */
		 (( android.content.pm.PackageManager ) v0 ).getInstallerPackageName ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;
		 /* if-nez p0, :cond_0 */
		 final String p0 = ""; // const-string p0, ""
	 } // :cond_0
} // .end method
/* # virtual methods */
public synchronized java.lang.String a ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.a;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 e.f.c.l.e.m.s1 .b ( p1 );
		 this.a = p1;
	 } // :cond_0
	 final String p1 = ""; // const-string p1, ""
	 /* .line 3 */
	 v0 = this.a;
	 p1 = 	 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_1
	 p1 = this.a;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
