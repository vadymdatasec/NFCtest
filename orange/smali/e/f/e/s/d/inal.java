public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.f.e.o.b a;
	 public e.f.e.l b;
	 public e.f.e.l c;
	 public e.f.e.l d;
	 public e.f.e.l e;
	 public Integer f;
	 public Integer g;
	 public Integer h;
	 public Integer i;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/NotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* if-nez p2, :cond_0 */
	 if ( p4 != null) { // if-eqz p4, :cond_3
	 } // :cond_0
	 /* if-nez p3, :cond_1 */
	 if ( p5 != null) { // if-eqz p5, :cond_3
	 } // :cond_1
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 if ( p3 != null) { // if-eqz p3, :cond_3
		 } // :cond_2
		 if ( p4 != null) { // if-eqz p4, :cond_4
			 if ( p5 != null) { // if-eqz p5, :cond_3
				 /* .line 2 */
			 } // :cond_3
			 com.google.zxing.NotFoundException .a ( );
			 /* throw p1 */
			 /* .line 3 */
		 } // :cond_4
	 } // :goto_0
	 /* invoke-virtual/range {p0 ..p5}, Le/f/e/s/d/c;->a(Le/f/e/o/b;Le/f/e/l;Le/f/e/l;Le/f/e/l;Le/f/e/l;)V */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 6 */
	 /* .line 4 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 5 */
	 v1 = this.a;
	 v2 = this.b;
	 v3 = this.c;
	 v4 = this.d;
	 v5 = this.e;
	 /* move-object v0, p0 */
	 /* invoke-virtual/range {v0 ..v5}, Le/f/e/s/d/c;->a(Le/f/e/o/b;Le/f/e/l;Le/f/e/l;Le/f/e/l;Le/f/e/l;)V */
	 return;
} // .end method
public static e.f.e.s.d.c a ( Object p0, Object p1 ) {
	 /* .locals 7 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/google/zxing/NotFoundException; */
	 /* } */
} // .end annotation
/* if-nez p0, :cond_0 */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 7 */
} // :cond_1
/* new-instance v6, Le/f/e/s/d/c; */
v1 = this.a;
v2 = this.b;
v3 = this.c;
v4 = this.d;
v5 = this.e;
/* move-object v0, v6 */
/* invoke-direct/range {v0 ..v5}, Le/f/e/s/d/c;-><init>(Le/f/e/o/b;Le/f/e/l;Le/f/e/l;Le/f/e/l;Le/f/e/l;)V */
} // .end method
/* # virtual methods */
public e.f.e.s.d.c a ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.b;
/* .line 9 */
v1 = this.c;
/* .line 10 */
v2 = this.d;
/* .line 11 */
v3 = this.e;
/* if-lez p1, :cond_3 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* move-object v4, v0 */
} // :cond_0
/* move-object v4, v2 */
/* .line 12 */
} // :goto_0
v5 = (( e.f.e.l ) v4 ).b ( ); // invoke-virtual {v4}, Le/f/e/l;->b()F
/* float-to-int v5, v5 */
/* sub-int/2addr v5, p1 */
/* if-gez v5, :cond_1 */
int v5 = 0; // const/4 v5, 0x0
/* .line 13 */
} // :cond_1
/* new-instance p1, Le/f/e/l; */
v4 = (( e.f.e.l ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/e/l;->a()F
/* int-to-float v5, v5 */
/* invoke-direct {p1, v4, v5}, Le/f/e/l;-><init>(FF)V */
if ( p3 != null) { // if-eqz p3, :cond_2
/* move-object v8, p1 */
} // :cond_2
/* move-object v10, p1 */
/* move-object v8, v0 */
} // :cond_3
/* move-object v8, v0 */
} // :goto_1
/* move-object v10, v2 */
} // :goto_2
/* if-lez p2, :cond_7 */
if ( p3 != null) { // if-eqz p3, :cond_4
/* .line 14 */
p1 = this.c;
} // :cond_4
p1 = this.e;
/* .line 15 */
} // :goto_3
v0 = (( e.f.e.l ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/e/l;->b()F
/* float-to-int v0, v0 */
/* add-int/2addr v0, p2 */
/* .line 16 */
p2 = this.a;
p2 = (( e.f.e.o.b ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/e/o/b;->d()I
/* if-lt v0, p2, :cond_5 */
/* .line 17 */
p2 = this.a;
p2 = (( e.f.e.o.b ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/e/o/b;->d()I
/* add-int/lit8 v0, p2, -0x1 */
/* .line 18 */
} // :cond_5
/* new-instance p2, Le/f/e/l; */
p1 = (( e.f.e.l ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/e/l;->a()F
/* int-to-float v0, v0 */
/* invoke-direct {p2, p1, v0}, Le/f/e/l;-><init>(FF)V */
if ( p3 != null) { // if-eqz p3, :cond_6
/* move-object v9, p2 */
} // :cond_6
/* move-object v11, p2 */
/* move-object v9, v1 */
} // :cond_7
/* move-object v9, v1 */
} // :goto_4
/* move-object v11, v3 */
/* .line 19 */
} // :goto_5
(( e.f.e.s.d.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/s/d/c;->a()V
/* .line 20 */
/* new-instance p1, Le/f/e/s/d/c; */
v7 = this.a;
/* move-object v6, p1 */
/* invoke-direct/range {v6 ..v11}, Le/f/e/s/d/c;-><init>(Le/f/e/o/b;Le/f/e/l;Le/f/e/l;Le/f/e/l;Le/f/e/l;)V */
} // .end method
public final void a ( ) {
/* .locals 3 */
/* .line 21 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 22 */
/* new-instance v0, Le/f/e/l; */
v1 = this.d;
v1 = (( e.f.e.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/e/l;->b()F
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v2, v1}, Le/f/e/l;-><init>(FF)V */
this.b = v0;
/* .line 23 */
/* new-instance v0, Le/f/e/l; */
v1 = this.e;
v1 = (( e.f.e.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/e/l;->b()F
/* invoke-direct {v0, v2, v1}, Le/f/e/l;-><init>(FF)V */
this.c = v0;
/* .line 24 */
} // :cond_0
v0 = this.d;
/* if-nez v0, :cond_1 */
/* .line 25 */
/* new-instance v0, Le/f/e/l; */
v1 = this.a;
v1 = (( e.f.e.o.b ) v1 ).f ( ); // invoke-virtual {v1}, Le/f/e/o/b;->f()I
/* add-int/lit8 v1, v1, -0x1 */
/* int-to-float v1, v1 */
v2 = this.b;
v2 = (( e.f.e.l ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/e/l;->b()F
/* invoke-direct {v0, v1, v2}, Le/f/e/l;-><init>(FF)V */
this.d = v0;
/* .line 26 */
/* new-instance v0, Le/f/e/l; */
v1 = this.a;
v1 = (( e.f.e.o.b ) v1 ).f ( ); // invoke-virtual {v1}, Le/f/e/o/b;->f()I
/* add-int/lit8 v1, v1, -0x1 */
/* int-to-float v1, v1 */
v2 = this.c;
v2 = (( e.f.e.l ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/e/l;->b()F
/* invoke-direct {v0, v1, v2}, Le/f/e/l;-><init>(FF)V */
this.e = v0;
/* .line 27 */
} // :cond_1
} // :goto_0
v0 = this.b;
v0 = (( e.f.e.l ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/l;->a()F
v1 = this.c;
v1 = (( e.f.e.l ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/e/l;->a()F
v0 = java.lang.Math .min ( v0,v1 );
/* float-to-int v0, v0 */
/* iput v0, p0, Le/f/e/s/d/c;->f:I */
/* .line 28 */
v0 = this.d;
v0 = (( e.f.e.l ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/l;->a()F
v1 = this.e;
v1 = (( e.f.e.l ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/e/l;->a()F
v0 = java.lang.Math .max ( v0,v1 );
/* float-to-int v0, v0 */
/* iput v0, p0, Le/f/e/s/d/c;->g:I */
/* .line 29 */
v0 = this.b;
v0 = (( e.f.e.l ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/l;->b()F
v1 = this.d;
v1 = (( e.f.e.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/e/l;->b()F
v0 = java.lang.Math .min ( v0,v1 );
/* float-to-int v0, v0 */
/* iput v0, p0, Le/f/e/s/d/c;->h:I */
/* .line 30 */
v0 = this.c;
v0 = (( e.f.e.l ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/l;->b()F
v1 = this.e;
v1 = (( e.f.e.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/e/l;->b()F
v0 = java.lang.Math .max ( v0,v1 );
/* float-to-int v0, v0 */
/* iput v0, p0, Le/f/e/s/d/c;->i:I */
return;
} // .end method
public final void a ( Object p0, Object p1, Object p2, Object p3, Object p4 ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* .line 2 */
this.b = p2;
/* .line 3 */
this.c = p3;
/* .line 4 */
this.d = p4;
/* .line 5 */
this.e = p5;
/* .line 6 */
(( e.f.e.s.d.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/s/d/c;->a()V
return;
} // .end method
public e.f.e.l b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public e.f.e.l c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/e/s/d/c;->g:I */
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/e/s/d/c;->i:I */
} // .end method
public Integer f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/e/s/d/c;->f:I */
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/e/s/d/c;->h:I */
} // .end method
public e.f.e.l h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public e.f.e.l i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
