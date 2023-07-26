public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.e.o.b a;
	 public final e.f.e.o.b b;
	 public final e.f.e.p.b.j c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/FormatException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 v0 = 	 (( e.f.e.o.b ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/e/o/b;->d()I
	 /* const/16 v1, 0x8 */
	 /* if-lt v0, v1, :cond_0 */
	 /* const/16 v1, 0x90 */
	 /* if-gt v0, v1, :cond_0 */
	 /* and-int/lit8 v0, v0, 0x1 */
	 /* if-nez v0, :cond_0 */
	 /* .line 3 */
	 e.f.e.p.b.a .b ( p1 );
	 this.c = v0;
	 /* .line 4 */
	 (( e.f.e.p.b.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/p/b/a;->a(Le/f/e/o/b;)Le/f/e/o/b;
	 this.a = p1;
	 /* .line 5 */
	 /* new-instance v0, Le/f/e/o/b; */
	 p1 = 	 (( e.f.e.o.b ) p1 ).f ( ); // invoke-virtual {p1}, Le/f/e/o/b;->f()I
	 v1 = this.a;
	 v1 = 	 (( e.f.e.o.b ) v1 ).d ( ); // invoke-virtual {v1}, Le/f/e/o/b;->d()I
	 /* invoke-direct {v0, p1, v1}, Le/f/e/o/b;-><init>(II)V */
	 this.b = v0;
	 return;
	 /* .line 6 */
} // :cond_0
com.google.zxing.FormatException .a ( );
/* throw p1 */
} // .end method
public static e.f.e.p.b.j b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.f.e.o.b ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/e/o/b;->d()I
/* .line 2 */
p0 = (( e.f.e.o.b ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/e/o/b;->f()I
/* .line 3 */
e.f.e.p.b.j .a ( v0,p0 );
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* add-int/lit8 v0, p1, -0x1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
v2 = (( e.f.e.p.b.a ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
int v3 = 1; // const/4 v3, 0x1
/* shl-int/2addr v2, v3 */
/* .line 5 */
v4 = (( e.f.e.p.b.a ) p0 ).a ( v0, v3, p1, p2 ); // invoke-virtual {p0, v0, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* or-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* shl-int/2addr v2, v3 */
int v4 = 2; // const/4 v4, 0x2
/* .line 6 */
v0 = (( e.f.e.p.b.a ) p0 ).a ( v0, v4, p1, p2 ); // invoke-virtual {p0, v0, v4, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* or-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* shl-int/lit8 v0, v2, 0x1 */
/* add-int/lit8 v2, p2, -0x2 */
/* .line 7 */
v2 = (( e.f.e.p.b.a ) p0 ).a ( v1, v2, p1, p2 ); // invoke-virtual {p0, v1, v2, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* shl-int/2addr v0, v3 */
/* add-int/lit8 v2, p2, -0x1 */
/* .line 8 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v1, v2, p1, p2 ); // invoke-virtual {p0, v1, v2, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* shl-int/2addr v0, v3 */
/* .line 9 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v3, v2, p1, p2 ); // invoke-virtual {p0, v3, v2, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_4
/* shl-int/2addr v0, v3 */
/* .line 10 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v4, v2, p1, p2 ); // invoke-virtual {p0, v4, v2, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_5
/* shl-int/2addr v0, v3 */
int v1 = 3; // const/4 v1, 0x3
/* .line 11 */
p1 = (( e.f.e.p.b.a ) p0 ).a ( v1, v2, p1, p2 ); // invoke-virtual {p0, v1, v2, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_6
} // .end method
public final e.f.e.o.b a ( Object p0 ) {
/* .locals 16 */
/* move-object/from16 v0, p0 */
/* .line 12 */
v1 = this.c;
v1 = (( e.f.e.p.b.j ) v1 ).e ( ); // invoke-virtual {v1}, Le/f/e/p/b/j;->e()I
/* .line 13 */
v2 = this.c;
v2 = (( e.f.e.p.b.j ) v2 ).d ( ); // invoke-virtual {v2}, Le/f/e/p/b/j;->d()I
/* .line 14 */
v3 = /* invoke-virtual/range {p1 ..p1}, Le/f/e/o/b;->d()I */
/* if-ne v3, v1, :cond_5 */
/* .line 15 */
v3 = this.c;
v3 = (( e.f.e.p.b.j ) v3 ).b ( ); // invoke-virtual {v3}, Le/f/e/p/b/j;->b()I
/* .line 16 */
v4 = this.c;
v4 = (( e.f.e.p.b.j ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/e/p/b/j;->a()I
/* .line 17 */
/* div-int/2addr v1, v3 */
/* .line 18 */
/* div-int/2addr v2, v4 */
/* mul-int v5, v1, v3 */
/* mul-int v6, v2, v4 */
/* .line 19 */
/* new-instance v7, Le/f/e/o/b; */
/* invoke-direct {v7, v6, v5}, Le/f/e/o/b;-><init>(II)V */
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v6, v1, :cond_4 */
/* mul-int v8, v6, v3 */
int v9 = 0; // const/4 v9, 0x0
} // :goto_1
/* if-ge v9, v2, :cond_3 */
/* mul-int v10, v9, v4 */
int v11 = 0; // const/4 v11, 0x0
} // :goto_2
/* if-ge v11, v3, :cond_2 */
/* add-int/lit8 v12, v3, 0x2 */
/* mul-int v12, v12, v6 */
/* add-int/lit8 v12, v12, 0x1 */
/* add-int/2addr v12, v11 */
/* add-int v13, v8, v11 */
int v14 = 0; // const/4 v14, 0x0
} // :goto_3
/* if-ge v14, v4, :cond_1 */
/* add-int/lit8 v15, v4, 0x2 */
/* mul-int v15, v15, v9 */
/* add-int/lit8 v15, v15, 0x1 */
/* add-int/2addr v15, v14 */
/* move-object/from16 v5, p1 */
/* .line 20 */
v15 = (( e.f.e.o.b ) v5 ).b ( v15, v12 ); // invoke-virtual {v5, v15, v12}, Le/f/e/o/b;->b(II)Z
if ( v15 != null) { // if-eqz v15, :cond_0
/* add-int v15, v10, v14 */
/* .line 21 */
(( e.f.e.o.b ) v7 ).c ( v15, v13 ); // invoke-virtual {v7, v15, v13}, Le/f/e/o/b;->c(II)V
} // :cond_0
/* add-int/lit8 v14, v14, 0x1 */
} // :cond_1
/* move-object/from16 v5, p1 */
/* add-int/lit8 v11, v11, 0x1 */
} // :cond_2
/* move-object/from16 v5, p1 */
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_3
/* move-object/from16 v5, p1 */
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_4
/* .line 22 */
} // :cond_5
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
final String v2 = "Dimension of bitMarix must match the version size"; // const-string v2, "Dimension of bitMarix must match the version size"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end method
public e.f.e.p.b.j a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public final Boolean a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* if-gez p1, :cond_0 */
/* add-int/2addr p1, p3 */
/* add-int/lit8 p3, p3, 0x4 */
/* and-int/lit8 p3, p3, 0x7 */
/* rsub-int/lit8 p3, p3, 0x4 */
/* add-int/2addr p2, p3 */
} // :cond_0
/* if-gez p2, :cond_1 */
/* add-int/2addr p2, p4 */
/* add-int/lit8 p4, p4, 0x4 */
/* and-int/lit8 p3, p4, 0x7 */
/* rsub-int/lit8 p3, p3, 0x4 */
/* add-int/2addr p1, p3 */
/* .line 2 */
} // :cond_1
p3 = this.b;
(( e.f.e.o.b ) p3 ).c ( p2, p1 ); // invoke-virtual {p3, p2, p1}, Le/f/e/o/b;->c(II)V
/* .line 3 */
p3 = this.a;
p1 = (( e.f.e.o.b ) p3 ).b ( p2, p1 ); // invoke-virtual {p3, p2, p1}, Le/f/e/o/b;->b(II)Z
} // .end method
public final Integer b ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* add-int/lit8 v0, p1, -0x3 */
int v1 = 0; // const/4 v1, 0x0
/* .line 25 */
v0 = (( e.f.e.p.b.a ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
int v2 = 1; // const/4 v2, 0x1
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p1, -0x2 */
/* .line 26 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v3, v1, p1, p2 ); // invoke-virtual {p0, v3, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p1, -0x1 */
/* .line 27 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v3, v1, p1, p2 ); // invoke-virtual {p0, v3, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p2, -0x4 */
/* .line 28 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p2, -0x3 */
/* .line 29 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p2, -0x2 */
/* .line 30 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_4
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_4
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p2, -0x1 */
/* .line 31 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_5
/* shl-int/2addr v0, v2 */
/* .line 32 */
p1 = (( e.f.e.p.b.a ) p0 ).a ( v2, v3, p1, p2 ); // invoke-virtual {p0, v2, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_6
} // .end method
public final Integer b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 5 */
/* add-int/lit8 v0, p1, -0x2 */
/* add-int/lit8 v1, p2, -0x2 */
/* .line 17 */
v2 = (( e.f.e.p.b.a ) p0 ).a ( v0, v1, p3, p4 ); // invoke-virtual {p0, v0, v1, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
/* shl-int/lit8 v2, v2, 0x1 */
/* add-int/lit8 v3, p2, -0x1 */
/* .line 18 */
v0 = (( e.f.e.p.b.a ) p0 ).a ( v0, v3, p3, p4 ); // invoke-virtual {p0, v0, v3, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* or-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* shl-int/lit8 v0, v2, 0x1 */
/* add-int/lit8 v2, p1, -0x1 */
/* .line 19 */
v4 = (( e.f.e.p.b.a ) p0 ).a ( v2, v1, p3, p4 ); // invoke-virtual {p0, v2, v1, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* shl-int/lit8 v0, v0, 0x1 */
/* .line 20 */
v4 = (( e.f.e.p.b.a ) p0 ).a ( v2, v3, p3, p4 ); // invoke-virtual {p0, v2, v3, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* shl-int/lit8 v0, v0, 0x1 */
/* .line 21 */
v2 = (( e.f.e.p.b.a ) p0 ).a ( v2, p2, p3, p4 ); // invoke-virtual {p0, v2, p2, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* shl-int/lit8 v0, v0, 0x1 */
/* .line 22 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( p1, v1, p3, p4 ); // invoke-virtual {p0, p1, v1, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_4
/* shl-int/lit8 v0, v0, 0x1 */
/* .line 23 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( p1, v3, p3, p4 ); // invoke-virtual {p0, p1, v3, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_5
/* shl-int/lit8 v0, v0, 0x1 */
/* .line 24 */
p1 = (( e.f.e.p.b.a ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/f/e/p/b/a;->a(IIII)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_6
} // .end method
public b ( ) {
/* .locals 14 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.c;
v0 = (( e.f.e.p.b.j ) v0 ).f ( ); // invoke-virtual {v0}, Le/f/e/p/b/j;->f()I
/* new-array v0, v0, [B */
/* .line 5 */
v1 = this.a;
v1 = (( e.f.e.o.b ) v1 ).d ( ); // invoke-virtual {v1}, Le/f/e/o/b;->d()I
/* .line 6 */
v2 = this.a;
v2 = (( e.f.e.o.b ) v2 ).f ( ); // invoke-virtual {v2}, Le/f/e/o/b;->f()I
int v3 = 4; // const/4 v3, 0x4
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 4; // const/4 v10, 0x4
} // :cond_0
int v11 = 1; // const/4 v11, 0x1
/* if-ne v10, v1, :cond_1 */
/* if-nez v4, :cond_1 */
/* if-nez v5, :cond_1 */
/* add-int/lit8 v5, v6, 0x1 */
/* .line 7 */
v12 = (( e.f.e.p.b.a ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/e/p/b/a;->a(II)I
/* int-to-byte v12, v12 */
/* aput-byte v12, v0, v6 */
/* add-int/lit8 v10, v10, -0x2 */
/* add-int/lit8 v4, v4, 0x2 */
/* move v6, v5 */
int v5 = 1; // const/4 v5, 0x1
/* goto/16 :goto_0 */
} // :cond_1
/* add-int/lit8 v12, v1, -0x2 */
/* if-ne v10, v12, :cond_2 */
/* if-nez v4, :cond_2 */
/* and-int/lit8 v13, v2, 0x3 */
if ( v13 != null) { // if-eqz v13, :cond_2
/* if-nez v7, :cond_2 */
/* add-int/lit8 v7, v6, 0x1 */
/* .line 8 */
v12 = (( e.f.e.p.b.a ) p0 ).b ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/e/p/b/a;->b(II)I
/* int-to-byte v12, v12 */
/* aput-byte v12, v0, v6 */
/* add-int/lit8 v10, v10, -0x2 */
/* add-int/lit8 v4, v4, 0x2 */
/* move v6, v7 */
int v7 = 1; // const/4 v7, 0x1
/* goto/16 :goto_0 */
} // :cond_2
/* add-int/lit8 v13, v1, 0x4 */
/* if-ne v10, v13, :cond_3 */
int v13 = 2; // const/4 v13, 0x2
/* if-ne v4, v13, :cond_3 */
/* and-int/lit8 v13, v2, 0x7 */
/* if-nez v13, :cond_3 */
/* if-nez v8, :cond_3 */
/* add-int/lit8 v8, v6, 0x1 */
/* .line 9 */
v12 = (( e.f.e.p.b.a ) p0 ).c ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/e/p/b/a;->c(II)I
/* int-to-byte v12, v12 */
/* aput-byte v12, v0, v6 */
/* add-int/lit8 v10, v10, -0x2 */
/* add-int/lit8 v4, v4, 0x2 */
/* move v6, v8 */
int v8 = 1; // const/4 v8, 0x1
} // :cond_3
/* if-ne v10, v12, :cond_4 */
/* if-nez v4, :cond_4 */
/* and-int/lit8 v12, v2, 0x7 */
/* if-ne v12, v3, :cond_4 */
/* if-nez v9, :cond_4 */
/* add-int/lit8 v9, v6, 0x1 */
/* .line 10 */
v12 = (( e.f.e.p.b.a ) p0 ).d ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/e/p/b/a;->d(II)I
/* int-to-byte v12, v12 */
/* aput-byte v12, v0, v6 */
/* add-int/lit8 v10, v10, -0x2 */
/* add-int/lit8 v4, v4, 0x2 */
/* move v6, v9 */
int v9 = 1; // const/4 v9, 0x1
} // :cond_4
/* if-ge v10, v1, :cond_5 */
/* if-ltz v4, :cond_5 */
/* .line 11 */
v11 = this.b;
v11 = (( e.f.e.o.b ) v11 ).b ( v4, v10 ); // invoke-virtual {v11, v4, v10}, Le/f/e/o/b;->b(II)Z
/* if-nez v11, :cond_5 */
/* add-int/lit8 v11, v6, 0x1 */
/* .line 12 */
v12 = (( e.f.e.p.b.a ) p0 ).b ( v10, v4, v1, v2 ); // invoke-virtual {p0, v10, v4, v1, v2}, Le/f/e/p/b/a;->b(IIII)I
/* int-to-byte v12, v12 */
/* aput-byte v12, v0, v6 */
/* move v6, v11 */
} // :cond_5
/* add-int/lit8 v10, v10, -0x2 */
/* add-int/lit8 v4, v4, 0x2 */
/* if-ltz v10, :cond_6 */
/* if-lt v4, v2, :cond_4 */
} // :cond_6
/* add-int/lit8 v10, v10, 0x1 */
/* add-int/lit8 v4, v4, 0x3 */
} // :cond_7
/* if-ltz v10, :cond_8 */
/* if-ge v4, v2, :cond_8 */
/* .line 13 */
v11 = this.b;
v11 = (( e.f.e.o.b ) v11 ).b ( v4, v10 ); // invoke-virtual {v11, v4, v10}, Le/f/e/o/b;->b(II)Z
/* if-nez v11, :cond_8 */
/* add-int/lit8 v11, v6, 0x1 */
/* .line 14 */
v12 = (( e.f.e.p.b.a ) p0 ).b ( v10, v4, v1, v2 ); // invoke-virtual {p0, v10, v4, v1, v2}, Le/f/e/p/b/a;->b(IIII)I
/* int-to-byte v12, v12 */
/* aput-byte v12, v0, v6 */
/* move v6, v11 */
} // :cond_8
/* add-int/lit8 v10, v10, 0x2 */
/* add-int/lit8 v4, v4, -0x2 */
/* if-ge v10, v1, :cond_9 */
/* if-gez v4, :cond_7 */
} // :cond_9
/* add-int/lit8 v10, v10, 0x3 */
/* add-int/lit8 v4, v4, 0x1 */
} // :goto_0
/* if-lt v10, v1, :cond_0 */
/* if-lt v4, v2, :cond_0 */
/* .line 15 */
v1 = this.c;
v1 = (( e.f.e.p.b.j ) v1 ).f ( ); // invoke-virtual {v1}, Le/f/e/p/b/j;->f()I
/* if-ne v6, v1, :cond_a */
/* .line 16 */
} // :cond_a
com.google.zxing.FormatException .a ( );
/* throw v0 */
} // .end method
public final Integer c ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* add-int/lit8 v0, p1, -0x1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
v2 = (( e.f.e.p.b.a ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
int v3 = 1; // const/4 v3, 0x1
/* shl-int/2addr v2, v3 */
/* add-int/lit8 v4, p2, -0x1 */
/* .line 2 */
v0 = (( e.f.e.p.b.a ) p0 ).a ( v0, v4, p1, p2 ); // invoke-virtual {p0, v0, v4, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* or-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* shl-int/lit8 v0, v2, 0x1 */
/* add-int/lit8 v2, p2, -0x3 */
/* .line 3 */
v5 = (( e.f.e.p.b.a ) p0 ).a ( v1, v2, p1, p2 ); // invoke-virtual {p0, v1, v2, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* shl-int/2addr v0, v3 */
/* add-int/lit8 v5, p2, -0x2 */
/* .line 4 */
v6 = (( e.f.e.p.b.a ) p0 ).a ( v1, v5, p1, p2 ); // invoke-virtual {p0, v1, v5, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* shl-int/2addr v0, v3 */
/* .line 5 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v1, v4, p1, p2 ); // invoke-virtual {p0, v1, v4, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* shl-int/2addr v0, v3 */
/* .line 6 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v3, v2, p1, p2 ); // invoke-virtual {p0, v3, v2, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_4
/* shl-int/2addr v0, v3 */
/* .line 7 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v3, v5, p1, p2 ); // invoke-virtual {p0, v3, v5, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_5
/* shl-int/2addr v0, v3 */
/* .line 8 */
p1 = (( e.f.e.p.b.a ) p0 ).a ( v3, v4, p1, p2 ); // invoke-virtual {p0, v3, v4, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_6
} // .end method
public final Integer d ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* add-int/lit8 v0, p1, -0x3 */
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
v0 = (( e.f.e.p.b.a ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
int v2 = 1; // const/4 v2, 0x1
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p1, -0x2 */
/* .line 2 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v3, v1, p1, p2 ); // invoke-virtual {p0, v3, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p1, -0x1 */
/* .line 3 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v3, v1, p1, p2 ); // invoke-virtual {p0, v3, v1, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p2, -0x2 */
/* .line 4 */
v3 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* shl-int/2addr v0, v2 */
/* add-int/lit8 v3, p2, -0x1 */
/* .line 5 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* shl-int/2addr v0, v2 */
/* .line 6 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v2, v3, p1, p2 ); // invoke-virtual {p0, v2, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_4
/* shl-int/2addr v0, v2 */
int v1 = 2; // const/4 v1, 0x2
/* .line 7 */
v1 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_5
/* shl-int/2addr v0, v2 */
int v1 = 3; // const/4 v1, 0x3
/* .line 8 */
p1 = (( e.f.e.p.b.a ) p0 ).a ( v1, v3, p1, p2 ); // invoke-virtual {p0, v1, v3, p1, p2}, Le/f/e/p/b/a;->a(IIII)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* or-int/lit8 v0, v0, 0x1 */
} // :cond_6
} // .end method
