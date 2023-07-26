public class c.r.d.z {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.r.d.y a;
	 /* # direct methods */
	 public c.r.d.z ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( java.util.List p0 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Lc/r/d/a$b;", */
		 /* ">;)I" */
		 /* } */
	 } // .end annotation
	 v0 = 	 /* .line 16 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* sub-int/2addr v0, v1 */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ltz v0, :cond_2 */
/* .line 17 */
/* check-cast v3, Lc/r/d/a$b; */
/* .line 18 */
/* iget v3, v3, Lc/r/d/a$b;->a:I */
/* const/16 v4, 0x8 */
/* if-ne v3, v4, :cond_0 */
if ( v2 != null) { // if-eqz v2, :cond_1
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_2
int p1 = -1; // const/4 p1, -0x1
} // .end method
public final void a ( java.util.List p0, Integer p1, Integer p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/r/d/a$b;", */
/* ">;II)V" */
/* } */
} // .end annotation
/* .line 1 */
/* move-object v4, v0 */
/* check-cast v4, Lc/r/d/a$b; */
/* .line 2 */
/* move-object v6, v0 */
/* check-cast v6, Lc/r/d/a$b; */
/* .line 3 */
/* iget v0, v6, Lc/r/d/a$b;->a:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_2 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
int v1 = 4; // const/4 v1, 0x4
/* if-eq v0, v1, :cond_0 */
} // :cond_0
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v5, p3 */
/* .line 4 */
/* invoke-virtual/range {v1 ..v6}, Lc/r/d/z;->c(Ljava/util/List;ILc/r/d/a$b;ILc/r/d/a$b;)V */
} // :cond_1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v5, p3 */
/* .line 5 */
/* invoke-virtual/range {v1 ..v6}, Lc/r/d/z;->b(Ljava/util/List;ILc/r/d/a$b;ILc/r/d/a$b;)V */
} // :cond_2
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v5, p3 */
/* .line 6 */
/* invoke-virtual/range {v1 ..v6}, Lc/r/d/z;->a(Ljava/util/List;ILc/r/d/a$b;ILc/r/d/a$b;)V */
} // :goto_0
return;
} // .end method
public final void a ( java.util.List p0, Integer p1, c.r.d.a$b p2, Integer p3, c.r.d.a$b p4 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/r/d/a$b;", */
/* ">;I", */
/* "Lc/r/d/a$b;", */
/* "I", */
/* "Lc/r/d/a$b;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 7 */
/* iget v0, p3, Lc/r/d/a$b;->d:I */
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* if-ge v0, v1, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
} // :goto_0
/* iget v1, p3, Lc/r/d/a$b;->b:I */
/* iget v2, p5, Lc/r/d/a$b;->b:I */
/* if-ge v1, v2, :cond_1 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 9 */
} // :cond_1
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* iget v2, p3, Lc/r/d/a$b;->b:I */
/* if-gt v1, v2, :cond_2 */
/* .line 10 */
/* iget v1, p5, Lc/r/d/a$b;->d:I */
/* add-int/2addr v2, v1 */
/* iput v2, p3, Lc/r/d/a$b;->b:I */
/* .line 11 */
} // :cond_2
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* iget v2, p3, Lc/r/d/a$b;->d:I */
/* if-gt v1, v2, :cond_3 */
/* .line 12 */
/* iget v1, p5, Lc/r/d/a$b;->d:I */
/* add-int/2addr v2, v1 */
/* iput v2, p3, Lc/r/d/a$b;->d:I */
/* .line 13 */
} // :cond_3
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* add-int/2addr v1, v0 */
/* iput v1, p5, Lc/r/d/a$b;->b:I */
/* .line 14 */
/* .line 15 */
return;
} // .end method
public void b ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/r/d/a$b;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
} // :goto_0
v0 = (( c.r.d.z ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/z;->a(Ljava/util/List;)I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* add-int/lit8 v1, v0, 0x1 */
/* .line 2 */
(( c.r.d.z ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lc/r/d/z;->a(Ljava/util/List;II)V
} // :cond_0
return;
} // .end method
public void b ( java.util.List p0, Integer p1, c.r.d.a$b p2, Integer p3, c.r.d.a$b p4 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/r/d/a$b;", */
/* ">;I", */
/* "Lc/r/d/a$b;", */
/* "I", */
/* "Lc/r/d/a$b;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 3 */
/* iget v0, p3, Lc/r/d/a$b;->b:I */
/* iget v1, p3, Lc/r/d/a$b;->d:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-ge v0, v1, :cond_1 */
/* .line 4 */
/* iget v4, p5, Lc/r/d/a$b;->b:I */
/* if-ne v4, v0, :cond_0 */
/* iget v4, p5, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v1, v0 */
/* if-ne v4, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
} // :cond_1
/* iget v4, p5, Lc/r/d/a$b;->b:I */
/* add-int/lit8 v5, v1, 0x1 */
/* if-ne v4, v5, :cond_2 */
/* iget v4, p5, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* if-ne v4, v0, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
int v2 = 1; // const/4 v2, 0x1
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
} // :goto_1
/* iget v1, p3, Lc/r/d/a$b;->d:I */
/* iget v4, p5, Lc/r/d/a$b;->b:I */
int v5 = 2; // const/4 v5, 0x2
/* if-ge v1, v4, :cond_3 */
/* sub-int/2addr v4, v3 */
/* .line 7 */
/* iput v4, p5, Lc/r/d/a$b;->b:I */
/* .line 8 */
} // :cond_3
/* iget v6, p5, Lc/r/d/a$b;->d:I */
/* add-int/2addr v4, v6 */
/* if-ge v1, v4, :cond_5 */
/* sub-int/2addr v6, v3 */
/* .line 9 */
/* iput v6, p5, Lc/r/d/a$b;->d:I */
/* .line 10 */
/* iput v5, p3, Lc/r/d/a$b;->a:I */
/* .line 11 */
/* iput v3, p3, Lc/r/d/a$b;->d:I */
/* .line 12 */
/* iget p2, p5, Lc/r/d/a$b;->d:I */
/* if-nez p2, :cond_4 */
/* .line 13 */
/* .line 14 */
p1 = this.a;
} // :cond_4
return;
/* .line 15 */
} // :cond_5
} // :goto_2
/* iget v1, p3, Lc/r/d/a$b;->b:I */
/* iget v4, p5, Lc/r/d/a$b;->b:I */
int v6 = 0; // const/4 v6, 0x0
/* if-gt v1, v4, :cond_6 */
/* add-int/2addr v4, v3 */
/* .line 16 */
/* iput v4, p5, Lc/r/d/a$b;->b:I */
/* .line 17 */
} // :cond_6
/* iget v7, p5, Lc/r/d/a$b;->d:I */
/* add-int v8, v4, v7 */
/* if-ge v1, v8, :cond_7 */
/* add-int/2addr v4, v7 */
/* sub-int/2addr v4, v1 */
/* .line 18 */
v7 = this.a;
/* add-int/2addr v1, v3 */
/* .line 19 */
/* iget v1, p3, Lc/r/d/a$b;->b:I */
/* iget v3, p5, Lc/r/d/a$b;->b:I */
/* sub-int/2addr v1, v3 */
/* iput v1, p5, Lc/r/d/a$b;->d:I */
} // :cond_7
} // :goto_3
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 20 */
/* .line 21 */
/* .line 22 */
p1 = this.a;
return;
} // :cond_8
if ( v0 != null) { // if-eqz v0, :cond_c
if ( v6 != null) { // if-eqz v6, :cond_a
/* .line 23 */
/* iget v0, p3, Lc/r/d/a$b;->b:I */
/* iget v1, v6, Lc/r/d/a$b;->b:I */
/* if-le v0, v1, :cond_9 */
/* .line 24 */
/* iget v1, v6, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->b:I */
/* .line 25 */
} // :cond_9
/* iget v0, p3, Lc/r/d/a$b;->d:I */
/* iget v1, v6, Lc/r/d/a$b;->b:I */
/* if-le v0, v1, :cond_a */
/* .line 26 */
/* iget v1, v6, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->d:I */
/* .line 27 */
} // :cond_a
/* iget v0, p3, Lc/r/d/a$b;->b:I */
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* if-le v0, v1, :cond_b */
/* .line 28 */
/* iget v1, p5, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->b:I */
/* .line 29 */
} // :cond_b
/* iget v0, p3, Lc/r/d/a$b;->d:I */
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* if-le v0, v1, :cond_10 */
/* .line 30 */
/* iget v1, p5, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->d:I */
} // :cond_c
if ( v6 != null) { // if-eqz v6, :cond_e
/* .line 31 */
/* iget v0, p3, Lc/r/d/a$b;->b:I */
/* iget v1, v6, Lc/r/d/a$b;->b:I */
/* if-lt v0, v1, :cond_d */
/* .line 32 */
/* iget v1, v6, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->b:I */
/* .line 33 */
} // :cond_d
/* iget v0, p3, Lc/r/d/a$b;->d:I */
/* iget v1, v6, Lc/r/d/a$b;->b:I */
/* if-lt v0, v1, :cond_e */
/* .line 34 */
/* iget v1, v6, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->d:I */
/* .line 35 */
} // :cond_e
/* iget v0, p3, Lc/r/d/a$b;->b:I */
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* if-lt v0, v1, :cond_f */
/* .line 36 */
/* iget v1, p5, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->b:I */
/* .line 37 */
} // :cond_f
/* iget v0, p3, Lc/r/d/a$b;->d:I */
/* iget v1, p5, Lc/r/d/a$b;->b:I */
/* if-lt v0, v1, :cond_10 */
/* .line 38 */
/* iget v1, p5, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p3, Lc/r/d/a$b;->d:I */
/* .line 39 */
} // :cond_10
} // :goto_4
/* .line 40 */
/* iget p5, p3, Lc/r/d/a$b;->b:I */
/* iget v0, p3, Lc/r/d/a$b;->d:I */
/* if-eq p5, v0, :cond_11 */
/* .line 41 */
/* .line 42 */
} // :cond_11
} // :goto_5
if ( v6 != null) { // if-eqz v6, :cond_12
/* .line 43 */
} // :cond_12
return;
} // .end method
public void c ( java.util.List p0, Integer p1, c.r.d.a$b p2, Integer p3, c.r.d.a$b p4 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/r/d/a$b;", */
/* ">;I", */
/* "Lc/r/d/a$b;", */
/* "I", */
/* "Lc/r/d/a$b;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p3, Lc/r/d/a$b;->d:I */
/* iget v1, p5, Lc/r/d/a$b;->b:I */
int v2 = 4; // const/4 v2, 0x4
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* if-ge v0, v1, :cond_0 */
/* sub-int/2addr v1, v4 */
/* .line 2 */
/* iput v1, p5, Lc/r/d/a$b;->b:I */
/* .line 3 */
} // :cond_0
/* iget v5, p5, Lc/r/d/a$b;->d:I */
/* add-int/2addr v1, v5 */
/* if-ge v0, v1, :cond_1 */
/* sub-int/2addr v5, v4 */
/* .line 4 */
/* iput v5, p5, Lc/r/d/a$b;->d:I */
/* .line 5 */
v0 = this.a;
/* iget v1, p3, Lc/r/d/a$b;->b:I */
v5 = this.c;
} // :cond_1
} // :goto_0
/* move-object v0, v3 */
/* .line 6 */
} // :goto_1
/* iget v1, p3, Lc/r/d/a$b;->b:I */
/* iget v5, p5, Lc/r/d/a$b;->b:I */
/* if-gt v1, v5, :cond_2 */
/* add-int/2addr v5, v4 */
/* .line 7 */
/* iput v5, p5, Lc/r/d/a$b;->b:I */
/* .line 8 */
} // :cond_2
/* iget v6, p5, Lc/r/d/a$b;->d:I */
/* add-int v7, v5, v6 */
/* if-ge v1, v7, :cond_3 */
/* add-int/2addr v5, v6 */
/* sub-int/2addr v5, v1 */
/* .line 9 */
v3 = this.a;
/* add-int/2addr v1, v4 */
v4 = this.c;
/* .line 10 */
/* iget v1, p5, Lc/r/d/a$b;->d:I */
/* sub-int/2addr v1, v5 */
/* iput v1, p5, Lc/r/d/a$b;->d:I */
/* .line 11 */
} // :cond_3
} // :goto_2
/* .line 12 */
/* iget p3, p5, Lc/r/d/a$b;->d:I */
/* if-lez p3, :cond_4 */
/* .line 13 */
/* .line 14 */
} // :cond_4
/* .line 15 */
p3 = this.a;
} // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 16 */
} // :cond_5
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 17 */
} // :cond_6
return;
} // .end method
