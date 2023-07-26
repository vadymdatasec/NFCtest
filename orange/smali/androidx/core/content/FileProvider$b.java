public class androidx.core.content.FileProvider$b implements androidx.core.content.FileProvider$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/core/content/FileProvider; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public final java.lang.String a;
public final java.util.HashMap b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap<", */
/* "Ljava/lang/String;", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public androidx.core.content.FileProvider$b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public android.net.Uri a ( java.io.File p0 ) {
/* .locals 5 */
/* .line 6 */
try { // :try_start_0
(( java.io.File ) p1 ).getCanonicalPath ( ); // invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
v1 = this.b;
(( java.util.HashMap ) v1 ).entrySet ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Ljava/util/Map$Entry; */
/* .line 8 */
/* check-cast v3, Ljava/io/File; */
(( java.io.File ) v3 ).getPath ( ); // invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
/* .line 9 */
v4 = (( java.lang.String ) p1 ).startsWith ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 10 */
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* check-cast v4, Ljava/io/File; */
(( java.io.File ) v4 ).getPath ( ); // invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-le v3, v4, :cond_0 */
} // :cond_1
/* move-object v0, v2 */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 11 */
/* check-cast v1, Ljava/io/File; */
(( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
final String v2 = "/"; // const-string v2, "/"
/* .line 12 */
v3 = (( java.lang.String ) v1 ).endsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 13 */
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
(( java.lang.String ) p1 ).substring ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 14 */
} // :cond_3
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.String ) p1 ).substring ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 15 */
} // :goto_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* check-cast v0, Ljava/lang/String; */
android.net.Uri .encode ( v0 );
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v0, 0x2f */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
android.net.Uri .encode ( p1,v2 );
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 16 */
/* new-instance v0, Landroid/net/Uri$Builder; */
/* invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V */
final String v1 = "content"; // const-string v1, "content"
(( android.net.Uri$Builder ) v0 ).scheme ( v1 ); // invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
v1 = this.a;
/* .line 17 */
(( android.net.Uri$Builder ) v0 ).authority ( v1 ); // invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
(( android.net.Uri$Builder ) v0 ).encodedPath ( p1 ); // invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
(( android.net.Uri$Builder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
/* .line 18 */
} // :cond_4
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to find configured root that contains "; // const-string v2, "Failed to find configured root that contains "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 19 */
/* :catch_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to resolve canonical path for "; // const-string v2, "Failed to resolve canonical path for "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.io.File a ( android.net.Uri p0 ) {
/* .locals 4 */
/* .line 20 */
(( android.net.Uri ) p1 ).getEncodedPath ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
/* const/16 v2, 0x2f */
/* .line 21 */
v2 = (( java.lang.String ) v0 ).indexOf ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/lang/String;->indexOf(II)I
/* .line 22 */
(( java.lang.String ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
android.net.Uri .decode ( v3 );
/* add-int/2addr v2, v1 */
/* .line 23 */
(( java.lang.String ) v0 ).substring ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
android.net.Uri .decode ( v0 );
/* .line 24 */
v1 = this.b;
(( java.util.HashMap ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/io/File; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 25 */
/* new-instance p1, Ljava/io/File; */
/* invoke-direct {p1, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 26 */
try { // :try_start_0
(( java.io.File ) p1 ).getCanonicalFile ( ); // invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 27 */
(( java.io.File ) p1 ).getPath ( ); // invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 28 */
} // :cond_0
/* new-instance p1, Ljava/lang/SecurityException; */
final String v0 = "Resolved path jumped beyond configured root"; // const-string v0, "Resolved path jumped beyond configured root"
/* invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 29 */
/* :catch_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to resolve canonical path for "; // const-string v2, "Failed to resolve canonical path for "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 30 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unable to find configured root for "; // const-string v2, "Unable to find configured root for "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( java.lang.String p0, java.io.File p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_0 */
/* .line 2 */
try { // :try_start_0
(( java.io.File ) p2 ).getCanonicalFile ( ); // invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3 */
v0 = this.b;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 4 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to resolve canonical path for "; // const-string v2, "Failed to resolve canonical path for "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Name must not be empty"; // const-string p2, "Name must not be empty"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
