.class public final Lk/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field public a:Lk/u;

.field public b:Ljava/net/Proxy;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/p0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/q;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/h0;",
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

.field public g:Lk/z;

.field public h:Ljava/net/ProxySelector;

.field public i:Lk/t;

.field public j:Lk/d;

.field public k:Lk/e1/g/f;

.field public l:Ljavax/net/SocketFactory;

.field public m:Ljavax/net/ssl/SSLSocketFactory;

.field public n:Lk/e1/n/c;

.field public o:Ljavax/net/ssl/HostnameVerifier;

.field public p:Lk/j;

.field public q:Lk/c;

.field public r:Lk/c;

.field public s:Lk/o;

.field public t:Lk/w;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/n0;->e:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/n0;->f:Ljava/util/List;

    .line 4
    new-instance v0, Lk/u;

    invoke-direct {v0}, Lk/u;-><init>()V

    iput-object v0, p0, Lk/n0;->a:Lk/u;

    .line 5
    sget-object v0, Lk/o0;->D:Ljava/util/List;

    iput-object v0, p0, Lk/n0;->c:Ljava/util/List;

    .line 6
    sget-object v0, Lk/o0;->E:Ljava/util/List;

    iput-object v0, p0, Lk/n0;->d:Ljava/util/List;

    .line 7
    sget-object v0, Lk/a0;->a:Lk/a0;

    invoke-static {v0}, Lk/a0;->a(Lk/a0;)Lk/z;

    move-result-object v0

    iput-object v0, p0, Lk/n0;->g:Lk/z;

    .line 8
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Lk/n0;->h:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Lk/e1/m/a;

    invoke-direct {v0}, Lk/e1/m/a;-><init>()V

    iput-object v0, p0, Lk/n0;->h:Ljava/net/ProxySelector;

    .line 10
    :cond_0
    sget-object v0, Lk/t;->a:Lk/t;

    iput-object v0, p0, Lk/n0;->i:Lk/t;

    .line 11
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lk/n0;->l:Ljavax/net/SocketFactory;

    .line 12
    sget-object v0, Lk/e1/n/d;->a:Lk/e1/n/d;

    iput-object v0, p0, Lk/n0;->o:Ljavax/net/ssl/HostnameVerifier;

    .line 13
    sget-object v0, Lk/j;->c:Lk/j;

    iput-object v0, p0, Lk/n0;->p:Lk/j;

    .line 14
    sget-object v0, Lk/c;->a:Lk/c;

    iput-object v0, p0, Lk/n0;->q:Lk/c;

    .line 15
    iput-object v0, p0, Lk/n0;->r:Lk/c;

    .line 16
    new-instance v0, Lk/o;

    invoke-direct {v0}, Lk/o;-><init>()V

    iput-object v0, p0, Lk/n0;->s:Lk/o;

    .line 17
    sget-object v0, Lk/w;->a:Lk/w;

    iput-object v0, p0, Lk/n0;->t:Lk/w;

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lk/n0;->u:Z

    .line 19
    iput-boolean v0, p0, Lk/n0;->v:Z

    .line 20
    iput-boolean v0, p0, Lk/n0;->w:Z

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lk/n0;->x:I

    const/16 v1, 0x2710

    .line 22
    iput v1, p0, Lk/n0;->y:I

    .line 23
    iput v1, p0, Lk/n0;->z:I

    .line 24
    iput v1, p0, Lk/n0;->A:I

    .line 25
    iput v0, p0, Lk/n0;->B:I

    return-void
.end method

.method public constructor <init>(Lk/o0;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/n0;->e:Ljava/util/List;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/n0;->f:Ljava/util/List;

    .line 29
    iget-object v0, p1, Lk/o0;->b:Lk/u;

    iput-object v0, p0, Lk/n0;->a:Lk/u;

    .line 30
    iget-object v0, p1, Lk/o0;->c:Ljava/net/Proxy;

    iput-object v0, p0, Lk/n0;->b:Ljava/net/Proxy;

    .line 31
    iget-object v0, p1, Lk/o0;->d:Ljava/util/List;

    iput-object v0, p0, Lk/n0;->c:Ljava/util/List;

    .line 32
    iget-object v0, p1, Lk/o0;->e:Ljava/util/List;

    iput-object v0, p0, Lk/n0;->d:Ljava/util/List;

    .line 33
    iget-object v0, p0, Lk/n0;->e:Ljava/util/List;

    iget-object v1, p1, Lk/o0;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 34
    iget-object v0, p0, Lk/n0;->f:Ljava/util/List;

    iget-object v1, p1, Lk/o0;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    iget-object v0, p1, Lk/o0;->h:Lk/z;

    iput-object v0, p0, Lk/n0;->g:Lk/z;

    .line 36
    iget-object v0, p1, Lk/o0;->i:Ljava/net/ProxySelector;

    iput-object v0, p0, Lk/n0;->h:Ljava/net/ProxySelector;

    .line 37
    iget-object v0, p1, Lk/o0;->j:Lk/t;

    iput-object v0, p0, Lk/n0;->i:Lk/t;

    .line 38
    iget-object v0, p1, Lk/o0;->l:Lk/e1/g/f;

    iput-object v0, p0, Lk/n0;->k:Lk/e1/g/f;

    .line 39
    iget-object v0, p1, Lk/o0;->k:Lk/d;

    iput-object v0, p0, Lk/n0;->j:Lk/d;

    .line 40
    iget-object v0, p1, Lk/o0;->m:Ljavax/net/SocketFactory;

    iput-object v0, p0, Lk/n0;->l:Ljavax/net/SocketFactory;

    .line 41
    iget-object v0, p1, Lk/o0;->n:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Lk/n0;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 42
    iget-object v0, p1, Lk/o0;->o:Lk/e1/n/c;

    iput-object v0, p0, Lk/n0;->n:Lk/e1/n/c;

    .line 43
    iget-object v0, p1, Lk/o0;->p:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lk/n0;->o:Ljavax/net/ssl/HostnameVerifier;

    .line 44
    iget-object v0, p1, Lk/o0;->q:Lk/j;

    iput-object v0, p0, Lk/n0;->p:Lk/j;

    .line 45
    iget-object v0, p1, Lk/o0;->r:Lk/c;

    iput-object v0, p0, Lk/n0;->q:Lk/c;

    .line 46
    iget-object v0, p1, Lk/o0;->s:Lk/c;

    iput-object v0, p0, Lk/n0;->r:Lk/c;

    .line 47
    iget-object v0, p1, Lk/o0;->t:Lk/o;

    iput-object v0, p0, Lk/n0;->s:Lk/o;

    .line 48
    iget-object v0, p1, Lk/o0;->u:Lk/w;

    iput-object v0, p0, Lk/n0;->t:Lk/w;

    .line 49
    iget-boolean v0, p1, Lk/o0;->v:Z

    iput-boolean v0, p0, Lk/n0;->u:Z

    .line 50
    iget-boolean v0, p1, Lk/o0;->w:Z

    iput-boolean v0, p0, Lk/n0;->v:Z

    .line 51
    iget-boolean v0, p1, Lk/o0;->x:Z

    iput-boolean v0, p0, Lk/n0;->w:Z

    .line 52
    iget v0, p1, Lk/o0;->y:I

    iput v0, p0, Lk/n0;->x:I

    .line 53
    iget v0, p1, Lk/o0;->z:I

    iput v0, p0, Lk/n0;->y:I

    .line 54
    iget v0, p1, Lk/o0;->A:I

    iput v0, p0, Lk/n0;->z:I

    .line 55
    iget v0, p1, Lk/o0;->B:I

    iput v0, p0, Lk/n0;->A:I

    .line 56
    iget p1, p1, Lk/o0;->C:I

    iput p1, p0, Lk/n0;->B:I

    return-void
.end method


# virtual methods
.method public a(JLjava/util/concurrent/TimeUnit;)Lk/n0;
    .locals 1

    const-string v0, "timeout"

    .line 1
    invoke-static {v0, p1, p2, p3}, Lk/e1/e;->a(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lk/n0;->x:I

    return-object p0
.end method

.method public a()Lk/o0;
    .locals 1

    .line 2
    new-instance v0, Lk/o0;

    invoke-direct {v0, p0}, Lk/o0;-><init>(Lk/n0;)V

    return-object v0
.end method
