.class public final Le/b/a/y/z/e/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "Landroid/graphics/ImageDecoder$Source;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/x/f1/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/x/f1/h;

    invoke-direct {v0}, Le/b/a/y/x/f1/h;-><init>()V

    iput-object v0, p0, Le/b/a/y/z/e/d;->a:Le/b/a/y/x/f1/g;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/ImageDecoder$Source;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/ImageDecoder$Source;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    new-instance v0, Le/b/a/y/z/b;

    invoke-direct {v0, p2, p3, p4}, Le/b/a/y/z/b;-><init>(IILe/b/a/y/r;)V

    .line 4
    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p4, "BitmapImageDecoder"

    const/4 v0, 0x2

    .line 5
    invoke-static {p4, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Decoded ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] for ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 9
    invoke-static {p4, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    :cond_0
    new-instance p2, Le/b/a/y/z/e/e;

    iget-object p3, p0, Le/b/a/y/z/e/d;->a:Le/b/a/y/x/f1/g;

    invoke-direct {p2, p1, p3}, Le/b/a/y/z/e/e;-><init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V

    return-object p2
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/d;->a(Landroid/graphics/ImageDecoder$Source;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/graphics/ImageDecoder$Source;Le/b/a/y/r;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Le/b/a/y/r;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/d;->a(Landroid/graphics/ImageDecoder$Source;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
