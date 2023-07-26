public class c.c.a.b.e$a implements java.util.Iterator implements c.c.a.b.g {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/c/a/b/e; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Iterator<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;", */
/* "Lc/c/a/b/g<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* # instance fields */
public c.c.a.b.d b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
public Boolean c;
public final c.c.a.b.e d; //synthetic
/* # direct methods */
public c.c.a.b.e$a ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Lc/c/a/b/e$a;->c:Z */
return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* if-ne p1, v0, :cond_1 */
/* .line 2 */
p1 = this.e;
this.b = p1;
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :goto_0
/* iput-boolean p1, p0, Lc/c/a/b/e$a;->c:Z */
} // :cond_1
return;
} // .end method
public Boolean hasNext ( ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/c/a/b/e$a;->c:Z */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.d;
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* .line 3 */
} // :cond_1
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
} // .end method
public java.lang.Object next ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( c.c.a.b.e$a ) p0 ).next ( ); // invoke-virtual {p0}, Lc/c/a/b/e$a;->next()Ljava/util/Map$Entry;
} // .end method
public java.util.Map$Entry next ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 2 */
/* iget-boolean v0, p0, Lc/c/a/b/e$a;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Lc/c/a/b/e$a;->c:Z */
/* .line 4 */
v0 = this.d;
v0 = this.b;
this.b = v0;
/* .line 5 */
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.d;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
this.b = v0;
/* .line 6 */
} // :goto_1
v0 = this.b;
} // .end method
