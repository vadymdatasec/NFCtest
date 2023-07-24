.class public abstract Le/b/a/y/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/List;Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;",
            "Le/b/a/y/x/f1/b;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    new-instance v0, Le/b/a/y/j;

    invoke-direct {v0, p1, p2}, Le/b/a/y/j;-><init>(Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)V

    invoke-static {p0, v0}, Le/b/a/y/m;->a(Ljava/util/List;Le/b/a/y/k;)I

    move-result p0

    return p0
.end method

.method public static a(Ljava/util/List;Le/b/a/y/k;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Le/b/a/y/k;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-ge v1, v0, :cond_1

    .line 15
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/load/ImageHeaderParser;

    .line 16
    invoke-interface {p1, v3}, Le/b/a/y/k;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)I

    move-result v3

    if-eq v3, v2, :cond_0

    return v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public static a(Ljava/util/List;Ljava/io/InputStream;Le/b/a/y/x/f1/b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Ljava/io/InputStream;",
            "Le/b/a/y/x/f1/b;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, -0x1

    return p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_1

    .line 10
    new-instance v0, Le/b/a/y/z/e/m0;

    invoke-direct {v0, p1, p2}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V

    move-object p1, v0

    :cond_1
    const/high16 v0, 0x500000

    .line 11
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 12
    new-instance v0, Le/b/a/y/i;

    invoke-direct {v0, p1, p2}, Le/b/a/y/i;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V

    invoke-static {p0, v0}, Le/b/a/y/m;->a(Ljava/util/List;Le/b/a/y/k;)I

    move-result p0

    return p0
.end method

.method public static a(Ljava/util/List;Ljava/nio/ByteBuffer;Le/b/a/y/x/f1/b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Ljava/nio/ByteBuffer;",
            "Le/b/a/y/x/f1/b;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, -0x1

    return p0

    .line 8
    :cond_0
    new-instance v0, Le/b/a/y/h;

    invoke-direct {v0, p1, p2}, Le/b/a/y/h;-><init>(Ljava/nio/ByteBuffer;Le/b/a/y/x/f1/b;)V

    invoke-static {p0, v0}, Le/b/a/y/m;->a(Ljava/util/List;Le/b/a/y/k;)I

    move-result p0

    return p0
.end method

.method public static a(Ljava/util/List;Le/b/a/y/l;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Le/b/a/y/l;",
            ")",
            "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bumptech/glide/load/ImageHeaderParser;

    .line 5
    invoke-interface {p1, v2}, Le/b/a/y/l;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v2

    .line 6
    sget-object v3, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v2, v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_1
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0
.end method

.method public static a(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Le/b/a/y/f;

    invoke-direct {v0, p1}, Le/b/a/y/f;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-static {p0, v0}, Le/b/a/y/m;->a(Ljava/util/List;Le/b/a/y/l;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/util/List;Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;",
            "Le/b/a/y/x/f1/b;",
            ")",
            "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    new-instance v0, Le/b/a/y/g;

    invoke-direct {v0, p1, p2}, Le/b/a/y/g;-><init>(Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)V

    invoke-static {p0, v0}, Le/b/a/y/m;->a(Ljava/util/List;Le/b/a/y/l;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/util/List;Ljava/io/InputStream;Le/b/a/y/x/f1/b;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Ljava/io/InputStream;",
            "Le/b/a/y/x/f1/b;",
            ")",
            "Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1
    sget-object p0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p0

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Le/b/a/y/z/e/m0;

    invoke-direct {v0, p1, p2}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V

    move-object p1, v0

    :cond_1
    const/high16 p2, 0x500000

    .line 4
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->mark(I)V

    .line 5
    new-instance p2, Le/b/a/y/e;

    invoke-direct {p2, p1}, Le/b/a/y/e;-><init>(Ljava/io/InputStream;)V

    invoke-static {p0, p2}, Le/b/a/y/m;->a(Ljava/util/List;Le/b/a/y/l;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p0

    return-object p0
.end method
