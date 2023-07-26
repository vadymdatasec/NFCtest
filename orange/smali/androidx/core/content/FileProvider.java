public class androidx.core.content.FileProvider extends android.content.ContentProvider {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/core/content/FileProvider$b;, */
	 /* Landroidx/core/content/FileProvider$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String c;
public static final java.io.File d;
public static java.util.HashMap e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap<", */
/* "Ljava/lang/String;", */
/* "Landroidx/core/content/FileProvider$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public androidx.core.content.FileProvider$a b;
/* # direct methods */
public static androidx.core.content.FileProvider ( ) {
/* .locals 2 */
final String v0 = "_display_name"; // const-string v0, "_display_name"
final String v1 = "_size"; // const-string v1, "_size"
/* .line 1 */
/* filled-new-array {v0, v1}, [Ljava/lang/String; */
/* .line 2 */
/* new-instance v0, Ljava/io/File; */
final String v1 = "/"; // const-string v1, "/"
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public androidx.core.content.FileProvider ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V */
return;
} // .end method
public static Integer a ( java.lang.String p0 ) {
/* .locals 3 */
final String v0 = "r"; // const-string v0, "r"
/* .line 10 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/high16 p0, 0x10000000 */
} // :cond_0
final String v0 = "w"; // const-string v0, "w"
/* .line 11 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_5 */
final String v0 = "wt"; // const-string v0, "wt"
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
final String v0 = "wa"; // const-string v0, "wa"
/* .line 12 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* const/high16 p0, 0x2a000000 */
} // :cond_2
final String v0 = "rw"; // const-string v0, "rw"
/* .line 13 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* const/high16 p0, 0x38000000 */
} // :cond_3
final String v0 = "rwt"; // const-string v0, "rwt"
/* .line 14 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* const/high16 p0, 0x3c000000 # 0.0078125f */
/* .line 15 */
} // :cond_4
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid mode: "; // const-string v2, "Invalid mode: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_5
} // :goto_0
/* const/high16 p0, 0x2c000000 */
} // :goto_1
} // .end method
public static android.net.Uri a ( android.content.Context p0, java.lang.String p1, java.io.File p2 ) {
/* .locals 0 */
/* .line 1 */
androidx.core.content.FileProvider .a ( p0,p1 );
/* .line 2 */
} // .end method
public static androidx.core.content.FileProvider$a a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 3 */
v0 = androidx.core.content.FileProvider.e;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
v1 = androidx.core.content.FileProvider.e;
(( java.util.HashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroidx/core/content/FileProvider$a; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v1, :cond_0 */
/* .line 5 */
try { // :try_start_1
androidx.core.content.FileProvider .b ( p0,p1 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 6 */
try { // :try_start_2
p0 = androidx.core.content.FileProvider.e;
(( java.util.HashMap ) p0 ).put ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :catch_0 */
/* move-exception p0 */
/* .line 7 */
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"; // const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
/* invoke-direct {p1, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p1 */
/* :catch_1 */
/* move-exception p0 */
/* .line 8 */
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"; // const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
/* invoke-direct {p1, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p1 */
/* .line 9 */
} // :cond_0
} // :goto_0
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw p0 */
} // .end method
public static java.io.File a ( java.io.File p0, java.lang.String...p1 ) {
/* .locals 4 */
/* .line 16 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* aget-object v2, p1, v1 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 17 */
/* new-instance v3, Ljava/io/File; */
/* invoke-direct {v3, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* move-object p0, v3 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public static java.lang.Object a ( java.lang.Object[] p0, Integer p1 ) {
/* .locals 2 */
/* .line 20 */
/* new-array v0, p1, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* .line 21 */
java.lang.System .arraycopy ( p0,v1,v0,v1,p1 );
} // .end method
public static java.lang.String a ( java.lang.String[] p0, Integer p1 ) {
/* .locals 2 */
/* .line 18 */
/* new-array v0, p1, [Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .line 19 */
java.lang.System .arraycopy ( p0,v1,v0,v1,p1 );
} // .end method
public static androidx.core.content.FileProvider$a b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/xmlpull/v1/XmlPullParserException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Landroidx/core/content/FileProvider$b; */
/* invoke-direct {v0, p1}, Landroidx/core/content/FileProvider$b;-><init>(Ljava/lang/String;)V */
/* .line 2 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/16 v2, 0x80 */
/* .line 3 */
(( android.content.pm.PackageManager ) v1 ).resolveContentProvider ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 4 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v2 = "android.support.FILE_PROVIDER_PATHS"; // const-string v2, "android.support.FILE_PROVIDER_PATHS"
/* .line 5 */
(( android.content.pm.ProviderInfo ) v1 ).loadXmlMetaData ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroid/content/pm/ProviderInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;
if ( p1 != null) { // if-eqz p1, :cond_9
/* .line 6 */
} // :cond_0
v1 = } // :goto_0
int v2 = 1; // const/4 v2, 0x1
/* if-eq v1, v2, :cond_8 */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v1, v3, :cond_0 */
/* .line 7 */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "name"; // const-string v4, "name"
/* .line 8 */
final String v5 = "path"; // const-string v5, "path"
/* .line 9 */
final String v6 = "root-path"; // const-string v6, "root-path"
/* .line 10 */
v6 = (( java.lang.String ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v7 = 0; // const/4 v7, 0x0
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 11 */
v3 = androidx.core.content.FileProvider.d;
} // :cond_1
final String v6 = "files-path"; // const-string v6, "files-path"
/* .line 12 */
v6 = (( java.lang.String ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 13 */
(( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
} // :cond_2
final String v6 = "cache-path"; // const-string v6, "cache-path"
/* .line 14 */
v6 = (( java.lang.String ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 15 */
(( android.content.Context ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
} // :cond_3
final String v6 = "external-path"; // const-string v6, "external-path"
/* .line 16 */
v6 = (( java.lang.String ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 17 */
android.os.Environment .getExternalStorageDirectory ( );
} // :cond_4
final String v6 = "external-files-path"; // const-string v6, "external-files-path"
/* .line 18 */
v6 = (( java.lang.String ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 19 */
c.h.f.f .b ( p0,v3 );
/* .line 20 */
/* array-length v6, v1 */
/* if-lez v6, :cond_7 */
/* .line 21 */
/* aget-object v3, v1, v7 */
} // :cond_5
final String v6 = "external-cache-path"; // const-string v6, "external-cache-path"
/* .line 22 */
v6 = (( java.lang.String ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 23 */
c.h.f.f .b ( p0 );
/* .line 24 */
/* array-length v6, v1 */
/* if-lez v6, :cond_7 */
/* .line 25 */
/* aget-object v3, v1, v7 */
/* .line 26 */
} // :cond_6
/* const/16 v8, 0x15 */
/* if-lt v6, v8, :cond_7 */
final String v6 = "external-media-path"; // const-string v6, "external-media-path"
/* .line 27 */
v1 = (( java.lang.String ) v6 ).equals ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 28 */
(( android.content.Context ) p0 ).getExternalMediaDirs ( ); // invoke-virtual {p0}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;
/* .line 29 */
/* array-length v6, v1 */
/* if-lez v6, :cond_7 */
/* .line 30 */
/* aget-object v3, v1, v7 */
} // :cond_7
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_0
/* new-array v1, v2, [Ljava/lang/String; */
/* aput-object v5, v1, v7 */
/* .line 31 */
androidx.core.content.FileProvider .a ( v3,v1 );
(( androidx.core.content.FileProvider$b ) v0 ).a ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroidx/core/content/FileProvider$b;->a(Ljava/lang/String;Ljava/io/File;)V
/* goto/16 :goto_0 */
} // :cond_8
/* .line 32 */
} // :cond_9
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"; // const-string p1, "Missing android.support.FILE_PROVIDER_PATHS meta-data"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 33 */
} // :cond_a
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Couldn\'t find meta-data for provider with authority "; // const-string v1, "Couldn\'t find meta-data for provider with authority "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public void attachInfo ( android.content.Context p0, android.content.pm.ProviderInfo p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V */
/* .line 2 */
/* iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z */
/* if-nez v0, :cond_1 */
/* .line 3 */
/* iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
p2 = this.authority;
final String v0 = ";"; // const-string v0, ";"
(( java.lang.String ) p2 ).split ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
/* aget-object p2, p2, v0 */
androidx.core.content.FileProvider .a ( p1,p2 );
this.b = p1;
return;
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/SecurityException; */
final String p2 = "Provider must grant uri permissions"; // const-string p2, "Provider must grant uri permissions"
/* invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/SecurityException; */
final String p2 = "Provider must not be exported"; // const-string p2, "Provider must not be exported"
/* invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Integer delete ( android.net.Uri p0, java.lang.String p1, java.lang.String[] p2 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.b;
/* .line 2 */
p1 = (( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
} // .end method
public java.lang.String getType ( android.net.Uri p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* .line 2 */
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
/* const/16 v1, 0x2e */
v0 = (( java.lang.String ) v0 ).lastIndexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I
/* if-ltz v0, :cond_0 */
/* .line 3 */
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
/* add-int/lit8 v0, v0, 0x1 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 4 */
android.webkit.MimeTypeMap .getSingleton ( );
(( android.webkit.MimeTypeMap ) v0 ).getMimeTypeFromExtension ( p1 ); // invoke-virtual {v0, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
final String p1 = "application/octet-stream"; // const-string p1, "application/octet-stream"
} // .end method
public android.net.Uri insert ( android.net.Uri p0, android.content.ContentValues p1 ) {
/* .locals 0 */
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String p2 = "No external inserts"; // const-string p2, "No external inserts"
/* invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Boolean onCreate ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public android.os.ParcelFileDescriptor openFile ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnknownNullness" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* .line 2 */
p2 = androidx.core.content.FileProvider .a ( p2 );
/* .line 3 */
android.os.ParcelFileDescriptor .open ( p1,p2 );
} // .end method
public android.database.Cursor query ( android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4 ) {
/* .locals 6 */
/* .line 1 */
p3 = this.b;
final String p4 = "displayName"; // const-string p4, "displayName"
/* .line 2 */
(( android.net.Uri ) p1 ).getQueryParameter ( p4 ); // invoke-virtual {p1, p4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
/* if-nez p2, :cond_0 */
/* .line 3 */
p2 = androidx.core.content.FileProvider.c;
/* .line 4 */
} // :cond_0
/* array-length p4, p2 */
/* new-array p4, p4, [Ljava/lang/String; */
/* .line 5 */
/* array-length p5, p2 */
/* new-array p5, p5, [Ljava/lang/Object; */
/* .line 6 */
/* array-length v0, p2 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_4 */
/* aget-object v3, p2, v1 */
final String v4 = "_display_name"; // const-string v4, "_display_name"
/* .line 7 */
v5 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 8 */
/* aput-object v4, p4, v2 */
/* add-int/lit8 v3, v2, 0x1 */
/* if-nez p1, :cond_1 */
/* .line 9 */
(( java.io.File ) p3 ).getName ( ); // invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;
} // :cond_1
/* move-object v4, p1 */
} // :goto_1
/* aput-object v4, p5, v2 */
} // :cond_2
final String v4 = "_size"; // const-string v4, "_size"
/* .line 10 */
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 11 */
/* aput-object v4, p4, v2 */
/* add-int/lit8 v3, v2, 0x1 */
/* .line 12 */
(( java.io.File ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/io/File;->length()J
/* move-result-wide v4 */
java.lang.Long .valueOf ( v4,v5 );
/* aput-object v4, p5, v2 */
} // :goto_2
/* move v2, v3 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* .line 13 */
} // :cond_4
androidx.core.content.FileProvider .a ( p4,v2 );
/* .line 14 */
androidx.core.content.FileProvider .a ( p5,v2 );
/* .line 15 */
/* new-instance p3, Landroid/database/MatrixCursor; */
int p4 = 1; // const/4 p4, 0x1
/* invoke-direct {p3, p1, p4}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V */
/* .line 16 */
(( android.database.MatrixCursor ) p3 ).addRow ( p2 ); // invoke-virtual {p3, p2}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V
} // .end method
public Integer update ( android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3 ) {
/* .locals 0 */
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String p2 = "No external updates"; // const-string p2, "No external updates"
/* invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
