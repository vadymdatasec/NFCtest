.class public final Lk/e1/i/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/h0;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lk/e1/i/c;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lk/g0;)Lk/z0;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lk/e1/i/i;

    .line 2
    invoke-virtual {p1}, Lk/e1/i/i;->h()Lk/e1/i/d;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lk/e1/i/i;->i()Lk/e1/h/h;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Lk/e1/i/i;->f()Lk/m;

    move-result-object v2

    check-cast v2, Lk/e1/h/c;

    .line 5
    invoke-virtual {p1}, Lk/e1/i/i;->b()Lk/u0;

    move-result-object v3

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 7
    invoke-virtual {p1}, Lk/e1/i/i;->g()Lk/a0;

    move-result-object v6

    invoke-virtual {p1}, Lk/e1/i/i;->e()Lk/g;

    move-result-object v7

    invoke-virtual {v6, v7}, Lk/a0;->d(Lk/g;)V

    .line 8
    invoke-interface {v0, v3}, Lk/e1/i/d;->a(Lk/u0;)V

    .line 9
    invoke-virtual {p1}, Lk/e1/i/i;->g()Lk/a0;

    move-result-object v6

    invoke-virtual {p1}, Lk/e1/i/i;->e()Lk/g;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Lk/a0;->a(Lk/g;Lk/u0;)V

    .line 10
    invoke-virtual {v3}, Lk/u0;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lk/e1/i/h;->b(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v3}, Lk/u0;->a()Lk/x0;

    move-result-object v6

    if-eqz v6, :cond_2

    const-string v6, "Expect"

    .line 11
    invoke-virtual {v3, v6}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "100-continue"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 12
    invoke-interface {v0}, Lk/e1/i/d;->b()V

    .line 13
    invoke-virtual {p1}, Lk/e1/i/i;->g()Lk/a0;

    move-result-object v6

    invoke-virtual {p1}, Lk/e1/i/i;->e()Lk/g;

    move-result-object v7

    invoke-virtual {v6, v7}, Lk/a0;->f(Lk/g;)V

    const/4 v6, 0x1

    .line 14
    invoke-interface {v0, v6}, Lk/e1/i/d;->a(Z)Lk/y0;

    move-result-object v7

    :cond_0
    if-nez v7, :cond_1

    .line 15
    invoke-virtual {p1}, Lk/e1/i/i;->g()Lk/a0;

    move-result-object v2

    invoke-virtual {p1}, Lk/e1/i/i;->e()Lk/g;

    move-result-object v6

    invoke-virtual {v2, v6}, Lk/a0;->c(Lk/g;)V

    .line 16
    invoke-virtual {v3}, Lk/u0;->a()Lk/x0;

    move-result-object v2

    invoke-virtual {v2}, Lk/x0;->a()J

    move-result-wide v8

    .line 17
    new-instance v2, Lk/e1/i/b;

    .line 18
    invoke-interface {v0, v3, v8, v9}, Lk/e1/i/d;->a(Lk/u0;J)Ll/x;

    move-result-object v6

    invoke-direct {v2, v6}, Lk/e1/i/b;-><init>(Ll/x;)V

    .line 19
    invoke-static {v2}, Ll/r;->a(Ll/x;)Ll/g;

    move-result-object v6

    .line 20
    invoke-virtual {v3}, Lk/u0;->a()Lk/x0;

    move-result-object v8

    invoke-virtual {v8, v6}, Lk/x0;->a(Ll/g;)V

    .line 21
    invoke-interface {v6}, Ll/x;->close()V

    .line 22
    invoke-virtual {p1}, Lk/e1/i/i;->g()Lk/a0;

    move-result-object v6

    .line 23
    invoke-virtual {p1}, Lk/e1/i/i;->e()Lk/g;

    move-result-object v8

    iget-wide v9, v2, Lk/e1/i/b;->c:J

    invoke-virtual {v6, v8, v9, v10}, Lk/a0;->a(Lk/g;J)V

    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v2}, Lk/e1/h/c;->d()Z

    move-result v2

    if-nez v2, :cond_2

    .line 25
    invoke-virtual {v1}, Lk/e1/h/h;->e()V

    .line 26
    :cond_2
    :goto_0
    invoke-interface {v0}, Lk/e1/i/d;->a()V

    const/4 v2, 0x0

    if-nez v7, :cond_3

    .line 27
    invoke-virtual {p1}, Lk/e1/i/i;->g()Lk/a0;

    move-result-object v6

    invoke-virtual {p1}, Lk/e1/i/i;->e()Lk/g;

    move-result-object v7

    invoke-virtual {v6, v7}, Lk/a0;->f(Lk/g;)V

    .line 28
    invoke-interface {v0, v2}, Lk/e1/i/d;->a(Z)Lk/y0;

    move-result-object v7

    .line 29
    :cond_3
    invoke-virtual {v7, v3}, Lk/y0;->a(Lk/u0;)Lk/y0;

    .line 30
    invoke-virtual {v1}, Lk/e1/h/h;->c()Lk/e1/h/c;

    move-result-object v6

    invoke-virtual {v6}, Lk/e1/h/c;->c()Lk/b0;

    move-result-object v6

    invoke-virtual {v7, v6}, Lk/y0;->a(Lk/b0;)Lk/y0;

    .line 31
    invoke-virtual {v7, v4, v5}, Lk/y0;->b(J)Lk/y0;

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Lk/y0;->a(J)Lk/y0;

    .line 33
    invoke-virtual {v7}, Lk/y0;->a()Lk/z0;

    move-result-object v6

    .line 34
    invoke-virtual {v6}, Lk/z0;->m()I

    move-result v7

    const/16 v8, 0x64

    if-ne v7, v8, :cond_4

    .line 35
    invoke-interface {v0, v2}, Lk/e1/i/d;->a(Z)Lk/y0;

    move-result-object v2

    .line 36
    invoke-virtual {v2, v3}, Lk/y0;->a(Lk/u0;)Lk/y0;

    .line 37
    invoke-virtual {v1}, Lk/e1/h/h;->c()Lk/e1/h/c;

    move-result-object v3

    invoke-virtual {v3}, Lk/e1/h/c;->c()Lk/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lk/y0;->a(Lk/b0;)Lk/y0;

    .line 38
    invoke-virtual {v2, v4, v5}, Lk/y0;->b(J)Lk/y0;

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lk/y0;->a(J)Lk/y0;

    .line 40
    invoke-virtual {v2}, Lk/y0;->a()Lk/z0;

    move-result-object v6

    .line 41
    invoke-virtual {v6}, Lk/z0;->m()I

    move-result v7

    .line 42
    :cond_4
    invoke-virtual {p1}, Lk/e1/i/i;->g()Lk/a0;

    move-result-object v2

    .line 43
    invoke-virtual {p1}, Lk/e1/i/i;->e()Lk/g;

    move-result-object p1

    invoke-virtual {v2, p1, v6}, Lk/a0;->a(Lk/g;Lk/z0;)V

    .line 44
    iget-boolean p1, p0, Lk/e1/i/c;->a:Z

    if-eqz p1, :cond_5

    const/16 p1, 0x65

    if-ne v7, p1, :cond_5

    .line 45
    invoke-virtual {v6}, Lk/z0;->p()Lk/y0;

    move-result-object p1

    sget-object v0, Lk/e1/e;->c:Lk/b1;

    .line 46
    invoke-virtual {p1, v0}, Lk/y0;->a(Lk/b1;)Lk/y0;

    .line 47
    invoke-virtual {p1}, Lk/y0;->a()Lk/z0;

    move-result-object p1

    goto :goto_1

    .line 48
    :cond_5
    invoke-virtual {v6}, Lk/z0;->p()Lk/y0;

    move-result-object p1

    .line 49
    invoke-interface {v0, v6}, Lk/e1/i/d;->a(Lk/z0;)Lk/b1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lk/y0;->a(Lk/b1;)Lk/y0;

    .line 50
    invoke-virtual {p1}, Lk/y0;->a()Lk/z0;

    move-result-object p1

    .line 51
    :goto_1
    invoke-virtual {p1}, Lk/z0;->s()Lk/u0;

    move-result-object v0

    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "close"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 52
    invoke-virtual {p1, v2}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 53
    :cond_6
    invoke-virtual {v1}, Lk/e1/h/h;->e()V

    :cond_7
    const/16 v0, 0xcc

    if-eq v7, v0, :cond_8

    const/16 v0, 0xcd

    if-ne v7, v0, :cond_9

    .line 54
    :cond_8
    invoke-virtual {p1}, Lk/z0;->c()Lk/b1;

    move-result-object v0

    invoke-virtual {v0}, Lk/b1;->l()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_a

    :cond_9
    return-object p1

    .line 55
    :cond_a
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {p1}, Lk/z0;->c()Lk/b1;

    move-result-object p1

    invoke-virtual {p1}, Lk/b1;->l()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
