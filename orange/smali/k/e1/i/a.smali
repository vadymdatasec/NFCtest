.class public final Lk/e1/i/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/h0;


# instance fields
.field public final a:Lk/t;


# direct methods
.method public constructor <init>(Lk/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk/e1/i/a;->a:Lk/t;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk/r;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    if-lez v2, :cond_0

    const-string v3, "; "

    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk/r;

    .line 41
    invoke-virtual {v3}, Lk/r;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lk/r;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lk/g0;)Lk/z0;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lk/g0;->b()Lk/u0;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lk/u0;->f()Lk/t0;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lk/u0;->a()Lk/x0;

    move-result-object v2

    const-string v3, "Content-Type"

    const-wide/16 v4, -0x1

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {v2}, Lk/x0;->b()Lk/i0;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 5
    invoke-virtual {v7}, Lk/i0;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v3, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    .line 6
    :cond_0
    invoke-virtual {v2}, Lk/x0;->a()J

    move-result-wide v7

    const-string v2, "Transfer-Encoding"

    cmp-long v9, v7, v4

    if-eqz v9, :cond_1

    .line 7
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    .line 8
    invoke-virtual {v1, v2}, Lk/t0;->a(Ljava/lang/String;)Lk/t0;

    goto :goto_0

    :cond_1
    const-string v7, "chunked"

    .line 9
    invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    .line 10
    invoke-virtual {v1, v6}, Lk/t0;->a(Ljava/lang/String;)Lk/t0;

    :cond_2
    :goto_0
    const-string v2, "Host"

    .line 11
    invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v7, :cond_3

    .line 12
    invoke-virtual {v0}, Lk/u0;->g()Lk/f0;

    move-result-object v7

    invoke-static {v7, v8}, Lk/e1/e;->a(Lk/f0;Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    :cond_3
    const-string v2, "Connection"

    .line 13
    invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    .line 14
    invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    :cond_4
    const-string v2, "Accept-Encoding"

    .line 15
    invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "gzip"

    if-nez v7, :cond_5

    const-string v7, "Range"

    invoke-virtual {v0, v7}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    const/4 v8, 0x1

    .line 16
    invoke-virtual {v1, v2, v9}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    .line 17
    :cond_5
    iget-object v2, p0, Lk/e1/i/a;->a:Lk/t;

    invoke-virtual {v0}, Lk/u0;->g()Lk/f0;

    move-result-object v7

    invoke-interface {v2, v7}, Lk/t;->a(Lk/f0;)Ljava/util/List;

    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_6

    .line 19
    invoke-virtual {p0, v2}, Lk/e1/i/a;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "Cookie"

    invoke-virtual {v1, v7, v2}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    :cond_6
    const-string v2, "User-Agent"

    .line 20
    invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    .line 21
    invoke-static {}, Lk/e1/f;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    .line 22
    :cond_7
    invoke-virtual {v1}, Lk/t0;->a()Lk/u0;

    move-result-object v1

    invoke-interface {p1, v1}, Lk/g0;->a(Lk/u0;)Lk/z0;

    move-result-object p1

    .line 23
    iget-object v1, p0, Lk/e1/i/a;->a:Lk/t;

    invoke-virtual {v0}, Lk/u0;->g()Lk/f0;

    move-result-object v2

    invoke-virtual {p1}, Lk/z0;->o()Lk/d0;

    move-result-object v7

    invoke-static {v1, v2, v7}, Lk/e1/i/g;->a(Lk/t;Lk/f0;Lk/d0;)V

    .line 24
    invoke-virtual {p1}, Lk/z0;->p()Lk/y0;

    move-result-object v1

    .line 25
    invoke-virtual {v1, v0}, Lk/y0;->a(Lk/u0;)Lk/y0;

    if-eqz v8, :cond_8

    const-string v0, "Content-Encoding"

    .line 26
    invoke-virtual {p1, v0}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 27
    invoke-static {p1}, Lk/e1/i/g;->b(Lk/z0;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 28
    new-instance v2, Ll/m;

    invoke-virtual {p1}, Lk/z0;->c()Lk/b1;

    move-result-object v7

    invoke-virtual {v7}, Lk/b1;->n()Ll/h;

    move-result-object v7

    invoke-direct {v2, v7}, Ll/m;-><init>(Ll/y;)V

    .line 29
    invoke-virtual {p1}, Lk/z0;->o()Lk/d0;

    move-result-object v7

    invoke-virtual {v7}, Lk/d0;->a()Lk/c0;

    move-result-object v7

    .line 30
    invoke-virtual {v7, v0}, Lk/c0;->b(Ljava/lang/String;)Lk/c0;

    .line 31
    invoke-virtual {v7, v6}, Lk/c0;->b(Ljava/lang/String;)Lk/c0;

    .line 32
    invoke-virtual {v7}, Lk/c0;->a()Lk/d0;

    move-result-object v0

    .line 33
    invoke-virtual {v1, v0}, Lk/y0;->a(Lk/d0;)Lk/y0;

    .line 34
    invoke-virtual {p1, v3}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 35
    new-instance v0, Lk/e1/i/j;

    invoke-static {v2}, Ll/r;->a(Ll/y;)Ll/h;

    move-result-object v2

    invoke-direct {v0, p1, v4, v5, v2}, Lk/e1/i/j;-><init>(Ljava/lang/String;JLl/h;)V

    invoke-virtual {v1, v0}, Lk/y0;->a(Lk/b1;)Lk/y0;

    .line 36
    :cond_8
    invoke-virtual {v1}, Lk/y0;->a()Lk/z0;

    move-result-object p1

    return-object p1
.end method
