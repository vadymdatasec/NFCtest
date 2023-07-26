public abstract class e.b.a.y.w.w.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* const/high16 v0, -0x80000000 */
		 /* if-eq p0, v0, :cond_0 */
		 /* if-eq p1, v0, :cond_0 */
		 /* const/16 v0, 0x200 */
		 /* if-gt p0, v0, :cond_0 */
		 /* const/16 p0, 0x180 */
		 /* if-gt p1, p0, :cond_0 */
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( android.net.Uri p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.w.w.b .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 p0 = 	 e.b.a.y.w.w.b .d ( p0 );
	 /* if-nez p0, :cond_0 */
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean b ( android.net.Uri p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
(( android.net.Uri ) p0 ).getScheme ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v1 = "content"; // const-string v1, "content"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( android.net.Uri ) p0 ).getAuthority ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;
	 final String v0 = "media"; // const-string v0, "media"
	 p0 = 	 (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean c ( android.net.Uri p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.w.w.b .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 p0 = 	 e.b.a.y.w.w.b .d ( p0 );
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean d ( android.net.Uri p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.net.Uri ) p0 ).getPathSegments ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
p0 = final String v0 = "video"; // const-string v0, "video"
} // .end method
