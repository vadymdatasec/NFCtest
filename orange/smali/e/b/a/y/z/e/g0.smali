.class public final Le/b/a/y/z/e/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/z/e/h0;


# instance fields
.field public final a:Le/b/a/y/x/f1/b;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;


# direct methods
.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/List;Le/b/a/y/x/f1/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelFileDescriptor;",
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
    invoke-static {p3}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, Le/b/a/y/x/f1/b;

    iput-object p3, p0, Le/b/a/y/z/e/g0;->a:Le/b/a/y/x/f1/b;

    .line 3
    invoke-static {p2}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Le/b/a/y/z/e/g0;->b:Ljava/util/List;

    .line 4
    new-instance p2, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;

    invoke-direct {p2, p1}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, Le/b/a/y/z/e/g0;->c:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/z/e/g0;->c:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;

    .line 2
    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public a()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/b/a/y/z/e/g0;->b:Ljava/util/List;

    iget-object v1, p0, Le/b/a/y/z/e/g0;->c:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;

    iget-object v2, p0, Le/b/a/y/z/e/g0;->a:Le/b/a/y/x/f1/b;

    invoke-static {v0, v1, v2}, Le/b/a/y/m;->b(Ljava/util/List;Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

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
    iget-object v0, p0, Le/b/a/y/z/e/g0;->b:Ljava/util/List;

    iget-object v1, p0, Le/b/a/y/z/e/g0;->c:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;

    iget-object v2, p0, Le/b/a/y/z/e/g0;->a:Le/b/a/y/x/f1/b;

    invoke-static {v0, v1, v2}, Le/b/a/y/m;->a(Ljava/util/List;Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;Le/b/a/y/x/f1/b;)I

    move-result v0

    return v0
.end method
