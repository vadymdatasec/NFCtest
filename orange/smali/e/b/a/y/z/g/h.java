public class e.b.a.y.z.g.h implements e.b.a.y.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/t<", */
	 /* "Landroid/net/Uri;", */
	 /* "Landroid/graphics/drawable/Drawable;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.b.a.y.q b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/q<", */
/* "Landroid/content/res/Resources$Theme;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.content.Context a;
/* # direct methods */
public static e.b.a.y.z.g.h ( ) {
/* .locals 1 */
final String v0 = "com.bumptech.glide.load.resource.bitmap.Downsampler.Theme"; // const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.Theme"
/* .line 1 */
e.b.a.y.q .a ( v0 );
return;
} // .end method
public e.b.a.y.z.g.h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.a = p1;
return;
} // .end method
/* # virtual methods */
public final Integer a ( android.content.Context p0, android.net.Uri p1 ) {
/* .locals 4 */
/* .line 21 */
(( android.net.Uri ) p2 ).getPathSegments ( ); // invoke-virtual {p2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
/* .line 22 */
(( android.net.Uri ) p2 ).getAuthority ( ); // invoke-virtual {p2}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* .line 23 */
/* check-cast v2, Ljava/lang/String; */
int v3 = 1; // const/4 v3, 0x1
/* .line 24 */
/* check-cast v0, Ljava/lang/String; */
/* .line 25 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
p1 = (( android.content.res.Resources ) p1 ).getIdentifier ( v0, v2, v1 ); // invoke-virtual {p1, v0, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* if-nez p1, :cond_0 */
/* .line 26 */
android.content.res.Resources .getSystem ( );
final String v1 = "android"; // const-string v1, "android"
p1 = (( android.content.res.Resources ) p1 ).getIdentifier ( v0, v2, v1 ); // invoke-virtual {p1, v0, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 27 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Failed to find resource id for: "; // const-string v1, "Failed to find resource id for: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Integer a ( android.net.Uri p0 ) {
/* .locals 4 */
/* .line 28 */
(( android.net.Uri ) p1 ).getPathSegments ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
int v1 = 0; // const/4 v1, 0x0
/* .line 29 */
try { // :try_start_0
/* check-cast v0, Ljava/lang/String; */
p1 = java.lang.Integer .parseInt ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 30 */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unrecognized Uri format: "; // const-string v3, "Unrecognized Uri format: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public final android.content.Context a ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 3 */
/* .line 15 */
v0 = this.a;
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
p1 = this.a;
/* .line 17 */
} // :cond_0
try { // :try_start_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) v0 ).createPackageContext ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 18 */
v1 = this.a;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
p2 = (( java.lang.String ) p2 ).contains ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( p2 != null) { // if-eqz p2, :cond_1
	 /* .line 19 */
	 p1 = this.a;
	 /* .line 20 */
} // :cond_1
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to obtain context or unrecognized Uri format for: "; // const-string v2, "Failed to obtain context or unrecognized Uri format for: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
} // .end method
public e.b.a.y.x.y0 a ( android.net.Uri p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 5 */
(( android.net.Uri ) p1 ).getAuthority ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;
/* .line 6 */
p3 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez p3, :cond_2 */
/* .line 7 */
(( e.b.a.y.z.g.h ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/g/h;->a(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Context;
/* .line 8 */
p1 = (( e.b.a.y.z.g.h ) p0 ).b ( p3, p1 ); // invoke-virtual {p0, p3, p1}, Le/b/a/y/z/g/h;->b(Landroid/content/Context;Landroid/net/Uri;)I
/* .line 9 */
e.b.a.e0.r .a ( p2 );
/* check-cast p2, Ljava/lang/String; */
v0 = this.a;
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
p2 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 10 */
p2 = e.b.a.y.z.g.h.b;
(( e.b.a.y.r ) p4 ).a ( p2 ); // invoke-virtual {p4, p2}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast p2, Landroid/content/res/Resources$Theme; */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
/* if-nez p2, :cond_1 */
/* .line 11 */
p2 = this.a;
e.b.a.y.z.g.e .a ( p2,p3,p1 );
/* .line 12 */
} // :cond_1
p3 = this.a;
e.b.a.y.z.g.e .a ( p3,p1,p2 );
/* .line 13 */
} // :goto_1
e.b.a.y.z.g.g .a ( p1 );
/* .line 14 */
} // :cond_2
/* new-instance p2, Ljava/lang/IllegalStateException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String p4 = "Package name for "; // const-string p4, "Package name for "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " is null or empty"; // const-string p1, " is null or empty"
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public e.b.a.y.x.y0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Landroid/net/Uri; */
(( e.b.a.y.z.g.h ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/g/h;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/x/y0;
} // .end method
public Boolean a ( android.net.Uri p0, Object p1 ) {
/* .locals 0 */
/* .line 3 */
(( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
final String p2 = "android.resource"; // const-string p2, "android.resource"
/* .line 4 */
p1 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( java.lang.Object p0, Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p1, Landroid/net/Uri; */
p1 = (( e.b.a.y.z.g.h ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/g/h;->a(Landroid/net/Uri;Le/b/a/y/r;)Z
} // .end method
public final Integer b ( android.content.Context p0, android.net.Uri p1 ) {
/* .locals 3 */
/* .line 1 */
(( android.net.Uri ) p2 ).getPathSegments ( ); // invoke-virtual {p2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
v1 = /* .line 2 */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_0 */
/* .line 3 */
p1 = (( e.b.a.y.z.g.h ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/g/h;->a(Landroid/content/Context;Landroid/net/Uri;)I
/* .line 4 */
p1 = } // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_1 */
/* .line 5 */
p1 = (( e.b.a.y.z.g.h ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/b/a/y/z/g/h;->a(Landroid/net/Uri;)I
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Unrecognized Uri format: "; // const-string v1, "Unrecognized Uri format: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
