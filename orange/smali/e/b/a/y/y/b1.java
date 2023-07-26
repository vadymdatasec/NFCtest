public class e.b.a.y.y.b1 implements e.b.a.y.w.e implements e.b.a.y.w.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Data:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/w/e<", */
	 /* "TData;>;", */
	 /* "Le/b/a/y/w/d<", */
	 /* "TData;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/b/a/y/w/e<", */
/* "TData;>;>;" */
/* } */
} // .end annotation
} // .end field
public final c.h.m.d c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/d<", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public Integer d;
public e.b.a.n e;
public e.b.a.y.w.d f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/w/d<", */
/* "-TData;>;" */
/* } */
} // .end annotation
} // .end field
public java.util.List g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean h;
/* # direct methods */
public e.b.a.y.y.b1 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/w/e<", */
/* "TData;>;>;", */
/* "Lc/h/m/d<", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.c = p2;
/* .line 3 */
e.b.a.e0.r .a ( p1 );
/* .line 4 */
this.b = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
/* iput p1, p0, Le/b/a/y/y/b1;->d:I */
return;
} // .end method
/* # virtual methods */
public java.lang.Class a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "TData;>;" */
/* } */
} // .end annotation
/* .line 7 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Le/b/a/y/w/e; */
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/n;", */
/* "Le/b/a/y/w/d<", */
/* "-TData;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
this.e = p1;
/* .line 2 */
this.f = p2;
/* .line 3 */
p2 = this.c;
/* check-cast p2, Ljava/util/List; */
this.g = p2;
/* .line 4 */
p2 = this.b;
/* iget v0, p0, Le/b/a/y/y/b1;->d:I */
/* check-cast p2, Le/b/a/y/w/e; */
/* .line 5 */
/* iget-boolean p1, p0, Le/b/a/y/y/b1;->h:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
(( e.b.a.y.y.b1 ) p0 ).cancel ( ); // invoke-virtual {p0}, Le/b/a/y/y/b1;->cancel()V
} // :cond_0
return;
} // .end method
public void a ( java.lang.Exception p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.g;
e.b.a.e0.r .a ( v0 );
/* check-cast v0, Ljava/util/List; */
/* .line 11 */
(( e.b.a.y.y.b1 ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/y/b1;->d()V
return;
} // .end method
public void a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TData;)V" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 8 */
v0 = this.f;
/* .line 9 */
} // :cond_0
(( e.b.a.y.y.b1 ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/y/b1;->d()V
} // :goto_0
return;
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = this.c;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.g = v0;
/* .line 4 */
v0 = this.b;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/b/a/y/w/e; */
/* .line 5 */
} // :cond_1
return;
} // .end method
public e.b.a.y.a c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Le/b/a/y/w/e; */
} // .end method
public void cancel ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/y/y/b1;->h:Z */
/* .line 2 */
v0 = this.b;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/b/a/y/w/e; */
/* .line 3 */
} // :cond_0
return;
} // .end method
public final void d ( ) {
/* .locals 4 */
/* .line 1 */
/* iget-boolean v0, p0, Le/b/a/y/y/b1;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* iget v0, p0, Le/b/a/y/y/b1;->d:I */
v1 = v1 = this.b;
/* add-int/lit8 v1, v1, -0x1 */
/* if-ge v0, v1, :cond_1 */
/* .line 3 */
/* iget v0, p0, Le/b/a/y/y/b1;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Le/b/a/y/y/b1;->d:I */
/* .line 4 */
v0 = this.e;
v1 = this.f;
(( e.b.a.y.y.b1 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/b/a/y/y/b1;->a(Le/b/a/n;Le/b/a/y/w/d;)V
/* .line 5 */
} // :cond_1
v0 = this.g;
e.b.a.e0.r .a ( v0 );
/* .line 6 */
v0 = this.f;
/* new-instance v1, Lcom/bumptech/glide/load/engine/GlideException; */
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.g;
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
final String v3 = "Fetch failed"; // const-string v3, "Fetch failed"
/* invoke-direct {v1, v3, v2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V */
} // :goto_0
return;
} // .end method
