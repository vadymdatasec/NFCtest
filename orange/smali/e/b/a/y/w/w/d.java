public class e.b.a.y.w.w.d implements e.b.a.y.w.w.f {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String b;
	 /* # instance fields */
	 public final android.content.ContentResolver a;
	 /* # direct methods */
	 public static e.b.a.y.w.w.d ( ) {
		 /* .locals 1 */
		 final String v0 = "_data"; // const-string v0, "_data"
		 /* .line 1 */
		 /* filled-new-array {v0}, [Ljava/lang/String; */
		 return;
	 } // .end method
	 public e.b.a.y.w.w.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.database.Cursor a ( android.net.Uri p0 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 (( android.net.Uri ) p1 ).getLastPathSegment ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;
		 /* .line 2 */
		 v0 = this.a;
		 v1 = android.provider.MediaStore$Video$Thumbnails.EXTERNAL_CONTENT_URI;
		 v2 = e.b.a.y.w.w.d.b;
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v4, v3, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object p1, v4, v3 */
		 final String v3 = "kind = 1 AND video_id = ?"; // const-string v3, "kind = 1 AND video_id = ?"
		 int v5 = 0; // const/4 v5, 0x0
		 /* invoke-virtual/range {v0 ..v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
	 } // .end method
