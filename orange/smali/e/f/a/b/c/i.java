public class e.f.a.b.c.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.a.b.c.i a;
	 /* # direct methods */
	 public e.f.a.b.c.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 return;
	 } // .end method
	 public static e.f.a.b.c.i a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 e.f.a.b.c.m.h .a ( p0 );
		 /* .line 2 */
		 /* const-class v0, Le/f/a/b/c/i; */
		 /* monitor-enter v0 */
		 /* .line 3 */
		 try { // :try_start_0
			 v1 = e.f.a.b.c.i.a;
			 /* if-nez v1, :cond_0 */
			 /* .line 4 */
			 e.f.a.b.c.t .a ( p0 );
			 /* .line 5 */
			 /* new-instance v1, Le/f/a/b/c/i; */
			 /* invoke-direct {v1, p0}, Le/f/a/b/c/i;-><init>(Landroid/content/Context;)V */
			 /* .line 6 */
		 } // :cond_0
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 7 */
		 p0 = e.f.a.b.c.i.a;
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* .line 8 */
		 try { // :try_start_1
			 /* monitor-exit v0 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* throw p0 */
		 } // .end method
		 public static e.f.a.b.c.u a ( android.content.pm.PackageInfo p0, Object...p1 ) {
			 /* .locals 3 */
			 /* .line 12 */
			 v0 = this.signatures;
			 int v1 = 0; // const/4 v1, 0x0
			 /* if-nez v0, :cond_0 */
			 /* .line 13 */
		 } // :cond_0
		 /* array-length v0, v0 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* if-eq v0, v2, :cond_1 */
		 final String p0 = "GoogleSignatureVerifier"; // const-string p0, "GoogleSignatureVerifier"
		 final String p1 = "Package has more than one signature."; // const-string p1, "Package has more than one signature."
		 /* .line 14 */
		 android.util.Log .w ( p0,p1 );
		 /* .line 15 */
	 } // :cond_1
	 /* new-instance v0, Le/f/a/b/c/v; */
	 p0 = this.signatures;
	 int v2 = 0; // const/4 v2, 0x0
	 /* aget-object p0, p0, v2 */
	 (( android.content.pm.Signature ) p0 ).toByteArray ( ); // invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B
	 /* invoke-direct {v0, p0}, Le/f/a/b/c/v;-><init>([B)V */
	 /* .line 16 */
} // :goto_0
/* array-length p0, p1 */
/* if-ge v2, p0, :cond_3 */
/* .line 17 */
/* aget-object p0, p1, v2 */
p0 = (( e.f.a.b.c.u ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/b/c/u;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_2
	 /* .line 18 */
	 /* aget-object p0, p1, v2 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // .end method
public static Boolean a ( android.content.pm.PackageInfo p0, Boolean p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 9 */
v1 = this.signatures;
if ( v1 != null) { // if-eqz v1, :cond_1
	 int v1 = 1; // const/4 v1, 0x1
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 10 */
		 p1 = e.f.a.b.c.x.a;
		 e.f.a.b.c.i .a ( p0,p1 );
	 } // :cond_0
	 /* new-array p1, v1, [Le/f/a/b/c/u; */
	 /* .line 11 */
	 v2 = e.f.a.b.c.x.a;
	 /* aget-object v2, v2, v0 */
	 /* aput-object v2, p1, v0 */
	 e.f.a.b.c.i .a ( p0,p1 );
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_1
} // :cond_1
} // .end method
