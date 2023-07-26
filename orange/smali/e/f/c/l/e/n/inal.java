public class inal extends java.io.InputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 public Integer c;
	 public final e.f.c.l.e.n.j d; //synthetic
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 this.d = p1;
		 /* invoke-direct {p0}, Ljava/io/InputStream;-><init>()V */
		 /* .line 3 */
		 /* iget v0, p2, Le/f/c/l/e/n/g;->a:I */
		 /* add-int/lit8 v0, v0, 0x4 */
		 p1 = 		 e.f.c.l.e.n.j .a ( p1,v0 );
		 /* iput p1, p0, Le/f/c/l/e/n/h;->b:I */
		 /* .line 4 */
		 /* iget p1, p2, Le/f/c/l/e/n/g;->b:I */
		 /* iput p1, p0, Le/f/c/l/e/n/h;->c:I */
		 return;
	 } // .end method
	 public inal ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/f/c/l/e/n/h;-><init>(Le/f/c/l/e/n/j;Le/f/c/l/e/n/g;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer read ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 8 */
	 /* iget v0, p0, Le/f/c/l/e/n/h;->c:I */
	 /* if-nez v0, :cond_0 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 9 */
} // :cond_0
v0 = this.d;
e.f.c.l.e.n.j .a ( v0 );
/* iget v1, p0, Le/f/c/l/e/n/h;->b:I */
/* int-to-long v1, v1 */
(( java.io.RandomAccessFile ) v0 ).seek ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V
/* .line 10 */
v0 = this.d;
e.f.c.l.e.n.j .a ( v0 );
v0 = (( java.io.RandomAccessFile ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I
/* .line 11 */
v1 = this.d;
/* iget v2, p0, Le/f/c/l/e/n/h;->b:I */
/* add-int/lit8 v2, v2, 0x1 */
v1 = e.f.c.l.e.n.j .a ( v1,v2 );
/* iput v1, p0, Le/f/c/l/e/n/h;->b:I */
/* .line 12 */
/* iget v1, p0, Le/f/c/l/e/n/h;->c:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, p0, Le/f/c/l/e/n/h;->c:I */
} // .end method
public Integer read ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "buffer"; // const-string v0, "buffer"
/* .line 1 */
e.f.c.l.e.n.j .a ( p1,v0 );
/* or-int v0, p2, p3 */
/* if-ltz v0, :cond_2 */
/* .line 2 */
/* array-length v0, p1 */
/* sub-int/2addr v0, p2 */
/* if-gt p3, v0, :cond_2 */
/* .line 3 */
/* iget v0, p0, Le/f/c/l/e/n/h;->c:I */
/* if-lez v0, :cond_1 */
/* if-le p3, v0, :cond_0 */
/* move p3, v0 */
/* .line 4 */
} // :cond_0
v0 = this.d;
/* iget v1, p0, Le/f/c/l/e/n/h;->b:I */
e.f.c.l.e.n.j .a ( v0,v1,p1,p2,p3 );
/* .line 5 */
p1 = this.d;
/* iget p2, p0, Le/f/c/l/e/n/h;->b:I */
/* add-int/2addr p2, p3 */
p1 = e.f.c.l.e.n.j .a ( p1,p2 );
/* iput p1, p0, Le/f/c/l/e/n/h;->b:I */
/* .line 6 */
/* iget p1, p0, Le/f/c/l/e/n/h;->c:I */
/* sub-int/2addr p1, p3 */
/* iput p1, p0, Le/f/c/l/e/n/h;->c:I */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
/* .line 7 */
} // :cond_2
/* new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException; */
/* invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V */
/* throw p1 */
} // .end method
