public class c.f.a.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Integer p;
	 public static c.f.a.g q;
	 /* # instance fields */
	 public Integer a;
	 public java.util.HashMap b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap<", */
	 /* "Ljava/lang/String;", */
	 /* "Lc/f/a/k;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public c.f.a.e c;
public Integer d;
public Integer e;
public c.f.a.b f;
public Boolean g;
public h;
public Integer i;
public Integer j;
public Integer k;
public final c.f.a.c l;
public c.f.a.k m;
public Integer n;
public final c.f.a.e o;
/* # direct methods */
public static c.f.a.f ( ) {
/* .locals 0 */
return;
} // .end method
public c.f.a.f ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lc/f/a/f;->a:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
this.b = v1;
/* const/16 v2, 0x20 */
/* .line 4 */
/* iput v2, p0, Lc/f/a/f;->d:I */
/* .line 5 */
/* iput v2, p0, Lc/f/a/f;->e:I */
/* .line 6 */
this.f = v1;
/* .line 7 */
/* iput-boolean v0, p0, Lc/f/a/f;->g:Z */
/* new-array v1, v2, [Z */
/* .line 8 */
this.h = v1;
int v1 = 1; // const/4 v1, 0x1
/* .line 9 */
/* iput v1, p0, Lc/f/a/f;->i:I */
/* .line 10 */
/* iput v0, p0, Lc/f/a/f;->j:I */
/* .line 11 */
/* iput v2, p0, Lc/f/a/f;->k:I */
/* .line 12 */
/* new-array v1, v1, [Lc/f/a/k; */
this.m = v1;
/* .line 13 */
/* iput v0, p0, Lc/f/a/f;->n:I */
/* new-array v0, v2, [Lc/f/a/b; */
/* .line 14 */
this.f = v0;
/* .line 15 */
(( c.f.a.f ) p0 ).h ( ); // invoke-virtual {p0}, Lc/f/a/f;->h()V
/* .line 16 */
/* new-instance v0, Lc/f/a/c; */
/* invoke-direct {v0}, Lc/f/a/c;-><init>()V */
this.l = v0;
/* .line 17 */
/* new-instance v1, Lc/f/a/d; */
/* invoke-direct {v1, v0}, Lc/f/a/d;-><init>(Lc/f/a/c;)V */
this.c = v1;
/* .line 18 */
/* new-instance v0, Lc/f/a/b; */
v1 = this.l;
/* invoke-direct {v0, v1}, Lc/f/a/b;-><init>(Lc/f/a/c;)V */
this.o = v0;
return;
} // .end method
public static c.f.a.b a ( Object p0, Object p1, Object p2, Object p3, Float p4, Boolean p5 ) {
/* .locals 1 */
/* .line 150 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
if ( p5 != null) { // if-eqz p5, :cond_0
	 /* .line 151 */
	 (( c.f.a.f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->b(Lc/f/a/b;)V
	 /* .line 152 */
} // :cond_0
(( c.f.a.b ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/f/a/b;->a(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;F)Lc/f/a/b;
} // .end method
public static c.f.a.g j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = c.f.a.f.q;
} // .end method
/* # virtual methods */
public final Integer a ( Object p0 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
int v2 = 0; // const/4 v2, 0x0
/* .line 91 */
} // :goto_0
/* iget v3, v0, Lc/f/a/f;->j:I */
int v4 = 0; // const/4 v4, 0x0
/* if-ge v2, v3, :cond_2 */
/* .line 92 */
v3 = this.f;
/* aget-object v6, v3, v2 */
v6 = this.a;
/* .line 93 */
v6 = this.g;
v7 = c.f.a.j.b;
/* if-ne v6, v7, :cond_0 */
/* .line 94 */
} // :cond_0
/* aget-object v3, v3, v2 */
/* iget v3, v3, Lc/f/a/b;->b:F */
/* cmpg-float v3, v3, v4 */
/* if-gez v3, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_11
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
/* if-nez v2, :cond_10 */
/* .line 95 */
v6 = c.f.a.f.q;
/* const-wide/16 v7, 0x1 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 96 */
/* iget-wide v9, v6, Lc/f/a/g;->k:J */
/* add-long/2addr v9, v7 */
/* iput-wide v9, v6, Lc/f/a/g;->k:J */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
/* const v6, 0x7f7fffff # Float.MAX_VALUE */
int v9 = -1; // const/4 v9, -0x1
int v10 = 0; // const/4 v10, 0x0
int v11 = -1; // const/4 v11, -0x1
int v12 = -1; // const/4 v12, -0x1
int v13 = 0; // const/4 v13, 0x0
/* .line 97 */
} // :goto_4
/* iget v14, v0, Lc/f/a/f;->j:I */
/* if-ge v10, v14, :cond_c */
/* .line 98 */
v14 = this.f;
/* aget-object v14, v14, v10 */
/* .line 99 */
v15 = this.a;
/* .line 100 */
v15 = this.g;
v1 = c.f.a.j.b;
/* if-ne v15, v1, :cond_4 */
/* .line 101 */
} // :cond_4
/* iget-boolean v1, v14, Lc/f/a/b;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 102 */
} // :cond_5
/* iget v1, v14, Lc/f/a/b;->b:F */
/* cmpg-float v1, v1, v4 */
/* if-gez v1, :cond_b */
int v1 = 1; // const/4 v1, 0x1
/* .line 103 */
} // :goto_5
/* iget v15, v0, Lc/f/a/f;->i:I */
/* if-ge v1, v15, :cond_b */
/* .line 104 */
v15 = this.l;
v15 = this.c;
/* aget-object v15, v15, v1 */
/* .line 105 */
v5 = this.d;
v5 = (( c.f.a.a ) v5 ).b ( v15 ); // invoke-virtual {v5, v15}, Lc/f/a/a;->b(Lc/f/a/k;)F
/* cmpg-float v16, v5, v4 */
/* if-gtz v16, :cond_6 */
} // :cond_6
int v4 = 0; // const/4 v4, 0x0
} // :goto_6
int v7 = 7; // const/4 v7, 0x7
/* if-ge v4, v7, :cond_a */
/* .line 106 */
v7 = this.f;
/* aget v7, v7, v4 */
/* div-float/2addr v7, v5 */
/* cmpg-float v8, v7, v6 */
/* if-gez v8, :cond_7 */
/* if-eq v4, v13, :cond_8 */
} // :cond_7
/* if-le v4, v13, :cond_9 */
} // :cond_8
/* move v12, v1 */
/* move v13, v4 */
/* move v6, v7 */
/* move v11, v10 */
} // :cond_9
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_a
} // :goto_7
/* add-int/lit8 v1, v1, 0x1 */
int v4 = 0; // const/4 v4, 0x0
/* const-wide/16 v7, 0x1 */
} // :cond_b
} // :goto_8
/* add-int/lit8 v10, v10, 0x1 */
int v4 = 0; // const/4 v4, 0x0
/* const-wide/16 v7, 0x1 */
} // :cond_c
/* if-eq v11, v9, :cond_e */
/* .line 107 */
v1 = this.f;
/* aget-object v1, v1, v11 */
/* .line 108 */
v4 = this.a;
/* iput v9, v4, Lc/f/a/k;->c:I */
/* .line 109 */
v4 = c.f.a.f.q;
if ( v4 != null) { // if-eqz v4, :cond_d
/* .line 110 */
/* iget-wide v5, v4, Lc/f/a/g;->j:J */
/* const-wide/16 v7, 0x1 */
/* add-long/2addr v5, v7 */
/* iput-wide v5, v4, Lc/f/a/g;->j:J */
/* .line 111 */
} // :cond_d
v4 = this.l;
v4 = this.c;
/* aget-object v4, v4, v12 */
(( c.f.a.b ) v1 ).d ( v4 ); // invoke-virtual {v1, v4}, Lc/f/a/b;->d(Lc/f/a/k;)V
/* .line 112 */
v4 = this.a;
/* iput v11, v4, Lc/f/a/k;->c:I */
/* .line 113 */
(( c.f.a.k ) v4 ).c ( v1 ); // invoke-virtual {v4, v1}, Lc/f/a/k;->c(Lc/f/a/b;)V
} // :cond_e
int v2 = 1; // const/4 v2, 0x1
/* .line 114 */
} // :goto_9
/* iget v1, v0, Lc/f/a/f;->i:I */
/* div-int/lit8 v1, v1, 0x2 */
/* if-le v3, v1, :cond_f */
int v2 = 1; // const/4 v2, 0x1
} // :cond_f
int v4 = 0; // const/4 v4, 0x0
/* goto/16 :goto_3 */
} // :cond_10
/* move v1, v3 */
} // :cond_11
int v1 = 0; // const/4 v1, 0x0
} // :goto_a
} // .end method
public final Integer a ( Object p0, Boolean p1 ) {
/* .locals 13 */
/* .line 64 */
p2 = c.f.a.f.q;
/* const-wide/16 v0, 0x1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 65 */
/* iget-wide v2, p2, Lc/f/a/g;->h:J */
/* add-long/2addr v2, v0 */
/* iput-wide v2, p2, Lc/f/a/g;->h:J */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 66 */
} // :goto_0
/* iget v3, p0, Lc/f/a/f;->i:I */
/* if-ge v2, v3, :cond_1 */
/* .line 67 */
v3 = this.h;
/* aput-boolean p2, v3, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-nez v2, :cond_d */
/* .line 68 */
v4 = c.f.a.f.q;
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 69 */
/* iget-wide v5, v4, Lc/f/a/g;->i:J */
/* add-long/2addr v5, v0 */
/* iput-wide v5, v4, Lc/f/a/g;->i:J */
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
/* .line 70 */
/* iget v4, p0, Lc/f/a/f;->i:I */
/* mul-int/lit8 v4, v4, 0x2 */
/* if-lt v3, v4, :cond_3 */
/* .line 71 */
} // :cond_3
int v5 = 1; // const/4 v5, 0x1
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 72 */
v4 = this.h;
/* iget v6, v6, Lc/f/a/k;->b:I */
/* aput-boolean v5, v4, v6 */
/* .line 73 */
} // :cond_4
v4 = this.h;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 74 */
v6 = this.h;
/* iget v7, v4, Lc/f/a/k;->b:I */
/* aget-boolean v8, v6, v7 */
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 75 */
} // :cond_5
/* aput-boolean v5, v6, v7 */
} // :cond_6
if ( v4 != null) { // if-eqz v4, :cond_c
/* const v6, 0x7f7fffff # Float.MAX_VALUE */
int v7 = -1; // const/4 v7, -0x1
int v8 = 0; // const/4 v8, 0x0
int v9 = -1; // const/4 v9, -0x1
/* .line 76 */
} // :goto_2
/* iget v10, p0, Lc/f/a/f;->j:I */
/* if-ge v8, v10, :cond_a */
/* .line 77 */
v10 = this.f;
/* aget-object v10, v10, v8 */
/* .line 78 */
v11 = this.a;
/* .line 79 */
v11 = this.g;
v12 = c.f.a.j.b;
/* if-ne v11, v12, :cond_7 */
/* .line 80 */
} // :cond_7
/* iget-boolean v11, v10, Lc/f/a/b;->e:Z */
if ( v11 != null) { // if-eqz v11, :cond_8
/* .line 81 */
} // :cond_8
v11 = (( c.f.a.b ) v10 ).b ( v4 ); // invoke-virtual {v10, v4}, Lc/f/a/b;->b(Lc/f/a/k;)Z
if ( v11 != null) { // if-eqz v11, :cond_9
/* .line 82 */
v11 = this.d;
v11 = (( c.f.a.a ) v11 ).b ( v4 ); // invoke-virtual {v11, v4}, Lc/f/a/a;->b(Lc/f/a/k;)F
int v12 = 0; // const/4 v12, 0x0
/* cmpg-float v12, v11, v12 */
/* if-gez v12, :cond_9 */
/* .line 83 */
/* iget v10, v10, Lc/f/a/b;->b:F */
/* neg-float v10, v10 */
/* div-float/2addr v10, v11 */
/* cmpg-float v11, v10, v6 */
/* if-gez v11, :cond_9 */
/* move v9, v8 */
/* move v6, v10 */
} // :cond_9
} // :goto_3
/* add-int/lit8 v8, v8, 0x1 */
} // :cond_a
/* if-le v9, v7, :cond_c */
/* .line 84 */
v5 = this.f;
/* aget-object v5, v5, v9 */
/* .line 85 */
v6 = this.a;
/* iput v7, v6, Lc/f/a/k;->c:I */
/* .line 86 */
v6 = c.f.a.f.q;
if ( v6 != null) { // if-eqz v6, :cond_b
/* .line 87 */
/* iget-wide v7, v6, Lc/f/a/g;->j:J */
/* add-long/2addr v7, v0 */
/* iput-wide v7, v6, Lc/f/a/g;->j:J */
/* .line 88 */
} // :cond_b
(( c.f.a.b ) v5 ).d ( v4 ); // invoke-virtual {v5, v4}, Lc/f/a/b;->d(Lc/f/a/k;)V
/* .line 89 */
v4 = this.a;
/* iput v9, v4, Lc/f/a/k;->c:I */
/* .line 90 */
(( c.f.a.k ) v4 ).c ( v5 ); // invoke-virtual {v4, v5}, Lc/f/a/k;->c(Lc/f/a/b;)V
/* goto/16 :goto_1 */
} // :cond_c
int v2 = 1; // const/4 v2, 0x1
/* goto/16 :goto_1 */
} // :cond_d
} // .end method
public c.f.a.b a ( Object p0, Object p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 133 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* .line 134 */
(( c.f.a.b ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/f/a/b;->a(Lc/f/a/k;Lc/f/a/k;I)Lc/f/a/b;
int p1 = 6; // const/4 p1, 0x6
/* if-eq p4, p1, :cond_0 */
/* .line 135 */
(( c.f.a.b ) v0 ).a ( p0, p4 ); // invoke-virtual {v0, p0, p4}, Lc/f/a/b;->a(Lc/f/a/f;I)Lc/f/a/b;
/* .line 136 */
} // :cond_0
(( c.f.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
} // .end method
public c.f.a.k a ( Integer p0, java.lang.String p1 ) {
/* .locals 5 */
/* .line 17 */
v0 = c.f.a.f.q;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 18 */
/* iget-wide v1, v0, Lc/f/a/g;->l:J */
/* const-wide/16 v3, 0x1 */
/* add-long/2addr v1, v3 */
/* iput-wide v1, v0, Lc/f/a/g;->l:J */
/* .line 19 */
} // :cond_0
/* iget v0, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iget v1, p0, Lc/f/a/f;->e:I */
/* if-lt v0, v1, :cond_1 */
/* .line 20 */
(( c.f.a.f ) p0 ).f ( ); // invoke-virtual {p0}, Lc/f/a/f;->f()V
/* .line 21 */
} // :cond_1
v0 = c.f.a.j.e;
(( c.f.a.f ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lc/f/a/f;->a(Lc/f/a/j;Ljava/lang/String;)Lc/f/a/k;
/* .line 22 */
/* iget v0, p0, Lc/f/a/f;->a:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lc/f/a/f;->a:I */
/* .line 23 */
/* iget v1, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lc/f/a/f;->i:I */
/* .line 24 */
/* iput v0, p2, Lc/f/a/k;->b:I */
/* .line 25 */
/* iput p1, p2, Lc/f/a/k;->d:I */
/* .line 26 */
p1 = this.l;
p1 = this.c;
/* aput-object p2, p1, v0 */
/* .line 27 */
p1 = this.c;
} // .end method
public final c.f.a.k a ( Object p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 28 */
v0 = this.l;
v0 = this.b;
/* check-cast v0, Lc/f/a/k; */
/* if-nez v0, :cond_0 */
/* .line 29 */
/* new-instance v0, Lc/f/a/k; */
/* invoke-direct {v0, p1, p2}, Lc/f/a/k;-><init>(Lc/f/a/j;Ljava/lang/String;)V */
/* .line 30 */
(( c.f.a.k ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/f/a/k;->a(Lc/f/a/j;Ljava/lang/String;)V
/* .line 31 */
} // :cond_0
(( c.f.a.k ) v0 ).a ( ); // invoke-virtual {v0}, Lc/f/a/k;->a()V
/* .line 32 */
(( c.f.a.k ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/f/a/k;->a(Lc/f/a/j;Ljava/lang/String;)V
/* .line 33 */
} // :goto_0
/* iget p1, p0, Lc/f/a/f;->n:I */
/* if-lt p1, p2, :cond_1 */
/* mul-int/lit8 p2, p2, 0x2 */
/* .line 34 */
/* .line 35 */
p1 = this.m;
java.util.Arrays .copyOf ( p1,p2 );
/* check-cast p1, [Lc/f/a/k; */
this.m = p1;
/* .line 36 */
} // :cond_1
p1 = this.m;
/* iget p2, p0, Lc/f/a/f;->n:I */
/* add-int/lit8 v1, p2, 0x1 */
/* iput v1, p0, Lc/f/a/f;->n:I */
/* aput-object v0, p1, p2 */
} // .end method
public c.f.a.k a ( java.lang.Object p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* iget v1, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iget v2, p0, Lc/f/a/f;->e:I */
/* if-lt v1, v2, :cond_1 */
/* .line 2 */
(( c.f.a.f ) p0 ).f ( ); // invoke-virtual {p0}, Lc/f/a/f;->f()V
/* .line 3 */
} // :cond_1
/* instance-of v1, p1, Lc/f/a/l/g; */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
/* check-cast p1, Lc/f/a/l/g; */
(( c.f.a.l.g ) p1 ).e ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->e()Lc/f/a/k;
/* if-nez v0, :cond_2 */
/* .line 5 */
v0 = this.l;
(( c.f.a.l.g ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/g;->a(Lc/f/a/c;)V
/* .line 6 */
(( c.f.a.l.g ) p1 ).e ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->e()Lc/f/a/k;
/* move-object v0, p1 */
/* .line 7 */
} // :cond_2
/* iget p1, v0, Lc/f/a/k;->b:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq p1, v1, :cond_3 */
/* iget v2, p0, Lc/f/a/f;->a:I */
/* if-gt p1, v2, :cond_3 */
v2 = this.l;
v2 = this.c;
/* aget-object p1, v2, p1 */
/* if-nez p1, :cond_5 */
/* .line 8 */
} // :cond_3
/* iget p1, v0, Lc/f/a/k;->b:I */
/* if-eq p1, v1, :cond_4 */
/* .line 9 */
(( c.f.a.k ) v0 ).a ( ); // invoke-virtual {v0}, Lc/f/a/k;->a()V
/* .line 10 */
} // :cond_4
/* iget p1, p0, Lc/f/a/f;->a:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lc/f/a/f;->a:I */
/* .line 11 */
/* iget v1, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lc/f/a/f;->i:I */
/* .line 12 */
/* iput p1, v0, Lc/f/a/k;->b:I */
/* .line 13 */
v1 = c.f.a.j.b;
this.g = v1;
/* .line 14 */
v1 = this.l;
v1 = this.c;
/* aput-object v0, v1, p1 */
} // :cond_5
} // .end method
public final void a ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 115 */
} // :goto_0
/* iget v1, p0, Lc/f/a/f;->j:I */
/* if-ge v0, v1, :cond_0 */
/* .line 116 */
v1 = this.f;
/* aget-object v1, v1, v0 */
/* .line 117 */
v2 = this.a;
/* iget v1, v1, Lc/f/a/b;->b:F */
/* iput v1, v2, Lc/f/a/k;->e:F */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 7 */
/* if-nez p1, :cond_0 */
return;
/* .line 37 */
} // :cond_0
v0 = c.f.a.f.q;
/* const-wide/16 v1, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 38 */
/* iget-wide v3, v0, Lc/f/a/g;->f:J */
/* add-long/2addr v3, v1 */
/* iput-wide v3, v0, Lc/f/a/g;->f:J */
/* .line 39 */
/* iget-boolean v3, p1, Lc/f/a/b;->e:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 40 */
/* iget-wide v3, v0, Lc/f/a/g;->g:J */
/* add-long/2addr v3, v1 */
/* iput-wide v3, v0, Lc/f/a/g;->g:J */
/* .line 41 */
} // :cond_1
/* iget v0, p0, Lc/f/a/f;->j:I */
int v3 = 1; // const/4 v3, 0x1
/* add-int/2addr v0, v3 */
/* iget v4, p0, Lc/f/a/f;->k:I */
/* if-ge v0, v4, :cond_2 */
/* iget v0, p0, Lc/f/a/f;->i:I */
/* add-int/2addr v0, v3 */
/* iget v4, p0, Lc/f/a/f;->e:I */
/* if-lt v0, v4, :cond_3 */
/* .line 42 */
} // :cond_2
(( c.f.a.f ) p0 ).f ( ); // invoke-virtual {p0}, Lc/f/a/f;->f()V
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 43 */
/* iget-boolean v4, p1, Lc/f/a/b;->e:Z */
/* if-nez v4, :cond_b */
/* .line 44 */
(( c.f.a.f ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/f;->d(Lc/f/a/b;)V
/* .line 45 */
v4 = (( c.f.a.b ) p1 ).c ( ); // invoke-virtual {p1}, Lc/f/a/b;->c()Z
if ( v4 != null) { // if-eqz v4, :cond_4
return;
/* .line 46 */
} // :cond_4
(( c.f.a.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/f/a/b;->a()V
/* .line 47 */
v4 = (( c.f.a.b ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/f/a/b;->a(Lc/f/a/f;)Z
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 48 */
(( c.f.a.f ) p0 ).b ( ); // invoke-virtual {p0}, Lc/f/a/f;->b()Lc/f/a/k;
/* .line 49 */
this.a = v0;
/* .line 50 */
(( c.f.a.f ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/f;->c(Lc/f/a/b;)V
/* .line 51 */
v4 = this.o;
/* .line 52 */
v4 = this.o;
(( c.f.a.f ) p0 ).a ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Lc/f/a/f;->a(Lc/f/a/e;Z)I
/* .line 53 */
/* iget v4, v0, Lc/f/a/k;->c:I */
int v5 = -1; // const/4 v5, -0x1
/* if-ne v4, v5, :cond_9 */
/* .line 54 */
v4 = this.a;
/* if-ne v4, v0, :cond_6 */
/* .line 55 */
(( c.f.a.b ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/b;->c(Lc/f/a/k;)Lc/f/a/k;
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 56 */
v4 = c.f.a.f.q;
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 57 */
/* iget-wide v5, v4, Lc/f/a/g;->j:J */
/* add-long/2addr v5, v1 */
/* iput-wide v5, v4, Lc/f/a/g;->j:J */
/* .line 58 */
} // :cond_5
(( c.f.a.b ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/b;->d(Lc/f/a/k;)V
/* .line 59 */
} // :cond_6
/* iget-boolean v0, p1, Lc/f/a/b;->e:Z */
/* if-nez v0, :cond_7 */
/* .line 60 */
v0 = this.a;
(( c.f.a.k ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/k;->c(Lc/f/a/b;)V
/* .line 61 */
} // :cond_7
/* iget v0, p0, Lc/f/a/f;->j:I */
/* sub-int/2addr v0, v3 */
/* iput v0, p0, Lc/f/a/f;->j:I */
} // :cond_8
int v3 = 0; // const/4 v3, 0x0
/* .line 62 */
} // :cond_9
} // :goto_0
v0 = (( c.f.a.b ) p1 ).b ( ); // invoke-virtual {p1}, Lc/f/a/b;->b()Z
/* if-nez v0, :cond_a */
return;
} // :cond_a
/* move v0, v3 */
} // :cond_b
/* if-nez v0, :cond_c */
/* .line 63 */
(( c.f.a.f ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/f;->c(Lc/f/a/b;)V
} // :cond_c
return;
} // .end method
public void a ( Object p0, Integer p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 15 */
(( c.f.a.f ) p0 ).a ( p3, v0 ); // invoke-virtual {p0, p3, v0}, Lc/f/a/f;->a(ILjava/lang/String;)Lc/f/a/k;
/* .line 16 */
(( c.f.a.b ) p1 ).a ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Lc/f/a/b;->a(Lc/f/a/k;I)Lc/f/a/b;
return;
} // .end method
public void a ( Object p0, Integer p1 ) {
/* .locals 2 */
/* .line 137 */
/* iget v0, p1, Lc/f/a/k;->c:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_2 */
/* .line 138 */
v1 = this.f;
/* aget-object v0, v1, v0 */
/* .line 139 */
/* iget-boolean v1, v0, Lc/f/a/b;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* int-to-float p1, p2 */
/* .line 140 */
/* iput p1, v0, Lc/f/a/b;->b:F */
/* .line 141 */
} // :cond_0
v1 = this.d;
/* iget v1, v1, Lc/f/a/a;->a:I */
/* if-nez v1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 142 */
/* iput-boolean p1, v0, Lc/f/a/b;->e:Z */
/* int-to-float p1, p2 */
/* .line 143 */
/* iput p1, v0, Lc/f/a/b;->b:F */
/* .line 144 */
} // :cond_1
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* .line 145 */
(( c.f.a.b ) v0 ).c ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/f/a/b;->c(Lc/f/a/k;I)Lc/f/a/b;
/* .line 146 */
(( c.f.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
/* .line 147 */
} // :cond_2
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* .line 148 */
(( c.f.a.b ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/f/a/b;->b(Lc/f/a/k;I)Lc/f/a/b;
/* .line 149 */
(( c.f.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
} // :goto_0
return;
} // .end method
public void a ( Object p0, Object p1, Integer p2, Float p3, Object p4, Object p5, Integer p6, Integer p7 ) {
/* .locals 11 */
/* move-object v0, p0 */
/* move/from16 v1, p8 */
/* .line 125 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* move-object v2, v10 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move v5, p3 */
/* move v6, p4 */
/* move-object/from16 v7, p5 */
/* move-object/from16 v8, p6 */
/* move/from16 v9, p7 */
/* .line 126 */
/* invoke-virtual/range {v2 ..v9}, Lc/f/a/b;->a(Lc/f/a/k;Lc/f/a/k;IFLc/f/a/k;Lc/f/a/k;I)Lc/f/a/b; */
int v2 = 6; // const/4 v2, 0x6
/* if-eq v1, v2, :cond_0 */
/* .line 127 */
(( c.f.a.b ) v10 ).a ( p0, v1 ); // invoke-virtual {v10, p0, v1}, Lc/f/a/b;->a(Lc/f/a/f;I)Lc/f/a/b;
/* .line 128 */
} // :cond_0
(( c.f.a.f ) p0 ).a ( v10 ); // invoke-virtual {p0, v10}, Lc/f/a/f;->a(Lc/f/a/b;)V
return;
} // .end method
public void a ( Object p0, Object p1, Object p2, Object p3, Float p4, Integer p5 ) {
/* .locals 7 */
/* .line 129 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* move-object v0, v6 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* move v5, p5 */
/* .line 130 */
/* invoke-virtual/range {v0 ..v5}, Lc/f/a/b;->a(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;F)Lc/f/a/b; */
int p1 = 6; // const/4 p1, 0x6
/* if-eq p6, p1, :cond_0 */
/* .line 131 */
(( c.f.a.b ) v6 ).a ( p0, p6 ); // invoke-virtual {v6, p0, p6}, Lc/f/a/b;->a(Lc/f/a/f;I)Lc/f/a/b;
/* .line 132 */
} // :cond_0
(( c.f.a.f ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Lc/f/a/f;->a(Lc/f/a/b;)V
return;
} // .end method
public void a ( Object p0, Object p1, Boolean p2 ) {
/* .locals 3 */
/* .line 118 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* .line 119 */
(( c.f.a.f ) p0 ).d ( ); // invoke-virtual {p0}, Lc/f/a/f;->d()Lc/f/a/k;
int v2 = 0; // const/4 v2, 0x0
/* .line 120 */
/* iput v2, v1, Lc/f/a/k;->d:I */
/* .line 121 */
(( c.f.a.b ) v0 ).a ( p1, p2, v1, v2 ); // invoke-virtual {v0, p1, p2, v1, v2}, Lc/f/a/b;->a(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;I)Lc/f/a/b;
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 122 */
p1 = this.d;
p1 = (( c.f.a.a ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/a;->b(Lc/f/a/k;)F
/* const/high16 p2, -0x40800000 # -1.0f */
/* mul-float p1, p1, p2 */
/* float-to-int p1, p1 */
int p2 = 1; // const/4 p2, 0x1
/* .line 123 */
(( c.f.a.f ) p0 ).a ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lc/f/a/f;->a(Lc/f/a/b;II)V
/* .line 124 */
} // :cond_0
(( c.f.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
return;
} // .end method
public void a ( Object p0, Object p1, Float p2, Integer p3 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
/* .line 153 */
v3 = c.f.a.l.g$b.c;
(( c.f.a.l.i ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 154 */
v3 = c.f.a.l.g$b.d;
(( c.f.a.l.i ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 155 */
v3 = c.f.a.l.g$b.e;
(( c.f.a.l.i ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 156 */
v4 = c.f.a.l.g$b.f;
(( c.f.a.l.i ) v1 ).a ( v4 ); // invoke-virtual {v1, v4}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 157 */
v1 = c.f.a.l.g$b.c;
(( c.f.a.l.i ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 158 */
v4 = c.f.a.l.g$b.d;
(( c.f.a.l.i ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 159 */
v4 = c.f.a.l.g$b.e;
(( c.f.a.l.i ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 160 */
v4 = c.f.a.l.g$b.f;
(( c.f.a.l.i ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
(( c.f.a.f ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/f/a/f;->a(Ljava/lang/Object;)Lc/f/a/k;
/* .line 161 */
/* invoke-virtual/range {p0 ..p0}, Lc/f/a/f;->c()Lc/f/a/b; */
/* move/from16 v4, p3 */
/* float-to-double v13, v4 */
/* .line 162 */
java.lang.Math .sin ( v13,v14 );
/* move-result-wide v15 */
/* move/from16 v4, p4 */
/* move-object/from16 v17, v3 */
/* int-to-double v3, v4 */
/* move-object/from16 p1, v12 */
/* mul-double v11, v15, v3 */
/* double-to-float v11, v11 */
/* move-object v6, v2 */
/* .line 163 */
/* invoke-virtual/range {v6 ..v11}, Lc/f/a/b;->b(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;F)Lc/f/a/b; */
/* .line 164 */
(( c.f.a.f ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/f/a/f;->a(Lc/f/a/b;)V
/* .line 165 */
/* invoke-virtual/range {p0 ..p0}, Lc/f/a/f;->c()Lc/f/a/b; */
/* .line 166 */
java.lang.Math .cos ( v13,v14 );
/* move-result-wide v6 */
/* mul-double v6, v6, v3 */
/* double-to-float v9, v6 */
/* move-object v4, v2 */
/* move-object/from16 v6, v17 */
/* move-object v7, v1 */
/* move-object/from16 v8, p1 */
/* .line 167 */
/* invoke-virtual/range {v4 ..v9}, Lc/f/a/b;->b(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;F)Lc/f/a/b; */
/* .line 168 */
(( c.f.a.f ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/f/a/f;->a(Lc/f/a/b;)V
return;
} // .end method
public Integer b ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 11 */
/* check-cast p1, Lc/f/a/l/g; */
(( c.f.a.l.g ) p1 ).e ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->e()Lc/f/a/k;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 12 */
/* iget p1, p1, Lc/f/a/k;->e:F */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* add-float/2addr p1, v0 */
/* float-to-int p1, p1 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public c.f.a.k b ( ) {
/* .locals 5 */
/* .line 1 */
v0 = c.f.a.f.q;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget-wide v1, v0, Lc/f/a/g;->n:J */
/* const-wide/16 v3, 0x1 */
/* add-long/2addr v1, v3 */
/* iput-wide v1, v0, Lc/f/a/g;->n:J */
/* .line 3 */
} // :cond_0
/* iget v0, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iget v1, p0, Lc/f/a/f;->e:I */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
(( c.f.a.f ) p0 ).f ( ); // invoke-virtual {p0}, Lc/f/a/f;->f()V
/* .line 5 */
} // :cond_1
v0 = c.f.a.j.d;
int v1 = 0; // const/4 v1, 0x0
(( c.f.a.f ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/f/a/f;->a(Lc/f/a/j;Ljava/lang/String;)Lc/f/a/k;
/* .line 6 */
/* iget v1, p0, Lc/f/a/f;->a:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lc/f/a/f;->a:I */
/* .line 7 */
/* iget v2, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lc/f/a/f;->i:I */
/* .line 8 */
/* iput v1, v0, Lc/f/a/k;->b:I */
/* .line 9 */
v2 = this.l;
v2 = this.c;
/* aput-object v0, v2, v1 */
} // .end method
public final void b ( Object p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
(( c.f.a.b ) p1 ).a ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Lc/f/a/b;->a(Lc/f/a/f;I)Lc/f/a/b;
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 13 */
v0 = c.f.a.f.q;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 14 */
/* iget-wide v1, v0, Lc/f/a/g;->s:J */
/* const-wide/16 v3, 0x1 */
/* add-long/2addr v1, v3 */
/* iput-wide v1, v0, Lc/f/a/g;->s:J */
/* .line 15 */
/* iget-wide v1, v0, Lc/f/a/g;->t:J */
/* iget v3, p0, Lc/f/a/f;->i:I */
/* int-to-long v3, v3 */
java.lang.Math .max ( v1,v2,v3,v4 );
/* move-result-wide v1 */
/* iput-wide v1, v0, Lc/f/a/g;->t:J */
/* .line 16 */
v0 = c.f.a.f.q;
/* iget-wide v1, v0, Lc/f/a/g;->u:J */
/* iget v3, p0, Lc/f/a/f;->j:I */
/* int-to-long v3, v3 */
java.lang.Math .max ( v1,v2,v3,v4 );
/* move-result-wide v1 */
/* iput-wide v1, v0, Lc/f/a/g;->u:J */
/* .line 17 */
} // :cond_0
/* move-object v0, p1 */
/* check-cast v0, Lc/f/a/b; */
(( c.f.a.f ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->d(Lc/f/a/b;)V
/* .line 18 */
(( c.f.a.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/f;->a(Lc/f/a/e;)I
int v0 = 0; // const/4 v0, 0x0
/* .line 19 */
(( c.f.a.f ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/f/a/f;->a(Lc/f/a/e;Z)I
/* .line 20 */
(( c.f.a.f ) p0 ).a ( ); // invoke-virtual {p0}, Lc/f/a/f;->a()V
return;
} // .end method
public void b ( Object p0, Object p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .line 21 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* .line 22 */
(( c.f.a.f ) p0 ).d ( ); // invoke-virtual {p0}, Lc/f/a/f;->d()Lc/f/a/k;
int v2 = 0; // const/4 v2, 0x0
/* .line 23 */
/* iput v2, v1, Lc/f/a/k;->d:I */
/* .line 24 */
(( c.f.a.b ) v0 ).a ( p1, p2, v1, p3 ); // invoke-virtual {v0, p1, p2, v1, p3}, Lc/f/a/b;->a(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;I)Lc/f/a/b;
int p1 = 6; // const/4 p1, 0x6
/* if-eq p4, p1, :cond_0 */
/* .line 25 */
p1 = this.d;
p1 = (( c.f.a.a ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/a;->b(Lc/f/a/k;)F
/* const/high16 p2, -0x40800000 # -1.0f */
/* mul-float p1, p1, p2 */
/* float-to-int p1, p1 */
/* .line 26 */
(( c.f.a.f ) p0 ).a ( v0, p1, p4 ); // invoke-virtual {p0, v0, p1, p4}, Lc/f/a/f;->a(Lc/f/a/b;II)V
/* .line 27 */
} // :cond_0
(( c.f.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
return;
} // .end method
public void b ( Object p0, Object p1, Boolean p2 ) {
/* .locals 3 */
/* .line 28 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* .line 29 */
(( c.f.a.f ) p0 ).d ( ); // invoke-virtual {p0}, Lc/f/a/f;->d()Lc/f/a/k;
int v2 = 0; // const/4 v2, 0x0
/* .line 30 */
/* iput v2, v1, Lc/f/a/k;->d:I */
/* .line 31 */
(( c.f.a.b ) v0 ).b ( p1, p2, v1, v2 ); // invoke-virtual {v0, p1, p2, v1, v2}, Lc/f/a/b;->b(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;I)Lc/f/a/b;
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 32 */
p1 = this.d;
p1 = (( c.f.a.a ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/a;->b(Lc/f/a/k;)F
/* const/high16 p2, -0x40800000 # -1.0f */
/* mul-float p1, p1, p2 */
/* float-to-int p1, p1 */
int p2 = 1; // const/4 p2, 0x1
/* .line 33 */
(( c.f.a.f ) p0 ).a ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lc/f/a/f;->a(Lc/f/a/b;II)V
/* .line 34 */
} // :cond_0
(( c.f.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
return;
} // .end method
public c.f.a.b c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.l;
v0 = this.a;
/* check-cast v0, Lc/f/a/b; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/f/a/b; */
v1 = this.l;
/* invoke-direct {v0, v1}, Lc/f/a/b;-><init>(Lc/f/a/c;)V */
/* .line 3 */
} // :cond_0
(( c.f.a.b ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/b;->d()V
/* .line 4 */
} // :goto_0
c.f.a.k .b ( );
} // .end method
public final void c ( Object p0 ) {
/* .locals 3 */
/* .line 5 */
v0 = this.f;
/* iget v1, p0, Lc/f/a/f;->j:I */
/* aget-object v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 6 */
v2 = this.l;
v2 = this.a;
/* aget-object v0, v0, v1 */
/* .line 7 */
} // :cond_0
v0 = this.f;
/* iget v1, p0, Lc/f/a/f;->j:I */
/* aput-object p1, v0, v1 */
/* .line 8 */
v0 = this.a;
/* iput v1, v0, Lc/f/a/k;->c:I */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 9 */
/* iput v1, p0, Lc/f/a/f;->j:I */
/* .line 10 */
(( c.f.a.k ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/k;->c(Lc/f/a/b;)V
return;
} // .end method
public void c ( Object p0, Object p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .line 11 */
(( c.f.a.f ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/f;->c()Lc/f/a/b;
/* .line 12 */
(( c.f.a.f ) p0 ).d ( ); // invoke-virtual {p0}, Lc/f/a/f;->d()Lc/f/a/k;
int v2 = 0; // const/4 v2, 0x0
/* .line 13 */
/* iput v2, v1, Lc/f/a/k;->d:I */
/* .line 14 */
(( c.f.a.b ) v0 ).b ( p1, p2, v1, p3 ); // invoke-virtual {v0, p1, p2, v1, p3}, Lc/f/a/b;->b(Lc/f/a/k;Lc/f/a/k;Lc/f/a/k;I)Lc/f/a/b;
int p1 = 6; // const/4 p1, 0x6
/* if-eq p4, p1, :cond_0 */
/* .line 15 */
p1 = this.d;
p1 = (( c.f.a.a ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/f/a/a;->b(Lc/f/a/k;)F
/* const/high16 p2, -0x40800000 # -1.0f */
/* mul-float p1, p1, p2 */
/* float-to-int p1, p1 */
/* .line 16 */
(( c.f.a.f ) p0 ).a ( v0, p1, p4 ); // invoke-virtual {p0, v0, p1, p4}, Lc/f/a/f;->a(Lc/f/a/b;II)V
/* .line 17 */
} // :cond_0
(( c.f.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->a(Lc/f/a/b;)V
return;
} // .end method
public c.f.a.k d ( ) {
/* .locals 5 */
/* .line 1 */
v0 = c.f.a.f.q;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget-wide v1, v0, Lc/f/a/g;->m:J */
/* const-wide/16 v3, 0x1 */
/* add-long/2addr v1, v3 */
/* iput-wide v1, v0, Lc/f/a/g;->m:J */
/* .line 3 */
} // :cond_0
/* iget v0, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iget v1, p0, Lc/f/a/f;->e:I */
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
(( c.f.a.f ) p0 ).f ( ); // invoke-virtual {p0}, Lc/f/a/f;->f()V
/* .line 5 */
} // :cond_1
v0 = c.f.a.j.d;
int v1 = 0; // const/4 v1, 0x0
(( c.f.a.f ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/f/a/f;->a(Lc/f/a/j;Ljava/lang/String;)Lc/f/a/k;
/* .line 6 */
/* iget v1, p0, Lc/f/a/f;->a:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lc/f/a/f;->a:I */
/* .line 7 */
/* iget v2, p0, Lc/f/a/f;->i:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lc/f/a/f;->i:I */
/* .line 8 */
/* iput v1, v0, Lc/f/a/k;->b:I */
/* .line 9 */
v2 = this.l;
v2 = this.c;
/* aput-object v0, v2, v1 */
} // .end method
public final void d ( Object p0 ) {
/* .locals 2 */
/* .line 10 */
/* iget v0, p0, Lc/f/a/f;->j:I */
/* if-lez v0, :cond_0 */
/* .line 11 */
v0 = this.d;
v1 = this.f;
(( c.f.a.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/f/a/a;->a(Lc/f/a/b;[Lc/f/a/b;)V
/* .line 12 */
v0 = this.d;
/* iget v0, v0, Lc/f/a/a;->a:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 13 */
/* iput-boolean v0, p1, Lc/f/a/b;->e:Z */
} // :cond_0
return;
} // .end method
public c.f.a.c e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public final void f ( ) {
/* .locals 6 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/f;->d:I */
/* mul-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lc/f/a/f;->d:I */
/* .line 2 */
v1 = this.f;
java.util.Arrays .copyOf ( v1,v0 );
/* check-cast v0, [Lc/f/a/b; */
this.f = v0;
/* .line 3 */
v0 = this.l;
v1 = this.c;
/* iget v2, p0, Lc/f/a/f;->d:I */
java.util.Arrays .copyOf ( v1,v2 );
/* check-cast v1, [Lc/f/a/k; */
this.c = v1;
/* .line 4 */
/* iget v0, p0, Lc/f/a/f;->d:I */
/* new-array v1, v0, [Z */
this.h = v1;
/* .line 5 */
/* iput v0, p0, Lc/f/a/f;->e:I */
/* .line 6 */
/* iput v0, p0, Lc/f/a/f;->k:I */
/* .line 7 */
v1 = c.f.a.f.q;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 8 */
/* iget-wide v2, v1, Lc/f/a/g;->d:J */
/* const-wide/16 v4, 0x1 */
/* add-long/2addr v2, v4 */
/* iput-wide v2, v1, Lc/f/a/g;->d:J */
/* .line 9 */
/* iget-wide v2, v1, Lc/f/a/g;->o:J */
/* int-to-long v4, v0 */
java.lang.Math .max ( v2,v3,v4,v5 );
/* move-result-wide v2 */
/* iput-wide v2, v1, Lc/f/a/g;->o:J */
/* .line 10 */
v0 = c.f.a.f.q;
/* iget-wide v1, v0, Lc/f/a/g;->o:J */
/* iput-wide v1, v0, Lc/f/a/g;->A:J */
} // :cond_0
return;
} // .end method
public void g ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
v0 = c.f.a.f.q;
/* const-wide/16 v1, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget-wide v3, v0, Lc/f/a/g;->e:J */
/* add-long/2addr v3, v1 */
/* iput-wide v3, v0, Lc/f/a/g;->e:J */
/* .line 3 */
} // :cond_0
/* iget-boolean v0, p0, Lc/f/a/f;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 4 */
v0 = c.f.a.f.q;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
/* iget-wide v3, v0, Lc/f/a/g;->q:J */
/* add-long/2addr v3, v1 */
/* iput-wide v3, v0, Lc/f/a/g;->q:J */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 6 */
} // :goto_0
/* iget v4, p0, Lc/f/a/f;->j:I */
/* if-ge v3, v4, :cond_3 */
/* .line 7 */
v4 = this.f;
/* aget-object v4, v4, v3 */
/* .line 8 */
/* iget-boolean v4, v4, Lc/f/a/b;->e:Z */
/* if-nez v4, :cond_2 */
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* if-nez v0, :cond_4 */
/* .line 9 */
v0 = this.c;
(( c.f.a.f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->b(Lc/f/a/e;)V
/* .line 10 */
} // :cond_4
v0 = c.f.a.f.q;
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 11 */
/* iget-wide v3, v0, Lc/f/a/g;->p:J */
/* add-long/2addr v3, v1 */
/* iput-wide v3, v0, Lc/f/a/g;->p:J */
/* .line 12 */
} // :cond_5
(( c.f.a.f ) p0 ).a ( ); // invoke-virtual {p0}, Lc/f/a/f;->a()V
/* .line 13 */
} // :cond_6
v0 = this.c;
(( c.f.a.f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/f/a/f;->b(Lc/f/a/e;)V
} // :goto_2
return;
} // .end method
public final void h ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = this.f;
/* array-length v2, v1 */
/* if-ge v0, v2, :cond_1 */
/* .line 2 */
/* aget-object v1, v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
v2 = this.l;
v2 = this.a;
/* .line 4 */
} // :cond_0
v1 = this.f;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public void i ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
} // :goto_0
v2 = this.l;
v3 = this.c;
/* array-length v4, v3 */
/* if-ge v1, v4, :cond_1 */
/* .line 2 */
/* aget-object v2, v3, v1 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
(( c.f.a.k ) v2 ).a ( ); // invoke-virtual {v2}, Lc/f/a/k;->a()V
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 4 */
} // :cond_1
v1 = this.b;
v2 = this.m;
/* iget v3, p0, Lc/f/a/f;->n:I */
/* .line 5 */
/* iput v0, p0, Lc/f/a/f;->n:I */
/* .line 6 */
v1 = this.l;
v1 = this.c;
int v2 = 0; // const/4 v2, 0x0
java.util.Arrays .fill ( v1,v2 );
/* .line 7 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
(( java.util.HashMap ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->clear()V
/* .line 9 */
} // :cond_2
/* iput v0, p0, Lc/f/a/f;->a:I */
/* .line 10 */
v1 = this.c;
int v1 = 1; // const/4 v1, 0x1
/* .line 11 */
/* iput v1, p0, Lc/f/a/f;->i:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 12 */
} // :goto_1
/* iget v2, p0, Lc/f/a/f;->j:I */
/* if-ge v1, v2, :cond_3 */
/* .line 13 */
v2 = this.f;
/* aget-object v2, v2, v1 */
/* iput-boolean v0, v2, Lc/f/a/b;->c:Z */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 14 */
} // :cond_3
(( c.f.a.f ) p0 ).h ( ); // invoke-virtual {p0}, Lc/f/a/f;->h()V
/* .line 15 */
/* iput v0, p0, Lc/f/a/f;->j:I */
return;
} // .end method
