public class c.b.m.a.c extends c.b.m.a.n {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.e.f K;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/f<", */
	 /* "Ljava/lang/Long;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public c.e.j L;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/j<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.b.m.a.c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2, p3}, Lc/b/m/a/n;-><init>(Lc/b/m/a/n;Lc/b/m/a/o;Landroid/content/res/Resources;)V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p2 = this.K;
this.K = p2;
/* .line 3 */
p1 = this.L;
this.L = p1;
/* .line 4 */
} // :cond_0
/* new-instance p1, Lc/e/f; */
/* invoke-direct {p1}, Lc/e/f;-><init>()V */
this.K = p1;
/* .line 5 */
/* new-instance p1, Lc/e/j; */
/* invoke-direct {p1}, Lc/e/j;-><init>()V */
this.L = p1;
} // :goto_0
return;
} // .end method
public static Long f ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* int-to-long v0, p0 */
/* const/16 p0, 0x20 */
/* shl-long/2addr v0, p0 */
/* int-to-long p0, p1 */
/* or-long/2addr p0, v0 */
/* return-wide p0 */
} // .end method
/* # virtual methods */
public Integer a ( Integer p0, Integer p1, android.graphics.drawable.Drawable p2, Boolean p3 ) {
/* .locals 9 */
/* .line 1 */
p3 = /* invoke-super {p0, p3}, Lc/b/m/a/k;->a(Landroid/graphics/drawable/Drawable;)I */
/* .line 2 */
c.b.m.a.c .f ( p1,p2 );
/* move-result-wide v0 */
if ( p4 != null) { // if-eqz p4, :cond_0
/* const-wide v2, 0x200000000L */
} // :cond_0
/* const-wide/16 v2, 0x0 */
/* .line 3 */
} // :goto_0
v4 = this.K;
/* int-to-long v5, p3 */
/* or-long v7, v5, v2 */
java.lang.Long .valueOf ( v7,v8 );
(( c.e.f ) v4 ).a ( v0, v1, v7 ); // invoke-virtual {v4, v0, v1, v7}, Lc/e/f;->a(JLjava/lang/Object;)V
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 4 */
c.b.m.a.c .f ( p2,p1 );
/* move-result-wide p1 */
/* .line 5 */
p4 = this.K;
/* const-wide v0, 0x100000000L */
/* or-long/2addr v0, v5 */
/* or-long/2addr v0, v2 */
java.lang.Long .valueOf ( v0,v1 );
(( c.e.f ) p4 ).a ( p1, p2, v0 ); // invoke-virtual {p4, p1, p2, v0}, Lc/e/f;->a(JLjava/lang/Object;)V
} // :cond_1
} // .end method
public Integer a ( Integer[] p0, android.graphics.drawable.Drawable p1, Integer p2 ) {
/* .locals 0 */
/* .line 6 */
p1 = /* invoke-super {p0, p1, p2}, Lc/b/m/a/n;->a([ILandroid/graphics/drawable/Drawable;)I */
/* .line 7 */
p2 = this.L;
java.lang.Integer .valueOf ( p3 );
(( c.e.j ) p2 ).c ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Lc/e/j;->c(ILjava/lang/Object;)V
} // .end method
public Integer b ( Integer[] p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = /* invoke-super {p0, p1}, Lc/b/m/a/n;->a([I)I */
/* if-ltz p1, :cond_0 */
/* .line 2 */
} // :cond_0
p1 = android.util.StateSet.WILD_CARD;
p1 = /* invoke-super {p0, p1}, Lc/b/m/a/n;->a([I)I */
} // .end method
public Integer c ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
c.b.m.a.c .f ( p1,p2 );
/* move-result-wide p1 */
/* .line 2 */
v0 = this.K;
/* const-wide/16 v1, -0x1 */
java.lang.Long .valueOf ( v1,v2 );
(( c.e.f ) v0 ).b ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/e/f;->b(JLjava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Long; */
(( java.lang.Long ) p1 ).longValue ( ); // invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/* move-result-wide p1 */
/* long-to-int p2, p1 */
} // .end method
public Integer d ( Integer p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-gez p1, :cond_0 */
/* .line 1 */
} // :cond_0
v1 = this.L;
java.lang.Integer .valueOf ( v0 );
(( c.e.j ) v1 ).b ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/j;->b(ILjava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
} // :goto_0
} // .end method
public Boolean d ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 2 */
c.b.m.a.c .f ( p1,p2 );
/* move-result-wide p1 */
/* .line 3 */
v0 = this.K;
/* const-wide/16 v1, -0x1 */
java.lang.Long .valueOf ( v1,v2 );
(( c.e.f ) v0 ).b ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/e/f;->b(JLjava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Long; */
(( java.lang.Long ) p1 ).longValue ( ); // invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/* move-result-wide p1 */
/* const-wide v0, 0x100000000L */
/* and-long/2addr p1, v0 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
if ( v2 != null) { // if-eqz v2, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean e ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
c.b.m.a.c .f ( p1,p2 );
/* move-result-wide p1 */
/* .line 2 */
v0 = this.K;
/* const-wide/16 v1, -0x1 */
java.lang.Long .valueOf ( v1,v2 );
(( c.e.f ) v0 ).b ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Lc/e/f;->b(JLjava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Long; */
(( java.lang.Long ) p1 ).longValue ( ); // invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/* move-result-wide p1 */
/* const-wide v0, 0x200000000L */
/* and-long/2addr p1, v0 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
if ( v2 != null) { // if-eqz v2, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.K;
(( c.e.f ) v0 ).clone ( ); // invoke-virtual {v0}, Lc/e/f;->clone()Lc/e/f;
this.K = v0;
/* .line 2 */
v0 = this.L;
(( c.e.j ) v0 ).clone ( ); // invoke-virtual {v0}, Lc/e/j;->clone()Lc/e/j;
this.L = v0;
return;
} // .end method
public android.graphics.drawable.Drawable newDrawable ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lc/b/m/a/h; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lc/b/m/a/h;-><init>(Lc/b/m/a/c;Landroid/content/res/Resources;)V */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance v0, Lc/b/m/a/h; */
/* invoke-direct {v0, p0, p1}, Lc/b/m/a/h;-><init>(Lc/b/m/a/c;Landroid/content/res/Resources;)V */
} // .end method
