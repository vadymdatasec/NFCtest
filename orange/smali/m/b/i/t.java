public abstract class m.b.i.t implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.util.List g;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Lm/b/i/t;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public m.b.i.t b;
public java.util.List c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lm/b/i/t;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public m.b.i.b d;
public java.lang.String e;
public Integer f;
/* # direct methods */
public static m.b.i.t ( ) {
/* .locals 1 */
/* .line 1 */
java.util.Collections .emptyList ( );
return;
} // .end method
public m.b.i.t ( ) {
/* .locals 1 */
/* .line 8 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 9 */
v0 = m.b.i.t.g;
this.c = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
this.d = v0;
return;
} // .end method
public m.b.i.t ( ) {
/* .locals 1 */
/* .line 7 */
/* new-instance v0, Lm/b/i/b; */
/* invoke-direct {v0}, Lm/b/i/b;-><init>()V */
/* invoke-direct {p0, p1, v0}, Lm/b/i/t;-><init>(Ljava/lang/String;Lm/b/i/b;)V */
return;
} // .end method
public m.b.i.t ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
m.b.h.j .a ( p1 );
/* .line 3 */
m.b.h.j .a ( p2 );
/* .line 4 */
v0 = m.b.i.t.g;
this.c = v0;
/* .line 5 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
this.e = p1;
/* .line 6 */
this.d = p2;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 3 */
m.b.h.j .b ( p1 );
/* .line 4 */
v0 = (( m.b.i.t ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/t;->c(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String p1 = ""; // const-string p1, ""
/* .line 5 */
} // :cond_0
v0 = this.e;
(( m.b.i.t ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
m.b.h.i .a ( v0,p1 );
} // .end method
public m.b.i.b a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public m.b.i.t a ( Integer p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.c;
/* check-cast p1, Lm/b/i/t; */
} // .end method
public m.b.i.t a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
(( m.b.i.b ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lm/b/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V
} // .end method
public m.b.i.t a ( Object p0 ) {
/* .locals 4 */
/* .line 7 */
m.b.h.j .a ( p1 );
/* .line 8 */
v0 = this.b;
m.b.h.j .a ( v0 );
/* .line 9 */
v0 = this.b;
/* iget v1, p0, Lm/b/i/t;->f:I */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Lm/b/i/t; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
(( m.b.i.t ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lm/b/i/t;->a(I[Lm/b/i/t;)V
} // .end method
public m.b.i.t a ( m.b.k.s0 p0 ) {
/* .locals 1 */
/* .line 17 */
m.b.h.j .a ( p1 );
/* .line 18 */
/* new-instance v0, Lm/b/k/r0; */
/* invoke-direct {v0, p1}, Lm/b/k/r0;-><init>(Lm/b/k/s0;)V */
/* .line 19 */
(( m.b.k.r0 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lm/b/k/r0;->a(Lm/b/i/t;)V
} // .end method
public void a ( Integer p0, Object...p1 ) {
/* .locals 3 */
/* .line 10 */
m.b.h.j .a ( p2 );
/* .line 11 */
(( m.b.i.t ) p0 ).f ( ); // invoke-virtual {p0}, Lm/b/i/t;->f()V
/* .line 12 */
/* array-length v0, p2 */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 13 */
/* aget-object v1, p2, v0 */
/* .line 14 */
(( m.b.i.t ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Lm/b/i/t;->d(Lm/b/i/t;)V
/* .line 15 */
v2 = this.c;
/* .line 16 */
(( m.b.i.t ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/t;->b(I)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public void a ( java.lang.Appendable p0 ) {
/* .locals 3 */
/* .line 20 */
/* new-instance v0, Lm/b/k/r0; */
/* new-instance v1, Lm/b/i/s; */
(( m.b.i.t ) p0 ).g ( ); // invoke-virtual {p0}, Lm/b/i/t;->g()Lm/b/i/g;
/* invoke-direct {v1, p1, v2}, Lm/b/i/s;-><init>(Ljava/lang/Appendable;Lm/b/i/g;)V */
/* invoke-direct {v0, v1}, Lm/b/k/r0;-><init>(Lm/b/k/s0;)V */
(( m.b.k.r0 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lm/b/k/r0;->a(Lm/b/i/t;)V
return;
} // .end method
public void a ( java.lang.Appendable p0, Integer p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "\n"; // const-string v0, "\n"
/* .line 21 */
p3 = (( m.b.i.g ) p3 ).e ( ); // invoke-virtual {p3}, Lm/b/i/g;->e()I
/* mul-int p2, p2, p3 */
m.b.h.i .b ( p2 );
return;
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 6 */
v0 = this.e;
} // .end method
public java.lang.String b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
m.b.h.j .a ( p1 );
/* .line 2 */
v0 = this.d;
(( m.b.i.b ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lm/b/i/b;->b(Ljava/lang/String;)Ljava/lang/String;
/* .line 3 */
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_0 */
/* .line 4 */
} // :cond_0
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v1 = "abs:"; // const-string v1, "abs:"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 4; // const/4 v0, 0x4
/* .line 5 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( m.b.i.t ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/t;->a(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
final String p1 = ""; // const-string p1, ""
} // .end method
public m.b.i.t b ( Object p0 ) {
/* .locals 3 */
/* .line 9 */
try { // :try_start_0
/* invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object; */
/* check-cast v0, Lm/b/i/t; */
/* :try_end_0 */
/* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 10 */
this.b = p1;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 11 */
} // :cond_0
/* iget p1, p0, Lm/b/i/t;->f:I */
} // :goto_0
/* iput p1, v0, Lm/b/i/t;->f:I */
/* .line 12 */
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_1
(( m.b.i.b ) p1 ).clone ( ); // invoke-virtual {p1}, Lm/b/i/b;->clone()Lm/b/i/b;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
this.d = p1;
/* .line 13 */
p1 = this.e;
this.e = p1;
/* .line 14 */
/* new-instance p1, Ljava/util/ArrayList; */
v1 = v1 = this.c;
/* invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V */
this.c = p1;
/* .line 15 */
p1 = this.c;
v1 = } // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Lm/b/i/t; */
/* .line 16 */
v2 = this.c;
} // :cond_2
/* :catch_0 */
/* move-exception p1 */
/* .line 17 */
/* new-instance v0, Ljava/lang/RuntimeException; */
/* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public final void b ( Integer p0 ) {
/* .locals 1 */
/* .line 7 */
} // :goto_0
v0 = v0 = this.c;
/* if-ge p1, v0, :cond_0 */
/* .line 8 */
v0 = this.c;
/* check-cast v0, Lm/b/i/t; */
(( m.b.i.t ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lm/b/i/t;->c(I)V
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_0
return;
} // .end method
public abstract void b ( java.lang.Appendable p0, Integer p1, Object p2 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public void c ( Integer p0 ) {
/* .locals 0 */
/* .line 11 */
/* iput p1, p0, Lm/b/i/t;->f:I */
return;
} // .end method
public abstract void c ( java.lang.Appendable p0, Integer p1, Object p2 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public void c ( Object p0 ) {
/* .locals 2 */
/* .line 6 */
v0 = this.b;
/* if-ne v0, p0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
m.b.h.j .b ( v0 );
/* .line 7 */
/* iget v0, p1, Lm/b/i/t;->f:I */
/* .line 8 */
v1 = this.c;
/* .line 9 */
(( m.b.i.t ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/t;->b(I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
this.b = v0;
return;
} // .end method
public Boolean c ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
m.b.h.j .a ( p1 );
final String v0 = "abs:"; // const-string v0, "abs:"
/* .line 2 */
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 4; // const/4 v0, 0x4
/* .line 3 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 4 */
v1 = this.d;
v1 = (( m.b.i.b ) v1 ).d ( v0 ); // invoke-virtual {v1, v0}, Lm/b/i/b;->d(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
(( m.b.i.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/t;->a(Ljava/lang/String;)Ljava/lang/String;
final String v1 = ""; // const-string v1, ""
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
} // :cond_0
v0 = this.d;
p1 = (( m.b.i.b ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lm/b/i/b;->d(Ljava/lang/String;)Z
} // .end method
public java.lang.Object clone ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/CloneNotSupportedException; */
/* } */
} // .end annotation
/* .line 1 */
(( m.b.i.t ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/i/t;->clone()Lm/b/i/t;
} // .end method
public m.b.i.t clone ( ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( m.b.i.t ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/t;->b(Lm/b/i/t;)Lm/b/i/t;
/* .line 3 */
/* new-instance v1, Ljava/util/LinkedList; */
/* invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V */
/* .line 4 */
(( java.util.LinkedList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 5 */
} // :cond_0
v2 = (( java.util.LinkedList ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z
/* if-nez v2, :cond_1 */
/* .line 6 */
(( java.util.LinkedList ) v1 ).remove ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;
/* check-cast v2, Lm/b/i/t; */
int v3 = 0; // const/4 v3, 0x0
/* .line 7 */
} // :goto_0
v4 = v4 = this.c;
/* if-ge v3, v4, :cond_0 */
/* .line 8 */
v4 = this.c;
/* check-cast v4, Lm/b/i/t; */
(( m.b.i.t ) v4 ).b ( v2 ); // invoke-virtual {v4, v2}, Lm/b/i/t;->b(Lm/b/i/t;)Lm/b/i/t;
/* .line 9 */
v5 = this.c;
/* .line 10 */
(( java.util.LinkedList ) v1 ).add ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
} // .end method
public final Integer d ( ) {
/* .locals 1 */
/* .line 3 */
v0 = v0 = this.c;
} // .end method
public void d ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
m.b.h.j .a ( p1 );
/* .line 2 */
/* new-instance v0, Lm/b/i/r; */
/* invoke-direct {v0, p0, p1}, Lm/b/i/r;-><init>(Lm/b/i/t;Ljava/lang/String;)V */
(( m.b.i.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/t;->a(Lm/b/k/s0;)Lm/b/i/t;
return;
} // .end method
public void d ( Object p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
(( m.b.i.t ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lm/b/i/t;->c(Lm/b/i/t;)V
/* .line 6 */
} // :cond_0
(( m.b.i.t ) p1 ).e ( p0 ); // invoke-virtual {p1, p0}, Lm/b/i/t;->e(Lm/b/i/t;)V
return;
} // .end method
public java.util.List e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lm/b/i/t;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
java.util.Collections .unmodifiableList ( v0 );
} // .end method
public void e ( Object p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( m.b.i.t ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lm/b/i/t;->c(Lm/b/i/t;)V
/* .line 4 */
} // :cond_0
this.b = p1;
return;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 0 */
/* if-ne p0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
v1 = m.b.i.t.g;
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
this.c = v0;
} // :cond_0
return;
} // .end method
public m.b.i.g g ( ) {
/* .locals 2 */
/* .line 1 */
(( m.b.i.t ) p0 ).k ( ); // invoke-virtual {p0}, Lm/b/i/t;->k()Lm/b/i/i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Lm/b/i/i; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v1}, Lm/b/i/i;-><init>(Ljava/lang/String;)V */
} // :goto_0
(( m.b.i.i ) v0 ).E ( ); // invoke-virtual {v0}, Lm/b/i/i;->E()Lm/b/i/g;
} // .end method
public m.b.i.t h ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.c;
/* .line 3 */
/* iget v2, p0, Lm/b/i/t;->f:I */
/* add-int/lit8 v2, v2, 0x1 */
v3 = /* .line 4 */
/* if-le v3, v2, :cond_1 */
/* .line 5 */
/* check-cast v0, Lm/b/i/t; */
} // :cond_1
} // .end method
public abstract java.lang.String i ( ) {
} // .end method
public java.lang.String j ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x80 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 2 */
(( m.b.i.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/t;->a(Ljava/lang/Appendable;)V
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public m.b.i.i k ( ) {
/* .locals 2 */
/* .line 1 */
(( m.b.i.t ) p0 ).o ( ); // invoke-virtual {p0}, Lm/b/i/t;->o()Lm/b/i/t;
/* .line 2 */
/* instance-of v1, v0, Lm/b/i/i; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v0, Lm/b/i/i; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public m.b.i.t l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final m.b.i.t m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public void n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
m.b.h.j .a ( v0 );
/* .line 2 */
v0 = this.b;
(( m.b.i.t ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lm/b/i/t;->c(Lm/b/i/t;)V
return;
} // .end method
public m.b.i.t o ( ) {
/* .locals 2 */
/* move-object v0, p0 */
/* .line 1 */
} // :goto_0
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
/* move-object v0, v1 */
} // :cond_0
} // .end method
public Integer p ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lm/b/i/t;->f:I */
} // .end method
public java.util.List q ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lm/b/i/t;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 2 */
java.util.Collections .emptyList ( );
/* .line 3 */
} // :cond_0
v0 = this.c;
/* .line 4 */
v2 = /* new-instance v1, Ljava/util/ArrayList; */
/* add-int/lit8 v2, v2, -0x1 */
/* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 5 */
} // :cond_1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Lm/b/i/t; */
/* if-eq v2, p0, :cond_1 */
/* .line 6 */
} // :cond_2
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( m.b.i.t ) p0 ).j ( ); // invoke-virtual {p0}, Lm/b/i/t;->j()Ljava/lang/String;
} // .end method
