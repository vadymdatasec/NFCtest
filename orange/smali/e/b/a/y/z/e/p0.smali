.class public Le/b/a/y/z/e/p0;
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
.field public final a:Le/b/a/y/z/e/x;

.field public final b:Le/b/a/y/x/f1/b;


# direct methods
.method public constructor <init>(Le/b/a/y/z/e/x;Le/b/a/y/x/f1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/z/e/p0;->a:Le/b/a/y/z/e/x;

    .line 3
    iput-object p2, p0, Le/b/a/y/z/e/p0;->b:Le/b/a/y/x/f1/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 8
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

    .line 4
    instance-of v0, p1, Le/b/a/y/z/e/m0;

    if-eqz v0, :cond_0

    .line 5
    check-cast p1, Le/b/a/y/z/e/m0;

    const/4 v0, 0x0

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Le/b/a/y/z/e/m0;

    iget-object v1, p0, Le/b/a/y/z/e/p0;->b:Le/b/a/y/x/f1/b;

    invoke-direct {v0, p1, v1}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V

    const/4 p1, 0x1

    move-object p1, v0

    const/4 v0, 0x1

    .line 7
    :goto_0
    invoke-static {p1}, Le/b/a/e0/f;->b(Ljava/io/InputStream;)Le/b/a/e0/f;

    move-result-object v1

    .line 8
    new-instance v3, Le/b/a/e0/p;

    invoke-direct {v3, v1}, Le/b/a/e0/p;-><init>(Ljava/io/InputStream;)V

    .line 9
    new-instance v7, Le/b/a/y/z/e/o0;

    invoke-direct {v7, p1, v1}, Le/b/a/y/z/e/o0;-><init>(Le/b/a/y/z/e/m0;Le/b/a/e0/f;)V

    .line 10
    :try_start_0
    iget-object v2, p0, Le/b/a/y/z/e/p0;->a:Le/b/a/y/z/e/x;

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Le/b/a/y/z/e/x;->a(Ljava/io/InputStream;IILe/b/a/y/r;Le/b/a/y/z/e/w;)Le/b/a/y/x/y0;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-virtual {v1}, Le/b/a/e0/f;->l()V

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Le/b/a/y/z/e/m0;->l()V

    :cond_1
    return-object p2

    :catchall_0
    move-exception p2

    .line 13
    invoke-virtual {v1}, Le/b/a/e0/f;->l()V

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p1}, Le/b/a/y/z/e/m0;->l()V

    .line 15
    :cond_2
    throw p2
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

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/p0;->a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/io/InputStream;Le/b/a/y/r;)Z
    .locals 0

    .line 3
    iget-object p2, p0, Le/b/a/y/z/e/p0;->a:Le/b/a/y/z/e/x;

    invoke-virtual {p2, p1}, Le/b/a/y/z/e/x;->a(Ljava/io/InputStream;)Z

    move-result p1

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

    invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/p0;->a(Ljava/io/InputStream;Le/b/a/y/r;)Z

    move-result p1

    return p1
.end method
