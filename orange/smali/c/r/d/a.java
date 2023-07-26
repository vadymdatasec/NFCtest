public class c.r.d.a implements c.r.d.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/r/d/a$a;, */
	 /* Lc/r/d/a$b; */
	 /* } */
} // .end annotation
/* # instance fields */
public c.h.m.d a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/d<", */
/* "Lc/r/d/a$b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.ArrayList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lc/r/d/a$b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lc/r/d/a$b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final c.r.d.a$a d;
public java.lang.Runnable e;
public final Boolean f;
public final c.r.d.z g;
public Integer h;
/* # direct methods */
public c.r.d.a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Lc/r/d/a;-><init>(Lc/r/d/a$a;Z)V */
return;
} // .end method
public c.r.d.a ( ) {
/* .locals 2 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* new-instance v0, Lc/h/m/e; */
/* const/16 v1, 0x1e */
/* invoke-direct {v0, v1}, Lc/h/m/e;-><init>(I)V */
this.a = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.c = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput v0, p0, Lc/r/d/a;->h:I */
/* .line 7 */
this.d = p1;
/* .line 8 */
/* iput-boolean p2, p0, Lc/r/d/a;->f:Z */
/* .line 9 */
/* new-instance p1, Lc/r/d/z; */
/* invoke-direct {p1, p0}, Lc/r/d/z;-><init>(Lc/r/d/y;)V */
this.g = p1;
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 5 */
/* .line 22 */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_7 */
/* .line 23 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/r/d/a$b; */
/* .line 24 */
/* iget v3, v2, Lc/r/d/a$b;->a:I */
int v4 = 1; // const/4 v4, 0x1
/* if-eq v3, v4, :cond_5 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v3, v4, :cond_3 */
/* const/16 v4, 0x8 */
/* if-eq v3, v4, :cond_0 */
/* .line 25 */
} // :cond_0
/* iget v3, v2, Lc/r/d/a$b;->b:I */
/* if-ne v3, p1, :cond_1 */
/* .line 26 */
/* iget p1, v2, Lc/r/d/a$b;->d:I */
} // :cond_1
/* if-ge v3, p1, :cond_2 */
/* add-int/lit8 p1, p1, -0x1 */
/* .line 27 */
} // :cond_2
/* iget v2, v2, Lc/r/d/a$b;->d:I */
/* if-gt v2, p1, :cond_6 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 28 */
} // :cond_3
/* iget v3, v2, Lc/r/d/a$b;->b:I */
/* if-gt v3, p1, :cond_6 */
/* .line 29 */
/* iget v2, v2, Lc/r/d/a$b;->d:I */
/* add-int/2addr v3, v2 */
/* if-le v3, p1, :cond_4 */
int p1 = -1; // const/4 p1, -0x1
} // :cond_4
/* sub-int/2addr p1, v2 */
/* .line 30 */
} // :cond_5
/* iget v3, v2, Lc/r/d/a$b;->b:I */
/* if-gt v3, p1, :cond_6 */
/* .line 31 */
/* iget v2, v2, Lc/r/d/a$b;->d:I */
/* add-int/2addr p1, v2 */
} // :cond_6
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
} // .end method
public Integer a ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .line 10 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_0
/* if-ge p2, v0, :cond_6 */
/* .line 11 */
v1 = this.c;
(( java.util.ArrayList ) v1 ).get ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Lc/r/d/a$b; */
/* .line 12 */
/* iget v2, v1, Lc/r/d/a$b;->a:I */
/* const/16 v3, 0x8 */
/* if-ne v2, v3, :cond_2 */
/* .line 13 */
/* iget v2, v1, Lc/r/d/a$b;->b:I */
/* if-ne v2, p1, :cond_0 */
/* .line 14 */
/* iget p1, v1, Lc/r/d/a$b;->d:I */
} // :cond_0
/* if-ge v2, p1, :cond_1 */
/* add-int/lit8 p1, p1, -0x1 */
/* .line 15 */
} // :cond_1
/* iget v1, v1, Lc/r/d/a$b;->d:I */
/* if-gt v1, p1, :cond_5 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 16 */
} // :cond_2
/* iget v3, v1, Lc/r/d/a$b;->b:I */
/* if-gt v3, p1, :cond_5 */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v2, v4, :cond_4 */
/* .line 17 */
/* iget v1, v1, Lc/r/d/a$b;->d:I */
/* add-int/2addr v3, v1 */
/* if-ge p1, v3, :cond_3 */
int p1 = -1; // const/4 p1, -0x1
} // :cond_3
/* sub-int/2addr p1, v1 */
} // :cond_4
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_5 */
/* .line 18 */
/* iget v1, v1, Lc/r/d/a$b;->d:I */
/* add-int/2addr p1, v1 */
} // :cond_5
} // :goto_1
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_6
} // .end method
public c.r.d.a$b a ( Integer p0, Integer p1, Integer p2, java.lang.Object p3 ) {
/* .locals 1 */
/* .line 32 */
v0 = this.a;
/* check-cast v0, Lc/r/d/a$b; */
/* if-nez v0, :cond_0 */
/* .line 33 */
/* new-instance v0, Lc/r/d/a$b; */
/* invoke-direct {v0, p1, p2, p3, p4}, Lc/r/d/a$b;-><init>(IIILjava/lang/Object;)V */
/* .line 34 */
} // :cond_0
/* iput p1, v0, Lc/r/d/a$b;->a:I */
/* .line 35 */
/* iput p2, v0, Lc/r/d/a$b;->b:I */
/* .line 36 */
/* iput p3, v0, Lc/r/d/a$b;->d:I */
/* .line 37 */
this.c = p4;
} // :goto_0
} // .end method
public void a ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* .line 2 */
v3 = this.d;
v4 = this.c;
(( java.util.ArrayList ) v4 ).get ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Lc/r/d/a$b; */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 3 */
} // :cond_0
v0 = this.c;
(( c.r.d.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V
/* .line 4 */
/* iput v1, p0, Lc/r/d/a;->h:I */
return;
} // .end method
public void a ( c.r.d.a$b p0 ) {
/* .locals 1 */
/* .line 38 */
/* iget-boolean v0, p0, Lc/r/d/a;->f:Z */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 39 */
this.c = v0;
/* .line 40 */
v0 = this.a;
} // :cond_0
return;
} // .end method
public void a ( c.r.d.a$b p0, Integer p1 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.d;
/* .line 6 */
/* iget v0, p1, Lc/r/d/a$b;->a:I */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_0 */
/* .line 7 */
v0 = this.d;
/* iget v1, p1, Lc/r/d/a$b;->d:I */
p1 = this.c;
/* .line 8 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "only remove and update ops can be dispatched in first pass"; // const-string p2, "only remove and update ops can be dispatched in first pass"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 9 */
} // :cond_1
v0 = this.d;
/* iget p1, p1, Lc/r/d/a$b;->d:I */
} // :goto_0
return;
} // .end method
public void a ( java.util.List p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/r/d/a$b;", */
/* ">;)V" */
/* } */
} // .end annotation
v0 = /* .line 41 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 42 */
/* check-cast v2, Lc/r/d/a$b; */
(( c.r.d.a ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
/* add-int/lit8 v1, v1, 0x1 */
/* .line 43 */
} // :cond_0
return;
} // .end method
public Boolean a ( Integer p0, Integer p1, java.lang.Object p2 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* if-ge p2, v1, :cond_0 */
/* .line 19 */
} // :cond_0
v2 = this.b;
int v3 = 4; // const/4 v3, 0x4
(( c.r.d.a ) p0 ).a ( v3, p1, p2, p3 ); // invoke-virtual {p0, v3, p1, p2, p3}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
(( java.util.ArrayList ) v2 ).add ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 20 */
/* iget p1, p0, Lc/r/d/a;->h:I */
/* or-int/2addr p1, v3 */
/* iput p1, p0, Lc/r/d/a;->h:I */
/* .line 21 */
p1 = this.b;
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* if-ne p1, v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
} // .end method
public final Integer b ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* .line 1 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* const/16 v2, 0x8 */
/* if-ltz v0, :cond_d */
/* .line 2 */
v3 = this.c;
(( java.util.ArrayList ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lc/r/d/a$b; */
/* .line 3 */
/* iget v4, v3, Lc/r/d/a$b;->a:I */
int v5 = 2; // const/4 v5, 0x2
/* if-ne v4, v2, :cond_8 */
/* .line 4 */
/* iget v2, v3, Lc/r/d/a$b;->b:I */
/* iget v4, v3, Lc/r/d/a$b;->d:I */
/* if-ge v2, v4, :cond_0 */
} // :cond_0
/* move v6, v4 */
/* move v4, v2 */
/* move v2, v6 */
} // :goto_1
/* if-lt p1, v2, :cond_6 */
/* if-gt p1, v4, :cond_6 */
/* .line 5 */
/* iget v4, v3, Lc/r/d/a$b;->b:I */
/* if-ne v2, v4, :cond_3 */
/* if-ne p2, v1, :cond_1 */
/* .line 6 */
/* iget v2, v3, Lc/r/d/a$b;->d:I */
/* add-int/2addr v2, v1 */
/* iput v2, v3, Lc/r/d/a$b;->d:I */
} // :cond_1
/* if-ne p2, v5, :cond_2 */
/* .line 7 */
/* iget v2, v3, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v2, v1 */
/* iput v2, v3, Lc/r/d/a$b;->d:I */
} // :cond_2
} // :goto_2
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_3
/* if-ne p2, v1, :cond_4 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 8 */
/* iput v4, v3, Lc/r/d/a$b;->b:I */
} // :cond_4
/* if-ne p2, v5, :cond_5 */
/* add-int/lit8 v4, v4, -0x1 */
/* .line 9 */
/* iput v4, v3, Lc/r/d/a$b;->b:I */
} // :cond_5
} // :goto_3
/* add-int/lit8 p1, p1, -0x1 */
/* .line 10 */
} // :cond_6
/* iget v2, v3, Lc/r/d/a$b;->b:I */
/* if-ge p1, v2, :cond_c */
/* if-ne p2, v1, :cond_7 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 11 */
/* iput v2, v3, Lc/r/d/a$b;->b:I */
/* .line 12 */
/* iget v2, v3, Lc/r/d/a$b;->d:I */
/* add-int/2addr v2, v1 */
/* iput v2, v3, Lc/r/d/a$b;->d:I */
} // :cond_7
/* if-ne p2, v5, :cond_c */
/* add-int/lit8 v2, v2, -0x1 */
/* .line 13 */
/* iput v2, v3, Lc/r/d/a$b;->b:I */
/* .line 14 */
/* iget v2, v3, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v2, v1 */
/* iput v2, v3, Lc/r/d/a$b;->d:I */
/* .line 15 */
} // :cond_8
/* iget v2, v3, Lc/r/d/a$b;->b:I */
/* if-gt v2, p1, :cond_a */
/* if-ne v4, v1, :cond_9 */
/* .line 16 */
/* iget v2, v3, Lc/r/d/a$b;->d:I */
/* sub-int/2addr p1, v2 */
} // :cond_9
/* if-ne v4, v5, :cond_c */
/* .line 17 */
/* iget v2, v3, Lc/r/d/a$b;->d:I */
/* add-int/2addr p1, v2 */
} // :cond_a
/* if-ne p2, v1, :cond_b */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 18 */
/* iput v2, v3, Lc/r/d/a$b;->b:I */
} // :cond_b
/* if-ne p2, v5, :cond_c */
/* add-int/lit8 v2, v2, -0x1 */
/* .line 19 */
/* iput v2, v3, Lc/r/d/a$b;->b:I */
} // :cond_c
} // :goto_4
/* add-int/lit8 v0, v0, -0x1 */
/* goto/16 :goto_0 */
/* .line 20 */
} // :cond_d
p2 = this.c;
p2 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr p2, v1 */
} // :goto_5
/* if-ltz p2, :cond_11 */
/* .line 21 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lc/r/d/a$b; */
/* .line 22 */
/* iget v1, v0, Lc/r/d/a$b;->a:I */
/* if-ne v1, v2, :cond_f */
/* .line 23 */
/* iget v1, v0, Lc/r/d/a$b;->d:I */
/* iget v3, v0, Lc/r/d/a$b;->b:I */
/* if-eq v1, v3, :cond_e */
/* if-gez v1, :cond_10 */
/* .line 24 */
} // :cond_e
v1 = this.c;
(( java.util.ArrayList ) v1 ).remove ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 25 */
(( c.r.d.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
/* .line 26 */
} // :cond_f
/* iget v1, v0, Lc/r/d/a$b;->d:I */
/* if-gtz v1, :cond_10 */
/* .line 27 */
v1 = this.c;
(( java.util.ArrayList ) v1 ).remove ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 28 */
(( c.r.d.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
} // :cond_10
} // :goto_6
/* add-int/lit8 p2, p2, -0x1 */
} // :cond_11
} // .end method
public void b ( ) {
/* .locals 7 */
/* .line 36 */
(( c.r.d.a ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/a;->a()V
/* .line 37 */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_5 */
/* .line 38 */
v3 = this.b;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lc/r/d/a$b; */
/* .line 39 */
/* iget v4, v3, Lc/r/d/a$b;->a:I */
int v5 = 1; // const/4 v5, 0x1
/* if-eq v4, v5, :cond_3 */
int v5 = 2; // const/4 v5, 0x2
/* if-eq v4, v5, :cond_2 */
int v5 = 4; // const/4 v5, 0x4
/* if-eq v4, v5, :cond_1 */
/* const/16 v5, 0x8 */
/* if-eq v4, v5, :cond_0 */
/* .line 40 */
} // :cond_0
v4 = this.d;
/* .line 41 */
v4 = this.d;
/* iget v5, v3, Lc/r/d/a$b;->b:I */
/* iget v3, v3, Lc/r/d/a$b;->d:I */
/* .line 42 */
} // :cond_1
v4 = this.d;
/* .line 43 */
v4 = this.d;
/* iget v5, v3, Lc/r/d/a$b;->b:I */
/* iget v6, v3, Lc/r/d/a$b;->d:I */
v3 = this.c;
/* .line 44 */
} // :cond_2
v4 = this.d;
/* .line 45 */
v4 = this.d;
/* iget v5, v3, Lc/r/d/a$b;->b:I */
/* iget v3, v3, Lc/r/d/a$b;->d:I */
/* .line 46 */
} // :cond_3
v4 = this.d;
/* .line 47 */
v4 = this.d;
/* iget v5, v3, Lc/r/d/a$b;->b:I */
/* iget v3, v3, Lc/r/d/a$b;->d:I */
/* .line 48 */
} // :goto_1
v3 = this.e;
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 49 */
} // :cond_4
/* add-int/lit8 v2, v2, 0x1 */
/* .line 50 */
} // :cond_5
v0 = this.b;
(( c.r.d.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V
/* .line 51 */
/* iput v1, p0, Lc/r/d/a;->h:I */
return;
} // .end method
public final void b ( c.r.d.a$b p0 ) {
/* .locals 0 */
/* .line 35 */
(( c.r.d.a ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V
return;
} // .end method
public final Boolean b ( Integer p0 ) {
/* .locals 7 */
/* .line 29 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_3 */
/* .line 30 */
v3 = this.c;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lc/r/d/a$b; */
/* .line 31 */
/* iget v4, v3, Lc/r/d/a$b;->a:I */
/* const/16 v5, 0x8 */
int v6 = 1; // const/4 v6, 0x1
/* if-ne v4, v5, :cond_0 */
/* .line 32 */
/* iget v3, v3, Lc/r/d/a$b;->d:I */
/* add-int/lit8 v4, v2, 0x1 */
v3 = (( c.r.d.a ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lc/r/d/a;->a(II)I
/* if-ne v3, p1, :cond_2 */
} // :cond_0
/* if-ne v4, v6, :cond_2 */
/* .line 33 */
/* iget v4, v3, Lc/r/d/a$b;->b:I */
/* iget v3, v3, Lc/r/d/a$b;->d:I */
/* add-int/2addr v3, v4 */
} // :goto_1
/* if-ge v4, v3, :cond_2 */
/* add-int/lit8 v5, v2, 0x1 */
/* .line 34 */
v5 = (( c.r.d.a ) p0 ).a ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lc/r/d/a;->a(II)I
/* if-ne v5, p1, :cond_1 */
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // .end method
public Integer c ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
p1 = (( c.r.d.a ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/r/d/a;->a(II)I
} // .end method
public final void c ( c.r.d.a$b p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.a ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void d ( c.r.d.a$b p0 ) {
/* .locals 10 */
/* .line 1 */
/* iget v0, p1, Lc/r/d/a$b;->b:I */
/* .line 2 */
/* iget v1, p1, Lc/r/d/a$b;->d:I */
/* add-int/2addr v1, v0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = -1; // const/4 v3, -0x1
/* move v4, v0 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
int v6 = 0; // const/4 v6, 0x0
int v7 = 2; // const/4 v7, 0x2
/* if-ge v4, v1, :cond_5 */
/* .line 3 */
v8 = this.d;
int v9 = 1; // const/4 v9, 0x1
/* if-nez v8, :cond_2 */
/* .line 4 */
v8 = (( c.r.d.a ) p0 ).b ( v4 ); // invoke-virtual {p0, v4}, Lc/r/d/a;->b(I)Z
if ( v8 != null) { // if-eqz v8, :cond_0
} // :cond_0
/* if-ne v3, v9, :cond_1 */
/* .line 5 */
(( c.r.d.a ) p0 ).a ( v7, v0, v5, v6 ); // invoke-virtual {p0, v7, v0, v5, v6}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
/* .line 6 */
(( c.r.d.a ) p0 ).g ( v3 ); // invoke-virtual {p0, v3}, Lc/r/d/a;->g(Lc/r/d/a$b;)V
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
int v6 = 0; // const/4 v6, 0x0
} // :cond_2
} // :goto_2
/* if-nez v3, :cond_3 */
/* .line 7 */
(( c.r.d.a ) p0 ).a ( v7, v0, v5, v6 ); // invoke-virtual {p0, v7, v0, v5, v6}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
/* .line 8 */
(( c.r.d.a ) p0 ).f ( v3 ); // invoke-virtual {p0, v3}, Lc/r/d/a;->f(Lc/r/d/a$b;)V
int v3 = 1; // const/4 v3, 0x1
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
int v6 = 1; // const/4 v6, 0x1
} // :goto_4
if ( v3 != null) { // if-eqz v3, :cond_4
/* sub-int/2addr v4, v5 */
/* sub-int/2addr v1, v5 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_4
/* add-int/lit8 v5, v5, 0x1 */
} // :goto_5
/* add-int/2addr v4, v9 */
/* move v3, v6 */
/* .line 9 */
} // :cond_5
/* iget v1, p1, Lc/r/d/a$b;->d:I */
/* if-eq v5, v1, :cond_6 */
/* .line 10 */
(( c.r.d.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
/* .line 11 */
(( c.r.d.a ) p0 ).a ( v7, v0, v5, v6 ); // invoke-virtual {p0, v7, v0, v5, v6}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
} // :cond_6
/* if-nez v3, :cond_7 */
/* .line 12 */
(( c.r.d.a ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->f(Lc/r/d/a$b;)V
/* .line 13 */
} // :cond_7
(( c.r.d.a ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V
} // :goto_6
return;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 15 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_0 */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean d ( Integer p0 ) {
/* .locals 1 */
/* .line 14 */
/* iget v0, p0, Lc/r/d/a;->h:I */
/* and-int/2addr p1, v0 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void e ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.g;
v1 = this.b;
(( c.r.d.z ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/r/d/z;->b(Ljava/util/List;)V
/* .line 2 */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_5 */
/* .line 3 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/r/d/a$b; */
/* .line 4 */
/* iget v3, v2, Lc/r/d/a$b;->a:I */
int v4 = 1; // const/4 v4, 0x1
/* if-eq v3, v4, :cond_3 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v3, v4, :cond_2 */
int v4 = 4; // const/4 v4, 0x4
/* if-eq v3, v4, :cond_1 */
/* const/16 v4, 0x8 */
/* if-eq v3, v4, :cond_0 */
/* .line 5 */
} // :cond_0
(( c.r.d.a ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Lc/r/d/a;->c(Lc/r/d/a$b;)V
/* .line 6 */
} // :cond_1
(( c.r.d.a ) p0 ).e ( v2 ); // invoke-virtual {p0, v2}, Lc/r/d/a;->e(Lc/r/d/a$b;)V
/* .line 7 */
} // :cond_2
(( c.r.d.a ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Lc/r/d/a;->d(Lc/r/d/a$b;)V
/* .line 8 */
} // :cond_3
(( c.r.d.a ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Lc/r/d/a;->b(Lc/r/d/a$b;)V
/* .line 9 */
} // :goto_1
v2 = this.e;
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 10 */
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
/* .line 11 */
} // :cond_5
v0 = this.b;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public final void e ( c.r.d.a$b p0 ) {
/* .locals 9 */
/* .line 12 */
/* iget v0, p1, Lc/r/d/a$b;->b:I */
/* .line 13 */
/* iget v1, p1, Lc/r/d/a$b;->d:I */
/* add-int/2addr v1, v0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = -1; // const/4 v3, -0x1
/* move v3, v0 */
int v4 = -1; // const/4 v4, -0x1
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
int v6 = 4; // const/4 v6, 0x4
/* if-ge v0, v1, :cond_4 */
/* .line 14 */
v7 = this.d;
int v8 = 1; // const/4 v8, 0x1
/* if-nez v7, :cond_2 */
/* .line 15 */
v7 = (( c.r.d.a ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->b(I)Z
if ( v7 != null) { // if-eqz v7, :cond_0
} // :cond_0
/* if-ne v4, v8, :cond_1 */
/* .line 16 */
v4 = this.c;
(( c.r.d.a ) p0 ).a ( v6, v3, v5, v4 ); // invoke-virtual {p0, v6, v3, v5, v4}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
/* .line 17 */
(( c.r.d.a ) p0 ).g ( v3 ); // invoke-virtual {p0, v3}, Lc/r/d/a;->g(Lc/r/d/a$b;)V
/* move v3, v0 */
int v5 = 0; // const/4 v5, 0x0
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :cond_2
} // :goto_1
/* if-nez v4, :cond_3 */
/* .line 18 */
v4 = this.c;
(( c.r.d.a ) p0 ).a ( v6, v3, v5, v4 ); // invoke-virtual {p0, v6, v3, v5, v4}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
/* .line 19 */
(( c.r.d.a ) p0 ).f ( v3 ); // invoke-virtual {p0, v3}, Lc/r/d/a;->f(Lc/r/d/a$b;)V
/* move v3, v0 */
int v5 = 0; // const/4 v5, 0x0
} // :cond_3
int v4 = 1; // const/4 v4, 0x1
} // :goto_2
/* add-int/2addr v5, v8 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 20 */
} // :cond_4
/* iget v0, p1, Lc/r/d/a$b;->d:I */
/* if-eq v5, v0, :cond_5 */
/* .line 21 */
v0 = this.c;
/* .line 22 */
(( c.r.d.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
/* .line 23 */
(( c.r.d.a ) p0 ).a ( v6, v3, v5, v0 ); // invoke-virtual {p0, v6, v3, v5, v0}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
} // :cond_5
/* if-nez v4, :cond_6 */
/* .line 24 */
(( c.r.d.a ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->f(Lc/r/d/a$b;)V
/* .line 25 */
} // :cond_6
(( c.r.d.a ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->g(Lc/r/d/a$b;)V
} // :goto_3
return;
} // .end method
public void f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( c.r.d.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V
/* .line 2 */
v0 = this.c;
(( c.r.d.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->a(Ljava/util/List;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Lc/r/d/a;->h:I */
return;
} // .end method
public final void f ( c.r.d.a$b p0 ) {
/* .locals 12 */
/* .line 4 */
/* iget v0, p1, Lc/r/d/a$b;->a:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_9 */
/* const/16 v2, 0x8 */
/* if-eq v0, v2, :cond_9 */
/* .line 5 */
/* iget v2, p1, Lc/r/d/a$b;->b:I */
v0 = (( c.r.d.a ) p0 ).b ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lc/r/d/a;->b(II)I
/* .line 6 */
/* iget v2, p1, Lc/r/d/a$b;->b:I */
/* .line 7 */
/* iget v3, p1, Lc/r/d/a$b;->a:I */
int v4 = 2; // const/4 v4, 0x2
int v5 = 4; // const/4 v5, 0x4
int v6 = 0; // const/4 v6, 0x0
/* if-eq v3, v4, :cond_1 */
/* if-ne v3, v5, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
/* .line 8 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "op should be remove or update."; // const-string v2, "op should be remove or update."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
int v7 = 1; // const/4 v7, 0x1
int v8 = 1; // const/4 v8, 0x1
/* .line 9 */
} // :goto_1
/* iget v9, p1, Lc/r/d/a$b;->d:I */
/* if-ge v7, v9, :cond_7 */
/* .line 10 */
/* iget v9, p1, Lc/r/d/a$b;->b:I */
/* mul-int v10, v3, v7 */
/* add-int/2addr v9, v10 */
/* .line 11 */
/* iget v10, p1, Lc/r/d/a$b;->a:I */
v9 = (( c.r.d.a ) p0 ).b ( v9, v10 ); // invoke-virtual {p0, v9, v10}, Lc/r/d/a;->b(II)I
/* .line 12 */
/* iget v10, p1, Lc/r/d/a$b;->a:I */
/* if-eq v10, v4, :cond_4 */
/* if-eq v10, v5, :cond_3 */
} // :cond_2
int v10 = 0; // const/4 v10, 0x0
} // :cond_3
/* add-int/lit8 v10, v0, 0x1 */
/* if-ne v9, v10, :cond_2 */
} // :goto_2
int v10 = 1; // const/4 v10, 0x1
} // :cond_4
/* if-ne v9, v0, :cond_2 */
} // :goto_3
if ( v10 != null) { // if-eqz v10, :cond_5
/* add-int/lit8 v8, v8, 0x1 */
/* .line 13 */
} // :cond_5
/* iget v10, p1, Lc/r/d/a$b;->a:I */
v11 = this.c;
(( c.r.d.a ) p0 ).a ( v10, v0, v8, v11 ); // invoke-virtual {p0, v10, v0, v8, v11}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
/* .line 14 */
(( c.r.d.a ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Lc/r/d/a;->a(Lc/r/d/a$b;I)V
/* .line 15 */
(( c.r.d.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
/* .line 16 */
/* iget v0, p1, Lc/r/d/a$b;->a:I */
/* if-ne v0, v5, :cond_6 */
/* add-int/2addr v2, v8 */
} // :cond_6
/* move v0, v9 */
int v8 = 1; // const/4 v8, 0x1
} // :goto_4
/* add-int/lit8 v7, v7, 0x1 */
/* .line 17 */
} // :cond_7
v1 = this.c;
/* .line 18 */
(( c.r.d.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
/* if-lez v8, :cond_8 */
/* .line 19 */
/* iget p1, p1, Lc/r/d/a$b;->a:I */
(( c.r.d.a ) p0 ).a ( p1, v0, v8, v1 ); // invoke-virtual {p0, p1, v0, v8, v1}, Lc/r/d/a;->a(IIILjava/lang/Object;)Lc/r/d/a$b;
/* .line 20 */
(( c.r.d.a ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lc/r/d/a;->a(Lc/r/d/a$b;I)V
/* .line 21 */
(( c.r.d.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/a;->a(Lc/r/d/a$b;)V
} // :cond_8
return;
/* .line 22 */
} // :cond_9
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "should not dispatch add or move for pre layout"; // const-string v0, "should not dispatch add or move for pre layout"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void g ( c.r.d.a$b p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 2 */
/* iget v0, p1, Lc/r/d/a$b;->a:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_3 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_2 */
int v1 = 4; // const/4 v1, 0x4
/* if-eq v0, v1, :cond_1 */
/* const/16 v1, 0x8 */
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
v0 = this.d;
/* iget v1, p1, Lc/r/d/a$b;->b:I */
/* iget p1, p1, Lc/r/d/a$b;->d:I */
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown update op type for "; // const-string v2, "Unknown update op type for "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 5 */
} // :cond_1
v0 = this.d;
/* iget v1, p1, Lc/r/d/a$b;->b:I */
/* iget v2, p1, Lc/r/d/a$b;->d:I */
p1 = this.c;
/* .line 6 */
} // :cond_2
v0 = this.d;
/* iget v1, p1, Lc/r/d/a$b;->b:I */
/* iget p1, p1, Lc/r/d/a$b;->d:I */
/* .line 7 */
} // :cond_3
v0 = this.d;
/* iget v1, p1, Lc/r/d/a$b;->b:I */
/* iget p1, p1, Lc/r/d/a$b;->d:I */
} // :goto_0
return;
} // .end method
