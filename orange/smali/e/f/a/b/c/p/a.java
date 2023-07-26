public abstract class e.f.a.b.c.p.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.b.c.p.a ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static java.security.MessageDigest a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 int v1 = 2; // const/4 v1, 0x2
	 /* if-ge v0, v1, :cond_1 */
	 /* .line 5 */
	 try { // :try_start_0
		 java.security.MessageDigest .getInstance ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* :catch_0 */
		 } // :cond_0
		 /* add-int/lit8 v0, v0, 0x1 */
	 } // :cond_1
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static a ( android.content.Context p0, java.lang.String p1 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Landroid/content/pm/PackageManager$NameNotFoundException; */
	 /* } */
} // .end annotation
/* .line 1 */
e.f.a.b.c.q.b .b ( p0 );
/* const/16 v0, 0x40 */
(( e.f.a.b.c.q.a ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/a/b/c/q/a;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 2 */
p1 = this.signatures;
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* array-length p1, p1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-ne p1, v0, :cond_0 */
	 final String p1 = "SHA1"; // const-string p1, "SHA1"
	 /* .line 3 */
	 e.f.a.b.c.p.a .a ( p1 );
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 4 */
		 p0 = this.signatures;
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget-object p0, p0, v0 */
		 (( android.content.pm.Signature ) p0 ).toByteArray ( ); // invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B
		 (( java.security.MessageDigest ) p1 ).digest ( p0 ); // invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->digest([B)[B
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
