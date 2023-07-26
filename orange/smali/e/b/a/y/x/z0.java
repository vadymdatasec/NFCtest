public class e.b.a.y.x.z0 implements e.b.a.y.x.l implements e.b.a.y.w.d {
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
public final e.b.a.y.x.k b;
public final e.b.a.y.x.m c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/x/m<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public Integer d;
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
public e.b.a.y.x.a1 k;
/* # direct methods */
public e.b.a.y.x.z0 ( ) {
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
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iput v0, p0, Le/b/a/y/x/z0;->e:I */
/* .line 3 */
this.c = p1;
/* .line 4 */
this.b = p2;
return;
} // .end method
/* # virtual methods */
public void a ( java.lang.Exception p0 ) {
/* .locals 4 */
/* .line 44 */
v0 = this.b;
v1 = this.k;
v2 = this.i;
v2 = this.c;
v3 = e.b.a.y.a.e;
return;
} // .end method
public void a ( java.lang.Object p0 ) {
/* .locals 6 */
/* .line 43 */
v0 = this.b;
v1 = this.f;
v2 = this.i;
v3 = this.c;
v4 = e.b.a.y.a.e;
v5 = this.k;
/* move-object v2, p1 */
/* invoke-interface/range {v0 ..v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V */
return;
} // .end method
public Boolean a ( ) {
/* .locals 14 */
final String v0 = "ResourceCacheGenerator.startNext"; // const-string v0, "ResourceCacheGenerator.startNext"
/* .line 1 */
e.b.a.e0.u.i .a ( v0 );
/* .line 2 */
try { // :try_start_0
v0 = this.c;
(( e.b.a.y.x.m ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/y/x/m;->c()Ljava/util/List;
v1 = /* .line 3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
e.b.a.e0.u.i .a ( );
/* .line 5 */
} // :cond_0
try { // :try_start_1
v1 = this.c;
(( e.b.a.y.x.m ) v1 ).k ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->k()Ljava/util/List;
v3 = /* .line 6 */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 7 */
/* const-class v0, Ljava/io/File; */
v1 = this.c;
(( e.b.a.y.x.m ) v1 ).m ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->m()Ljava/lang/Class;
v0 = (( java.lang.Object ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
e.b.a.e0.u.i .a ( );
/* .line 9 */
} // :cond_1
try { // :try_start_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to find any load path from "; // const-string v2, "Failed to find any load path from "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
/* .line 10 */
(( e.b.a.y.x.m ) v2 ).h ( ); // invoke-virtual {v2}, Le/b/a/y/x/m;->h()Ljava/lang/Class;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " to "; // const-string v2, " to "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
/* .line 11 */
(( e.b.a.y.x.m ) v2 ).m ( ); // invoke-virtual {v2}, Le/b/a/y/x/m;->m()Ljava/lang/Class;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 12 */
} // :cond_2
} // :goto_0
v3 = this.g;
int v4 = 1; // const/4 v4, 0x1
if ( v3 != null) { // if-eqz v3, :cond_6
v3 = (( e.b.a.y.x.z0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/x/z0;->b()Z
/* if-nez v3, :cond_3 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 13 */
this.i = v0;
} // :cond_4
} // :goto_1
/* if-nez v2, :cond_5 */
/* .line 14 */
v0 = (( e.b.a.y.x.z0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/x/z0;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 15 */
v0 = this.g;
/* iget v1, p0, Le/b/a/y/x/z0;->h:I */
/* add-int/lit8 v3, v1, 0x1 */
/* iput v3, p0, Le/b/a/y/x/z0;->h:I */
/* check-cast v0, Le/b/a/y/y/w0; */
/* .line 16 */
v1 = this.j;
v3 = this.c;
/* .line 17 */
v3 = (( e.b.a.y.x.m ) v3 ).n ( ); // invoke-virtual {v3}, Le/b/a/y/x/m;->n()I
v5 = this.c;
v5 = (( e.b.a.y.x.m ) v5 ).f ( ); // invoke-virtual {v5}, Le/b/a/y/x/m;->f()I
v6 = this.c;
(( e.b.a.y.x.m ) v6 ).i ( ); // invoke-virtual {v6}, Le/b/a/y/x/m;->i()Le/b/a/y/r;
/* .line 18 */
this.i = v0;
/* .line 19 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.c;
v1 = this.i;
v1 = this.c;
v0 = (( e.b.a.y.x.m ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/b/a/y/x/m;->c(Ljava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 20 */
v0 = this.i;
v0 = this.c;
v1 = this.c;
(( e.b.a.y.x.m ) v1 ).j ( ); // invoke-virtual {v1}, Le/b/a/y/x/m;->j()Le/b/a/n;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
int v2 = 1; // const/4 v2, 0x1
/* .line 21 */
} // :cond_5
e.b.a.e0.u.i .a ( );
/* .line 22 */
} // :cond_6
} // :goto_2
try { // :try_start_3
/* iget v3, p0, Le/b/a/y/x/z0;->e:I */
/* add-int/2addr v3, v4 */
/* iput v3, p0, Le/b/a/y/x/z0;->e:I */
v5 = /* .line 23 */
/* if-lt v3, v5, :cond_8 */
/* .line 24 */
/* iget v3, p0, Le/b/a/y/x/z0;->d:I */
/* add-int/2addr v3, v4 */
/* iput v3, p0, Le/b/a/y/x/z0;->d:I */
v4 = /* .line 25 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* if-lt v3, v4, :cond_7 */
/* .line 26 */
e.b.a.e0.u.i .a ( );
/* .line 27 */
} // :cond_7
try { // :try_start_4
/* iput v2, p0, Le/b/a/y/x/z0;->e:I */
/* .line 28 */
} // :cond_8
/* iget v3, p0, Le/b/a/y/x/z0;->d:I */
/* check-cast v3, Le/b/a/y/n; */
/* .line 29 */
/* iget v4, p0, Le/b/a/y/x/z0;->e:I */
/* move-object v11, v4 */
/* check-cast v11, Ljava/lang/Class; */
/* .line 30 */
v4 = this.c;
(( e.b.a.y.x.m ) v4 ).b ( v11 ); // invoke-virtual {v4, v11}, Le/b/a/y/x/m;->b(Ljava/lang/Class;)Le/b/a/y/v;
/* .line 31 */
/* new-instance v13, Le/b/a/y/x/a1; */
v4 = this.c;
/* .line 32 */
(( e.b.a.y.x.m ) v4 ).b ( ); // invoke-virtual {v4}, Le/b/a/y/x/m;->b()Le/b/a/y/x/f1/b;
v4 = this.c;
/* .line 33 */
(( e.b.a.y.x.m ) v4 ).l ( ); // invoke-virtual {v4}, Le/b/a/y/x/m;->l()Le/b/a/y/n;
v4 = this.c;
/* .line 34 */
v8 = (( e.b.a.y.x.m ) v4 ).n ( ); // invoke-virtual {v4}, Le/b/a/y/x/m;->n()I
v4 = this.c;
/* .line 35 */
v9 = (( e.b.a.y.x.m ) v4 ).f ( ); // invoke-virtual {v4}, Le/b/a/y/x/m;->f()I
v4 = this.c;
/* .line 36 */
(( e.b.a.y.x.m ) v4 ).i ( ); // invoke-virtual {v4}, Le/b/a/y/x/m;->i()Le/b/a/y/r;
/* move-object v4, v13 */
/* move-object v6, v3 */
/* invoke-direct/range {v4 ..v12}, Le/b/a/y/x/a1;-><init>(Le/b/a/y/x/f1/b;Le/b/a/y/n;Le/b/a/y/n;IILe/b/a/y/v;Ljava/lang/Class;Le/b/a/y/r;)V */
this.k = v13;
/* .line 37 */
v4 = this.c;
(( e.b.a.y.x.m ) v4 ).d ( ); // invoke-virtual {v4}, Le/b/a/y/x/m;->d()Le/b/a/y/x/g1/c;
v5 = this.k;
this.j = v4;
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 38 */
this.f = v3;
/* .line 39 */
v3 = this.c;
(( e.b.a.y.x.m ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/b/a/y/x/m;->a(Ljava/io/File;)Ljava/util/List;
this.g = v3;
/* .line 40 */
/* iput v2, p0, Le/b/a/y/x/z0;->h:I */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 41 */
e.b.a.e0.u.i .a ( );
/* .line 42 */
/* throw v0 */
} // .end method
public final Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/b/a/y/x/z0;->h:I */
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
