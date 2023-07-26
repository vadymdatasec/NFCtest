public class e.c.a.b2 implements e.c.a.j0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/c/a/c2;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Float b;
public Float c;
public e.c.a.c2 d;
public Boolean e;
public Boolean f;
public Integer g;
public Boolean h;
public final e.c.a.l2 i; //synthetic
/* # direct methods */
public e.c.a.b2 ( ) {
/* .locals 2 */
/* .line 1 */
this.i = p1;
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.a = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
this.d = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
/* iput-boolean p1, p0, Le/c/a/b2;->e:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Le/c/a/b2;->f:Z */
int v0 = -1; // const/4 v0, -0x1
/* .line 6 */
/* iput v0, p0, Le/c/a/b2;->g:I */
/* .line 7 */
(( e.c.a.i0 ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Le/c/a/i0;->a(Le/c/a/j0;)V
/* .line 8 */
/* iget-boolean p2, p0, Le/c/a/b2;->h:Z */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 9 */
	 p2 = this.d;
	 v0 = this.a;
	 /* iget v1, p0, Le/c/a/b2;->g:I */
	 /* check-cast v0, Le/c/a/c2; */
	 (( e.c.a.c2 ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/c/a/c2;->a(Le/c/a/c2;)V
	 /* .line 10 */
	 p2 = this.a;
	 /* iget v0, p0, Le/c/a/b2;->g:I */
	 v1 = this.d;
	 /* .line 11 */
	 /* iput-boolean p1, p0, Le/c/a/b2;->h:Z */
	 /* .line 12 */
} // :cond_0
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 13 */
	 p2 = this.a;
} // :cond_1
return;
} // .end method
/* # virtual methods */
public java.util.List a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/c/a/c2;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
} // .end method
public void a ( Float p0, Float p1 ) {
/* .locals 8 */
/* .line 2 */
/* iget-boolean v0, p0, Le/c/a/b2;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.d;
v1 = this.a;
/* iget v2, p0, Le/c/a/b2;->g:I */
/* check-cast v1, Le/c/a/c2; */
(( e.c.a.c2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/c/a/c2;->a(Le/c/a/c2;)V
/* .line 4 */
v0 = this.a;
/* iget v1, p0, Le/c/a/b2;->g:I */
v2 = this.d;
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput-boolean v0, p0, Le/c/a/b2;->h:Z */
/* .line 6 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v1 = this.a;
/* .line 8 */
} // :cond_1
/* iput p1, p0, Le/c/a/b2;->b:F */
/* .line 9 */
/* iput p2, p0, Le/c/a/b2;->c:F */
/* .line 10 */
/* new-instance v0, Le/c/a/c2; */
v3 = this.i;
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move-object v2, v0 */
/* move v4, p1 */
/* move v5, p2 */
/* invoke-direct/range {v2 ..v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
this.d = v0;
/* .line 11 */
p1 = p1 = this.a;
/* iput p1, p0, Le/c/a/b2;->g:I */
return;
} // .end method
public void a ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 8 */
/* .line 19 */
v0 = this.d;
(( e.c.a.c2 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/c/a/c2;->a(FF)V
/* .line 20 */
v0 = this.a;
v1 = this.d;
/* .line 21 */
/* new-instance v0, Le/c/a/c2; */
v3 = this.i;
/* sub-float v6, p3, p1 */
/* sub-float v7, p4, p2 */
/* move-object v2, v0 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v2 ..v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
/* .line 22 */
this.d = v0;
int p1 = 0; // const/4 p1, 0x0
/* .line 23 */
/* iput-boolean p1, p0, Le/c/a/b2;->h:Z */
return;
} // .end method
public void a ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 8 */
/* .line 12 */
/* iget-boolean v0, p0, Le/c/a/b2;->f:Z */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Le/c/a/b2;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 13 */
} // :cond_0
v0 = this.d;
(( e.c.a.c2 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/c/a/c2;->a(FF)V
/* .line 14 */
p1 = this.a;
p2 = this.d;
/* .line 15 */
/* iput-boolean v1, p0, Le/c/a/b2;->e:Z */
/* .line 16 */
} // :cond_1
/* new-instance p1, Le/c/a/c2; */
v3 = this.i;
/* sub-float v6, p5, p3 */
/* sub-float v7, p6, p4 */
/* move-object v2, p1 */
/* move v4, p5 */
/* move v5, p6 */
/* invoke-direct/range {v2 ..v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
/* .line 17 */
this.d = p1;
/* .line 18 */
/* iput-boolean v1, p0, Le/c/a/b2;->h:Z */
return;
} // .end method
public void a ( Float p0, Float p1, Float p2, Boolean p3, Boolean p4, Float p5, Float p6 ) {
/* .locals 13 */
/* move-object v10, p0 */
int v11 = 1; // const/4 v11, 0x1
/* .line 24 */
/* iput-boolean v11, v10, Le/c/a/b2;->e:Z */
int v12 = 0; // const/4 v12, 0x0
/* .line 25 */
/* iput-boolean v12, v10, Le/c/a/b2;->f:Z */
/* .line 26 */
v0 = this.d;
/* iget v1, v0, Le/c/a/c2;->a:F */
/* iget v2, v0, Le/c/a/c2;->b:F */
/* move v0, v1 */
/* move v1, v2 */
/* move v2, p1 */
/* move v3, p2 */
/* move/from16 v4, p3 */
/* move/from16 v5, p4 */
/* move/from16 v6, p5 */
/* move/from16 v7, p6 */
/* move/from16 v8, p7 */
/* move-object v9, p0 */
/* invoke-static/range {v0 ..v9}, Le/c/a/l2;->a(FFFFFZZFFLe/c/a/j0;)V */
/* .line 27 */
/* iput-boolean v11, v10, Le/c/a/b2;->f:Z */
/* .line 28 */
/* iput-boolean v12, v10, Le/c/a/b2;->h:Z */
return;
} // .end method
public void b ( Float p0, Float p1 ) {
/* .locals 8 */
/* .line 1 */
v0 = this.d;
(( e.c.a.c2 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/c/a/c2;->a(FF)V
/* .line 2 */
v0 = this.a;
v1 = this.d;
/* .line 3 */
/* new-instance v0, Le/c/a/c2; */
v3 = this.i;
v1 = this.d;
/* iget v2, v1, Le/c/a/c2;->a:F */
/* sub-float v6, p1, v2 */
/* iget v1, v1, Le/c/a/c2;->b:F */
/* sub-float v7, p2, v1 */
/* move-object v2, v0 */
/* move v4, p1 */
/* move v5, p2 */
/* invoke-direct/range {v2 ..v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
/* .line 4 */
this.d = v0;
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
/* iput-boolean p1, p0, Le/c/a/b2;->h:Z */
return;
} // .end method
public void close ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v1 = this.d;
/* .line 2 */
/* iget v0, p0, Le/c/a/b2;->b:F */
/* iget v1, p0, Le/c/a/b2;->c:F */
(( e.c.a.b2 ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/c/a/b2;->b(FF)V
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Le/c/a/b2;->h:Z */
return;
} // .end method
