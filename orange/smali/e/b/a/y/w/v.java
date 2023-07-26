public class e.b.a.y.w.v extends e.b.a.y.w.s {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/w/s<", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.content.UriMatcher e;
/* # direct methods */
public static e.b.a.y.w.v ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* new-instance v0, Landroid/content/UriMatcher; */
	 int v1 = -1; // const/4 v1, -0x1
	 /* invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V */
	 int v1 = 1; // const/4 v1, 0x1
	 final String v2 = "com.android.contacts"; // const-string v2, "com.android.contacts"
	 final String v3 = "contacts/lookup/*/#"; // const-string v3, "contacts/lookup/*/#"
	 /* .line 2 */
	 (( android.content.UriMatcher ) v0 ).addURI ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V
	 /* .line 3 */
	 v0 = e.b.a.y.w.v.e;
	 final String v3 = "contacts/lookup/*"; // const-string v3, "contacts/lookup/*"
	 (( android.content.UriMatcher ) v0 ).addURI ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V
	 /* .line 4 */
	 v0 = e.b.a.y.w.v.e;
	 final String v1 = "contacts/#/photo"; // const-string v1, "contacts/#/photo"
	 int v3 = 2; // const/4 v3, 0x2
	 (( android.content.UriMatcher ) v0 ).addURI ( v2, v1, v3 ); // invoke-virtual {v0, v2, v1, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V
	 /* .line 5 */
	 v0 = e.b.a.y.w.v.e;
	 final String v1 = "contacts/#"; // const-string v1, "contacts/#"
	 int v3 = 3; // const/4 v3, 0x3
	 (( android.content.UriMatcher ) v0 ).addURI ( v2, v1, v3 ); // invoke-virtual {v0, v2, v1, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V
	 /* .line 6 */
	 v0 = e.b.a.y.w.v.e;
	 final String v1 = "contacts/#/display_photo"; // const-string v1, "contacts/#/display_photo"
	 int v3 = 4; // const/4 v3, 0x4
	 (( android.content.UriMatcher ) v0 ).addURI ( v2, v1, v3 ); // invoke-virtual {v0, v2, v1, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V
	 /* .line 7 */
	 v0 = e.b.a.y.w.v.e;
	 final String v1 = "phone_lookup/*"; // const-string v1, "phone_lookup/*"
	 int v3 = 5; // const/4 v3, 0x5
	 (( android.content.UriMatcher ) v0 ).addURI ( v2, v1, v3 ); // invoke-virtual {v0, v2, v1, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V
	 return;
} // .end method
public e.b.a.y.w.v ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2}, Le/b/a/y/w/s;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V */
	 return;
} // .end method
/* # virtual methods */
public final java.io.InputStream a ( android.content.ContentResolver p0, android.net.Uri p1 ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 5 */
	 android.provider.ContactsContract$Contacts .openContactPhotoInputStream ( p1,p2,v0 );
} // .end method
public java.io.InputStream a ( android.net.Uri p0, android.content.ContentResolver p1 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/FileNotFoundException; */
	 /* } */
} // .end annotation
/* .line 3 */
(( e.b.a.y.w.v ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/w/v;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/io/InputStream;
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 4 */
} // :cond_0
/* new-instance p2, Ljava/io/FileNotFoundException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "InputStream is null for "; // const-string v1, "InputStream is null for "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "Ljava/io/InputStream;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 7 */
/* const-class v0, Ljava/io/InputStream; */
} // .end method
public java.lang.Object a ( android.net.Uri p0, android.content.ContentResolver p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.y.w.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/w/v;->a(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/io/InputStream;
} // .end method
public void a ( java.io.InputStream p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 6 */
(( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
return;
} // .end method
public void a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Ljava/io/InputStream; */
(( e.b.a.y.w.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/w/v;->a(Ljava/io/InputStream;)V
return;
} // .end method
public final java.io.InputStream b ( android.net.Uri p0, android.content.ContentResolver p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.b.a.y.w.v.e;
v0 = (( android.content.UriMatcher ) v0 ).match ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_1 */
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_0 */
int v1 = 5; // const/4 v1, 0x5
/* if-eq v0, v1, :cond_1 */
/* .line 2 */
(( android.content.ContentResolver ) p2 ).openInputStream ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* .line 3 */
} // :cond_0
(( e.b.a.y.w.v ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/b/a/y/w/v;->a(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/io/InputStream;
/* .line 4 */
} // :cond_1
android.provider.ContactsContract$Contacts .lookupContact ( p2,p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
(( e.b.a.y.w.v ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/b/a/y/w/v;->a(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/io/InputStream;
/* .line 6 */
} // :cond_2
/* new-instance p1, Ljava/io/FileNotFoundException; */
final String p2 = "Contact cannot be found"; // const-string p2, "Contact cannot be found"
/* invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
