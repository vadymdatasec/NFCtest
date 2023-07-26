public class e.b.a.y.x.f1.x implements e.b.a.y.x.f1.s {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.graphics.Bitmap$Config d;
	 public static final android.graphics.Bitmap$Config e;
	 public static final android.graphics.Bitmap$Config f;
	 public static final android.graphics.Bitmap$Config g;
	 public static final android.graphics.Bitmap$Config h;
	 /* # instance fields */
	 public final e.b.a.y.x.f1.w a;
	 public final e.b.a.y.x.f1.k b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/x/f1/k<", */
	 /* "Le/b/a/y/x/f1/v;", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Landroid/graphics/Bitmap$Config;", */
/* "Ljava/util/NavigableMap<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.y.x.f1.x ( ) {
/* .locals 5 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Landroid/graphics/Bitmap$Config; */
/* .line 1 */
v1 = android.graphics.Bitmap$Config.ARGB_8888;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
int v1 = 0; // const/4 v1, 0x0
int v3 = 1; // const/4 v3, 0x1
/* aput-object v1, v0, v3 */
/* .line 2 */
/* const/16 v4, 0x1a */
/* if-lt v1, v4, :cond_0 */
int v1 = 3; // const/4 v1, 0x3
/* .line 3 */
java.util.Arrays .copyOf ( v0,v1 );
/* check-cast v0, [Landroid/graphics/Bitmap$Config; */
/* .line 4 */
/* array-length v1, v0 */
/* sub-int/2addr v1, v3 */
v4 = android.graphics.Bitmap$Config.RGBA_F16;
/* aput-object v4, v0, v1 */
/* .line 5 */
} // :cond_0
/* .line 6 */
/* new-array v0, v3, [Landroid/graphics/Bitmap$Config; */
/* .line 7 */
v1 = android.graphics.Bitmap$Config.RGB_565;
/* aput-object v1, v0, v2 */
/* new-array v0, v3, [Landroid/graphics/Bitmap$Config; */
/* .line 8 */
v1 = android.graphics.Bitmap$Config.ARGB_4444;
/* aput-object v1, v0, v2 */
/* new-array v0, v3, [Landroid/graphics/Bitmap$Config; */
/* .line 9 */
v1 = android.graphics.Bitmap$Config.ALPHA_8;
/* aput-object v1, v0, v2 */
return;
} // .end method
public e.b.a.y.x.f1.x ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/b/a/y/x/f1/w; */
/* invoke-direct {v0}, Le/b/a/y/x/f1/w;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Le/b/a/y/x/f1/k; */
/* invoke-direct {v0}, Le/b/a/y/x/f1/k;-><init>()V */
this.b = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.c = v0;
return;
} // .end method
public static java.lang.String b ( Integer p0, android.graphics.Bitmap$Config p1 ) {
/* .locals 2 */
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = "]("; // const-string p0, "]("
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = ")"; // const-string p0, ")"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static android.graphics.Bitmap$Config b ( android.graphics.Bitmap$Config p0 ) {
/* .locals 3 */
/* .line 5 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
/* .line 6 */
v0 = android.graphics.Bitmap$Config.RGBA_F16;
v0 = (( android.graphics.Bitmap$Config ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Landroid/graphics/Bitmap$Config;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
p0 = e.b.a.y.x.f1.x.e;
/* .line 8 */
} // :cond_0
v0 = e.b.a.y.x.f1.u.a;
v1 = (( android.graphics.Bitmap$Config ) p0 ).ordinal ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap$Config;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_4 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq v0, v2, :cond_3 */
int v2 = 3; // const/4 v2, 0x3
/* if-eq v0, v2, :cond_2 */
int v2 = 4; // const/4 v2, 0x4
/* if-eq v0, v2, :cond_1 */
/* new-array v0, v1, [Landroid/graphics/Bitmap$Config; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p0, v0, v1 */
/* .line 9 */
} // :cond_1
p0 = e.b.a.y.x.f1.x.h;
/* .line 10 */
} // :cond_2
p0 = e.b.a.y.x.f1.x.g;
/* .line 11 */
} // :cond_3
p0 = e.b.a.y.x.f1.x.f;
/* .line 12 */
} // :cond_4
p0 = e.b.a.y.x.f1.x.d;
} // .end method
/* # virtual methods */
public android.graphics.Bitmap a ( ) {
/* .locals 2 */
/* .line 21 */
v0 = this.b;
(( e.b.a.y.x.f1.k ) v0 ).a ( ); // invoke-virtual {v0}, Le/b/a/y/x/f1/k;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 22 */
v1 = e.b.a.e0.t .a ( v0 );
/* .line 23 */
java.lang.Integer .valueOf ( v1 );
(( e.b.a.y.x.f1.x ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/b/a/y/x/f1/x;->a(Ljava/lang/Integer;Landroid/graphics/Bitmap;)V
} // :cond_0
} // .end method
public android.graphics.Bitmap a ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
/* .locals 2 */
/* .line 7 */
v0 = e.b.a.e0.t .a ( p1,p2,p3 );
/* .line 8 */
(( e.b.a.y.x.f1.x ) p0 ).a ( v0, p3 ); // invoke-virtual {p0, v0, p3}, Le/b/a/y/x/f1/x;->a(ILandroid/graphics/Bitmap$Config;)Le/b/a/y/x/f1/v;
/* .line 9 */
v1 = this.b;
(( e.b.a.y.x.f1.k ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/b/a/y/x/f1/k;->a(Le/b/a/y/x/f1/t;)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 10 */
/* iget v0, v0, Le/b/a/y/x/f1/v;->b:I */
java.lang.Integer .valueOf ( v0 );
(( e.b.a.y.x.f1.x ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/y/x/f1/x;->a(Ljava/lang/Integer;Landroid/graphics/Bitmap;)V
/* .line 11 */
(( android.graphics.Bitmap ) v1 ).reconfigure ( p1, p2, p3 ); // invoke-virtual {v1, p1, p2, p3}, Landroid/graphics/Bitmap;->reconfigure(IILandroid/graphics/Bitmap$Config;)V
} // :cond_0
} // .end method
public final e.b.a.y.x.f1.v a ( Integer p0, android.graphics.Bitmap$Config p1 ) {
/* .locals 8 */
/* .line 12 */
v0 = this.a;
(( e.b.a.y.x.f1.w ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/b/a/y/x/f1/w;->a(ILandroid/graphics/Bitmap$Config;)Le/b/a/y/x/f1/v;
/* .line 13 */
e.b.a.y.x.f1.x .b ( p2 );
/* array-length v2, v1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_3 */
/* aget-object v4, v1, v3 */
/* .line 14 */
(( e.b.a.y.x.f1.x ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Le/b/a/y/x/f1/x;->a(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;
/* .line 15 */
java.lang.Integer .valueOf ( p1 );
/* check-cast v5, Ljava/lang/Integer; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 16 */
v6 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
/* mul-int/lit8 v7, p1, 0x8 */
/* if-gt v6, v7, :cond_2 */
/* .line 17 */
v1 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
/* if-ne v1, p1, :cond_1 */
/* if-nez v4, :cond_0 */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 18 */
} // :cond_0
p1 = (( android.graphics.Bitmap$Config ) v4 ).equals ( p2 ); // invoke-virtual {v4, p2}, Landroid/graphics/Bitmap$Config;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_3 */
/* .line 19 */
} // :cond_1
} // :goto_1
p1 = this.a;
(( e.b.a.y.x.f1.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/b/a/y/x/f1/f;->a(Le/b/a/y/x/f1/t;)V
/* .line 20 */
p1 = this.a;
p2 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
(( e.b.a.y.x.f1.w ) p1 ).a ( p2, v4 ); // invoke-virtual {p1, p2, v4}, Le/b/a/y/x/f1/w;->a(ILandroid/graphics/Bitmap$Config;)Le/b/a/y/x/f1/v;
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
} // :goto_2
} // .end method
public final java.util.NavigableMap a ( android.graphics.Bitmap$Config p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/graphics/Bitmap$Config;", */
/* ")", */
/* "Ljava/util/NavigableMap<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 32 */
v0 = this.c;
/* check-cast v0, Ljava/util/NavigableMap; */
/* if-nez v0, :cond_0 */
/* .line 33 */
/* new-instance v0, Ljava/util/TreeMap; */
/* invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V */
/* .line 34 */
v1 = this.c;
} // :cond_0
} // .end method
public void a ( android.graphics.Bitmap p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = e.b.a.e0.t .a ( p1 );
/* .line 2 */
v1 = this.a;
(( android.graphics.Bitmap ) p1 ).getConfig ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
(( e.b.a.y.x.f1.w ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Le/b/a/y/x/f1/w;->a(ILandroid/graphics/Bitmap$Config;)Le/b/a/y/x/f1/v;
/* .line 3 */
v1 = this.b;
(( e.b.a.y.x.f1.k ) v1 ).a ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Le/b/a/y/x/f1/k;->a(Le/b/a/y/x/f1/t;Ljava/lang/Object;)V
/* .line 4 */
(( android.graphics.Bitmap ) p1 ).getConfig ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
(( e.b.a.y.x.f1.x ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/x/f1/x;->a(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;
/* .line 5 */
/* iget v1, v0, Le/b/a/y/x/f1/v;->b:I */
java.lang.Integer .valueOf ( v1 );
/* check-cast v1, Ljava/lang/Integer; */
/* .line 6 */
/* iget v0, v0, Le/b/a/y/x/f1/v;->b:I */
java.lang.Integer .valueOf ( v0 );
int v2 = 1; // const/4 v2, 0x1
/* if-nez v1, :cond_0 */
} // :cond_0
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* add-int/2addr v2, v1 */
} // :goto_0
java.lang.Integer .valueOf ( v2 );
return;
} // .end method
public final void a ( java.lang.Integer p0, android.graphics.Bitmap p1 ) {
/* .locals 3 */
/* .line 24 */
(( android.graphics.Bitmap ) p2 ).getConfig ( ); // invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
/* .line 25 */
(( e.b.a.y.x.f1.x ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/y/x/f1/x;->a(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;
/* .line 26 */
/* check-cast v1, Ljava/lang/Integer; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 27 */
p2 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
int v2 = 1; // const/4 v2, 0x1
/* if-ne p2, v2, :cond_0 */
/* .line 28 */
/* .line 29 */
} // :cond_0
p2 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* sub-int/2addr p2, v2 */
java.lang.Integer .valueOf ( p2 );
} // :goto_0
return;
/* .line 30 */
} // :cond_1
/* new-instance v0, Ljava/lang/NullPointerException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Tried to decrement empty size, size: "; // const-string v2, "Tried to decrement empty size, size: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = ", removed: "; // const-string p1, ", removed: "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 31 */
(( e.b.a.y.x.f1.x ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/b/a/y/x/f1/x;->c(Landroid/graphics/Bitmap;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ", this: "; // const-string p1, ", this: "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer b ( android.graphics.Bitmap p0 ) {
/* .locals 0 */
/* .line 3 */
p1 = e.b.a.e0.t .a ( p1 );
} // .end method
public java.lang.String b ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = e.b.a.e0.t .a ( p1,p2,p3 );
/* .line 2 */
e.b.a.y.x.f1.x .b ( p1,p3 );
} // .end method
public java.lang.String c ( android.graphics.Bitmap p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.e0.t .a ( p1 );
/* .line 2 */
(( android.graphics.Bitmap ) p1 ).getConfig ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
e.b.a.y.x.f1.x .b ( v0,p1 );
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SizeConfigStrategy{groupedMap="; // const-string v1, "SizeConfigStrategy{groupedMap="
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", sortedSizes=("; // const-string v1, ", sortedSizes=("
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
v1 = this.c;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Ljava/util/Map$Entry; */
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x5b */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "], "; // const-string v2, "], "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
} // :cond_0
v1 = v1 = this.c;
/* if-nez v1, :cond_1 */
/* .line 8 */
v1 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v1, v1, -0x2 */
v2 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
final String v3 = ""; // const-string v3, ""
(( java.lang.StringBuilder ) v0 ).replace ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
final String v1 = ")}"; // const-string v1, ")}"
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
