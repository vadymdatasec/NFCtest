.class public Le/b/a/y/z/i/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/u<",
        "Le/b/a/y/z/i/f;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/r;)Le/b/a/y/c;
    .locals 0

    .line 2
    sget-object p1, Le/b/a/y/c;->b:Le/b/a/y/c;

    return-object p1
.end method

.method public a(Le/b/a/y/x/y0;Ljava/io/File;Le/b/a/y/r;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "Le/b/a/y/z/i/f;",
            ">;",
            "Ljava/io/File;",
            "Le/b/a/y/r;",
            ")Z"
        }
    .end annotation

    .line 3
    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/z/i/f;

    .line 4
    :try_start_0
    invoke-virtual {p1}, Le/b/a/y/z/i/f;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1, p2}, Le/b/a/e0/c;->a(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x5

    const-string p3, "GifEncoder"

    .line 5
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Failed to encode GIF drawable data"

    .line 6
    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/File;Le/b/a/y/r;)Z
    .locals 0

    .line 1
    check-cast p1, Le/b/a/y/x/y0;

    invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/z/i/g;->a(Le/b/a/y/x/y0;Ljava/io/File;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
