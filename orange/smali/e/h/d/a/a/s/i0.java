public class e.h.d.a.a.s.i0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public e.h.d.a.a.s.i0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( e.h.d.a.a.s.i0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/s/i0;->d()Ljava/io/File;
		 /* .line 2 */
		 v1 = 		 (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
		 /* if-nez v1, :cond_0 */
		 /* .line 3 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Can\'t delete, "; // const-string v2, "Can\'t delete, "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = " do not exists."; // const-string v0, " do not exists."
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "packid.UserUriRepo"; // const-string v1, "packid.UserUriRepo"
		 android.util.Log .w ( v1,v0 );
	 } // :cond_0
	 return;
} // .end method
public fr.mbs.binary.Octets b ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/service/NoUserException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
(( e.h.d.a.a.s.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/s/i0;->c()[B
fr.mbs.binary.Octets .createOctets ( v0 );
} // .end method
public final c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/service/NoUserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.h.d.a.a.s.i0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/d/a/a/s/i0;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.h.d.a.a.s.i0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/s/i0;->d()Ljava/io/File;
e.f.b.c.s .b ( v0 );
/* .line 3 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/NoUserException; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/service/NoUserException;-><init>()V */
/* throw v0 */
} // .end method
public final java.io.File d ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
v1 = this.a;
(( android.content.Context ) v1 ).getFilesDir ( ); // invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
final String v2 = "uri.cfg"; // const-string v2, "uri.cfg"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public final Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
(( e.h.d.a.a.s.i0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/s/i0;->d()Ljava/io/File;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
} // .end method
