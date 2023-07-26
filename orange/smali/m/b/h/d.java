public class m.b.h.d extends m.b.h.c implements m.b.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lm/b/h/c<", */
	 /* "Lm/b/d;", */
	 /* ">;", */
	 /* "Lm/b/d;" */
	 /* } */
} // .end annotation
/* # instance fields */
public java.net.Proxy e;
public Integer f;
public Integer g;
public Boolean h;
public java.util.Collection i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Collection<", */
/* "Lm/b/b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.lang.String j;
public Boolean k;
public Boolean l;
public m.b.j.f0 m;
public Boolean n;
public Boolean o;
public java.lang.String p;
/* # direct methods */
public m.b.h.d ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* invoke-direct {p0, v0}, Lm/b/h/c;-><init>(Lm/b/h/b;)V */
/* .line 3 */
this.j = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Lm/b/h/d;->k:Z */
/* .line 5 */
/* iput-boolean v0, p0, Lm/b/h/d;->l:Z */
/* .line 6 */
/* iput-boolean v0, p0, Lm/b/h/d;->n:Z */
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
/* iput-boolean v0, p0, Lm/b/h/d;->o:Z */
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
/* .line 8 */
this.p = v1;
/* const/16 v1, 0x7530 */
/* .line 9 */
/* iput v1, p0, Lm/b/h/d;->f:I */
/* const/high16 v1, 0x100000 */
/* .line 10 */
/* iput v1, p0, Lm/b/h/d;->g:I */
/* .line 11 */
/* iput-boolean v0, p0, Lm/b/h/d;->h:Z */
/* .line 12 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.i = v0;
/* .line 13 */
v0 = m.b.c.c;
this.b = v0;
/* .line 14 */
v0 = this.c;
final String v1 = "Accept-Encoding"; // const-string v1, "Accept-Encoding"
final String v2 = "gzip"; // const-string v2, "gzip"
/* .line 15 */
v0 = this.c;
final String v1 = "User-Agent"; // const-string v1, "User-Agent"
final String v2 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36"; // const-string v2, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36"
/* .line 16 */
m.b.j.f0 .b ( );
this.m = v0;
return;
} // .end method
public m.b.h.d ( ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lm/b/h/d;-><init>()V */
return;
} // .end method
public static Boolean a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget-boolean p0, p0, Lm/b/h/d;->n:Z */
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .line 4 */
/* iget v0, p0, Lm/b/h/d;->f:I */
} // .end method
public m.b.d a ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 3 */
(( m.b.h.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/d;->a(I)Lm/b/h/d;
} // .end method
public m.b.d a ( m.b.j.f0 p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( m.b.h.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/d;->a(Lm/b/j/f0;)Lm/b/h/d;
} // .end method
public m.b.h.d a ( Integer p0 ) {
/* .locals 2 */
/* if-ltz p1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
final String v1 = "Timeout milliseconds must be 0 (infinite) or greater"; // const-string v1, "Timeout milliseconds must be 0 (infinite) or greater"
/* .line 5 */
m.b.h.j .b ( v0,v1 );
/* .line 6 */
/* iput p1, p0, Lm/b/h/d;->f:I */
} // .end method
public m.b.h.d a ( m.b.j.f0 p0 ) {
/* .locals 0 */
/* .line 7 */
this.m = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 8 */
/* iput-boolean p1, p0, Lm/b/h/d;->n:Z */
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lm/b/h/d;->l:Z */
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lm/b/h/d;->k:Z */
} // .end method
public java.lang.String h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
} // .end method
public Boolean i ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lm/b/h/d;->h:Z */
} // .end method
public java.lang.String k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public Integer l ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lm/b/h/d;->g:I */
} // .end method
public java.net.Proxy m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public java.util.Collection n ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Collection<", */
/* "Lm/b/b;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.i;
} // .end method
public Boolean o ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lm/b/h/d;->o:Z */
} // .end method
public m.b.j.f0 p ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.m;
} // .end method
