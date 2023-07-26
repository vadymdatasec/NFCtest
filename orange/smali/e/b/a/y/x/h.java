public class e.b.a.y.x.h implements e.b.a.y.x.l implements e.b.a.y.w.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/x/l;", */
	 /* "Le/b/a/y/w/d<", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/b/a/y/n;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.x.m c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/x/m<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.x.k d;
public Integer e;
public e.b.a.y.n f;
public java.util.List g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "Ljava/io/File;", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public Integer h;
public volatile e.b.a.y.y.v0 i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/v0<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public java.io.File j;
/* # direct methods */
public e.b.a.y.x.h ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/m<", */
/* "*>;", */
/* "Le/b/a/y/x/k;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
(( e.b.a.y.x.m ) p1 ).c ( ); // invoke-virtual {p1}, Le/b/a/y/x/m;->c()Ljava/util/List;
/* invoke-direct {p0, v0, p1, p2}, Le/b/a/y/x/h;-><init>(Ljava/util/List;Le/b/a/y/x/m;Le/b/a/y/x/k;)V */
return;
} // .end method
public e.b.a.y.x.h ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/n;", */
/* ">;", */
/* "Le/b/a/y/x/m<", */
/* "*>;", */
/* "Le/b/a/y/x/k;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = -1; // const/4 v0, -0x1
/* .line 3 */
/* iput v0, p0, Le/b/a/y/x/h;->e:I */
/* .line 4 */
this.b = p1;
/* .line 5 */
this.c = p2;
/* .line 6 */
this.d = p3;
return;
} // .end method
/* # virtual methods */
public void a ( java.lang.Exception p0 ) {
/* .locals 4 */
/* .line 24 */
v0 = this.d;
v1 = this.f;
v2 = this.i;
v2 = this.c;
v3 = e.b.a.y.a.d;
return;
} // .end method
public void a ( java.lang.Object p0 ) {
/* .locals 6 */
/* .line 23 */
v0 = this.d;
v1 = this.f;
v2 = this.i;
v3 = this.c;
v4 = e.b.a.y.a.d;
v5 = this.f;
/* move-object v2, p1 */
/* invoke-interface/range {v0 ..v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V */
return;
} // .end method
public Boolean a ( ) {
/* .locals 7 */
final String v0 = "DataCacheGenerator.startNext"; // const-string v0, "DataCacheGenerator.startNext"
/* .line 1 */
e.b.a.e0.u.i .a ( v0 );
/* .line 2 */
} // :cond_0
} // :goto_0
try { // :try_start_0
v0 = this.g;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = (( e.b.a.y.x.h ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/x/h;->b()Z
/* if-nez v0, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.i = v0;
} // :cond_2
} // :goto_1
/* if-nez v1, :cond_3 */
/* .line 4 */
v0 = (( e.b.a.y.x.h ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/x/h;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 5 */
v0 = this.g;
/* iget v3, p0, Le/b/a/y/x/h;->h:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Le/b/a/y/x/h;->h:I */
/* check-cast v0, Le/b/a/y/y/w0; */
/* .line 6 */
v3 = this.j;
v4 = this.c;
/* .line 7 */
v4 = (( e.b.a.y.x.m ) v4 ).n ( ); // invoke-virtual {v4}, Le/b/a/y/x/m;->n()I
v5 = this.c;
v5 = (( e.b.a.y.x.m ) v5 ).f ( ); // invoke-virtual {v5}, Le/b/a/y/x/m;->f()I
v6 = this.c;
(( e.b.a.y.x.m ) v6 ).i ( ); // invoke-virtual {v6}, Le/b/a/y/x/m;->i()Le/b/a/y/r;
/* .line 8 */
this.i = v0;
/* .line 9 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.c;
v3 = this.i;
v3 = this.c;
v0 = (( e.b.a.y.x.m ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Le/b/a/y/x/m;->c(Ljava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 10 */
v0 = this.i;
v0 = this.c;
v1 = this.c;
(( e.b.a.y.x.m ) v1 ).j ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->j()Le/b/a/n;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 11 */
} // :cond_3
e.b.a.e0.u.i .a ( );
/* .line 12 */
} // :cond_4
} // :goto_2
try { // :try_start_1
/* iget v0, p0, Le/b/a/y/x/h;->e:I */
/* add-int/2addr v0, v2 */
/* iput v0, p0, Le/b/a/y/x/h;->e:I */
/* .line 13 */
v2 = v2 = this.b;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* if-lt v0, v2, :cond_5 */
/* .line 14 */
e.b.a.e0.u.i .a ( );
/* .line 15 */
} // :cond_5
try { // :try_start_2
v0 = this.b;
/* iget v2, p0, Le/b/a/y/x/h;->e:I */
/* check-cast v0, Le/b/a/y/n; */
/* .line 16 */
/* new-instance v2, Le/b/a/y/x/i; */
v3 = this.c;
(( e.b.a.y.x.m ) v3 ).l ( ); // invoke-virtual {v3}, Le/b/a/y/x/m;->l()Le/b/a/y/n;
/* invoke-direct {v2, v0, v3}, Le/b/a/y/x/i;-><init>(Le/b/a/y/n;Le/b/a/y/n;)V */
/* .line 17 */
v3 = this.c;
(( e.b.a.y.x.m ) v3 ).d ( ); // invoke-virtual {v3}, Le/b/a/y/x/m;->d()Le/b/a/y/x/g1/c;
this.j = v2;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 18 */
this.f = v0;
/* .line 19 */
v0 = this.c;
(( e.b.a.y.x.m ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/b/a/y/x/m;->a(Ljava/io/File;)Ljava/util/List;
this.g = v0;
/* .line 20 */
/* iput v1, p0, Le/b/a/y/x/h;->h:I */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 21 */
e.b.a.e0.u.i .a ( );
/* .line 22 */
/* throw v0 */
} // .end method
public final Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/b/a/y/x/h;->h:I */
v1 = v1 = this.g;
/* if-ge v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void cancel ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.c;
} // :cond_0
return;
} // .end method
