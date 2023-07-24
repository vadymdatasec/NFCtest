.class public final Le/b/a/y/z/e/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/z/e/h0;


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/x/f1/b;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Ljava/util/List;Le/b/a/y/x/f1/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Le/b/a/y/x/f1/b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/e/e0;->a:Ljava/nio/ByteBuffer;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/e/e0;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Le/b/a/y/z/e/e0;->c:Le/b/a/y/x/f1/b;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/b/a/y/z/e/e0;->d()Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public a()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/z/e/e0;->b:Ljava/util/List;

    iget-object v1, p0, Le/b/a/y/z/e/e0;->a:Ljava/nio/ByteBuffer;

    invoke-static {v1}, Le/b/a/e0/c;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v0, v1}, Le/b/a/y/m;->a(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/e0;->b:Ljava/util/List;

    iget-object v1, p0, Le/b/a/y/z/e/e0;->a:Ljava/nio/ByteBuffer;

    .line 2
    invoke-static {v1}, Le/b/a/e0/c;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Le/b/a/y/z/e/e0;->c:Le/b/a/y/x/f1/b;

    .line 3
    invoke-static {v0, v1, v2}, Le/b/a/y/m;->a(Ljava/util/List;Ljava/nio/ByteBuffer;Le/b/a/y/x/f1/b;)I

    move-result v0

    return v0
.end method

.method public final d()Ljava/io/InputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/e0;->a:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Le/b/a/e0/c;->b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Le/b/a/e0/c;->d(Ljava/nio/ByteBuffer;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
