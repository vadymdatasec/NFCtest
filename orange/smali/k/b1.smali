.class public abstract Lk/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lk/i0;JLl/h;)Lk/b1;
    .locals 1

    if-eqz p3, :cond_0

    .line 3
    new-instance v0, Lk/a1;

    invoke-direct {v0, p0, p1, p2, p3}, Lk/a1;-><init>(Lk/i0;JLl/h;)V

    return-object v0

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "source == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Lk/i0;[B)Lk/b1;
    .locals 3

    .line 1
    new-instance v0, Ll/f;

    invoke-direct {v0}, Ll/f;-><init>()V

    invoke-virtual {v0, p1}, Ll/f;->write([B)Ll/f;

    .line 2
    array-length p1, p1

    int-to-long v1, p1

    invoke-static {p0, v1, v2, v0}, Lk/b1;->a(Lk/i0;JLl/h;)Lk/b1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c()Ljava/nio/charset/Charset;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk/b1;->m()Lk/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Lk/e1/e;->i:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lk/i0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lk/e1/e;->i:Ljava/nio/charset/Charset;

    :goto_0
    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk/b1;->n()Ll/h;

    move-result-object v0

    invoke-static {v0}, Lk/e1/e;->a(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract l()J
.end method

.method public abstract m()Lk/i0;
.end method

.method public abstract n()Ll/h;
.end method

.method public final o()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lk/b1;->n()Ll/h;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lk/b1;->c()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Lk/e1/e;->a(Ll/h;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 3
    invoke-interface {v0, v1}, Ll/h;->a(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-static {v0}, Lk/e1/e;->a(Ljava/io/Closeable;)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-static {v0}, Lk/e1/e;->a(Ljava/io/Closeable;)V

    throw v1
.end method
