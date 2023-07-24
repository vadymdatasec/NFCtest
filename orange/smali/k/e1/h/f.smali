.class public final Lk/e1/h/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk/a;

.field public final b:Lk/e1/h/d;

.field public final c:Lk/g;

.field public final d:Lk/a0;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/net/Proxy;",
            ">;"
        }
    .end annotation
.end field

.field public f:I

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/net/InetSocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/c1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk/a;Lk/e1/h/d;Lk/g;Lk/a0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lk/e1/h/f;->e:Ljava/util/List;

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lk/e1/h/f;->g:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/e1/h/f;->h:Ljava/util/List;

    .line 5
    iput-object p1, p0, Lk/e1/h/f;->a:Lk/a;

    .line 6
    iput-object p2, p0, Lk/e1/h/f;->b:Lk/e1/h/d;

    .line 7
    iput-object p3, p0, Lk/e1/h/f;->c:Lk/g;

    .line 8
    iput-object p4, p0, Lk/e1/h/f;->d:Lk/a0;

    .line 9
    invoke-virtual {p1}, Lk/a;->k()Lk/f0;

    move-result-object p2

    invoke-virtual {p1}, Lk/a;->f()Ljava/net/Proxy;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lk/e1/h/f;->a(Lk/f0;Ljava/net/Proxy;)V

    return-void
.end method

.method public static a(Ljava/net/InetSocketAddress;)Ljava/lang/String;
    .locals 1

    .line 35
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 37
    :cond_0
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/net/Proxy;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/e1/h/f;->g:Ljava/util/List;

    .line 14
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    .line 16
    instance-of v1, v0, Ljava/net/InetSocketAddress;

    if-eqz v1, :cond_1

    .line 17
    check-cast v0, Ljava/net/InetSocketAddress;

    .line 18
    invoke-static {v0}, Lk/e1/h/f;->a(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    goto :goto_1

    .line 20
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Proxy.address() is not an InetSocketAddress: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_2
    :goto_0
    iget-object v0, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v0

    invoke-virtual {v0}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v1

    .line 23
    iget-object v0, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v0

    invoke-virtual {v0}, Lk/f0;->j()I

    move-result v0

    :goto_1
    const/4 v2, 0x1

    if-lt v0, v2, :cond_6

    const v2, 0xffff

    if-gt v0, v2, :cond_6

    .line 24
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p1

    sget-object v2, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne p1, v2, :cond_3

    .line 25
    iget-object p1, p0, Lk/e1/h/f;->g:Ljava/util/List;

    invoke-static {v1, v0}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 26
    :cond_3
    iget-object p1, p0, Lk/e1/h/f;->d:Lk/a0;

    iget-object v2, p0, Lk/e1/h/f;->c:Lk/g;

    invoke-virtual {p1, v2, v1}, Lk/a0;->a(Lk/g;Ljava/lang/String;)V

    .line 27
    iget-object p1, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {p1}, Lk/a;->c()Lk/w;

    move-result-object p1

    invoke-interface {p1, v1}, Lk/w;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 29
    iget-object v2, p0, Lk/e1/h/f;->d:Lk/a0;

    iget-object v3, p0, Lk/e1/h/f;->c:Lk/g;

    invoke-virtual {v2, v3, v1, p1}, Lk/a0;->a(Lk/g;Ljava/lang/String;Ljava/util/List;)V

    const/4 v1, 0x0

    .line 30
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    :goto_2
    if-ge v1, v2, :cond_4

    .line 31
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/InetAddress;

    .line 32
    iget-object v4, p0, Lk/e1/h/f;->g:Ljava/util/List;

    new-instance v5, Ljava/net/InetSocketAddress;

    invoke-direct {v5, v3, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    return-void

    .line 33
    :cond_5
    new-instance p1, Ljava/net/UnknownHostException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {v2}, Lk/a;->c()Lk/w;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned no addresses for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 34
    :cond_6
    new-instance p1, Ljava/net/SocketException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No route to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "; port is out of range"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lk/c1;Ljava/io/IOException;)V
    .locals 3

    .line 2
    invoke-virtual {p1}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {v0}, Lk/a;->h()Ljava/net/ProxySelector;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {v0}, Lk/a;->h()Ljava/net/ProxySelector;

    move-result-object v0

    iget-object v1, p0, Lk/e1/h/f;->a:Lk/a;

    .line 4
    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    invoke-virtual {v1}, Lk/f0;->m()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {p1}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v1, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 6
    :cond_0
    iget-object p2, p0, Lk/e1/h/f;->b:Lk/e1/h/d;

    invoke-virtual {p2, p1}, Lk/e1/h/d;->b(Lk/c1;)V

    return-void
.end method

.method public final a(Lk/f0;Ljava/net/Proxy;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 7
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lk/e1/h/f;->e:Ljava/util/List;

    goto :goto_1

    .line 8
    :cond_0
    iget-object p2, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {p2}, Lk/a;->h()Ljava/net/ProxySelector;

    move-result-object p2

    invoke-virtual {p1}, Lk/f0;->m()Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 10
    invoke-static {p1}, Lk/e1/e;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/net/Proxy;

    .line 11
    sget-object p2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    aput-object p2, p1, v0

    invoke-static {p1}, Lk/e1/e;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lk/e1/h/f;->e:Ljava/util/List;

    .line 12
    :goto_1
    iput v0, p0, Lk/e1/h/f;->f:I

    return-void
.end method

.method public a()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk/e1/h/f;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lk/e1/h/f;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget v0, p0, Lk/e1/h/f;->f:I

    iget-object v1, p0, Lk/e1/h/f;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Lk/e1/h/e;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lk/e1/h/f;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lk/e1/h/f;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4
    invoke-virtual {p0}, Lk/e1/h/f;->d()Ljava/net/Proxy;

    move-result-object v1

    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lk/e1/h/f;->g:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_2

    .line 6
    new-instance v4, Lk/c1;

    iget-object v5, p0, Lk/e1/h/f;->a:Lk/a;

    iget-object v6, p0, Lk/e1/h/f;->g:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/net/InetSocketAddress;

    invoke-direct {v4, v5, v1, v6}, Lk/c1;-><init>(Lk/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 7
    iget-object v5, p0, Lk/e1/h/f;->b:Lk/e1/h/d;

    invoke-virtual {v5, v4}, Lk/e1/h/d;->c(Lk/c1;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 8
    iget-object v5, p0, Lk/e1/h/f;->h:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 9
    :cond_1
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 11
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    iget-object v1, p0, Lk/e1/h/f;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    iget-object v1, p0, Lk/e1/h/f;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 14
    :cond_4
    new-instance v1, Lk/e1/h/e;

    invoke-direct {v1, v0}, Lk/e1/h/e;-><init>(Ljava/util/List;)V

    return-object v1

    .line 15
    :cond_5
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final d()Ljava/net/Proxy;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lk/e1/h/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lk/e1/h/f;->e:Ljava/util/List;

    iget v1, p0, Lk/e1/h/f;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lk/e1/h/f;->f:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Proxy;

    .line 3
    invoke-virtual {p0, v0}, Lk/e1/h/f;->a(Ljava/net/Proxy;)V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No route to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lk/e1/h/f;->a:Lk/a;

    invoke-virtual {v2}, Lk/a;->k()Lk/f0;

    move-result-object v2

    invoke-virtual {v2}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; exhausted proxy configurations: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lk/e1/h/f;->e:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
