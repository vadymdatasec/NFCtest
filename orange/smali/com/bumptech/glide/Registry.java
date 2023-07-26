public class com.bumptech.glide.Registry {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/bumptech/glide/Registry$NoImageHeaderParserException;, */
	 /* Lcom/bumptech/glide/Registry$MissingComponentException;, */
	 /* Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;, */
	 /* Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;, */
	 /* Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException; */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.y.a1 a;
public final e.b.a.b0.b b;
public final e.b.a.b0.g c;
public final e.b.a.b0.i d;
public final e.b.a.y.w.j e;
public final e.b.a.y.z.j.g f;
public final e.b.a.b0.c g;
public final e.b.a.b0.e h;
public final e.b.a.b0.d i;
public final c.h.m.d j;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/d<", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.bumptech.glide.Registry ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/b/a/b0/e; */
/* invoke-direct {v0}, Le/b/a/b0/e;-><init>()V */
this.h = v0;
/* .line 3 */
/* new-instance v0, Le/b/a/b0/d; */
/* invoke-direct {v0}, Le/b/a/b0/d;-><init>()V */
this.i = v0;
/* .line 4 */
e.b.a.e0.u.h .b ( );
this.j = v0;
/* .line 5 */
/* new-instance v1, Le/b/a/y/y/a1; */
/* invoke-direct {v1, v0}, Le/b/a/y/y/a1;-><init>(Lc/h/m/d;)V */
this.a = v1;
/* .line 6 */
/* new-instance v0, Le/b/a/b0/b; */
/* invoke-direct {v0}, Le/b/a/b0/b;-><init>()V */
this.b = v0;
/* .line 7 */
/* new-instance v0, Le/b/a/b0/g; */
/* invoke-direct {v0}, Le/b/a/b0/g;-><init>()V */
this.c = v0;
/* .line 8 */
/* new-instance v0, Le/b/a/b0/i; */
/* invoke-direct {v0}, Le/b/a/b0/i;-><init>()V */
this.d = v0;
/* .line 9 */
/* new-instance v0, Le/b/a/y/w/j; */
/* invoke-direct {v0}, Le/b/a/y/w/j;-><init>()V */
this.e = v0;
/* .line 10 */
/* new-instance v0, Le/b/a/y/z/j/g; */
/* invoke-direct {v0}, Le/b/a/y/z/j/g;-><init>()V */
this.f = v0;
/* .line 11 */
/* new-instance v0, Le/b/a/b0/c; */
/* invoke-direct {v0}, Le/b/a/b0/c;-><init>()V */
this.g = v0;
final String v0 = "Animation"; // const-string v0, "Animation"
final String v1 = "Bitmap"; // const-string v1, "Bitmap"
final String v2 = "BitmapDrawable"; // const-string v2, "BitmapDrawable"
/* .line 12 */
/* filled-new-array {v0, v1, v2}, [Ljava/lang/String; */
/* .line 13 */
java.util.Arrays .asList ( v0 );
/* .line 14 */
(( com.bumptech.glide.Registry ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/util/List;)Lcom/bumptech/glide/Registry;
return;
} // .end method
/* # virtual methods */
public com.bumptech.glide.Registry a ( com.bumptech.glide.load.ImageHeaderParser p0 ) {
/* .locals 1 */
/* .line 13 */
v0 = this.g;
(( e.b.a.b0.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/b0/c;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)V
} // .end method
public com.bumptech.glide.Registry a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/w/f<", */
/* "*>;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
/* .line 11 */
v0 = this.e;
(( e.b.a.y.w.j ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/w/j;->a(Le/b/a/y/w/f;)V
} // .end method
public com.bumptech.glide.Registry a ( java.lang.Class p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Data:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Le/b/a/y/d<", */
/* "TData;>;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
(( e.b.a.b0.b ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/b/a/b0/b;->a(Ljava/lang/Class;Le/b/a/y/d;)V
} // .end method
public com.bumptech.glide.Registry a ( java.lang.Class p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<TResource:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Le/b/a/y/u<", */
/* "TTResource;>;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
/* .line 10 */
v0 = this.d;
(( e.b.a.b0.i ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/b/a/b0/i;->a(Ljava/lang/Class;Le/b/a/y/u;)V
} // .end method
public com.bumptech.glide.Registry a ( java.lang.Class p0, java.lang.Class p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Data:", */
/* "Ljava/lang/Object;", */
/* "TResource:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Le/b/a/y/t<", */
/* "TData;TTResource;>;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
final String v0 = "legacy_append"; // const-string v0, "legacy_append"
/* .line 2 */
(( com.bumptech.glide.Registry ) p0 ).a ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
} // .end method
public com.bumptech.glide.Registry a ( java.lang.Class p0, java.lang.Class p1, e.b.a.y.y.x0 p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Model:", */
/* "Ljava/lang/Object;", */
/* "Data:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TModel;>;", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Le/b/a/y/y/x0<", */
/* "TModel;TData;>;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
/* .line 14 */
v0 = this.a;
(( e.b.a.y.y.a1 ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/b/a/y/y/a1;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)V
} // .end method
public com.bumptech.glide.Registry a ( java.lang.Class p0, java.lang.Class p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<TResource:", */
/* "Ljava/lang/Object;", */
/* "Transcode:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Ljava/lang/Class<", */
/* "TTranscode;>;", */
/* "Le/b/a/y/z/j/e<", */
/* "TTResource;TTranscode;>;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
/* .line 12 */
v0 = this.f;
(( e.b.a.y.z.j.g ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/b/a/y/z/j/g;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)V
} // .end method
public com.bumptech.glide.Registry a ( java.lang.String p0, java.lang.Class p1, java.lang.Class p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Data:", */
/* "Ljava/lang/Object;", */
/* "TResource:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Le/b/a/y/t<", */
/* "TData;TTResource;>;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.c;
(( e.b.a.b0.g ) v0 ).a ( p1, p4, p2, p3 ); // invoke-virtual {v0, p1, p4, p2, p3}, Le/b/a/b0/g;->a(Ljava/lang/String;Le/b/a/y/t;Ljava/lang/Class;Ljava/lang/Class;)V
} // .end method
public final com.bumptech.glide.Registry a ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Lcom/bumptech/glide/Registry;" */
/* } */
} // .end annotation
/* .line 4 */
v1 = /* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
final String v1 = "legacy_prepend_all"; // const-string v1, "legacy_prepend_all"
/* .line 5 */
/* .line 6 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/lang/String; */
/* .line 7 */
} // :cond_0
final String p1 = "legacy_append"; // const-string p1, "legacy_append"
/* .line 8 */
/* .line 9 */
p1 = this.c;
(( e.b.a.b0.g ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/b/a/b0/g;->a(Ljava/util/List;)V
} // .end method
public e.b.a.y.u a ( e.b.a.y.x.y0 p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<X:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/b/a/y/x/y0<", */
/* "TX;>;)", */
/* "Le/b/a/y/u<", */
/* "TX;>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException; */
/* } */
} // .end annotation
/* .line 28 */
v0 = this.d;
(( e.b.a.b0.i ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/b/a/b0/i;->a(Ljava/lang/Class;)Le/b/a/y/u;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 29 */
} // :cond_0
/* new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException; */
/* invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V */
/* throw v0 */
} // .end method
public java.util.List a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 31 */
v0 = this.g;
(( e.b.a.b0.c ) v0 ).a ( ); // invoke-virtual {v0}, Le/b/a/b0/c;->a()Ljava/util/List;
v1 = /* .line 32 */
/* if-nez v1, :cond_0 */
/* .line 33 */
} // :cond_0
/* new-instance v0, Lcom/bumptech/glide/Registry$NoImageHeaderParserException; */
/* invoke-direct {v0}, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;-><init>()V */
/* throw v0 */
} // .end method
public final java.util.List a ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Data:", */
/* "Ljava/lang/Object;", */
/* "TResource:", */
/* "Ljava/lang/Object;", */
/* "Transcode:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Ljava/lang/Class<", */
/* "TTranscode;>;)", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/x/w<", */
/* "TData;TTResource;TTranscode;>;>;" */
/* } */
} // .end annotation
/* .line 15 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 16 */
v1 = this.c;
/* .line 17 */
(( e.b.a.b0.g ) v1 ).b ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Le/b/a/b0/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
/* .line 18 */
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/lang/Class; */
/* .line 19 */
v2 = this.f;
/* .line 20 */
(( e.b.a.y.z.j.g ) v2 ).b ( v1, p3 ); // invoke-virtual {v2, v1, p3}, Le/b/a/y/z/j/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
/* .line 21 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* move-object v5, v2 */
/* check-cast v5, Ljava/lang/Class; */
/* .line 22 */
v2 = this.c;
/* .line 23 */
(( e.b.a.b0.g ) v2 ).a ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Le/b/a/b0/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
/* .line 24 */
v2 = this.f;
/* .line 25 */
(( e.b.a.y.z.j.g ) v2 ).a ( v1, v5 ); // invoke-virtual {v2, v1, v5}, Le/b/a/y/z/j/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/z/j/e;
/* .line 26 */
/* new-instance v10, Le/b/a/y/x/w; */
v8 = this.j;
/* move-object v2, v10 */
/* move-object v3, p1 */
/* move-object v4, v1 */
/* invoke-direct/range {v2 ..v8}, Le/b/a/y/x/w;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Le/b/a/y/z/j/e;Lc/h/m/d;)V */
/* .line 27 */
} // :cond_1
} // .end method
public java.util.List a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Model:", */
/* "Ljava/lang/Object;", */
/* ">(TModel;)", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "TModel;*>;>;" */
/* } */
} // .end annotation
/* .line 30 */
v0 = this.a;
(( e.b.a.y.y.a1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/y/a1;->a(Ljava/lang/Object;)Ljava/util/List;
} // .end method
public e.b.a.y.w.g b ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<X:", */
/* "Ljava/lang/Object;", */
/* ">(TX;)", */
/* "Le/b/a/y/w/g<", */
/* "TX;>;" */
/* } */
} // .end annotation
/* .line 9 */
v0 = this.e;
(( e.b.a.y.w.j ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/w/j;->a(Ljava/lang/Object;)Le/b/a/y/w/g;
} // .end method
public e.b.a.y.x.v0 b ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Data:", */
/* "Ljava/lang/Object;", */
/* "TResource:", */
/* "Ljava/lang/Object;", */
/* "Transcode:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Ljava/lang/Class<", */
/* "TTranscode;>;)", */
/* "Le/b/a/y/x/v0<", */
/* "TData;TTResource;TTranscode;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.i;
/* .line 2 */
(( e.b.a.b0.d ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/b/a/b0/d;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/x/v0;
/* .line 3 */
v1 = this.i;
v1 = (( e.b.a.b0.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/b/a/b0/d;->a(Le/b/a/y/x/v0;)Z
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
/* if-nez v0, :cond_2 */
/* .line 4 */
(( com.bumptech.glide.Registry ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
v0 = /* .line 5 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* move-object v0, v2 */
/* .line 6 */
} // :cond_1
/* new-instance v0, Le/b/a/y/x/v0; */
v8 = this.j;
/* move-object v3, v0 */
/* move-object v4, p1 */
/* move-object v5, p2 */
/* move-object v6, p3 */
/* invoke-direct/range {v3 ..v8}, Le/b/a/y/x/v0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lc/h/m/d;)V */
/* .line 7 */
} // :goto_0
v1 = this.i;
(( e.b.a.b0.d ) v1 ).a ( p1, p2, p3, v0 ); // invoke-virtual {v1, p1, p2, p3, v0}, Le/b/a/b0/d;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/x/v0;)V
} // :cond_2
} // .end method
public Boolean b ( e.b.a.y.x.y0 p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/y0<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.d;
(( e.b.a.b0.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/b0/i;->a(Ljava/lang/Class;)Le/b/a/y/u;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public e.b.a.y.d c ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<X:", */
/* "Ljava/lang/Object;", */
/* ">(TX;)", */
/* "Le/b/a/y/d<", */
/* "TX;>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException; */
/* } */
} // .end annotation
/* .line 16 */
v0 = this.b;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( e.b.a.b0.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/b/a/b0/b;->a(Ljava/lang/Class;)Le/b/a/y/d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 17 */
} // :cond_0
/* new-instance v0, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException; */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;-><init>(Ljava/lang/Class;)V */
/* throw v0 */
} // .end method
public java.util.List c ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Model:", */
/* "Ljava/lang/Object;", */
/* "TResource:", */
/* "Ljava/lang/Object;", */
/* "Transcode:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TModel;>;", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Ljava/lang/Class<", */
/* "TTranscode;>;)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Class<", */
/* "*>;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.h;
/* .line 2 */
(( e.b.a.b0.e ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/b/a/b0/e;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
/* if-nez v0, :cond_3 */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 4 */
v1 = this.a;
(( e.b.a.y.y.a1 ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/b/a/y/y/a1;->a(Ljava/lang/Class;)Ljava/util/List;
/* .line 5 */
v2 = } // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Ljava/lang/Class; */
/* .line 6 */
v3 = this.c;
/* .line 7 */
(( e.b.a.b0.g ) v3 ).b ( v2, p2 ); // invoke-virtual {v3, v2, p2}, Le/b/a/b0/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
/* .line 8 */
} // :cond_1
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Ljava/lang/Class; */
/* .line 9 */
v4 = this.f;
/* .line 10 */
(( e.b.a.y.z.j.g ) v4 ).b ( v3, p3 ); // invoke-virtual {v4, v3, p3}, Le/b/a/y/z/j/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
v4 = /* .line 11 */
v4 = /* if-nez v4, :cond_1 */
/* if-nez v4, :cond_1 */
/* .line 12 */
/* .line 13 */
} // :cond_2
v1 = this.h;
/* .line 14 */
java.util.Collections .unmodifiableList ( v0 );
/* .line 15 */
(( e.b.a.b0.e ) v1 ).a ( p1, p2, p3, v2 ); // invoke-virtual {v1, p1, p2, p3, v2}, Le/b/a/b0/e;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;)V
} // :cond_3
} // .end method
