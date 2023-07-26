public class e.c.a.a2 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.List e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/c/a/h1;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public e.c.a.z0 a;
public e.c.a.m2 b;
public Float c;
public e.c.a.g d;
/* # direct methods */
public static e.c.a.a2 ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
return;
} // .end method
public e.c.a.a2 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
/* .line 3 */
this.b = v0;
/* const/high16 v0, 0x42c00000 # 96.0f */
/* .line 4 */
/* iput v0, p0, Le/c/a/a2;->c:F */
/* .line 5 */
/* new-instance v0, Le/c/a/g; */
/* invoke-direct {v0}, Le/c/a/g;-><init>()V */
this.d = v0;
return;
} // .end method
public static e.c.a.a2 a ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/caverock/androidsvg/SVGParseException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/c/a/p2; */
/* invoke-direct {v0}, Le/c/a/p2;-><init>()V */
/* .line 2 */
(( e.c.a.p2 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/p2;->a(Ljava/io/InputStream;)Le/c/a/a2;
} // .end method
public static java.util.List h ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
v0 = e.c.a.a2.e;
} // .end method
/* # virtual methods */
public android.graphics.Picture a ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .line 3 */
/* new-instance v0, Landroid/graphics/Picture; */
/* invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V */
/* .line 4 */
(( android.graphics.Picture ) v0 ).beginRecording ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;
/* .line 5 */
/* new-instance v2, Le/c/a/n; */
/* int-to-float p1, p1 */
/* int-to-float p2, p2 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v3, v3, p1, p2}, Le/c/a/n;-><init>(FFFF)V */
/* .line 6 */
/* new-instance p1, Le/c/a/l2; */
/* iget p2, p0, Le/c/a/a2;->c:F */
/* invoke-direct {p1, v1, v2, p2}, Le/c/a/l2;-><init>(Landroid/graphics/Canvas;Le/c/a/n;F)V */
int p2 = 0; // const/4 p2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
(( e.c.a.l2 ) p1 ).a ( p0, p2, p2, v1 ); // invoke-virtual {p1, p0, p2, p2, v1}, Le/c/a/l2;->a(Le/c/a/a2;Le/c/a/n;Le/c/a/m;Z)V
/* .line 8 */
(( android.graphics.Picture ) v0 ).endRecording ( ); // invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V
} // .end method
public final e.c.a.f1 a ( e.c.a.d1 p0, java.lang.String p1 ) {
/* .locals 3 */
/* .line 26 */
/* move-object v0, p1 */
/* check-cast v0, Le/c/a/f1; */
/* .line 27 */
v1 = this.c;
v1 = (( java.lang.String ) p2 ).equals ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 28 */
} // :cond_0
} // :cond_1
v0 = } // :goto_0
/* if-nez v0, :cond_2 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_2
/* check-cast v0, Le/c/a/h1; */
/* .line 29 */
/* instance-of v1, v0, Le/c/a/f1; */
/* if-nez v1, :cond_3 */
/* .line 30 */
} // :cond_3
/* move-object v1, v0 */
/* check-cast v1, Le/c/a/f1; */
/* .line 31 */
v2 = this.c;
v2 = (( java.lang.String ) p2 ).equals ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 32 */
} // :cond_4
/* instance-of v1, v0, Le/c/a/d1; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 33 */
/* check-cast v0, Le/c/a/d1; */
(( e.c.a.a2 ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/c/a/a2;->a(Le/c/a/d1;Ljava/lang/String;)Le/c/a/f1;
if ( v0 != null) { // if-eqz v0, :cond_1
} // .end method
public e.c.a.h1 a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 23 */
v0 = this.a;
v0 = this.c;
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 24 */
p1 = this.a;
/* .line 25 */
} // :cond_0
v0 = this.a;
(( e.c.a.a2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/a2;->a(Le/c/a/d1;Ljava/lang/String;)Le/c/a/f1;
} // .end method
public final e.c.a.n a ( Float p0 ) {
/* .locals 5 */
/* .line 10 */
v0 = this.a;
v1 = this.r;
/* .line 11 */
v0 = this.s;
/* const/high16 v2, -0x40800000 # -1.0f */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 12 */
v3 = (( e.c.a.b0 ) v1 ).d ( ); // invoke-virtual {v1}, Le/c/a/b0;->d()Z
/* if-nez v3, :cond_5 */
v3 = this.c;
v4 = e.c.a.x1.j;
/* if-eq v3, v4, :cond_5 */
v4 = e.c.a.x1.c;
/* if-eq v3, v4, :cond_5 */
v4 = e.c.a.x1.d;
/* if-ne v3, v4, :cond_0 */
/* .line 13 */
} // :cond_0
v1 = (( e.c.a.b0 ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/c/a/b0;->a(F)F
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 14 */
v3 = (( e.c.a.b0 ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/b0;->d()Z
/* if-nez v3, :cond_2 */
v3 = this.c;
v4 = e.c.a.x1.j;
/* if-eq v3, v4, :cond_2 */
v4 = e.c.a.x1.c;
/* if-eq v3, v4, :cond_2 */
v4 = e.c.a.x1.d;
/* if-ne v3, v4, :cond_1 */
/* .line 15 */
} // :cond_1
p1 = (( e.c.a.b0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/c/a/b0;->a(F)F
/* .line 16 */
} // :cond_2
} // :goto_0
/* new-instance p1, Le/c/a/n; */
/* invoke-direct {p1, v2, v2, v2, v2}, Le/c/a/n;-><init>(FFFF)V */
/* .line 17 */
} // :cond_3
p1 = this.a;
p1 = this.o;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 18 */
/* iget v0, p1, Le/c/a/n;->e:F */
/* mul-float v0, v0, v1 */
/* iget p1, p1, Le/c/a/n;->d:F */
/* div-float p1, v0, p1 */
} // :cond_4
/* move p1, v1 */
/* .line 19 */
} // :goto_1
/* new-instance v0, Le/c/a/n; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v2, v2, v1, p1}, Le/c/a/n;-><init>(FFFF)V */
/* .line 20 */
} // :cond_5
} // :goto_2
/* new-instance p1, Le/c/a/n; */
/* invoke-direct {p1, v2, v2, v2, v2}, Le/c/a/n;-><init>(FFFF)V */
} // .end method
public java.util.List a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/c/a/f;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 22 */
v0 = this.d;
(( e.c.a.g ) v0 ).a ( ); // invoke-virtual {v0}, Le/c/a/g;->a()Ljava/util/List;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 21 */
v0 = this.d;
(( e.c.a.g ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/c/a/g;->a(Le/c/a/g;)V
return;
} // .end method
public void a ( e.c.a.z0 p0 ) {
/* .locals 0 */
/* .line 9 */
this.a = p1;
return;
} // .end method
public Float b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v0, p0, Le/c/a/a2;->c:F */
(( e.c.a.a2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/a2;->a(F)Le/c/a/n;
/* iget v0, v0, Le/c/a/n;->e:F */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "SVG document is empty"; // const-string v1, "SVG document is empty"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public e.c.a.h1 b ( java.lang.String p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 7 */
} // :cond_0
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v2 = 1; // const/4 v2, 0x1
/* if-le v1, v2, :cond_1 */
final String v1 = "#"; // const-string v1, "#"
v1 = (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 8 */
(( java.lang.String ) p1 ).substring ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( e.c.a.a2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/a2;->a(Ljava/lang/String;)Le/c/a/h1;
} // :cond_1
} // .end method
public void b ( Float p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* new-instance v1, Le/c/a/b0; */
/* invoke-direct {v1, p1}, Le/c/a/b0;-><init>(F)V */
this.s = v1;
return;
/* .line 6 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "SVG document is empty"; // const-string v0, "SVG document is empty"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public android.graphics.RectF c ( ) {
/* .locals 2 */
/* .line 4 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = this.o;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
} // :cond_0
(( e.c.a.n ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/n;->d()Landroid/graphics/RectF;
/* .line 7 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "SVG document is empty"; // const-string v1, "SVG document is empty"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void c ( Float p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v1, Le/c/a/b0; */
/* invoke-direct {v1, p1}, Le/c/a/b0;-><init>(F)V */
this.r = v1;
return;
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "SVG document is empty"; // const-string v0, "SVG document is empty"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void c ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public Float d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v0, p0, Le/c/a/a2;->c:F */
(( e.c.a.a2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/a2;->a(F)Le/c/a/n;
/* iget v0, v0, Le/c/a/n;->d:F */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "SVG document is empty"; // const-string v1, "SVG document is empty"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void d ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public e.c.a.m2 e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public e.c.a.z0 f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Boolean g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
v0 = (( e.c.a.g ) v0 ).b ( ); // invoke-virtual {v0}, Le/c/a/g;->b()Z
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
