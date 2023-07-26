public class inal implements com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.InputStream a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = 	 (( e.b.a.y.z.e.m ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/z/e/m;->b()S
	 /* shl-int/lit8 v0, v0, 0x8 */
	 v1 = 	 (( e.b.a.y.z.e.m ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/z/e/m;->b()S
	 /* or-int/2addr v0, v1 */
} // .end method
public Integer a ( Object[] p0, Integer p1 ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-ge v0, p2, :cond_0 */
/* .line 2 */
v1 = this.a;
/* sub-int v3, p2, v0 */
/* .line 3 */
v1 = (( java.io.InputStream ) v1 ).read ( p1, v0, v3 ); // invoke-virtual {v1, p1, v0, v3}, Ljava/io/InputStream;->read([BII)I
/* if-eq v1, v2, :cond_0 */
/* add-int/2addr v0, v1 */
} // :cond_0
/* if-nez v0, :cond_2 */
/* if-eq v1, v2, :cond_1 */
/* .line 4 */
} // :cond_1
/* new-instance p1, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException; */
/* invoke-direct {p1}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V */
/* throw p1 */
} // :cond_2
} // :goto_1
} // .end method
public Object b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
v0 = (( java.io.InputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->read()I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* int-to-short v0, v0 */
/* .line 2 */
} // :cond_0
/* new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException; */
/* invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V */
/* throw v0 */
} // .end method
public Long skip ( Long p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
/* if-gez v2, :cond_0 */
/* return-wide v0 */
} // :cond_0
/* move-wide v2, p1 */
} // :goto_0
/* cmp-long v4, v2, v0 */
/* if-lez v4, :cond_3 */
/* .line 1 */
v4 = this.a;
(( java.io.InputStream ) v4 ).skip ( v2, v3 ); // invoke-virtual {v4, v2, v3}, Ljava/io/InputStream;->skip(J)J
/* move-result-wide v4 */
/* cmp-long v6, v4, v0 */
/* if-lez v6, :cond_1 */
} // :goto_1
/* sub-long/2addr v2, v4 */
/* .line 2 */
} // :cond_1
v4 = this.a;
v4 = (( java.io.InputStream ) v4 ).read ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->read()I
int v5 = -1; // const/4 v5, -0x1
/* if-ne v4, v5, :cond_2 */
} // :cond_2
/* const-wide/16 v4, 0x1 */
} // :cond_3
} // :goto_2
/* sub-long/2addr p1, v2 */
/* return-wide p1 */
} // .end method
