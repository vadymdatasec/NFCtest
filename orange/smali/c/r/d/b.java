public class c.r.d.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Long a;
	 public c.r.d.b b;
	 /* # direct methods */
	 public c.r.d.b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 2 */
		 /* iput-wide v0, p0, Lc/r/d/b;->a:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 /* new-instance v0, Lc/r/d/b; */
		 /* invoke-direct {v0}, Lc/r/d/b;-><init>()V */
		 this.b = v0;
	 } // :cond_0
	 return;
} // .end method
public void a ( Integer p0 ) {
	 /* .locals 4 */
	 /* const/16 v0, 0x40 */
	 /* if-lt p1, v0, :cond_0 */
	 /* .line 3 */
	 v1 = this.b;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* sub-int/2addr p1, v0 */
		 /* .line 4 */
		 (( c.r.d.b ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/b;->a(I)V
		 /* .line 5 */
	 } // :cond_0
	 /* iget-wide v0, p0, Lc/r/d/b;->a:J */
	 /* const-wide/16 v2, 0x1 */
	 /* shl-long/2addr v2, p1 */
	 /* not-long v2, v2 */
	 /* and-long/2addr v0, v2 */
	 /* iput-wide v0, p0, Lc/r/d/b;->a:J */
} // :cond_1
} // :goto_0
return;
} // .end method
public void a ( Integer p0, Boolean p1 ) {
/* .locals 10 */
/* const/16 v0, 0x40 */
/* if-lt p1, v0, :cond_0 */
/* .line 6 */
(( c.r.d.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/b;->a()V
/* .line 7 */
v1 = this.b;
/* sub-int/2addr p1, v0 */
(( c.r.d.b ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lc/r/d/b;->a(IZ)V
/* .line 8 */
} // :cond_0
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
/* const-wide/high16 v2, -0x8000000000000000L */
/* and-long/2addr v0, v2 */
/* const-wide/16 v2, 0x0 */
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* cmp-long v6, v0, v2 */
if ( v6 != null) { // if-eqz v6, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* const-wide/16 v1, 0x1 */
/* shl-long v6, v1, p1 */
/* sub-long/2addr v6, v1 */
/* .line 9 */
/* iget-wide v1, p0, Lc/r/d/b;->a:J */
/* and-long v8, v1, v6 */
/* not-long v6, v6 */
/* and-long/2addr v1, v6 */
/* shl-long/2addr v1, v4 */
/* or-long/2addr v1, v8 */
/* .line 10 */
/* iput-wide v1, p0, Lc/r/d/b;->a:J */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 11 */
(( c.r.d.b ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/b;->e(I)V
/* .line 12 */
} // :cond_2
(( c.r.d.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/b;->a(I)V
} // :goto_1
/* if-nez v0, :cond_3 */
/* .line 13 */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 14 */
} // :cond_3
(( c.r.d.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/b;->a()V
/* .line 15 */
p1 = this.b;
(( c.r.d.b ) p1 ).a ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lc/r/d/b;->a(IZ)V
} // :cond_4
} // :goto_2
return;
} // .end method
public Integer b ( Integer p0 ) {
/* .locals 6 */
/* .line 4 */
v0 = this.b;
/* const/16 v1, 0x40 */
/* const-wide/16 v2, 0x1 */
/* if-nez v0, :cond_1 */
/* if-lt p1, v1, :cond_0 */
/* .line 5 */
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
p1 = java.lang.Long .bitCount ( v0,v1 );
/* .line 6 */
} // :cond_0
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
/* shl-long v4, v2, p1 */
/* sub-long/2addr v4, v2 */
/* and-long/2addr v0, v4 */
p1 = java.lang.Long .bitCount ( v0,v1 );
} // :cond_1
/* if-ge p1, v1, :cond_2 */
/* .line 7 */
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
/* shl-long v4, v2, p1 */
/* sub-long/2addr v4, v2 */
/* and-long/2addr v0, v4 */
p1 = java.lang.Long .bitCount ( v0,v1 );
} // :cond_2
/* sub-int/2addr p1, v1 */
/* .line 8 */
p1 = (( c.r.d.b ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/b;->b(I)I
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
v0 = java.lang.Long .bitCount ( v0,v1 );
/* add-int/2addr p1, v0 */
} // .end method
public void b ( ) {
/* .locals 2 */
/* const-wide/16 v0, 0x0 */
/* .line 1 */
/* iput-wide v0, p0, Lc/r/d/b;->a:J */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.r.d.b ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/b;->b()V
} // :cond_0
return;
} // .end method
public Boolean c ( Integer p0 ) {
/* .locals 4 */
/* const/16 v0, 0x40 */
/* if-lt p1, v0, :cond_0 */
/* .line 1 */
(( c.r.d.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/b;->a()V
/* .line 2 */
v1 = this.b;
/* sub-int/2addr p1, v0 */
p1 = (( c.r.d.b ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/b;->c(I)Z
/* .line 3 */
} // :cond_0
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
/* const-wide/16 v2, 0x1 */
/* shl-long/2addr v2, p1 */
/* and-long/2addr v0, v2 */
/* const-wide/16 v2, 0x0 */
/* cmp-long p1, v0, v2 */
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean d ( Integer p0 ) {
/* .locals 11 */
/* const/16 v0, 0x40 */
/* if-lt p1, v0, :cond_0 */
/* .line 1 */
(( c.r.d.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/b;->a()V
/* .line 2 */
v1 = this.b;
/* sub-int/2addr p1, v0 */
p1 = (( c.r.d.b ) v1 ).d ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/b;->d(I)Z
} // :cond_0
/* const-wide/16 v0, 0x1 */
/* shl-long v2, v0, p1 */
/* .line 3 */
/* iget-wide v4, p0, Lc/r/d/b;->a:J */
/* and-long/2addr v4, v2 */
/* const-wide/16 v6, 0x0 */
int p1 = 1; // const/4 p1, 0x1
int v8 = 0; // const/4 v8, 0x0
/* cmp-long v9, v4, v6 */
if ( v9 != null) { // if-eqz v9, :cond_1
int v4 = 1; // const/4 v4, 0x1
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* .line 4 */
} // :goto_0
/* iget-wide v5, p0, Lc/r/d/b;->a:J */
/* not-long v9, v2 */
/* and-long/2addr v5, v9 */
/* iput-wide v5, p0, Lc/r/d/b;->a:J */
/* sub-long/2addr v2, v0 */
/* and-long v0, v5, v2 */
/* not-long v2, v2 */
/* and-long/2addr v2, v5 */
/* .line 5 */
java.lang.Long .rotateRight ( v2,v3,p1 );
/* move-result-wide v2 */
/* or-long/2addr v0, v2 */
/* .line 6 */
/* iput-wide v0, p0, Lc/r/d/b;->a:J */
/* .line 7 */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 8 */
p1 = (( c.r.d.b ) p1 ).c ( v8 ); // invoke-virtual {p1, v8}, Lc/r/d/b;->c(I)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* const/16 p1, 0x3f */
/* .line 9 */
(( c.r.d.b ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/b;->e(I)V
/* .line 10 */
} // :cond_2
p1 = this.b;
(( c.r.d.b ) p1 ).d ( v8 ); // invoke-virtual {p1, v8}, Lc/r/d/b;->d(I)Z
} // :cond_3
} // .end method
public void e ( Integer p0 ) {
/* .locals 4 */
/* const/16 v0, 0x40 */
/* if-lt p1, v0, :cond_0 */
/* .line 1 */
(( c.r.d.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/b;->a()V
/* .line 2 */
v1 = this.b;
/* sub-int/2addr p1, v0 */
(( c.r.d.b ) v1 ).e ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/b;->e(I)V
/* .line 3 */
} // :cond_0
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
/* const-wide/16 v2, 0x1 */
/* shl-long/2addr v2, p1 */
/* or-long/2addr v0, v2 */
/* iput-wide v0, p0, Lc/r/d/b;->a:J */
} // :goto_0
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* iget-wide v0, p0, Lc/r/d/b;->a:J */
java.lang.Long .toBinaryString ( v0,v1 );
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.b;
/* .line 2 */
(( c.r.d.b ) v1 ).toString ( ); // invoke-virtual {v1}, Lc/r/d/b;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "xx"; // const-string v1, "xx"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v1, p0, Lc/r/d/b;->a:J */
java.lang.Long .toBinaryString ( v1,v2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
