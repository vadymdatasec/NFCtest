public abstract class c.c.a.b.f implements java.util.Iterator implements c.c.a.b.g {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
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
public c.c.a.b.d c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.c.a.b.f ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p2;
/* .line 3 */
this.c = p1;
return;
} // .end method
/* # virtual methods */
public final c.c.a.b.d a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.c;
v1 = this.b;
/* if-eq v0, v1, :cond_1 */
/* if-nez v1, :cond_0 */
/* .line 9 */
} // :cond_0
(( c.c.a.b.f ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/c/a/b/f;->c(Lc/c/a/b/d;)Lc/c/a/b/d;
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
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
/* if-ne v0, p1, :cond_0 */
v0 = this.c;
/* if-ne p1, v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.c = v0;
/* .line 3 */
this.b = v0;
/* .line 4 */
} // :cond_0
v0 = this.b;
/* if-ne v0, p1, :cond_1 */
/* .line 5 */
(( c.c.a.b.f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/c/a/b/f;->b(Lc/c/a/b/d;)Lc/c/a/b/d;
this.b = v0;
/* .line 6 */
} // :cond_1
v0 = this.c;
/* if-ne v0, p1, :cond_2 */
/* .line 7 */
(( c.c.a.b.f ) p0 ).a ( ); // invoke-virtual {p0}, Lc/c/a/b/f;->a()Lc/c/a/b/d;
this.c = p1;
} // :cond_2
return;
} // .end method
public abstract c.c.a.b.d b ( Object p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;)", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end method
public abstract c.c.a.b.d c ( Object p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;)", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end method
public Boolean hasNext ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.Object next ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( c.c.a.b.f ) p0 ).next ( ); // invoke-virtual {p0}, Lc/c/a/b/f;->next()Ljava/util/Map$Entry;
} // .end method
public java.util.Map$Entry next ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.c;
/* .line 3 */
(( c.c.a.b.f ) p0 ).a ( ); // invoke-virtual {p0}, Lc/c/a/b/f;->a()Lc/c/a/b/d;
this.c = v1;
} // .end method
