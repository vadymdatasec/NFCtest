public class e.b.a.w.h implements java.io.Closeable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.InputStream b;
	 public final java.nio.charset.Charset c;
	 public d;
	 public Integer e;
	 public Integer f;
	 /* # direct methods */
	 public e.b.a.w.h ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 if ( p3 != null) { // if-eqz p3, :cond_2
				 /* if-ltz p2, :cond_1 */
				 /* .line 3 */
				 v0 = e.b.a.w.i.a;
				 v0 = 				 (( java.nio.charset.Charset ) p3 ).equals ( v0 ); // invoke-virtual {p3, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 4 */
					 this.b = p1;
					 /* .line 5 */
					 this.c = p3;
					 /* .line 6 */
					 /* new-array p1, p2, [B */
					 this.d = p1;
					 return;
					 /* .line 7 */
				 } // :cond_0
				 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
				 final String p2 = "Unsupported encoding"; // const-string p2, "Unsupported encoding"
				 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
				 /* throw p1 */
				 /* .line 8 */
			 } // :cond_1
			 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
			 final String p2 = "capacity <= 0"; // const-string p2, "capacity <= 0"
			 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 /* throw p1 */
		 } // :cond_2
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 9 */
		 /* throw p1 */
	 } // .end method
	 public e.b.a.w.h ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x2000 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0, p2}, Le/b/a/w/h;-><init>(Ljava/io/InputStream;ILjava/nio/charset/Charset;)V */
		 return;
	 } // .end method
	 public static java.nio.charset.Charset a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.c;
	 } // .end method
	 /* # virtual methods */
	 public final void c ( ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.b;
	 v1 = this.d;
	 /* array-length v2, v1 */
	 int v3 = 0; // const/4 v3, 0x0
	 v0 = 	 (( java.io.InputStream ) v0 ).read ( v1, v3, v2 ); // invoke-virtual {v0, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-eq v0, v1, :cond_0 */
	 /* .line 2 */
	 /* iput v3, p0, Le/b/a/w/h;->e:I */
	 /* .line 3 */
	 /* iput v0, p0, Le/b/a/w/h;->f:I */
	 return;
	 /* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/io/EOFException; */
/* invoke-direct {v0}, Ljava/io/EOFException;-><init>()V */
/* throw v0 */
} // .end method
public void close ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 3 */
	 this.d = v1;
	 /* .line 4 */
	 v1 = this.b;
	 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
	 /* .line 5 */
} // :cond_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public Boolean l ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/b/a/w/h;->f:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.String m ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 3 */
/* iget v1, p0, Le/b/a/w/h;->e:I */
/* iget v2, p0, Le/b/a/w/h;->f:I */
/* if-lt v1, v2, :cond_0 */
/* .line 4 */
(( e.b.a.w.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/w/h;->c()V
/* .line 5 */
} // :cond_0
/* iget v1, p0, Le/b/a/w/h;->e:I */
} // :goto_0
/* iget v2, p0, Le/b/a/w/h;->f:I */
/* const/16 v3, 0xa */
/* if-eq v1, v2, :cond_3 */
/* .line 6 */
v2 = this.d;
/* aget-byte v2, v2, v1 */
/* if-ne v2, v3, :cond_2 */
/* .line 7 */
/* iget v2, p0, Le/b/a/w/h;->e:I */
/* if-eq v1, v2, :cond_1 */
v2 = this.d;
/* add-int/lit8 v3, v1, -0x1 */
/* aget-byte v2, v2, v3 */
/* const/16 v4, 0xd */
/* if-ne v2, v4, :cond_1 */
} // :cond_1
/* move v3, v1 */
/* .line 8 */
} // :goto_1
/* new-instance v2, Ljava/lang/String; */
v4 = this.d;
/* iget v5, p0, Le/b/a/w/h;->e:I */
/* iget v6, p0, Le/b/a/w/h;->e:I */
/* sub-int/2addr v3, v6 */
v6 = this.c;
(( java.nio.charset.Charset ) v6 ).name ( ); // invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
/* invoke-direct {v2, v4, v5, v3, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 9 */
/* iput v1, p0, Le/b/a/w/h;->e:I */
/* .line 10 */
/* monitor-exit v0 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 11 */
} // :cond_3
/* new-instance v1, Le/b/a/w/g; */
/* iget v2, p0, Le/b/a/w/h;->f:I */
/* iget v4, p0, Le/b/a/w/h;->e:I */
/* sub-int/2addr v2, v4 */
/* add-int/lit8 v2, v2, 0x50 */
/* invoke-direct {v1, p0, v2}, Le/b/a/w/g;-><init>(Le/b/a/w/h;I)V */
/* .line 12 */
} // :cond_4
v2 = this.d;
/* iget v4, p0, Le/b/a/w/h;->e:I */
/* iget v5, p0, Le/b/a/w/h;->f:I */
/* iget v6, p0, Le/b/a/w/h;->e:I */
/* sub-int/2addr v5, v6 */
(( java.io.ByteArrayOutputStream ) v1 ).write ( v2, v4, v5 ); // invoke-virtual {v1, v2, v4, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
int v2 = -1; // const/4 v2, -0x1
/* .line 13 */
/* iput v2, p0, Le/b/a/w/h;->f:I */
/* .line 14 */
(( e.b.a.w.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/b/a/w/h;->c()V
/* .line 15 */
/* iget v2, p0, Le/b/a/w/h;->e:I */
} // :goto_2
/* iget v4, p0, Le/b/a/w/h;->f:I */
/* if-eq v2, v4, :cond_4 */
/* .line 16 */
v4 = this.d;
/* aget-byte v4, v4, v2 */
/* if-ne v4, v3, :cond_6 */
/* .line 17 */
/* iget v3, p0, Le/b/a/w/h;->e:I */
/* if-eq v2, v3, :cond_5 */
/* .line 18 */
v3 = this.d;
/* iget v4, p0, Le/b/a/w/h;->e:I */
/* iget v5, p0, Le/b/a/w/h;->e:I */
/* sub-int v5, v2, v5 */
(( java.io.ByteArrayOutputStream ) v1 ).write ( v3, v4, v5 ); // invoke-virtual {v1, v3, v4, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
} // :cond_5
/* add-int/lit8 v2, v2, 0x1 */
/* .line 19 */
/* iput v2, p0, Le/b/a/w/h;->e:I */
/* .line 20 */
(( e.b.a.w.g ) v1 ).toString ( ); // invoke-virtual {v1}, Le/b/a/w/g;->toString()Ljava/lang/String;
/* monitor-exit v0 */
} // :cond_6
/* add-int/lit8 v2, v2, 0x1 */
/* .line 21 */
} // :cond_7
/* new-instance v1, Ljava/io/IOException; */
final String v2 = "LineReader is closed"; // const-string v2, "LineReader is closed"
/* invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :catchall_0 */
/* move-exception v1 */
/* .line 22 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
