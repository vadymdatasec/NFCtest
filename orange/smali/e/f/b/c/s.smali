.class public abstract Le/f/b/c/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/b/c/p;

    invoke-direct {v0}, Le/f/b/c/p;-><init>()V

    return-void
.end method

.method public static varargs a(Ljava/io/File;[Le/f/b/c/n;)Le/f/b/c/e;
    .locals 2

    .line 2
    new-instance v0, Le/f/b/c/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Le/f/b/c/q;-><init>(Ljava/io/File;[Le/f/b/c/n;Le/f/b/c/o;)V

    return-object v0
.end method

.method public static a(Ljava/io/File;)Le/f/b/c/f;
    .locals 2

    .line 1
    new-instance v0, Le/f/b/c/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/f/b/c/r;-><init>(Ljava/io/File;Le/f/b/c/o;)V

    return-object v0
.end method

.method public static a([BLjava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Le/f/b/c/n;

    .line 3
    invoke-static {p1, v0}, Le/f/b/c/s;->a(Ljava/io/File;[Le/f/b/c/n;)Le/f/b/c/e;

    move-result-object p1

    invoke-virtual {p1, p0}, Le/f/b/c/e;->a([B)V

    return-void
.end method

.method public static b(Ljava/io/File;)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Le/f/b/c/s;->a(Ljava/io/File;)Le/f/b/c/f;

    move-result-object p0

    invoke-virtual {p0}, Le/f/b/c/f;->a()[B

    move-result-object p0

    return-object p0
.end method
