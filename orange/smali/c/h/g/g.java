public abstract class c.h.g.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c.h.g.p a;
	 public static final c.e.g b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/g<", */
	 /* "Ljava/lang/String;", */
	 /* "Landroid/graphics/Typeface;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.h.g.g ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1d */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/h/g/l; */
/* invoke-direct {v0}, Lc/h/g/l;-><init>()V */
} // :cond_0
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_1 */
/* .line 3 */
/* new-instance v0, Lc/h/g/k; */
/* invoke-direct {v0}, Lc/h/g/k;-><init>()V */
} // :cond_1
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_2 */
/* .line 4 */
/* new-instance v0, Lc/h/g/j; */
/* invoke-direct {v0}, Lc/h/g/j;-><init>()V */
} // :cond_2
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_3 */
/* .line 5 */
v0 = c.h.g.i .a ( );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 6 */
/* new-instance v0, Lc/h/g/i; */
/* invoke-direct {v0}, Lc/h/g/i;-><init>()V */
/* .line 7 */
} // :cond_3
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_4 */
/* .line 8 */
/* new-instance v0, Lc/h/g/h; */
/* invoke-direct {v0}, Lc/h/g/h;-><init>()V */
/* .line 9 */
} // :cond_4
/* new-instance v0, Lc/h/g/p; */
/* invoke-direct {v0}, Lc/h/g/p;-><init>()V */
/* .line 10 */
} // :goto_0
/* new-instance v0, Lc/e/g; */
/* const/16 v1, 0x10 */
/* invoke-direct {v0, v1}, Lc/e/g;-><init>(I)V */
return;
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, android.content.res.Resources p1, Integer p2, java.lang.String p3, Integer p4 ) {
/* .locals 6 */
/* .line 20 */
v0 = c.h.g.g.a;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move-object v4, p3 */
/* move v5, p4 */
/* invoke-virtual/range {v0 ..v5}, Lc/h/g/p;->a(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface; */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 21 */
c.h.g.g .a ( p1,p2,p4 );
/* .line 22 */
p2 = c.h.g.g.b;
(( c.e.g ) p2 ).a ( p1, p0 ); // invoke-virtual {p2, p1, p0}, Lc/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, android.graphics.Typeface p1, Integer p2 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 24 */
/* const/16 v1, 0x15 */
/* if-ge v0, v1, :cond_0 */
/* .line 25 */
c.h.g.g .b ( p0,p1,p2 );
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 26 */
} // :cond_0
android.graphics.Typeface .create ( p1,p2 );
/* .line 27 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Context cannot be null"; // const-string p1, "Context cannot be null"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, android.os.CancellationSignal p1, Object[] p2, Integer p3 ) {
/* .locals 1 */
/* .line 23 */
v0 = c.h.g.g.a;
(( c.h.g.p ) v0 ).a ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lc/h/g/p;->a(Landroid/content/Context;Landroid/os/CancellationSignal;[Lc/h/k/o;I)Landroid/graphics/Typeface;
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, Object p1, android.content.res.Resources p2, Integer p3, Integer p4, Object p5, android.os.Handler p6, Boolean p7 ) {
/* .locals 13 */
/* move-object v0, p1 */
/* move-object/from16 v1, p5 */
/* move-object/from16 v2, p6 */
/* .line 6 */
/* instance-of v3, v0, Lc/h/f/i/h; */
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 7 */
/* check-cast v0, Lc/h/f/i/h; */
/* .line 8 */
(( c.h.f.i.h ) v0 ).c ( ); // invoke-virtual {v0}, Lc/h/f/i/h;->c()Ljava/lang/String;
/* .line 9 */
c.h.g.g .a ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_1
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 10 */
(( c.h.f.i.r ) v1 ).a ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Lc/h/f/i/r;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V
} // :cond_0
} // :cond_1
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
if ( p7 != null) { // if-eqz p7, :cond_2
/* .line 11 */
v5 = (( c.h.f.i.h ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/f/i/h;->a()I
/* if-nez v5, :cond_3 */
} // :cond_2
/* if-nez v1, :cond_3 */
} // :goto_0
int v9 = 1; // const/4 v9, 0x1
} // :cond_3
int v9 = 0; // const/4 v9, 0x0
} // :goto_1
if ( p7 != null) { // if-eqz p7, :cond_4
/* .line 12 */
v3 = (( c.h.f.i.h ) v0 ).d ( ); // invoke-virtual {v0}, Lc/h/f/i/h;->d()I
/* move v10, v3 */
} // :cond_4
int v3 = -1; // const/4 v3, -0x1
int v10 = -1; // const/4 v10, -0x1
/* .line 13 */
} // :goto_2
/* invoke-static/range {p6 ..p6}, Lc/h/f/i/r;->a(Landroid/os/Handler;)Landroid/os/Handler; */
/* .line 14 */
/* new-instance v12, Lc/h/g/f; */
/* invoke-direct {v12, v1}, Lc/h/g/f;-><init>(Lc/h/f/i/r;)V */
/* .line 15 */
(( c.h.f.i.h ) v0 ).b ( ); // invoke-virtual {v0}, Lc/h/f/i/h;->b()Lc/h/k/g;
/* move-object v6, p0 */
/* move/from16 v8, p4 */
/* invoke-static/range {v6 ..v12}, Lc/h/k/q;->a(Landroid/content/Context;Lc/h/k/g;IZILandroid/os/Handler;Lc/h/k/p;)Landroid/graphics/Typeface; */
/* move-object v5, p2 */
/* move/from16 v6, p4 */
/* .line 16 */
} // :cond_5
v3 = c.h.g.g.a;
/* check-cast v0, Lc/h/f/i/f; */
/* move-object v4, p0 */
/* move-object v5, p2 */
/* move/from16 v6, p4 */
(( c.h.g.p ) v3 ).a ( p0, v0, p2, v6 ); // invoke-virtual {v3, p0, v0, p2, v6}, Lc/h/g/p;->a(Landroid/content/Context;Lc/h/f/i/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
if ( v1 != null) { // if-eqz v1, :cond_7
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 17 */
(( c.h.f.i.r ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lc/h/f/i/r;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V
} // :cond_6
int v3 = -3; // const/4 v3, -0x3
/* .line 18 */
(( c.h.f.i.r ) v1 ).a ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Lc/h/f/i/r;->a(ILandroid/os/Handler;)V
} // :cond_7
} // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 19 */
v1 = c.h.g.g.b;
/* invoke-static/range {p2 ..p4}, Lc/h/g/g;->a(Landroid/content/res/Resources;II)Ljava/lang/String; */
(( c.e.g ) v1 ).a ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lc/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_8
} // .end method
public static android.graphics.Typeface a ( java.lang.String p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 2 */
v1 = (( java.lang.String ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
android.graphics.Typeface .create ( p0,v1 );
/* .line 4 */
v2 = android.graphics.Typeface.DEFAULT;
android.graphics.Typeface .create ( v2,v1 );
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 5 */
v1 = (( android.graphics.Typeface ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* move-object v0, p0 */
} // :cond_1
} // :goto_0
} // .end method
public static java.lang.String a ( android.content.res.Resources p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.res.Resources ) p0 ).getResourcePackageName ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "-"; // const-string p0, "-"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static android.graphics.Typeface b ( android.content.Context p0, android.graphics.Typeface p1, Integer p2 ) {
/* .locals 2 */
/* .line 2 */
v0 = c.h.g.g.a;
(( c.h.g.p ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/h/g/p;->a(Landroid/graphics/Typeface;)Lc/h/f/i/f;
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 3 */
} // :cond_0
v0 = c.h.g.g.a;
/* .line 4 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 5 */
(( c.h.g.p ) v0 ).a ( p0, p1, v1, p2 ); // invoke-virtual {v0, p0, p1, v1, p2}, Lc/h/g/p;->a(Landroid/content/Context;Lc/h/f/i/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
} // .end method
public static android.graphics.Typeface b ( android.content.res.Resources p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.h.g.g.b;
c.h.g.g .a ( p0,p1,p2 );
(( c.e.g ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroid/graphics/Typeface; */
} // .end method
