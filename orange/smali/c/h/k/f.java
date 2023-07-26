public abstract class c.h.k.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.Comparator a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Comparator<", */
	 /* "[B>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.h.k.f ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/h/k/e; */
/* invoke-direct {v0}, Lc/h/k/e;-><init>()V */
return;
} // .end method
public static android.content.pm.ProviderInfo a ( android.content.pm.PackageManager p0, Object p1, android.content.res.Resources p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/pm/PackageManager$NameNotFoundException; */
/* } */
} // .end annotation
/* .line 6 */
(( c.h.k.g ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/k/g;->d()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
(( android.content.pm.PackageManager ) p0 ).resolveContentProvider ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 8 */
v3 = this.packageName;
(( c.h.k.g ) p1 ).e ( ); // invoke-virtual {p1}, Lc/h/k/g;->e()Ljava/lang/String;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
	 /* .line 9 */
	 v0 = this.packageName;
	 /* const/16 v3, 0x40 */
	 (( android.content.pm.PackageManager ) p0 ).getPackageInfo ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
	 /* .line 10 */
	 p0 = this.signatures;
	 c.h.k.f .a ( p0 );
	 /* .line 11 */
	 v0 = c.h.k.f.a;
	 java.util.Collections .sort ( p0,v0 );
	 /* .line 12 */
	 c.h.k.f .a ( p1,p2 );
	 /* .line 13 */
p2 = } // :goto_0
/* if-ge v1, p2, :cond_1 */
/* .line 14 */
/* new-instance p2, Ljava/util/ArrayList; */
/* check-cast v0, Ljava/util/Collection; */
/* invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 15 */
v0 = c.h.k.f.a;
java.util.Collections .sort ( p2,v0 );
/* .line 16 */
p2 = c.h.k.f .a ( p0,p2 );
if ( p2 != null) { // if-eqz p2, :cond_0
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
/* .line 17 */
} // :cond_2
/* new-instance p0, Landroid/content/pm/PackageManager$NameNotFoundException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Found content provider "; // const-string v1, "Found content provider "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ", but package was not "; // const-string v0, ", but package was not "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
(( c.h.k.g ) p1 ).e ( ); // invoke-virtual {p1}, Lc/h/k/g;->e()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 19 */
} // :cond_3
/* new-instance p0, Landroid/content/pm/PackageManager$NameNotFoundException; */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String p2 = "No package found for authority: "; // const-string p2, "No package found for authority: "
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static c.h.k.n a ( android.content.Context p0, Object p1, android.os.CancellationSignal p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/pm/PackageManager$NameNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2 */
c.h.k.f .a ( v0,p1,v1 );
/* if-nez v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
c.h.k.n .a ( p0,p1 );
/* .line 4 */
} // :cond_0
v0 = this.authority;
c.h.k.f .a ( p0,p1,v0,p2 );
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
c.h.k.n .a ( p1,p0 );
} // .end method
public static java.util.List a ( Object p0, android.content.res.Resources p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/h/k/g;", */
/* "Landroid/content/res/Resources;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/util/List<", */
/* "[B>;>;" */
/* } */
} // .end annotation
/* .line 58 */
(( c.h.k.g ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/k/g;->a()Ljava/util/List;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 59 */
(( c.h.k.g ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/k/g;->a()Ljava/util/List;
/* .line 60 */
} // :cond_0
p0 = (( c.h.k.g ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/k/g;->b()I
/* .line 61 */
c.h.f.i.i .a ( p1,p0 );
} // .end method
public static java.util.List a ( android.content.pm.Signature[] p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Landroid/content/pm/Signature;", */
/* ")", */
/* "Ljava/util/List<", */
/* "[B>;" */
/* } */
} // .end annotation
/* .line 65 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 66 */
} // :goto_0
/* array-length v2, p0 */
/* if-ge v1, v2, :cond_0 */
/* .line 67 */
/* aget-object v2, p0, v1 */
(( android.content.pm.Signature ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Landroid/content/pm/Signature;->toByteArray()[B
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
public static Boolean a ( java.util.List p0, java.util.List p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "[B>;", */
/* "Ljava/util/List<", */
/* "[B>;)Z" */
/* } */
} // .end annotation
v1 = v0 = /* .line 62 */
int v2 = 0; // const/4 v2, 0x0
/* if-eq v0, v1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 63 */
v1 = } // :goto_0
/* if-ge v0, v1, :cond_2 */
/* .line 64 */
/* check-cast v1, [B */
/* check-cast v3, [B */
v1 = java.util.Arrays .equals ( v1,v3 );
/* if-nez v1, :cond_1 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static c.h.k.o a ( android.content.Context p0, Object p1, java.lang.String p2, android.os.CancellationSignal p3 ) {
/* .locals 16 */
/* move-object/from16 v0, p2 */
/* .line 20 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 21 */
/* new-instance v2, Landroid/net/Uri$Builder; */
/* invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V */
final String v3 = "content"; // const-string v3, "content"
(( android.net.Uri$Builder ) v2 ).scheme ( v3 ); // invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 22 */
(( android.net.Uri$Builder ) v2 ).authority ( v0 ); // invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 23 */
(( android.net.Uri$Builder ) v2 ).build ( ); // invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
/* .line 24 */
/* new-instance v4, Landroid/net/Uri$Builder; */
/* invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V */
(( android.net.Uri$Builder ) v4 ).scheme ( v3 ); // invoke-virtual {v4, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 25 */
(( android.net.Uri$Builder ) v3 ).authority ( v0 ); // invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
final String v3 = "file"; // const-string v3, "file"
/* .line 26 */
(( android.net.Uri$Builder ) v0 ).appendPath ( v3 ); // invoke-virtual {v0, v3}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 27 */
(( android.net.Uri$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
int v3 = 0; // const/4 v3, 0x0
try { // :try_start_0
final String v4 = "_id"; // const-string v4, "_id"
final String v5 = "file_id"; // const-string v5, "file_id"
final String v6 = "font_ttc_index"; // const-string v6, "font_ttc_index"
final String v7 = "font_variation_settings"; // const-string v7, "font_variation_settings"
final String v8 = "font_weight"; // const-string v8, "font_weight"
final String v9 = "font_italic"; // const-string v9, "font_italic"
final String v10 = "result_code"; // const-string v10, "result_code"
/* .line 28 */
/* filled-new-array/range {v4 ..v10}, [Ljava/lang/String; */
/* .line 29 */
/* const/16 v5, 0x10 */
int v11 = 1; // const/4 v11, 0x1
int v12 = 0; // const/4 v12, 0x0
/* if-le v4, v5, :cond_0 */
/* .line 30 */
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver; */
final String v7 = "query = ?"; // const-string v7, "query = ?"
/* new-array v8, v11, [Ljava/lang/String; */
/* .line 31 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/k/g;->f()Ljava/lang/String; */
/* aput-object v5, v8, v12 */
int v9 = 0; // const/4 v9, 0x0
/* move-object v5, v2 */
/* move-object/from16 v10, p3 */
/* .line 32 */
/* invoke-virtual/range {v4 ..v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor; */
/* .line 33 */
} // :cond_0
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver; */
final String v7 = "query = ?"; // const-string v7, "query = ?"
/* new-array v8, v11, [Ljava/lang/String; */
/* .line 34 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/k/g;->f()Ljava/lang/String; */
/* aput-object v5, v8, v12 */
int v9 = 0; // const/4 v9, 0x0
/* move-object v5, v2 */
/* .line 35 */
/* invoke-virtual/range {v4 ..v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_7
v4 = /* .line 36 */
/* if-lez v4, :cond_7 */
final String v1 = "result_code"; // const-string v1, "result_code"
v1 = /* .line 37 */
/* .line 38 */
/* new-instance v4, Ljava/util/ArrayList; */
/* invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V */
final String v5 = "_id"; // const-string v5, "_id"
v5 = /* .line 39 */
final String v6 = "file_id"; // const-string v6, "file_id"
v6 = /* .line 40 */
final String v7 = "font_ttc_index"; // const-string v7, "font_ttc_index"
v7 = /* .line 41 */
final String v8 = "font_weight"; // const-string v8, "font_weight"
v8 = /* .line 42 */
final String v9 = "font_italic"; // const-string v9, "font_italic"
v9 = /* .line 43 */
/* .line 44 */
v10 = } // :goto_1
if ( v10 != null) { // if-eqz v10, :cond_6
int v10 = -1; // const/4 v10, -0x1
/* if-eq v1, v10, :cond_1 */
v13 = /* .line 45 */
} // :cond_1
int v13 = 0; // const/4 v13, 0x0
} // :goto_2
/* if-eq v7, v10, :cond_2 */
v14 = /* .line 46 */
} // :cond_2
int v14 = 0; // const/4 v14, 0x0
} // :goto_3
/* if-ne v6, v10, :cond_3 */
/* move/from16 p0, v13 */
/* .line 47 */
/* move-result-wide v12 */
/* .line 48 */
android.content.ContentUris .withAppendedId ( v2,v12,v13 );
} // :cond_3
/* move/from16 p0, v13 */
/* .line 49 */
/* move-result-wide v12 */
/* .line 50 */
android.content.ContentUris .withAppendedId ( v0,v12,v13 );
} // :goto_4
/* if-eq v8, v10, :cond_4 */
v13 = /* .line 51 */
} // :cond_4
/* const/16 v13, 0x190 */
} // :goto_5
/* if-eq v9, v10, :cond_5 */
v10 = /* .line 52 */
/* if-ne v10, v11, :cond_5 */
int v15 = 1; // const/4 v15, 0x1
} // :cond_5
int v15 = 0; // const/4 v15, 0x0
} // :goto_6
/* move/from16 v10, p0 */
/* .line 53 */
c.h.k.o .a ( v12,v14,v13,v15,v10 );
(( java.util.ArrayList ) v4 ).add ( v10 ); // invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v12 = 0; // const/4 v12, 0x0
} // :cond_6
/* move-object v1, v4 */
} // :cond_7
if ( v3 != null) { // if-eqz v3, :cond_8
/* .line 54 */
} // :cond_8
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Lc/h/k/o; */
/* .line 55 */
(( java.util.ArrayList ) v1 ).toArray ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v0, [Lc/h/k/o; */
/* :catchall_0 */
/* move-exception v0 */
if ( v3 != null) { // if-eqz v3, :cond_9
/* .line 56 */
/* .line 57 */
} // :cond_9
/* throw v0 */
} // .end method
