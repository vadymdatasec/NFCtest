.class public abstract Le/f/b/c/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public a([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {}, Le/f/b/c/m;->c()Le/f/b/c/m;

    move-result-object v0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Le/f/b/c/e;->a()Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/b/c/m;->a(Ljava/io/Closeable;)Ljava/io/Closeable;

    check-cast v1, Ljava/io/OutputStream;

    .line 4
    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    .line 5
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-virtual {v0}, Le/f/b/c/m;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    invoke-virtual {v0, p1}, Le/f/b/c/m;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 p1, 0x0

    throw p1

    :catchall_1
    move-exception p1

    .line 8
    invoke-virtual {v0}, Le/f/b/c/m;->close()V

    .line 9
    throw p1
.end method
