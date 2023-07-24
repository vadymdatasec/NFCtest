.class public final Lk/e1/k/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/e1/i/d;


# static fields
.field public static final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lk/g0;

.field public final b:Lk/e1/h/h;

.field public final c:Lk/e1/k/x;

.field public d:Lk/e1/k/e0;

.field public final e:Lk/p0;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    .line 1
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lk/e1/e;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lk/e1/k/i;->f:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    .line 2
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lk/e1/e;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lk/e1/k/i;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lk/o0;Lk/g0;Lk/e1/h/h;Lk/e1/k/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lk/e1/k/i;->a:Lk/g0;

    .line 3
    iput-object p3, p0, Lk/e1/k/i;->b:Lk/e1/h/h;

    .line 4
    iput-object p4, p0, Lk/e1/k/i;->c:Lk/e1/k/x;

    .line 5
    invoke-virtual {p1}, Lk/o0;->t()Ljava/util/List;

    move-result-object p1

    sget-object p2, Lk/p0;->g:Lk/p0;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    sget-object p1, Lk/p0;->g:Lk/p0;

    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lk/p0;->f:Lk/p0;

    :goto_0
    iput-object p1, p0, Lk/e1/k/i;->e:Lk/p0;

    return-void
.end method

.method public static a(Lk/d0;Lk/p0;)Lk/y0;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12
    new-instance v0, Lk/c0;

    invoke-direct {v0}, Lk/c0;-><init>()V

    .line 13
    invoke-virtual {p0}, Lk/d0;->b()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 14
    invoke-virtual {p0, v3}, Lk/d0;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual {p0, v3}, Lk/d0;->b(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ":status"

    .line 16
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HTTP/1.1 "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk/e1/i/m;->a(Ljava/lang/String;)Lk/e1/i/m;

    move-result-object v2

    goto :goto_1

    .line 18
    :cond_0
    sget-object v6, Lk/e1/k/i;->g:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 19
    sget-object v6, Lk/e1/a;->a:Lk/e1/a;

    invoke-virtual {v6, v0, v4, v5}, Lk/e1/a;->a(Lk/c0;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 20
    new-instance p0, Lk/y0;

    invoke-direct {p0}, Lk/y0;-><init>()V

    .line 21
    invoke-virtual {p0, p1}, Lk/y0;->a(Lk/p0;)Lk/y0;

    iget p1, v2, Lk/e1/i/m;->b:I

    .line 22
    invoke-virtual {p0, p1}, Lk/y0;->a(I)Lk/y0;

    iget-object p1, v2, Lk/e1/i/m;->c:Ljava/lang/String;

    .line 23
    invoke-virtual {p0, p1}, Lk/y0;->a(Ljava/lang/String;)Lk/y0;

    .line 24
    invoke-virtual {v0}, Lk/c0;->a()Lk/d0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk/y0;->a(Lk/d0;)Lk/y0;

    return-object p0

    .line 25
    :cond_3
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Expected \':status\' header not present"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lk/u0;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/u0;",
            ")",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lk/u0;->c()Lk/d0;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lk/d0;->b()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    new-instance v2, Lk/e1/k/c;

    sget-object v3, Lk/e1/k/c;->f:Ll/i;

    invoke-virtual {p0}, Lk/u0;->e()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lk/e1/k/c;-><init>(Ll/i;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v2, Lk/e1/k/c;

    sget-object v3, Lk/e1/k/c;->g:Ll/i;

    invoke-virtual {p0}, Lk/u0;->g()Lk/f0;

    move-result-object v4

    invoke-static {v4}, Lk/e1/i/k;->a(Lk/f0;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lk/e1/k/c;-><init>(Ll/i;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "Host"

    .line 6
    invoke-virtual {p0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 7
    new-instance v3, Lk/e1/k/c;

    sget-object v4, Lk/e1/k/c;->i:Ll/i;

    invoke-direct {v3, v4, v2}, Lk/e1/k/c;-><init>(Ll/i;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    :cond_0
    new-instance v2, Lk/e1/k/c;

    sget-object v3, Lk/e1/k/c;->h:Ll/i;

    invoke-virtual {p0}, Lk/u0;->g()Lk/f0;

    move-result-object p0

    invoke-virtual {p0}, Lk/f0;->l()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Lk/e1/k/c;-><init>(Ll/i;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    .line 9
    invoke-virtual {v0}, Lk/d0;->b()I

    move-result v2

    :goto_0
    if-ge p0, v2, :cond_2

    .line 10
    invoke-virtual {v0, p0}, Lk/d0;->a(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/i;->c(Ljava/lang/String;)Ll/i;

    move-result-object v3

    .line 11
    sget-object v4, Lk/e1/k/i;->f:Ljava/util/List;

    invoke-virtual {v3}, Ll/i;->h()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 12
    new-instance v4, Lk/e1/k/c;

    invoke-virtual {v0, p0}, Lk/d0;->b(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lk/e1/k/c;-><init>(Ll/i;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method


# virtual methods
.method public a(Lk/z0;)Lk/b1;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lk/e1/k/i;->b:Lk/e1/h/h;

    iget-object v1, v0, Lk/e1/h/h;->f:Lk/a0;

    iget-object v0, v0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v1, v0}, Lk/a0;->e(Lk/g;)V

    const-string v0, "Content-Type"

    .line 27
    invoke-virtual {p1, v0}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-static {p1}, Lk/e1/i/g;->a(Lk/z0;)J

    move-result-wide v1

    .line 29
    new-instance p1, Lk/e1/k/h;

    iget-object v3, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    invoke-virtual {v3}, Lk/e1/k/e0;->e()Ll/y;

    move-result-object v3

    invoke-direct {p1, p0, v3}, Lk/e1/k/h;-><init>(Lk/e1/k/i;Ll/y;)V

    .line 30
    new-instance v3, Lk/e1/i/j;

    invoke-static {p1}, Ll/r;->a(Ll/y;)Ll/h;

    move-result-object p1

    invoke-direct {v3, v0, v1, v2, p1}, Lk/e1/i/j;-><init>(Ljava/lang/String;JLl/h;)V

    return-object v3
.end method

.method public a(Z)Lk/y0;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    invoke-virtual {v0}, Lk/e1/k/e0;->j()Lk/d0;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lk/e1/k/i;->e:Lk/p0;

    invoke-static {v0, v1}, Lk/e1/k/i;->a(Lk/d0;Lk/p0;)Lk/y0;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 11
    sget-object p1, Lk/e1/a;->a:Lk/e1/a;

    invoke-virtual {p1, v0}, Lk/e1/a;->a(Lk/y0;)I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public a(Lk/u0;J)Ll/x;
    .locals 0

    .line 1
    iget-object p1, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    invoke-virtual {p1}, Lk/e1/k/e0;->d()Ll/x;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    invoke-virtual {v0}, Lk/e1/k/e0;->d()Ll/x;

    move-result-object v0

    invoke-interface {v0}, Ll/x;->close()V

    return-void
.end method

.method public a(Lk/u0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lk/u0;->a()Lk/x0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-static {p1}, Lk/e1/k/i;->b(Lk/u0;)Ljava/util/List;

    move-result-object p1

    .line 5
    iget-object v1, p0, Lk/e1/k/i;->c:Lk/e1/k/x;

    invoke-virtual {v1, p1, v0}, Lk/e1/k/x;->a(Ljava/util/List;Z)Lk/e1/k/e0;

    move-result-object p1

    iput-object p1, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    .line 6
    invoke-virtual {p1}, Lk/e1/k/e0;->h()Ll/a0;

    move-result-object p1

    iget-object v0, p0, Lk/e1/k/i;->a:Lk/g0;

    invoke-interface {v0}, Lk/g0;->d()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;

    .line 7
    iget-object p1, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    invoke-virtual {p1}, Lk/e1/k/e0;->l()Ll/a0;

    move-result-object p1

    iget-object v0, p0, Lk/e1/k/i;->a:Lk/g0;

    invoke-interface {v0}, Lk/g0;->a()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;

    return-void
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/e1/k/i;->c:Lk/e1/k/x;

    invoke-virtual {v0}, Lk/e1/k/x;->flush()V

    return-void
.end method

.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/e1/k/i;->d:Lk/e1/k/e0;

    if-eqz v0, :cond_0

    sget-object v1, Lk/e1/k/a;->h:Lk/e1/k/a;

    invoke-virtual {v0, v1}, Lk/e1/k/e0;->c(Lk/e1/k/a;)V

    :cond_0
    return-void
.end method
