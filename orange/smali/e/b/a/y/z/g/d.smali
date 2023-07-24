.class public final Le/b/a/y/z/g/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/b/a/y/x/f1/b;


# direct methods
.method public constructor <init>(Ljava/util/List;Le/b/a/y/x/f1/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    iput-object p1, p0, Le/b/a/y/z/g/d;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/g/d;->b:Le/b/a/y/x/f1/b;

    return-void
.end method

.method public static a(Ljava/util/List;Le/b/a/y/x/f1/b;)Le/b/a/y/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Le/b/a/y/x/f1/b;",
            ")",
            "Le/b/a/y/t<",
            "Ljava/nio/ByteBuffer;",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/z/g/b;

    new-instance v1, Le/b/a/y/z/g/d;

    invoke-direct {v1, p0, p1}, Le/b/a/y/z/g/d;-><init>(Ljava/util/List;Le/b/a/y/x/f1/b;)V

    invoke-direct {v0, v1}, Le/b/a/y/z/g/b;-><init>(Le/b/a/y/z/g/d;)V

    return-object v0
.end method

.method public static b(Ljava/util/List;Le/b/a/y/x/f1/b;)Le/b/a/y/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Le/b/a/y/x/f1/b;",
            ")",
            "Le/b/a/y/t<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/b/a/y/z/g/c;

    new-instance v1, Le/b/a/y/z/g/d;

    invoke-direct {v1, p0, p1}, Le/b/a/y/z/g/d;-><init>(Ljava/util/List;Le/b/a/y/x/f1/b;)V

    invoke-direct {v0, v1}, Le/b/a/y/z/g/c;-><init>(Le/b/a/y/z/g/d;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/ImageDecoder$Source;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/ImageDecoder$Source;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    new-instance v0, Le/b/a/y/z/b;

    invoke-direct {v0, p2, p3, p4}, Le/b/a/y/z/b;-><init>(IILe/b/a/y/r;)V

    .line 6
    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->decodeDrawable(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 7
    instance-of p2, p1, Landroid/graphics/drawable/AnimatedImageDrawable;

    if-eqz p2, :cond_0

    .line 8
    new-instance p2, Le/b/a/y/z/g/a;

    check-cast p1, Landroid/graphics/drawable/AnimatedImageDrawable;

    invoke-direct {p2, p1}, Le/b/a/y/z/g/a;-><init>(Landroid/graphics/drawable/AnimatedImageDrawable;)V

    return-object p2

    .line 9
    :cond_0
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Received unexpected drawable type for animated image, failing: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final a(Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;)Z
    .locals 2

    .line 4
    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq p1, v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->ANIMATED_AVIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public a(Ljava/io/InputStream;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/b/a/y/z/g/d;->a:Ljava/util/List;

    iget-object v1, p0, Le/b/a/y/z/g/d;->b:Le/b/a/y/x/f1/b;

    invoke-static {v0, p1, v1}, Le/b/a/y/m;->b(Ljava/util/List;Ljava/io/InputStream;Le/b/a/y/x/f1/b;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/y/z/g/d;->a(Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/nio/ByteBuffer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/z/g/d;->a:Ljava/util/List;

    invoke-static {v0, p1}, Le/b/a/y/m;->a(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/y/z/g/d;->a(Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;)Z

    move-result p1

    return p1
.end method
