.class public Lk/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/p0;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:I

.field public final B:I

.field public final C:I

.field public final b:Lk/u;

.field public final c:Ljava/net/Proxy;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/p0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/q;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/h0;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/h0;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lk/z;

.field public final i:Ljava/net/ProxySelector;

.field public final j:Lk/t;

.field public final k:Lk/d;

.field public final l:Lk/e1/g/f;

.field public final m:Ljavax/net/SocketFactory;

.field public final n:Ljavax/net/ssl/SSLSocketFactory;

.field public final o:Lk/e1/n/c;

.field public final p:Ljavax/net/ssl/HostnameVerifier;

.field public final q:Lk/j;

.field public final r:Lk/c;

.field public final s:Lk/c;

.field public final t:Lk/o;

.field public final u:Lk/w;

.field public final v:Z

.field public final w:Z

.field public final x:Z

.field public final y:I

.field public final z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Lk/p0;

    .line 1
    sget-object v2, Lk/p0;->f:Lk/p0;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lk/p0;->d:Lk/p0;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lk/e1/e;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lk/o0;->D:Ljava/util/List;

    new-array v0, v0, [Lk/q;

    .line 2
    sget-object v1, Lk/q;->g:Lk/q;

    aput-object v1, v0, v3

    sget-object v1, Lk/q;->h:Lk/q;

    aput-object v1, v0, v4

    invoke-static {v0}, Lk/e1/e;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lk/o0;->E:Ljava/util/List;

    .line 3
    new-instance v0, Lk/m0;

    invoke-direct {v0}, Lk/m0;-><init>()V

    sput-object v0, Lk/e1/a;->a:Lk/e1/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lk/n0;

    invoke-direct {v0}, Lk/n0;-><init>()V

    invoke-direct {p0, v0}, Lk/o0;-><init>(Lk/n0;)V

    return-void
.end method

.method public constructor <init>(Lk/n0;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Lk/n0;->a:Lk/u;

    iput-object v0, p0, Lk/o0;->b:Lk/u;

    .line 4
    iget-object v0, p1, Lk/n0;->b:Ljava/net/Proxy;

    iput-object v0, p0, Lk/o0;->c:Ljava/net/Proxy;

    .line 5
    iget-object v0, p1, Lk/n0;->c:Ljava/util/List;

    iput-object v0, p0, Lk/o0;->d:Ljava/util/List;

    .line 6
    iget-object v0, p1, Lk/n0;->d:Ljava/util/List;

    iput-object v0, p0, Lk/o0;->e:Ljava/util/List;

    .line 7
    iget-object v0, p1, Lk/n0;->e:Ljava/util/List;

    invoke-static {v0}, Lk/e1/e;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lk/o0;->f:Ljava/util/List;

    .line 8
    iget-object v0, p1, Lk/n0;->f:Ljava/util/List;

    invoke-static {v0}, Lk/e1/e;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lk/o0;->g:Ljava/util/List;

    .line 9
    iget-object v0, p1, Lk/n0;->g:Lk/z;

    iput-object v0, p0, Lk/o0;->h:Lk/z;

    .line 10
    iget-object v0, p1, Lk/n0;->h:Ljava/net/ProxySelector;

    iput-object v0, p0, Lk/o0;->i:Ljava/net/ProxySelector;

    .line 11
    iget-object v0, p1, Lk/n0;->i:Lk/t;

    iput-object v0, p0, Lk/o0;->j:Lk/t;

    .line 12
    iget-object v0, p1, Lk/n0;->j:Lk/d;

    iput-object v0, p0, Lk/o0;->k:Lk/d;

    .line 13
    iget-object v0, p1, Lk/n0;->k:Lk/e1/g/f;

    iput-object v0, p0, Lk/o0;->l:Lk/e1/g/f;

    .line 14
    iget-object v0, p1, Lk/n0;->l:Ljavax/net/SocketFactory;

    iput-object v0, p0, Lk/o0;->m:Ljavax/net/SocketFactory;

    .line 15
    iget-object v0, p0, Lk/o0;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk/q;

    if-nez v2, :cond_1

    .line 16
    invoke-virtual {v3}, Lk/q;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    .line 17
    :cond_2
    iget-object v0, p1, Lk/n0;->m:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_4

    if-nez v2, :cond_3

    goto :goto_1

    .line 18
    :cond_3
    invoke-static {}, Lk/e1/e;->a()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    .line 19
    invoke-static {v0}, Lk/o0;->a(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, Lk/o0;->n:Ljavax/net/ssl/SSLSocketFactory;

    .line 20
    invoke-static {v0}, Lk/e1/n/c;->a(Ljavax/net/ssl/X509TrustManager;)Lk/e1/n/c;

    move-result-object v0

    iput-object v0, p0, Lk/o0;->o:Lk/e1/n/c;

    goto :goto_2

    .line 21
    :cond_4
    :goto_1
    iget-object v0, p1, Lk/n0;->m:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Lk/o0;->n:Ljavax/net/ssl/SSLSocketFactory;

    .line 22
    iget-object v0, p1, Lk/n0;->n:Lk/e1/n/c;

    iput-object v0, p0, Lk/o0;->o:Lk/e1/n/c;

    .line 23
    :goto_2
    iget-object v0, p0, Lk/o0;->n:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5

    .line 24
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object v0

    iget-object v1, p0, Lk/o0;->n:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v1}, Lk/e1/l/j;->a(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 25
    :cond_5
    iget-object v0, p1, Lk/n0;->o:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lk/o0;->p:Ljavax/net/ssl/HostnameVerifier;

    .line 26
    iget-object v0, p1, Lk/n0;->p:Lk/j;

    iget-object v1, p0, Lk/o0;->o:Lk/e1/n/c;

    invoke-virtual {v0, v1}, Lk/j;->a(Lk/e1/n/c;)Lk/j;

    move-result-object v0

    iput-object v0, p0, Lk/o0;->q:Lk/j;

    .line 27
    iget-object v0, p1, Lk/n0;->q:Lk/c;

    iput-object v0, p0, Lk/o0;->r:Lk/c;

    .line 28
    iget-object v0, p1, Lk/n0;->r:Lk/c;

    iput-object v0, p0, Lk/o0;->s:Lk/c;

    .line 29
    iget-object v0, p1, Lk/n0;->s:Lk/o;

    iput-object v0, p0, Lk/o0;->t:Lk/o;

    .line 30
    iget-object v0, p1, Lk/n0;->t:Lk/w;

    iput-object v0, p0, Lk/o0;->u:Lk/w;

    .line 31
    iget-boolean v0, p1, Lk/n0;->u:Z

    iput-boolean v0, p0, Lk/o0;->v:Z

    .line 32
    iget-boolean v0, p1, Lk/n0;->v:Z

    iput-boolean v0, p0, Lk/o0;->w:Z

    .line 33
    iget-boolean v0, p1, Lk/n0;->w:Z

    iput-boolean v0, p0, Lk/o0;->x:Z

    .line 34
    iget v0, p1, Lk/n0;->x:I

    iput v0, p0, Lk/o0;->y:I

    .line 35
    iget v0, p1, Lk/n0;->y:I

    iput v0, p0, Lk/o0;->z:I

    .line 36
    iget v0, p1, Lk/n0;->z:I

    iput v0, p0, Lk/o0;->A:I

    .line 37
    iget v0, p1, Lk/n0;->A:I

    iput v0, p0, Lk/o0;->B:I

    .line 38
    iget p1, p1, Lk/n0;->B:I

    iput p1, p0, Lk/o0;->C:I

    .line 39
    iget-object p1, p0, Lk/o0;->f:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 40
    iget-object p1, p0, Lk/o0;->g:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    .line 41
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null network interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/o0;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 42
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/o0;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object v0

    invoke-virtual {v0}, Lk/e1/l/j;->a()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    .line 2
    invoke-virtual {v0, p0, v1, p0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "No System TLS"

    .line 4
    invoke-static {v0, p0}, Lk/e1/e;->a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public A()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->n:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public B()I
    .locals 1

    .line 1
    iget v0, p0, Lk/o0;->B:I

    return v0
.end method

.method public a()Lk/c;
    .locals 1

    .line 5
    iget-object v0, p0, Lk/o0;->s:Lk/c;

    return-object v0
.end method

.method public a(Lk/u0;)Lk/g;
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, v0}, Lk/s0;->a(Lk/o0;Lk/u0;Z)Lk/s0;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lk/o0;->y:I

    return v0
.end method

.method public d()Lk/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->q:Lk/j;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lk/o0;->z:I

    return v0
.end method

.method public f()Lk/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->t:Lk/o;

    return-object v0
.end method

.method public g()Ljava/util/List;
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
    iget-object v0, p0, Lk/o0;->e:Ljava/util/List;

    return-object v0
.end method

.method public h()Lk/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->j:Lk/t;

    return-object v0
.end method

.method public i()Lk/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->b:Lk/u;

    return-object v0
.end method

.method public j()Lk/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->u:Lk/w;

    return-object v0
.end method

.method public k()Lk/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->h:Lk/z;

    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk/o0;->w:Z

    return v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk/o0;->v:Z

    return v0
.end method

.method public n()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->p:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk/h0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/o0;->f:Ljava/util/List;

    return-object v0
.end method

.method public p()Lk/e1/g/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->k:Lk/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lk/d;->b:Lk/e1/g/f;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/o0;->l:Lk/e1/g/f;

    :goto_0
    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk/h0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/o0;->g:Ljava/util/List;

    return-object v0
.end method

.method public r()Lk/n0;
    .locals 1

    .line 1
    new-instance v0, Lk/n0;

    invoke-direct {v0, p0}, Lk/n0;-><init>(Lk/o0;)V

    return-object v0
.end method

.method public s()I
    .locals 1

    .line 1
    iget v0, p0, Lk/o0;->C:I

    return v0
.end method

.method public t()Ljava/util/List;
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
    iget-object v0, p0, Lk/o0;->d:Ljava/util/List;

    return-object v0
.end method

.method public u()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->c:Ljava/net/Proxy;

    return-object v0
.end method

.method public v()Lk/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->r:Lk/c;

    return-object v0
.end method

.method public w()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->i:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1
    iget v0, p0, Lk/o0;->A:I

    return v0
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk/o0;->x:Z

    return v0
.end method

.method public z()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/o0;->m:Ljavax/net/SocketFactory;

    return-object v0
.end method
