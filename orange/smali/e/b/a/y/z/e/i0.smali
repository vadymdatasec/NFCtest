.class public final Le/b/a/y/z/e/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/z/e/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/z/e/d;

    invoke-direct {v0}, Le/b/a/y/z/e/d;-><init>()V

    iput-object v0, p0, Le/b/a/y/z/e/i0;->a:Le/b/a/y/z/e/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
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
    invoke-static {p1}, Le/b/a/e0/c;->a(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 4
    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    .line 5
    iget-object v0, p0, Le/b/a/y/z/e/i0;->a:Le/b/a/y/z/e/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/e/d;->a(Landroid/graphics/ImageDecoder$Source;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/i0;->a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/io/InputStream;Le/b/a/y/r;)Z
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
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/i0;->a(Ljava/io/InputStream;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
