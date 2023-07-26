public class e.b.a.y.y.q0 implements e.b.a.y.w.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/w/e<", */
	 /* "Ljava/io/File;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String d;
/* # instance fields */
public final android.content.Context b;
public final android.net.Uri c;
/* # direct methods */
public static e.b.a.y.y.q0 ( ) {
	 /* .locals 1 */
	 final String v0 = "_data"; // const-string v0, "_data"
	 /* .line 1 */
	 /* filled-new-array {v0}, [Ljava/lang/String; */
	 return;
} // .end method
public e.b.a.y.y.q0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.b = p1;
	 /* .line 3 */
	 this.c = p2;
	 return;
} // .end method
/* # virtual methods */
public java.lang.Class a ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()", */
	 /* "Ljava/lang/Class<", */
	 /* "Ljava/io/File;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .line 11 */
/* const-class v0, Ljava/io/File; */
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/n;", */
/* "Le/b/a/y/w/d<", */
/* "-", */
/* "Ljava/io/File;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
p1 = this.b;
/* .line 2 */
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
v1 = this.c;
v2 = e.b.a.y.y.q0.d;
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 3 */
/* invoke-virtual/range {v0 ..v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
	 v1 = try { // :try_start_0
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 final String v0 = "_data"; // const-string v0, "_data"
		 v0 = 		 /* .line 5 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 6 */
	 } // :cond_0
	 /* :catchall_0 */
	 /* move-exception p2 */
	 /* .line 7 */
	 /* throw p2 */
	 /* .line 8 */
} // :cond_1
} // :goto_0
p1 = android.text.TextUtils .isEmpty ( v0 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 9 */
/* new-instance p1, Ljava/io/FileNotFoundException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Failed to find file path for: "; // const-string v1, "Failed to find file path for: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* .line 10 */
} // :cond_2
/* new-instance p1, Ljava/io/File; */
/* invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
} // :goto_1
return;
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
public e.b.a.y.a c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.a.b;
} // .end method
public void cancel ( ) {
/* .locals 0 */
return;
} // .end method
