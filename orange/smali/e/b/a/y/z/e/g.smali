.class public Le/b/a/y/z/e/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/t;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/t<",
        "Ljava/nio/ByteBuffer;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/z/e/x;


# direct methods
.method public constructor <init>(Le/b/a/y/z/e/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/e/g;->a:Le/b/a/y/z/e/x;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/g;->a(Ljava/nio/ByteBuffer;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/nio/ByteBuffer;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
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

    .line 4
    iget-object v0, p0, Le/b/a/y/z/e/g;->a:Le/b/a/y/z/e/x;

    invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/e/x;->a(Ljava/nio/ByteBuffer;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Le/b/a/y/r;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/g;->a(Ljava/nio/ByteBuffer;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/nio/ByteBuffer;Le/b/a/y/r;)Z
    .locals 0

    .line 3
    iget-object p2, p0, Le/b/a/y/z/e/g;->a:Le/b/a/y/z/e/x;

    invoke-virtual {p2, p1}, Le/b/a/y/z/e/x;->a(Ljava/nio/ByteBuffer;)Z

    move-result p1

    return p1
.end method
