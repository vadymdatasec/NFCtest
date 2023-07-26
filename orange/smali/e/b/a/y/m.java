public abstract class e.b.a.y.m {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( java.util.List p0, com.bumptech.glide.load.data.ParcelFileDescriptorRewinder p1, Object p2 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
		 /* ">;", */
		 /* "Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;", */
		 /* "Le/b/a/y/x/f1/b;", */
		 /* ")I" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 13 */
/* new-instance v0, Le/b/a/y/j; */
/* invoke-direct {v0, p1, p2}, Le/b/a/y/j;-><init>(Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)V */
p0 = e.b.a.y.m .a ( p0,v0 );
} // .end method
public static Integer a ( java.util.List p0, Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/k;", */
/* ")I" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = /* .line 14 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-ge v1, v0, :cond_1 */
/* .line 15 */
/* check-cast v3, Lcom/bumptech/glide/load/ImageHeaderParser; */
v3 = /* .line 16 */
/* if-eq v3, v2, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public static Integer a ( java.util.List p0, java.io.InputStream p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Ljava/io/InputStream;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")I" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
int p0 = -1; // const/4 p0, -0x1
/* .line 9 */
} // :cond_0
v0 = (( java.io.InputStream ) p1 ).markSupported ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z
/* if-nez v0, :cond_1 */
/* .line 10 */
/* new-instance v0, Le/b/a/y/z/e/m0; */
/* invoke-direct {v0, p1, p2}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V */
/* move-object p1, v0 */
} // :cond_1
/* const/high16 v0, 0x500000 */
/* .line 11 */
(( java.io.InputStream ) p1 ).mark ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V
/* .line 12 */
/* new-instance v0, Le/b/a/y/i; */
/* invoke-direct {v0, p1, p2}, Le/b/a/y/i;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V */
p0 = e.b.a.y.m .a ( p0,v0 );
} // .end method
public static Integer a ( java.util.List p0, java.nio.ByteBuffer p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Ljava/nio/ByteBuffer;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")I" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
int p0 = -1; // const/4 p0, -0x1
/* .line 8 */
} // :cond_0
/* new-instance v0, Le/b/a/y/h; */
/* invoke-direct {v0, p1, p2}, Le/b/a/y/h;-><init>(Ljava/nio/ByteBuffer;Le/b/a/y/x/f1/b;)V */
p0 = e.b.a.y.m .a ( p0,v0 );
} // .end method
public static com.bumptech.glide.load.ImageHeaderParser$ImageType a ( java.util.List p0, Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/l;", */
/* ")", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = /* .line 3 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 4 */
/* check-cast v2, Lcom/bumptech/glide/load/ImageHeaderParser; */
/* .line 5 */
/* .line 6 */
v3 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
/* if-eq v2, v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 7 */
} // :cond_1
p0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
} // .end method
public static com.bumptech.glide.load.ImageHeaderParser$ImageType a ( java.util.List p0, java.nio.ByteBuffer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Ljava/nio/ByteBuffer;", */
/* ")", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
/* .line 1 */
p0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
/* .line 2 */
} // :cond_0
/* new-instance v0, Le/b/a/y/f; */
/* invoke-direct {v0, p1}, Le/b/a/y/f;-><init>(Ljava/nio/ByteBuffer;)V */
e.b.a.y.m .a ( p0,v0 );
} // .end method
public static com.bumptech.glide.load.ImageHeaderParser$ImageType b ( java.util.List p0, com.bumptech.glide.load.data.ParcelFileDescriptorRewinder p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 6 */
/* new-instance v0, Le/b/a/y/g; */
/* invoke-direct {v0, p1, p2}, Le/b/a/y/g;-><init>(Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)V */
e.b.a.y.m .a ( p0,v0 );
} // .end method
public static com.bumptech.glide.load.ImageHeaderParser$ImageType b ( java.util.List p0, java.io.InputStream p1, Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Ljava/io/InputStream;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
/* .line 1 */
p0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
/* .line 2 */
} // :cond_0
v0 = (( java.io.InputStream ) p1 ).markSupported ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z
/* if-nez v0, :cond_1 */
/* .line 3 */
/* new-instance v0, Le/b/a/y/z/e/m0; */
/* invoke-direct {v0, p1, p2}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V */
/* move-object p1, v0 */
} // :cond_1
/* const/high16 p2, 0x500000 */
/* .line 4 */
(( java.io.InputStream ) p1 ).mark ( p2 ); // invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V
/* .line 5 */
/* new-instance p2, Le/b/a/y/e; */
/* invoke-direct {p2, p1}, Le/b/a/y/e;-><init>(Ljava/io/InputStream;)V */
e.b.a.y.m .a ( p0,p2 );
} // .end method
