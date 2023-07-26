public class c.h.o.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public Float c;
	 public Float d;
	 public Long e;
	 public Long f;
	 public Integer g;
	 public Integer h;
	 public Long i;
	 public Float j;
	 public Integer k;
	 /* # direct methods */
	 public c.h.o.a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/high16 v0, -0x8000000000000000L */
		 /* .line 2 */
		 /* iput-wide v0, p0, Lc/h/o/a;->e:J */
		 /* const-wide/16 v0, -0x1 */
		 /* .line 3 */
		 /* iput-wide v0, p0, Lc/h/o/a;->i:J */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 4 */
		 /* iput-wide v0, p0, Lc/h/o/a;->f:J */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 /* iput v0, p0, Lc/h/o/a;->g:I */
		 /* .line 6 */
		 /* iput v0, p0, Lc/h/o/a;->h:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Float a ( Float p0 ) {
		 /* .locals 2 */
		 /* const/high16 v0, -0x3f800000 # -4.0f */
		 /* mul-float v0, v0, p1 */
		 /* mul-float v0, v0, p1 */
		 /* const/high16 v1, 0x40800000 # 4.0f */
		 /* mul-float p1, p1, v1 */
		 /* add-float/2addr v0, p1 */
	 } // .end method
	 public final Float a ( Long p0 ) {
		 /* .locals 7 */
		 /* .line 2 */
		 /* iget-wide v0, p0, Lc/h/o/a;->e:J */
		 int v2 = 0; // const/4 v2, 0x0
		 /* cmp-long v3, p1, v0 */
		 /* if-gez v3, :cond_0 */
		 /* .line 3 */
	 } // :cond_0
	 /* iget-wide v0, p0, Lc/h/o/a;->i:J */
	 /* const-wide/16 v3, 0x0 */
	 /* const/high16 v5, 0x3f800000 # 1.0f */
	 /* cmp-long v6, v0, v3 */
	 /* if-ltz v6, :cond_2 */
	 /* cmp-long v3, p1, v0 */
	 /* if-gez v3, :cond_1 */
} // :cond_1
/* sub-long/2addr p1, v0 */
/* .line 4 */
/* iget v0, p0, Lc/h/o/a;->j:F */
/* sub-float v1, v5, v0 */
/* long-to-float p1, p1 */
/* iget p2, p0, Lc/h/o/a;->k:I */
/* int-to-float p2, p2 */
/* div-float/2addr p1, p2 */
/* .line 5 */
p1 = c.h.o.c .a ( p1,v2,v5 );
/* mul-float v0, v0, p1 */
/* add-float/2addr v1, v0 */
/* .line 6 */
} // :cond_2
} // :goto_0
/* iget-wide v0, p0, Lc/h/o/a;->e:J */
/* sub-long/2addr p1, v0 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* long-to-float p1, p1 */
/* .line 7 */
/* iget p2, p0, Lc/h/o/a;->a:I */
/* int-to-float p2, p2 */
/* div-float/2addr p1, p2 */
p1 = c.h.o.c .a ( p1,v2,v5 );
/* mul-float p1, p1, v0 */
} // .end method
public void a ( ) {
/* .locals 5 */
/* .line 8 */
/* iget-wide v0, p0, Lc/h/o/a;->f:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, v0, v2 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 9 */
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide v0 */
/* .line 10 */
v2 = (( c.h.o.a ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/h/o/a;->a(J)F
/* .line 11 */
v2 = (( c.h.o.a ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/h/o/a;->a(F)F
/* .line 12 */
/* iget-wide v3, p0, Lc/h/o/a;->f:J */
/* sub-long v3, v0, v3 */
/* .line 13 */
/* iput-wide v0, p0, Lc/h/o/a;->f:J */
/* long-to-float v0, v3 */
/* mul-float v0, v0, v2 */
/* .line 14 */
/* iget v1, p0, Lc/h/o/a;->c:F */
/* mul-float v1, v1, v0 */
/* float-to-int v1, v1 */
/* iput v1, p0, Lc/h/o/a;->g:I */
/* .line 15 */
/* iget v1, p0, Lc/h/o/a;->d:F */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lc/h/o/a;->h:I */
return;
/* .line 16 */
} // :cond_0
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "Cannot compute scroll delta before calling start()"; // const-string v1, "Cannot compute scroll delta before calling start()"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( Float p0, Float p1 ) {
/* .locals 0 */
/* .line 17 */
/* iput p1, p0, Lc/h/o/a;->c:F */
/* .line 18 */
/* iput p2, p0, Lc/h/o/a;->d:F */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/h/o/a;->b:I */
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 2 */
/* iget v0, p0, Lc/h/o/a;->g:I */
} // .end method
public void b ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/h/o/a;->a:I */
return;
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/o/a;->h:I */
} // .end method
public Integer d ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/h/o/a;->c:F */
v1 = java.lang.Math .abs ( v0 );
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
} // .end method
public Integer e ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/h/o/a;->d:F */
v1 = java.lang.Math .abs ( v0 );
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
} // .end method
public Boolean f ( ) {
/* .locals 6 */
/* .line 1 */
/* iget-wide v0, p0, Lc/h/o/a;->i:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, v0, v2 */
/* if-lez v4, :cond_0 */
/* .line 2 */
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lc/h/o/a;->i:J */
/* iget v4, p0, Lc/h/o/a;->k:I */
/* int-to-long v4, v4 */
/* add-long/2addr v2, v4 */
/* cmp-long v4, v0, v2 */
/* if-lez v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void g ( ) {
/* .locals 5 */
/* .line 1 */
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide v0 */
/* .line 2 */
/* iget-wide v2, p0, Lc/h/o/a;->e:J */
/* sub-long v2, v0, v2 */
/* long-to-int v3, v2 */
/* iget v2, p0, Lc/h/o/a;->b:I */
int v4 = 0; // const/4 v4, 0x0
v2 = c.h.o.c .a ( v3,v4,v2 );
/* iput v2, p0, Lc/h/o/a;->k:I */
/* .line 3 */
v2 = (( c.h.o.a ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/h/o/a;->a(J)F
/* iput v2, p0, Lc/h/o/a;->j:F */
/* .line 4 */
/* iput-wide v0, p0, Lc/h/o/a;->i:J */
return;
} // .end method
public void h ( ) {
/* .locals 4 */
/* .line 1 */
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lc/h/o/a;->e:J */
/* const-wide/16 v2, -0x1 */
/* .line 2 */
/* iput-wide v2, p0, Lc/h/o/a;->i:J */
/* .line 3 */
/* iput-wide v0, p0, Lc/h/o/a;->f:J */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* .line 4 */
/* iput v0, p0, Lc/h/o/a;->j:F */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput v0, p0, Lc/h/o/a;->g:I */
/* .line 6 */
/* iput v0, p0, Lc/h/o/a;->h:I */
return;
} // .end method
