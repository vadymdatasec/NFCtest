.class public final Lk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk/f0;

.field public final b:Lk/w;

.field public final c:Ljavax/net/SocketFactory;

.field public final d:Lk/c;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/p0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/q;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/net/ProxySelector;

.field public final h:Ljava/net/Proxy;

.field public final i:Ljavax/net/ssl/SSLSocketFactory;

.field public final j:Ljavax/net/ssl/HostnameVerifier;

.field public final k:Lk/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILk/w;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lk/j;Lk/c;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lk/w;",
            "Ljavax/net/SocketFactory;",
            "Ljavax/net/ssl/SSLSocketFactory;",
            "Ljavax/net/ssl/HostnameVerifier;",
            "Lk/j;",
            "Lk/c;",
            "Ljava/net/Proxy;",
            "Ljava/util/List<",
            "Lk/p0;",
            ">;",
            "Ljava/util/List<",
            "Lk/q;",
            ">;",
            "Ljava/net/ProxySelector;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lk/e0;

    invoke-direct {v0}, Lk/e0;-><init>()V

    if-eqz p5, :cond_0

    const-string v1, "https"

    goto :goto_0

    :cond_0
    const-string v1, "http"

    .line 3
    :goto_0
    invoke-virtual {v0, v1}, Lk/e0;->e(Ljava/lang/String;)Lk/e0;

    .line 4
    invoke-virtual {v0, p1}, Lk/e0;->b(Ljava/lang/String;)Lk/e0;

    .line 5
    invoke-virtual {v0, p2}, Lk/e0;->a(I)Lk/e0;

    .line 6
    invoke-virtual {v0}, Lk/e0;->a()Lk/f0;

    move-result-object p1

    iput-object p1, p0, Lk/a;->a:Lk/f0;

    if-eqz p3, :cond_6

    .line 7
    iput-object p3, p0, Lk/a;->b:Lk/w;

    if-eqz p4, :cond_5

    .line 8
    iput-object p4, p0, Lk/a;->c:Ljavax/net/SocketFactory;

    if-eqz p8, :cond_4

    .line 9
    iput-object p8, p0, Lk/a;->d:Lk/c;

    if-eqz p10, :cond_3

    .line 10
    invoke-static {p10}, Lk/e1/e;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lk/a;->e:Ljava/util/List;

    if-eqz p11, :cond_2

    .line 11
    invoke-static {p11}, Lk/e1/e;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lk/a;->f:Ljava/util/List;

    if-eqz p12, :cond_1

    .line 12
    iput-object p12, p0, Lk/a;->g:Ljava/net/ProxySelector;

    .line 13
    iput-object p9, p0, Lk/a;->h:Ljava/net/Proxy;

    .line 14
    iput-object p5, p0, Lk/a;->i:Ljavax/net/ssl/SSLSocketFactory;

    .line 15
    iput-object p6, p0, Lk/a;->j:Ljavax/net/ssl/HostnameVerifier;

    .line 16
    iput-object p7, p0, Lk/a;->k:Lk/j;

    return-void

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "proxySelector == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "connectionSpecs == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "protocols == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "proxyAuthenticator == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "socketFactory == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "dns == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lk/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->k:Lk/j;

    return-object v0
.end method

.method public a(Lk/a;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lk/a;->b:Lk/w;

    iget-object v1, p1, Lk/a;->b:Lk/w;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->d:Lk/c;

    iget-object v1, p1, Lk/a;->d:Lk/c;

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->e:Ljava/util/List;

    iget-object v1, p1, Lk/a;->e:Ljava/util/List;

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->f:Ljava/util/List;

    iget-object v1, p1, Lk/a;->f:Ljava/util/List;

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->g:Ljava/net/ProxySelector;

    iget-object v1, p1, Lk/a;->g:Ljava/net/ProxySelector;

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->h:Ljava/net/Proxy;

    iget-object v1, p1, Lk/a;->h:Ljava/net/Proxy;

    .line 7
    invoke-static {v0, v1}, Lk/e1/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->i:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, p1, Lk/a;->i:Ljavax/net/ssl/SSLSocketFactory;

    .line 8
    invoke-static {v0, v1}, Lk/e1/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->j:Ljavax/net/ssl/HostnameVerifier;

    iget-object v1, p1, Lk/a;->j:Ljavax/net/ssl/HostnameVerifier;

    .line 9
    invoke-static {v0, v1}, Lk/e1/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->k:Lk/j;

    iget-object v1, p1, Lk/a;->k:Lk/j;

    .line 10
    invoke-static {v0, v1}, Lk/e1/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0}, Lk/a;->k()Lk/f0;

    move-result-object v0

    invoke-virtual {v0}, Lk/f0;->j()I

    move-result v0

    invoke-virtual {p1}, Lk/a;->k()Lk/f0;

    move-result-object p1

    invoke-virtual {p1}, Lk/f0;->j()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk/q;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/a;->f:Ljava/util/List;

    return-object v0
.end method

.method public c()Lk/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->b:Lk/w;

    return-object v0
.end method

.method public d()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->j:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk/p0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/a;->e:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lk/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/a;->a:Lk/f0;

    check-cast p1, Lk/a;

    iget-object v1, p1, Lk/a;->a:Lk/f0;

    .line 2
    invoke-virtual {v0, v1}, Lk/f0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lk/a;->a(Lk/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->h:Ljava/net/Proxy;

    return-object v0
.end method

.method public g()Lk/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->d:Lk/c;

    return-object v0
.end method

.method public h()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->g:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lk/a;->a:Lk/f0;

    invoke-virtual {v0}, Lk/f0;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 2
    iget-object v0, p0, Lk/a;->b:Lk/w;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 3
    iget-object v0, p0, Lk/a;->d:Lk/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 4
    iget-object v0, p0, Lk/a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 5
    iget-object v0, p0, Lk/a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 6
    iget-object v0, p0, Lk/a;->g:Ljava/net/ProxySelector;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 7
    iget-object v0, p0, Lk/a;->h:Ljava/net/Proxy;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/net/Proxy;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 8
    iget-object v0, p0, Lk/a;->i:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 9
    iget-object v0, p0, Lk/a;->j:Ljavax/net/ssl/HostnameVerifier;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 10
    iget-object v0, p0, Lk/a;->k:Lk/j;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lk/j;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v1, v2

    return v1
.end method

.method public i()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->c:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public j()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->i:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public k()Lk/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->a:Lk/f0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Address{"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/a;->a:Lk/f0;

    .line 3
    invoke-virtual {v1}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/a;->a:Lk/f0;

    invoke-virtual {v1}, Lk/f0;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4
    iget-object v1, p0, Lk/a;->h:Ljava/net/Proxy;

    if-eqz v1, :cond_0

    const-string v1, ", proxy="

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/a;->h:Ljava/net/Proxy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, ", proxySelector="

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/a;->g:Ljava/net/ProxySelector;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}"

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
