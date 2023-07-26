public class inal implements l.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final l.h b;
	 public Integer c;
	 public Object d;
	 public Integer e;
	 public Integer f;
	 public Object g;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public l.a0 a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public Long b ( Object p0, Long p1 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
} // :goto_0
/* iget v0, p0, Lk/e1/k/y;->f:I */
/* const-wide/16 v1, -0x1 */
/* if-nez v0, :cond_1 */
/* .line 2 */
v0 = this.b;
/* iget-short v3, p0, Lk/e1/k/y;->g:S */
/* int-to-long v3, v3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-short v0, p0, Lk/e1/k/y;->g:S */
/* .line 4 */
/* iget-byte v0, p0, Lk/e1/k/y;->d:B */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* return-wide v1 */
	 /* .line 5 */
} // :cond_0
(( k.e1.k.y ) p0 ).c ( ); // invoke-virtual {p0}, Lk/e1/k/y;->c()V
/* .line 6 */
} // :cond_1
v3 = this.b;
/* int-to-long v4, v0 */
java.lang.Math .min ( p2,p3,v4,v5 );
/* move-result-wide p2 */
/* move-result-wide p1 */
/* cmp-long p3, p1, v1 */
/* if-nez p3, :cond_2 */
/* return-wide v1 */
/* .line 7 */
} // :cond_2
/* iget p3, p0, Lk/e1/k/y;->f:I */
/* int-to-long v0, p3 */
/* sub-long/2addr v0, p1 */
/* long-to-int p3, v0 */
/* iput p3, p0, Lk/e1/k/y;->f:I */
/* return-wide p1 */
} // .end method
public final void c ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lk/e1/k/y;->e:I */
/* .line 2 */
v1 = this.b;
v1 = k.e1.k.a0 .a ( v1 );
/* iput v1, p0, Lk/e1/k/y;->f:I */
/* iput v1, p0, Lk/e1/k/y;->c:I */
/* .line 3 */
v1 = v1 = this.b;
/* and-int/lit16 v1, v1, 0xff */
/* int-to-byte v1, v1 */
/* .line 4 */
v2 = v2 = this.b;
/* and-int/lit16 v2, v2, 0xff */
/* int-to-byte v2, v2 */
/* iput-byte v2, p0, Lk/e1/k/y;->d:B */
/* .line 5 */
v2 = k.e1.k.a0.f;
v3 = java.util.logging.Level.FINE;
v2 = (( java.util.logging.Logger ) v2 ).isLoggable ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = k.e1.k.a0.f;
/* iget v4, p0, Lk/e1/k/y;->e:I */
/* iget v5, p0, Lk/e1/k/y;->c:I */
/* iget-byte v6, p0, Lk/e1/k/y;->d:B */
k.e1.k.g .a ( v3,v4,v5,v1,v6 );
(( java.util.logging.Logger ) v2 ).fine ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V
/* .line 6 */
} // :cond_0
v2 = v2 = this.b;
/* const v4, 0x7fffffff */
/* and-int/2addr v2, v4 */
/* iput v2, p0, Lk/e1/k/y;->e:I */
/* const/16 v4, 0x9 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* if-ne v1, v4, :cond_2 */
/* if-ne v2, v0, :cond_1 */
return;
} // :cond_1
/* new-array v0, v6, [Ljava/lang/Object; */
final String v1 = "TYPE_CONTINUATION streamId changed"; // const-string v1, "TYPE_CONTINUATION streamId changed"
/* .line 7 */
k.e1.k.g .b ( v1,v0 );
/* throw v5 */
} // :cond_2
/* new-array v0, v3, [Ljava/lang/Object; */
/* .line 8 */
java.lang.Byte .valueOf ( v1 );
/* aput-object v1, v0, v6 */
final String v1 = "%s != TYPE_CONTINUATION"; // const-string v1, "%s != TYPE_CONTINUATION"
k.e1.k.g .b ( v1,v0 );
/* throw v5 */
} // .end method
public void close ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
return;
} // .end method
